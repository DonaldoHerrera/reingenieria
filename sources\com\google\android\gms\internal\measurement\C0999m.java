package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.m reason: case insensitive filesystem */
final class C0999m extends a {
    private final /* synthetic */ int e = 5;
    private final /* synthetic */ String f;
    private final /* synthetic */ Object g;
    private final /* synthetic */ Object h;
    private final /* synthetic */ Object i;
    private final /* synthetic */ If j;

    C0999m(If ifR, boolean z, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.j = ifR;
        this.f = str;
        this.g = obj;
        this.h = null;
        this.i = null;
        super(false);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.j.p.logHealthData(this.e, this.f, Er.a(this.g), Er.a(this.h), Er.a(this.i));
    }
}
