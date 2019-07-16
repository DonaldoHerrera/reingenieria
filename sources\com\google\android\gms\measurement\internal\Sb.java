package com.google.android.gms.measurement.internal;

final class Sb implements Runnable {
    private final /* synthetic */ zzq a;
    private final /* synthetic */ zzn b;
    private final /* synthetic */ Nb c;

    Sb(Nb nb, zzq zzq, zzn zzn) {
        this.c = nb;
        this.a = zzq;
        this.b = zzn;
    }

    public final void run() {
        this.c.a.o();
        this.c.a.a(this.a, this.b);
    }
}
