package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.c reason: case insensitive filesystem */
final class C0933c extends a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Bundle g;
    private final /* synthetic */ If h;

    C0933c(If ifR, String str, String str2, Bundle bundle) {
        this.h = ifR;
        this.e = str;
        this.f = str2;
        this.g = bundle;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.h.p.clearConditionalUserProperty(this.e, this.f, this.g);
    }
}
