package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.k reason: case insensitive filesystem */
final class C0766k extends C0751f<Boolean> {
    C0766k(C0781p pVar, String str, Boolean bool) {
        super(pVar, str, bool, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Boolean a(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.g, false));
        } catch (ClassCastException e) {
            String str = "Invalid boolean value in SharedPreferences for ";
            String valueOf = String.valueOf(this.g);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(String str) {
        if (xc.c.matcher(str).matches()) {
            return Boolean.valueOf(true);
        }
        if (xc.d.matcher(str).matches()) {
            return Boolean.valueOf(false);
        }
        String str2 = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
