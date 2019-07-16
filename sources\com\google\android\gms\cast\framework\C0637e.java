package com.google.android.gms.cast.framework;

import java.util.Locale;

/* renamed from: com.google.android.gms.cast.framework.e reason: case insensitive filesystem */
public final class C0637e {
    public static String a(int i) {
        if (i == 1) {
            return "NO_DEVICES_AVAILABLE";
        }
        if (i == 2) {
            return "NOT_CONNECTED";
        }
        if (i == 3) {
            return "CONNECTING";
        }
        if (i == 4) {
            return "CONNECTED";
        }
        return String.format(Locale.ROOT, "UNKNOWN_STATE(%d)", new Object[]{Integer.valueOf(i)});
    }
}
