package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.gc reason: case insensitive filesystem */
final class C1115gc implements Runnable {
    private final /* synthetic */ zzn a;
    private final /* synthetic */ Nb b;

    C1115gc(Nb nb, zzn zzn) {
        this.b = nb;
        this.a = zzn;
    }

    public final void run() {
        this.b.a.o();
        this.b.a.c(this.a);
    }
}
