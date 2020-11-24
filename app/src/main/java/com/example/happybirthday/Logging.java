package com.example.happybirthday;

import android.util.Log;

public class Logging {

    public static void show (Object obj, String message) {
        if (BuildConfig.DEBUG) {
            Log.e(obj.getClass().getName(), message);
        }
    }
}
