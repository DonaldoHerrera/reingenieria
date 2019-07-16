package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.measurement.internal.kd reason: case insensitive filesystem */
final class C1136kd implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ zzai c;
    private final /* synthetic */ zzn d;
    private final /* synthetic */ String e;
    private final /* synthetic */ Yc f;

    C1136kd(Yc yc, boolean z, boolean z2, zzai zzai, zzn zzn, String str) {
        this.f = yc;
        this.a = z;
        this.b = z2;
        this.c = zzai;
        this.d = zzn;
        this.e = str;
    }

    public final void run() {
        _a d2 = this.f.d;
        if (d2 == null) {
            this.f.e().s().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.a) {
            this.f.a(d2, (AbstractSafeParcelable) this.b ? null : this.c, this.d);
        } else {
            try {
                if (TextUtils.isEmpty(this.e)) {
                    d2.a(this.c, this.d);
                } else {
                    d2.a(this.c, this.e, this.f.e().B());
                }
            } catch (RemoteException e2) {
                this.f.e().s().a("Failed to send event to the service", e2);
            }
        }
        this.f.I();
    }
}
