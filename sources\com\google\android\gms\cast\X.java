package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.cast.wa;
import com.google.android.gms.internal.cast.ya;

final class X extends TaskApiCall<wa, Void> {
    final /* synthetic */ C0631e a;

    X(C0631e eVar) {
        this.a = eVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(AnyClient anyClient, Xy xy) throws RemoteException {
        wa waVar = (wa) anyClient;
        ((ya) waVar.getService()).a(new W(this, xy));
    }
}
