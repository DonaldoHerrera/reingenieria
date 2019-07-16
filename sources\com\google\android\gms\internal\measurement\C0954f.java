package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.f reason: case insensitive filesystem */
final class C0954f extends a {
    private final /* synthetic */ String e;
    private final /* synthetic */ If f;

    C0954f(If ifR, String str) {
        this.f = ifR;
        this.e = str;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.f.p.endAdUnitExposure(this.e, this.b);
    }
}
