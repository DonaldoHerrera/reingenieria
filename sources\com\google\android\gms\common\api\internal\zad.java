package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager.zaa;

abstract class zad<T> extends zac {
    protected final Xy<T> zacn;

    public zad(int i, Xy<T> xy) {
        super(i);
        this.zacn = xy;
    }

    public void zaa(Status status) {
        this.zacn.b((Exception) new ApiException(status));
    }

    public void zaa(zaab zaab, boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract void zad(zaa<?> zaa) throws RemoteException;

    public void zaa(RuntimeException runtimeException) {
        this.zacn.b((Exception) runtimeException);
    }

    public final void zaa(zaa<?> zaa) throws DeadObjectException {
        try {
            zad(zaa);
        } catch (DeadObjectException e) {
            zaa(zab.zaa((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            zaa(zab.zaa(e2));
        } catch (RuntimeException e3) {
            zaa(e3);
        }
    }
}
