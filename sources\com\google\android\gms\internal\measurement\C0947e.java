package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.e reason: case insensitive filesystem */
final class C0947e extends a {
    private final /* synthetic */ boolean e;
    private final /* synthetic */ If f;

    C0947e(If ifR, boolean z) {
        this.f = ifR;
        this.e = z;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.f.p.setMeasurementEnabled(this.e, this.a);
    }
}
