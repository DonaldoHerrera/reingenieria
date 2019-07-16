package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.m reason: case insensitive filesystem */
final class C0772m extends C0751f<T> {
    private final Object m = new Object();
    private String n;
    private T o;
    private final /* synthetic */ C0778o p;

    C0772m(C0781p pVar, String str, Object obj, C0778o oVar) {
        this.p = oVar;
        super(pVar, str, obj, null);
    }

    /* access modifiers changed from: protected */
    public final T a(SharedPreferences sharedPreferences) {
        try {
            return a(sharedPreferences.getString(this.g, ""));
        } catch (ClassCastException e) {
            String str = "Invalid byte[] value in SharedPreferences for ";
            String valueOf = String.valueOf(this.g);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final T a(String str) {
        T t;
        try {
            synchronized (this.m) {
                if (!str.equals(this.n)) {
                    T a = this.p.a(Base64.decode(str, 3));
                    this.n = str;
                    this.o = a;
                }
                t = this.o;
            }
            return t;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.g;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
