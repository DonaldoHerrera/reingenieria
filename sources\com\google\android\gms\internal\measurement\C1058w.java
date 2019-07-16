package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.w reason: case insensitive filesystem */
final class C1058w extends a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ Bundle f;
    private final /* synthetic */ b g;

    C1058w(b bVar, Activity activity, Bundle bundle) {
        this.g = bVar;
        this.e = activity;
        this.f = bundle;
        super(If.this);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        If.this.p.onActivityCreated(Er.a(this.e), this.f, this.b);
    }
}
