package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

final class r extends a {
    private final /* synthetic */ Long e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ If k;

    r(If ifR, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        this.k = ifR;
        this.e = l;
        this.f = str;
        this.g = str2;
        this.h = bundle;
        this.i = z;
        this.j = z2;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        Long l = this.e;
        this.k.p.logEvent(this.f, this.g, this.h, this.i, this.j, l == null ? this.a : l.longValue());
    }
}
