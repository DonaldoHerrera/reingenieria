package com.google.android.gms.measurement.internal;

final class Zb implements Runnable {
    private final /* synthetic */ zzai a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Nb c;

    Zb(Nb nb, zzai zzai, String str) {
        this.c = nb;
        this.a = zzai;
        this.b = str;
    }

    public final void run() {
        this.c.a.o();
        this.c.a.a(this.a, this.b);
    }
}
