package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.q reason: case insensitive filesystem */
final class C1023q extends a {
    private final /* synthetic */ boolean e;
    private final /* synthetic */ If f;

    C1023q(If ifR, boolean z) {
        this.f = ifR;
        this.e = z;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.f.p.setDataCollectionEnabled(this.e);
    }
}
