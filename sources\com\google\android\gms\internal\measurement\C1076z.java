package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.z reason: case insensitive filesystem */
final class C1076z extends a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ Ie f;
    private final /* synthetic */ b g;

    C1076z(b bVar, Activity activity, Ie ie) {
        this.g = bVar;
        this.e = activity;
        this.f = ie;
        super(If.this);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        If.this.p.onActivitySaveInstanceState(Er.a(this.e), this.f, this.b);
    }
}
