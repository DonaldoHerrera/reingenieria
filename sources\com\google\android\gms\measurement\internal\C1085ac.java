package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ac reason: case insensitive filesystem */
final class C1085ac implements Runnable {
    private final /* synthetic */ zzjn a;
    private final /* synthetic */ zzn b;
    private final /* synthetic */ Nb c;

    C1085ac(Nb nb, zzjn zzjn, zzn zzn) {
        this.c = nb;
        this.a = zzjn;
        this.b = zzn;
    }

    public final void run() {
        this.c.a.o();
        this.c.a.b(this.a, this.b);
    }
}
