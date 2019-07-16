package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;

final class B extends a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ b f;

    B(b bVar, Activity activity) {
        this.f = bVar;
        this.e = activity;
        super(If.this);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        If.this.p.onActivityDestroyed(Er.a(this.e), this.b);
    }
}
