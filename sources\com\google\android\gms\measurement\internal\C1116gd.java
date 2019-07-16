package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.gd reason: case insensitive filesystem */
final class C1116gd implements Runnable {
    private final /* synthetic */ Uc a;
    private final /* synthetic */ Yc b;

    C1116gd(Yc yc, Uc uc) {
        this.b = yc;
        this.a = uc;
    }

    public final void run() {
        _a d = this.b.d;
        if (d == null) {
            this.b.e().s().a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.a == null) {
                d.a(0, (String) null, (String) null, this.b.getContext().getPackageName());
            } else {
                d.a(this.a.c, this.a.a, this.a.b, this.b.getContext().getPackageName());
            }
            this.b.I();
        } catch (RemoteException e) {
            this.b.e().s().a("Failed to send current screen to the service", e);
        }
    }
}
