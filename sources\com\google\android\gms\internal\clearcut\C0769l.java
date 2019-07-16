package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.l reason: case insensitive filesystem */
final class C0769l extends C0751f<String> {
    C0769l(C0781p pVar, String str, String str2) {
        super(pVar, str, str2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String a(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.g, null);
        } catch (ClassCastException e) {
            String str = "Invalid string value in SharedPreferences for ";
            String valueOf = String.valueOf(this.g);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(String str) {
        return str;
    }
}
