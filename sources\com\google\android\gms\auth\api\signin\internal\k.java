package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

final class k extends d {
    private final /* synthetic */ j a;

    k(j jVar) {
        this.a = jVar;
    }

    public final void e(Status status) throws RemoteException {
        this.a.setResult(status);
    }
}
