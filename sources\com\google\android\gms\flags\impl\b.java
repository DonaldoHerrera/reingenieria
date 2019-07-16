package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;

public final class b extends a<Boolean> {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) Dy.a(new c(sharedPreferences, str, bool));
        } catch (Exception e) {
            String str2 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return bool;
        }
    }
}
