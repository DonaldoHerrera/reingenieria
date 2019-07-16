package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Fc implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ C1174sc b;

    Fc(C1174sc scVar, AtomicReference atomicReference) {
        this.b = scVar;
        this.a = atomicReference;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(Double.valueOf(this.b.f().c(this.b.p().B(), C1127j.W)));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
