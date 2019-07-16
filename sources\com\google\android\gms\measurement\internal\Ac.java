package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Ac implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ C1174sc b;

    Ac(C1174sc scVar, AtomicReference atomicReference) {
        this.b = scVar;
        this.a = atomicReference;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(this.b.f().h(this.b.p().B()));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
