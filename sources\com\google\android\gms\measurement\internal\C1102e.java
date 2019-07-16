package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e reason: case insensitive filesystem */
final class C1102e implements Runnable {
    private final /* synthetic */ C1135kc a;
    private final /* synthetic */ C1087b b;

    C1102e(C1087b bVar, C1135kc kcVar) {
        this.b = bVar;
        this.a = kcVar;
    }

    public final void run() {
        this.a.a();
        if (be.a()) {
            this.a.d().a((Runnable) this);
            return;
        }
        boolean c = this.b.c();
        this.b.d = 0;
        if (c) {
            this.b.b();
        }
    }
}
