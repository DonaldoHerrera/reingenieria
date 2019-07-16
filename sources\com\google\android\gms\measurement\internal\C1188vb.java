package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* renamed from: com.google.android.gms.measurement.internal.vb reason: case insensitive filesystem */
public final class C1188vb {
    @VisibleForTesting
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final /* synthetic */ C1168rb e;

    private C1188vb(C1168rb rbVar, String str, long j) {
        this.e = rbVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.a = String.valueOf(str).concat(":start");
        this.b = String.valueOf(str).concat(":count");
        this.c = String.valueOf(str).concat(":value");
        this.d = j;
    }

    private final void b() {
        this.e.i();
        long currentTimeMillis = this.e.c().currentTimeMillis();
        Editor edit = this.e.A().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, currentTimeMillis);
        edit.apply();
    }

    private final long c() {
        return this.e.A().getLong(this.a, 0);
    }

    public final void a(String str, long j) {
        this.e.i();
        if (c() == 0) {
            b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.A().getLong(this.b, 0);
        if (j2 <= 0) {
            Editor edit = this.e.A().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.e.l().u().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        Editor edit2 = this.e.A().edit();
        if (z) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j3);
        edit2.apply();
    }

    public final Pair<String, Long> a() {
        long j;
        this.e.i();
        this.e.i();
        long c2 = c();
        if (c2 == 0) {
            b();
            j = 0;
        } else {
            j = Math.abs(c2 - this.e.c().currentTimeMillis());
        }
        long j2 = this.d;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            b();
            return null;
        }
        String string = this.e.A().getString(this.c, null);
        long j3 = this.e.A().getLong(this.b, 0);
        b();
        if (string == null || j3 <= 0) {
            return C1168rb.c;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }
}
