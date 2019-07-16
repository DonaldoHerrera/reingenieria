package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.rd reason: case insensitive filesystem */
final class C1170rd implements Runnable {
    private final /* synthetic */ _a a;
    private final /* synthetic */ C1166qd b;

    C1170rd(C1166qd qdVar, _a _aVar) {
        this.b = qdVar;
        this.a = _aVar;
    }

    public final void run() {
        synchronized (this.b) {
            this.b.a = false;
            if (!this.b.c.B()) {
                this.b.c.e().z().a("Connected to remote service");
                this.b.c.a(this.a);
            }
        }
    }
}
