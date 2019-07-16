package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.measurement.internal.dd reason: case insensitive filesystem */
final class C1101dd implements Runnable {
    private final /* synthetic */ zzn a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ Yc c;

    C1101dd(Yc yc, zzn zzn, boolean z) {
        this.c = yc;
        this.a = zzn;
        this.b = z;
    }

    public final void run() {
        _a d = this.c.d;
        if (d == null) {
            this.c.e().s().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d.a(this.a);
            if (this.b) {
                this.c.s().C();
            }
            this.c.a(d, (AbstractSafeParcelable) null, this.a);
            this.c.I();
        } catch (RemoteException e) {
            this.c.e().s().a("Failed to send app launch to the service", e);
        }
    }
}
