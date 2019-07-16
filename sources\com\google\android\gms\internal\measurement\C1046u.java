package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.u reason: case insensitive filesystem */
final class C1046u extends a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Object g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ If i;

    C1046u(If ifR, String str, String str2, Object obj, boolean z) {
        this.i = ifR;
        this.e = str;
        this.f = str2;
        this.g = obj;
        this.h = z;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.i.p.setUserProperty(this.e, this.f, Er.a(this.g), this.h, this.a);
    }
}
