package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.wb reason: case insensitive filesystem */
public final class C1193wb {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    private final /* synthetic */ C1168rb e;

    public C1193wb(C1168rb rbVar, String str, long j) {
        this.e = rbVar;
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.A().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void a(long j) {
        Editor edit = this.e.A().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
