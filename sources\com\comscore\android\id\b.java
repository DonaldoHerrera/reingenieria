package com.comscore.android.id;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Build.VERSION;

@SuppressLint({"NewApi"})
class b {
    b() {
    }

    static String a() {
        if (Integer.valueOf(VERSION.SDK_INT).intValue() >= 9) {
            return Build.SERIAL;
        }
        return null;
    }
}
