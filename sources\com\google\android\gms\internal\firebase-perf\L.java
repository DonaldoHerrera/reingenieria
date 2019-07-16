package com.google.android.gms.internal.firebase-perf;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

public final class L {
    private static Boolean a;

    public static int a(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (i < 4 && i < bArr.length) {
            i2 |= (bArr[i] & 255) << (i << 3);
            i++;
        }
        return i2;
    }

    public static boolean a(Context context) {
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            a = valueOf;
            return valueOf.booleanValue();
        } catch (NameNotFoundException | NullPointerException e) {
            String str = "No perf logcat meta data found ";
            String valueOf2 = String.valueOf(e.getMessage());
            Log.d("isEnabled", valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
            return false;
        }
    }
}
