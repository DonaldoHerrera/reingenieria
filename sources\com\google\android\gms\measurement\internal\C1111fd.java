package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zf;

/* renamed from: com.google.android.gms.measurement.internal.fd reason: case insensitive filesystem */
final class C1111fd implements Runnable {
    private final /* synthetic */ zzai a;
    private final /* synthetic */ String b;
    private final /* synthetic */ zf c;
    private final /* synthetic */ Yc d;

    C1111fd(Yc yc, zzai zzai, String str, zf zfVar) {
        this.d = yc;
        this.a = zzai;
        this.b = str;
        this.c = zfVar;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            _a d2 = this.d.d;
            if (d2 == null) {
                this.d.e().s().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = d2.a(this.a, this.b);
            this.d.I();
            this.d.l().a(this.c, bArr);
        } catch (RemoteException e) {
            this.d.e().s().a("Failed to send event to the service to bundle", e);
        } finally {
            this.d.l().a(this.c, bArr);
        }
    }
}
