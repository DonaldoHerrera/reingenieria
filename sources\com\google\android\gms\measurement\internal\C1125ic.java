package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* renamed from: com.google.android.gms.measurement.internal.ic reason: case insensitive filesystem */
class C1125ic implements C1135kc {
    protected final Mb a;

    C1125ic(Mb mb) {
        Preconditions.checkNotNull(mb);
        this.a = mb;
    }

    public be a() {
        return this.a.a();
    }

    public C1168rb b() {
        return this.a.g();
    }

    public Clock c() {
        return this.a.c();
    }

    public Gb d() {
        return this.a.d();
    }

    public C1124ib e() {
        return this.a.e();
    }

    public ce f() {
        return this.a.h();
    }

    public void g() {
        this.a.v();
    }

    public Context getContext() {
        return this.a.getContext();
    }

    public void h() {
        this.a.d().h();
    }

    public void i() {
        this.a.d().i();
    }

    public C1097d j() {
        return this.a.D();
    }

    public C1114gb k() {
        return this.a.E();
    }

    public Vd l() {
        return this.a.F();
    }
}
