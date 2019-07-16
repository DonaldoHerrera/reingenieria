package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zf;

/* renamed from: com.google.android.gms.measurement.internal.nd reason: case insensitive filesystem */
final class C1151nd implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ zzn d;
    private final /* synthetic */ zf e;
    private final /* synthetic */ Yc f;

    C1151nd(Yc yc, String str, String str2, boolean z, zzn zzn, zf zfVar) {
        this.f = yc;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = zzn;
        this.e = zfVar;
    }

    public final void run() {
        String str = "Failed to get user properties";
        Bundle bundle = new Bundle();
        try {
            _a d2 = this.f.d;
            if (d2 == null) {
                this.f.e().s().a(str, this.a, this.b);
                return;
            }
            bundle = Vd.a(d2.a(this.a, this.b, this.c, this.d));
            this.f.I();
            this.f.l().a(this.e, bundle);
        } catch (RemoteException e2) {
            this.f.e().s().a(str, this.a, e2);
        } finally {
            this.f.l().a(this.e, bundle);
        }
    }
}
