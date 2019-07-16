package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.td reason: case insensitive filesystem */
final class C1180td implements Runnable {
    private final /* synthetic */ C1166qd a;

    C1180td(C1166qd qdVar) {
        this.a = qdVar;
    }

    public final void run() {
        this.a.c.d = null;
        this.a.c.K();
    }
}
