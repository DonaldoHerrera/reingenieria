package com.google.android.gms.internal.clearcut;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.clearcut.a;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

final class kc extends ApiMethodImpl<Status, oc> {
    private final zze a;

    kc(zze zze, GoogleApiClient googleApiClient) {
        super(a.c, googleApiClient);
        this.a = zze;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(AnyClient anyClient) throws RemoteException {
        oc ocVar = (oc) anyClient;
        nc ncVar = new nc(this);
        try {
            zze zze = this.a;
            if (zze.j != null && zze.i.n.length == 0) {
                zze.i.n = zze.j.a();
            }
            if (zze.k != null && zze.i.u.length == 0) {
                zze.i.u = zze.k.a();
            }
            lc lcVar = zze.i;
            byte[] bArr = new byte[lcVar.i()];
            Wb.a(lcVar, bArr, 0, bArr.length);
            zze.b = bArr;
            ((sc) ocVar.getService()).a(ncVar, this.a);
        } catch (RuntimeException e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            setFailedResult(new Status(10, "MessageProducer"));
        }
    }
}
