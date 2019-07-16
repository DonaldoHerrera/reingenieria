package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall.Builder;

final class zack extends TaskApiCall<A, ResultT> {
    private final /* synthetic */ Builder zakn;

    zack(Builder builder, Feature[] featureArr, boolean z) {
        this.zakn = builder;
        super(featureArr, z);
    }

    /* access modifiers changed from: protected */
    public final void doExecute(A a, Xy<ResultT> xy) throws RemoteException {
        this.zakn.zakm.accept(a, xy);
    }
}
