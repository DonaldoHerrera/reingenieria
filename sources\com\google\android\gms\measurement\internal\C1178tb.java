package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.tb reason: case insensitive filesystem */
public final class C1178tb {
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private final /* synthetic */ C1168rb e;

    public C1178tb(C1168rb rbVar, String str, boolean z) {
        this.e = rbVar;
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.A().getBoolean(this.a, this.b);
        }
        return this.d;
    }

    public final void a(boolean z) {
        Editor edit = this.e.A().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }
}
