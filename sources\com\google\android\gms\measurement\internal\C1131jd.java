package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.measurement.internal.jd reason: case insensitive filesystem */
final class C1131jd implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ zzq c;
    private final /* synthetic */ zzn d;
    private final /* synthetic */ zzq e;
    private final /* synthetic */ Yc f;

    C1131jd(Yc yc, boolean z, boolean z2, zzq zzq, zzn zzn, zzq zzq2) {
        this.f = yc;
        this.a = z;
        this.b = z2;
        this.c = zzq;
        this.d = zzn;
        this.e = zzq2;
    }

    public final void run() {
        _a d2 = this.f.d;
        if (d2 == null) {
            this.f.e().s().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.a) {
            this.f.a(d2, (AbstractSafeParcelable) this.b ? null : this.c, this.d);
        } else {
            try {
                if (TextUtils.isEmpty(this.e.a)) {
                    d2.a(this.c, this.d);
                } else {
                    d2.a(this.c);
                }
            } catch (RemoteException e2) {
                this.f.e().s().a("Failed to send conditional user property to the service", e2);
            }
        }
        this.f.I();
    }
}
