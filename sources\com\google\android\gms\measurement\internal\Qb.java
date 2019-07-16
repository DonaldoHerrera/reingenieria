package com.google.android.gms.measurement.internal;

final class Qb implements Runnable {
    private final /* synthetic */ zzn a;
    private final /* synthetic */ Nb b;

    Qb(Nb nb, zzn zzn) {
        this.b = nb;
        this.a = zzn;
    }

    public final void run() {
        this.b.a.o();
        this.b.a.b(this.a);
    }
}
