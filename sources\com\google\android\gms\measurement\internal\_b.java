package com.google.android.gms.measurement.internal;

final class _b implements Runnable {
    private final /* synthetic */ zzai a;
    private final /* synthetic */ zzn b;
    private final /* synthetic */ Nb c;

    _b(Nb nb, zzai zzai, zzn zzn) {
        this.c = nb;
        this.a = zzai;
        this.b = zzn;
    }

    public final void run() {
        zzai b2 = this.c.b(this.a, this.b);
        this.c.a.o();
        this.c.a.a(b2, this.b);
    }
}
