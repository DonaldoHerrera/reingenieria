package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.i reason: case insensitive filesystem */
final class C0975i extends a {
    private final /* synthetic */ Ie e;
    private final /* synthetic */ If f;

    C0975i(If ifR, Ie ie) {
        this.f = ifR;
        this.e = ie;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.f.p.generateEventId(this.e);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.e.h(null);
    }
}
