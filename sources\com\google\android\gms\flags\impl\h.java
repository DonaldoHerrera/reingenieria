package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;

public final class h extends a<String> {
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) Dy.a(new i(sharedPreferences, str, str2));
        } catch (Exception e) {
            String str3 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return str2;
        }
    }
}
