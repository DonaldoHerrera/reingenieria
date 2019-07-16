package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

public final class be {
    private final boolean a = false;

    be(Context context) {
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
