package com.google.android.gms.measurement.internal;

final class Vc implements Runnable {
    private final /* synthetic */ Uc a;
    private final /* synthetic */ Tc b;

    Vc(Tc tc, Uc uc) {
        this.b = tc;
        this.a = uc;
    }

    public final void run() {
        this.b.a(this.a, false);
        Tc tc = this.b;
        tc.c = null;
        tc.q().a((Uc) null);
    }
}
