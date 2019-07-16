package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

final class Hf extends a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Context g;
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ If i;

    Hf(If ifR, String str, String str2, Context context, Bundle bundle) {
        this.i = ifR;
        this.e = str;
        this.f = str2;
        this.g = context;
        this.h = bundle;
        super(ifR);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r4 < r3) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ RemoteException -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[Catch:{ RemoteException -> 0x009e }] */
    public final void a() {
        String str;
        String str2;
        String str3;
        boolean z;
        int i2;
        boolean z2;
        try {
            this.i.l = new ArrayList();
            if (If.c(this.e, this.f)) {
                String str4 = this.f;
                str2 = this.e;
                str = str4;
                str3 = this.i.h;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            If.i(this.g);
            if (!If.c.booleanValue()) {
                if (str2 == null) {
                    z = false;
                    this.i.p = this.i.a(this.g, z);
                    if (this.i.p != null) {
                        Log.w(this.i.h, "Failed to connect to measurement client.");
                        return;
                    }
                    int d = If.h(this.g);
                    int e2 = If.g(this.g);
                    if (z) {
                        i2 = Math.max(d, e2);
                    } else {
                        i2 = d > 0 ? d : e2;
                        if (d > 0) {
                        }
                        z2 = false;
                        zzx zzx = new zzx(16250, (long) i2, z2, str3, str2, str, this.h);
                        this.i.p.initialize(Er.a(this.g), zzx, this.a);
                        return;
                    }
                    z2 = true;
                    zzx zzx2 = new zzx(16250, (long) i2, z2, str3, str2, str, this.h);
                    this.i.p.initialize(Er.a(this.g), zzx2, this.a);
                    return;
                }
            }
            z = true;
            this.i.p = this.i.a(this.g, z);
            if (this.i.p != null) {
            }
        } catch (RemoteException e3) {
            this.i.a((Exception) e3, true, false);
        }
    }
}
