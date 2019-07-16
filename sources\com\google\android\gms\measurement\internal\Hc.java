package com.google.android.gms.measurement.internal;

final class Hc implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ C1174sc b;

    Hc(C1174sc scVar, boolean z) {
        this.b = scVar;
        this.a = z;
    }

    public final void run() {
        boolean b2 = this.b.a.b();
        boolean q = this.b.a.q();
        this.b.a.a(this.a);
        if (q == this.a) {
            this.b.a.e().A().a("Default data collection state already set to", Boolean.valueOf(this.a));
        }
        if (this.b.a.b() == b2 || this.b.a.b() != this.b.a.q()) {
            this.b.a.e().x().a("Default data collection is different than actual status", Boolean.valueOf(this.a), Boolean.valueOf(b2));
        }
        this.b.L();
    }
}
