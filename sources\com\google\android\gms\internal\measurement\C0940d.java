package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.d reason: case insensitive filesystem */
final class C0940d extends a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ If h;

    C0940d(If ifR, Activity activity, String str, String str2) {
        this.h = ifR;
        this.e = activity;
        this.f = str;
        this.g = str2;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.h.p.setCurrentScreen(Er.a(this.e), this.f, this.g, this.a);
    }
}
