package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zf;

/* renamed from: com.google.android.gms.measurement.internal.ed reason: case insensitive filesystem */
final class C1106ed implements Runnable {
    private final /* synthetic */ zzn a;
    private final /* synthetic */ zf b;
    private final /* synthetic */ Yc c;

    C1106ed(Yc yc, zzn zzn, zf zfVar) {
        this.c = yc;
        this.a = zzn;
        this.b = zfVar;
    }

    public final void run() {
        String str = "Failed to get app instance id";
        try {
            _a d = this.c.d;
            if (d == null) {
                this.c.e().s().a(str);
                return;
            }
            String c2 = d.c(this.a);
            if (c2 != null) {
                this.c.o().a(c2);
                this.c.b().m.a(c2);
            }
            this.c.I();
            this.c.l().a(this.b, c2);
        } catch (RemoteException e) {
            this.c.e().s().a(str, e);
        } finally {
            this.c.l().a(this.b, (String) null);
        }
    }
}
