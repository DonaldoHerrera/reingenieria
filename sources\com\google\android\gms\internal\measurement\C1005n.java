package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.n reason: case insensitive filesystem */
final class C1005n extends a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ Ie h;
    private final /* synthetic */ If i;

    C1005n(If ifR, String str, String str2, boolean z, Ie ie) {
        this.i = ifR;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = ie;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.i.p.getUserProperties(this.e, this.f, this.g, this.h);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.h.h(null);
    }
}
