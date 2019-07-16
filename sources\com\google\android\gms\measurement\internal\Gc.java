package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Gc implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ C1174sc b;

    Gc(C1174sc scVar, AtomicReference atomicReference) {
        this.b = scVar;
        this.a = atomicReference;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(Integer.valueOf(this.b.f().b(this.b.p().B(), C1127j.V)));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
