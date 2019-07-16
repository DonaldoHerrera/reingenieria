package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.t reason: case insensitive filesystem */
final class C1040t extends a {
    private final /* synthetic */ Bundle e;
    private final /* synthetic */ If f;

    C1040t(If ifR, Bundle bundle) {
        this.f = ifR;
        this.e = bundle;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        this.f.p.setConditionalUserProperty(this.e, this.a);
    }
}
