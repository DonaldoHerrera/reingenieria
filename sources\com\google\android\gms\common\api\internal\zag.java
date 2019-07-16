package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager.zaa;

public final class zag<ResultT> extends zac {
    private final Xy<ResultT> zacn;
    private final TaskApiCall<AnyClient, ResultT> zacr;
    private final StatusExceptionMapper zacs;

    public zag(int i, TaskApiCall<AnyClient, ResultT> taskApiCall, Xy<ResultT> xy, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.zacn = xy;
        this.zacr = taskApiCall;
        this.zacs = statusExceptionMapper;
    }

    public final void zaa(zaa<?> zaa) throws DeadObjectException {
        try {
            this.zacr.doExecute(zaa.zaab(), this.zacn);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            zaa(zab.zaa(e2));
        } catch (RuntimeException e3) {
            zaa(e3);
        }
    }

    public final Feature[] zab(zaa<?> zaa) {
        return this.zacr.zabt();
    }

    public final boolean zac(zaa<?> zaa) {
        return this.zacr.shouldAutoResolveMissingFeatures();
    }

    public final void zaa(Status status) {
        this.zacn.b(this.zacs.getException(status));
    }

    public final void zaa(RuntimeException runtimeException) {
        this.zacn.b((Exception) runtimeException);
    }

    public final void zaa(zaab zaab, boolean z) {
        zaab.zaa(this.zacn, z);
    }
}
