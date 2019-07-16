package com.google.android.gms.measurement.internal;

final class Xb implements Runnable {
    private final /* synthetic */ zzn a;
    private final /* synthetic */ Nb b;

    Xb(Nb nb, zzn zzn) {
        this.b = nb;
        this.a = zzn;
    }

    public final void run() {
        this.b.a.o();
        this.b.a.a(this.a);
    }
}
