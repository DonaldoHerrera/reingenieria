package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager.zaa;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;

public final class zah extends zad<Boolean> {
    private final ListenerKey<?> zact;

    public zah(ListenerKey<?> listenerKey, Xy<Boolean> xy) {
        super(4, xy);
        this.zact = listenerKey;
    }

    public final /* bridge */ /* synthetic */ void zaa(zaab zaab, boolean z) {
    }

    public final /* bridge */ /* synthetic */ void zaa(RuntimeException runtimeException) {
        super.zaa(runtimeException);
    }

    public final Feature[] zab(zaa<?> zaa) {
        zabw zabw = (zabw) zaa.zabk().get(this.zact);
        if (zabw == null) {
            return null;
        }
        return zabw.zajx.getRequiredFeatures();
    }

    public final boolean zac(zaa<?> zaa) {
        zabw zabw = (zabw) zaa.zabk().get(this.zact);
        return zabw != null && zabw.zajx.shouldAutoResolveMissingFeatures();
    }

    public final void zad(zaa<?> zaa) throws RemoteException {
        zabw zabw = (zabw) zaa.zabk().remove(this.zact);
        if (zabw != null) {
            zabw.zajy.unregisterListener(zaa.zaab(), this.zacn);
            zabw.zajx.clearListener();
            return;
        }
        this.zacn.b(Boolean.valueOf(false));
    }

    public final /* bridge */ /* synthetic */ void zaa(Status status) {
        super.zaa(status);
    }
}
