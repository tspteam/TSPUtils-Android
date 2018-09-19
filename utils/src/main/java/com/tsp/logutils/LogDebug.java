package com.tsp.logutils;
/*
 * Created by Shukri.
 */

import android.util.Log;

public class LogDebug {
    public static final String TAG = "TSPUtils";

    public static void d(String msg) {
        Log.d(TAG, "" + msg);
    }
}
