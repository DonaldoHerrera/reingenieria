package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.xc reason: case insensitive filesystem */
final class C1199xc implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ C1174sc b;

    C1199xc(C1174sc scVar, long j) {
        this.b = scVar;
        this.a = j;
    }

    public final void run() {
        C1174sc scVar = this.b;
        long j = this.a;
        scVar.i();
        scVar.g();
        scVar.w();
        scVar.e().z().a("Resetting analytics data (FE)");
        scVar.t().A();
        if (scVar.f().j(scVar.p().B())) {
            scVar.b().k.a(j);
        }
        boolean b2 = scVar.a.b();
        if (!scVar.f().p()) {
            scVar.b().d(!b2);
        }
        scVar.q().C();
        scVar.h = !b2;
        this.b.q().a(new AtomicReference<>());
    }
}
