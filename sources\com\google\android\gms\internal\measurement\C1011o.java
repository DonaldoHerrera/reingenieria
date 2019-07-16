package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.o reason: case insensitive filesystem */
final class C1011o extends a {
    private final /* synthetic */ String e;
    private final /* synthetic */ Ie f;
    private final /* synthetic */ If g;

    C1011o(If ifR, String str, Ie ie) {
        this.g = ifR;
        this.e = str;
        this.f = ie;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.g.p.getMaxUserProperties(this.e, this.f);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f.h(null);
    }
}
