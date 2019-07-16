package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.b reason: case insensitive filesystem */
final class C0926b extends a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Ie g;
    private final /* synthetic */ If h;

    C0926b(If ifR, String str, String str2, Ie ie) {
        this.h = ifR;
        this.e = str;
        this.f = str2;
        this.g = ie;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.h.p.getConditionalUserProperties(this.e, this.f, this.g);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.g.h(null);
    }
}
