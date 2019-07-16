package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.bd reason: case insensitive filesystem */
final class C1091bd implements Runnable {
    private final /* synthetic */ zzn a;
    private final /* synthetic */ Yc b;

    C1091bd(Yc yc, zzn zzn) {
        this.b = yc;
        this.a = zzn;
    }

    public final void run() {
        _a d = this.b.d;
        if (d == null) {
            this.b.e().s().a("Failed to reset data on the service; null service");
            return;
        }
        try {
            d.d(this.a);
        } catch (RemoteException e) {
            this.b.e().s().a("Failed to reset data on the service", e);
        }
        this.b.I();
    }
}
