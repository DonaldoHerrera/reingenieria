package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.yb reason: case insensitive filesystem */
public final class C1203yb {
    private final String a;
    private final String b = null;
    private boolean c;
    private String d;
    private final /* synthetic */ C1168rb e;

    public C1203yb(C1168rb rbVar, String str, String str2) {
        this.e = rbVar;
        Preconditions.checkNotEmpty(str);
        this.a = str;
    }

    public final String a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.A().getString(this.a, null);
        }
        return this.d;
    }

    public final void a(String str) {
        if (!Vd.e(str, this.d)) {
            Editor edit = this.e.A().edit();
            edit.putString(this.a, str);
            edit.apply();
            this.d = str;
        }
    }
}
