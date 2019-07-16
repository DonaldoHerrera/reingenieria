package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zf;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.ld reason: case insensitive filesystem */
final class C1141ld implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ zzn c;
    private final /* synthetic */ zf d;
    private final /* synthetic */ Yc e;

    C1141ld(Yc yc, String str, String str2, zzn zzn, zf zfVar) {
        this.e = yc;
        this.a = str;
        this.b = str2;
        this.c = zzn;
        this.d = zfVar;
    }

    public final void run() {
        String str = "Failed to get conditional properties";
        ArrayList arrayList = new ArrayList();
        try {
            _a d2 = this.e.d;
            if (d2 == null) {
                this.e.e().s().a(str, this.a, this.b);
                return;
            }
            arrayList = Vd.b(d2.a(this.a, this.b, this.c));
            this.e.I();
            this.e.l().a(this.d, arrayList);
        } catch (RemoteException e2) {
            this.e.e().s().a(str, this.a, this.b, e2);
        } finally {
            this.e.l().a(this.d, arrayList);
        }
    }
}
