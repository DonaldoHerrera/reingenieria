package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ad reason: case insensitive filesystem */
final class C1086ad implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ zzn b;
    private final /* synthetic */ Yc c;

    C1086ad(Yc yc, AtomicReference atomicReference, zzn zzn) {
        this.c = yc;
        this.a = atomicReference;
        this.b = zzn;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                _a d = this.c.d;
                if (d == null) {
                    this.c.e().s().a("Failed to get app instance id");
                    this.a.notify();
                    return;
                }
                this.a.set(d.c(this.b));
                String str = (String) this.a.get();
                if (str != null) {
                    this.c.o().a(str);
                    this.c.b().m.a(str);
                }
                this.c.I();
                this.a.notify();
            } catch (RemoteException e) {
                try {
                    this.c.e().s().a("Failed to get app instance id", e);
                    this.a.notify();
                } catch (Throwable th) {
                    this.a.notify();
                    throw th;
                }
            }
        }
    }
}
