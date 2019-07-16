package com.google.android.gms.measurement.internal;

final class Ub implements Runnable {
    private final /* synthetic */ zzq a;
    private final /* synthetic */ Nb b;

    Ub(Nb nb, zzq zzq) {
        this.b = nb;
        this.a = zzq;
    }

    public final void run() {
        this.b.a.o();
        this.b.a.a(this.a);
    }
}
