package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.hd reason: case insensitive filesystem */
final class C1121hd implements Runnable {
    private final /* synthetic */ zzn a;
    private final /* synthetic */ Yc b;

    C1121hd(Yc yc, zzn zzn) {
        this.b = yc;
        this.a = zzn;
    }

    public final void run() {
        _a d = this.b.d;
        if (d == null) {
            this.b.e().s().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d.b(this.a);
            this.b.I();
        } catch (RemoteException e) {
            this.b.e().s().a("Failed to send measurementEnabled to the service", e);
        }
    }
}
