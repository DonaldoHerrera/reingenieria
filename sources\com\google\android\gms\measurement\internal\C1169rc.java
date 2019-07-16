package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.rc reason: case insensitive filesystem */
final class C1169rc implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ C1174sc b;

    C1169rc(C1174sc scVar, AtomicReference atomicReference) {
        this.b = scVar;
        this.a = atomicReference;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(Boolean.valueOf(this.b.f().g(this.b.p().B())));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
