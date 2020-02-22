package com.geektech.todoapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Prefs {

    private static volatile Prefs instance;

    private SharedPreferences preferences;

    public Prefs(Context context) {
        instance = this;
        preferences = context.getSharedPreferences("settings", Context.MODE_PRIVATE);

    }

    public static Prefs getInstance(Context context) {
        if (instance == null) new Prefs(context);
        return instance;
    }

    public boolean isShown() {
        return preferences.getBoolean("isShown", false);
    }

    public void saveShown() {
        preferences.edit().putBoolean("isShown", true).apply();
    }

    public void clearSettings() {
        preferences.edit().clear().apply();
    }
}
