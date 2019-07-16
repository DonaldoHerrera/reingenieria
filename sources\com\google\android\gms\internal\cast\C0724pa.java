package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.pa reason: case insensitive filesystem */
public final class C0724pa {
    public static Integer a(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1118317585:
                if (str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                    c = 3;
                    break;
                }
                break;
            case -962896020:
                if (str.equals("REPEAT_SINGLE")) {
                    c = 2;
                    break;
                }
                break;
            case 1645938909:
                if (str.equals("REPEAT_ALL")) {
                    c = 1;
                    break;
                }
                break;
            case 1645952171:
                if (str.equals("REPEAT_OFF")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            return Integer.valueOf(0);
        }
        if (c == 1) {
            return Integer.valueOf(1);
        }
        if (c == 2) {
            return Integer.valueOf(2);
        }
        if (c != 3) {
            return null;
        }
        return Integer.valueOf(3);
    }

    public static String a(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return "REPEAT_OFF";
        }
        if (intValue == 1) {
            return "REPEAT_ALL";
        }
        if (intValue == 2) {
            return "REPEAT_SINGLE";
        }
        if (intValue != 3) {
            return null;
        }
        return "REPEAT_ALL_AND_SHUFFLE";
    }
}
