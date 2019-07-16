package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.x reason: case insensitive filesystem */
final class C1064x extends a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ b f;

    C1064x(b bVar, Activity activity) {
        this.f = bVar;
        this.e = activity;
        super(If.this);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        If.this.p.onActivityPaused(Er.a(this.e), this.b);
    }
}
