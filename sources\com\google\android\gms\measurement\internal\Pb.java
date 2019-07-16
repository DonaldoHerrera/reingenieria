package com.google.android.gms.measurement.internal;

final class Pb implements Runnable {
    private final /* synthetic */ zzq a;
    private final /* synthetic */ zzn b;
    private final /* synthetic */ Nb c;

    Pb(Nb nb, zzq zzq, zzn zzn) {
        this.c = nb;
        this.a = zzq;
        this.b = zzn;
    }

    public final void run() {
        this.c.a.o();
        this.c.a.b(this.a, this.b);
    }
}
