package com.cita.wallet.app.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * App that lets save and modify preferences.
 * Created by Enrique Ramirez on 5/27/14.
 */
public class AppUtils {

    Context context;

    public AppUtils(Context context) {

        this.context = context;

    }

    public void clearPreferences() {

        SharedPreferences preferences = context.getSharedPreferences("PREFERENCE", 0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.commit();

    }

    public void saveIntegerToStorage(String key, int value) {

        SharedPreferences preferences = context.getSharedPreferences(
                "com.cita.nama", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();

        editor.putInt(key, value);
        editor.commit();

    }

    public int getIntegerFromStorage(String key) {

        SharedPreferences preferences = context.getSharedPreferences(
                "com.cita.nama", Context.MODE_PRIVATE);

        return preferences.getInt(key, 0);

    }

    public void saveBooleanToStorage(String key, boolean value) {

        SharedPreferences preferences = context.getSharedPreferences(
                "com.cita.nama", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();

        editor.putBoolean(key, value);
        editor.commit();

    }

    public boolean getBooleanFromStorage(String key) {

        SharedPreferences preferences = context.getSharedPreferences(
                "com.cita.nama", Context.MODE_PRIVATE);

        return preferences.getBoolean(key, false);

    }

    public void saveStringToStorage(String key, String value) {

        SharedPreferences preferences = context.getSharedPreferences(
                "com.cita.nama", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();

        editor.putString(key, value);
        editor.commit();

    }

    public String getStringFromStorage(String key) {

        SharedPreferences preferences = context.getSharedPreferences(
                "com.cita.nama", Context.MODE_PRIVATE);

        return preferences.getString(key, "");

    }

}
