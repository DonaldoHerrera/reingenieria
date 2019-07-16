package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.g reason: case insensitive filesystem */
final class C0961g extends a {
    private final /* synthetic */ String e;
    private final /* synthetic */ If f;

    C0961g(If ifR, String str) {
        this.f = ifR;
        this.e = str;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.f.p.beginAdUnitExposure(this.e, this.b);
    }
}
