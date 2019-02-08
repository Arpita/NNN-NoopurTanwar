package com.example.vvdemo.data.api;

import android.util.Log;


public class NetworkingLogger implements DebugLoggerInterface {

    private static final String TEST_APP = "~NET TEST APP~";

    @Override
    public void e(String error) {
        Log.e(TEST_APP, error);
    }

    @Override
    public void e(String error, Exception exception) {
        Log.e(TEST_APP, error, exception);
    }

    @Override
    public void d(String debug) {
        Log.d(TEST_APP, debug);
    }

    @Override
    public void v(String verbose) {
        Log.v(TEST_APP, verbose);
    }
}
