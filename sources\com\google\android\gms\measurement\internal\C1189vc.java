package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.vc reason: case insensitive filesystem */
final class C1189vc implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ C1174sc c;

    C1189vc(C1174sc scVar, AtomicReference atomicReference, boolean z) {
        this.c = scVar;
        this.a = atomicReference;
        this.b = z;
    }

    public final void run() {
        this.c.q().a(this.a, this.b);
    }
}
