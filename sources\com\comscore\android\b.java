package com.comscore.android;

import android.content.Context;

class b {
    private static String[] a;

    b() {
    }

    static Boolean a(Context context, String str) {
        int i = 0;
        Boolean valueOf = Boolean.valueOf(false);
        if (a == null) {
            try {
                a = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            } catch (Exception unused) {
            }
        }
        if (a == null) {
            return valueOf;
        }
        while (true) {
            String[] strArr = a;
            if (i >= strArr.length) {
                return valueOf;
            }
            if (strArr[i].equals(str)) {
                return Boolean.valueOf(true);
            }
            i++;
        }
    }
}
