package com.comscore.android.id;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;

@SuppressLint({"NewApi"})
class a {
    private static boolean a = false;
    private static boolean b = false;

    a() {
    }

    static boolean a(Context context) {
        if (a) {
            return b;
        }
        if (VERSION.SDK_INT > 4) {
            try {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if ("com.android.vending".equals(installerPackageName) || "com.google.play".equals(installerPackageName)) {
                    a = true;
                    b = true;
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        a = true;
        b = false;
        return false;
    }
}
