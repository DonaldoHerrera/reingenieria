package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ec reason: case insensitive filesystem */
final class C1105ec implements Runnable {
    private final /* synthetic */ zzjn a;
    private final /* synthetic */ zzn b;
    private final /* synthetic */ Nb c;

    C1105ec(Nb nb, zzjn zzjn, zzn zzn) {
        this.c = nb;
        this.a = zzjn;
        this.b = zzn;
    }

    public final void run() {
        this.c.a.o();
        this.c.a.a(this.a, this.b);
    }
}
