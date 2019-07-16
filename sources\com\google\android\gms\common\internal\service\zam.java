package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zam extends C1337gs implements zal {
    zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zaa(zaj zaj) throws RemoteException {
        Parcel zaa = zaa();
        C1398is.a(zaa, (IInterface) zaj);
        zac(1, zaa);
    }
}
