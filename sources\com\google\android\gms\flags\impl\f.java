package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;

public final class f extends a<Long> {
    public static Long a(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) Dy.a(new g(sharedPreferences, str, l));
        } catch (Exception e) {
            String str2 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return l;
        }
    }
}
