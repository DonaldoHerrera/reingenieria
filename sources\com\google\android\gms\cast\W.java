package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

final class W extends a {
    private final /* synthetic */ Xy a;
    private final /* synthetic */ X b;

    W(X x, Xy xy) {
        this.b = x;
        this.a = xy;
        super(null);
    }

    public final void A() throws RemoteException {
        this.b.a.c.a("onDisconnected", new Object[0]);
        this.b.a.b();
        TaskUtil.setResultOrApiException(Status.RESULT_SUCCESS, this.a);
    }

    public final void onError(int i) throws RemoteException {
        this.b.a.c.a("onError: %d", Integer.valueOf(i));
        this.b.a.b();
        TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, this.a);
    }
}
