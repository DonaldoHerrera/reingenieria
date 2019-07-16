package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class Zc implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ zzn b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ Yc d;

    Zc(Yc yc, AtomicReference atomicReference, zzn zzn, boolean z) {
        this.d = yc;
        this.a = atomicReference;
        this.b = zzn;
        this.c = z;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                _a d2 = this.d.d;
                if (d2 == null) {
                    this.d.e().s().a("Failed to get user properties");
                    this.a.notify();
                    return;
                }
                this.a.set(d2.a(this.b, this.c));
                this.d.I();
                this.a.notify();
            } catch (RemoteException e) {
                try {
                    this.d.e().s().a("Failed to get user properties", e);
                    this.a.notify();
                } catch (Throwable th) {
                    this.a.notify();
                    throw th;
                }
            }
        }
    }
}
