package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Dc implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ C1174sc b;

    Dc(C1174sc scVar, AtomicReference atomicReference) {
        this.b = scVar;
        this.a = atomicReference;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(Long.valueOf(this.b.f().a(this.b.p().B(), C1127j.U)));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
