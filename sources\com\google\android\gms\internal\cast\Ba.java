package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class Ba extends C0732w implements ya {
    Ba(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
    }

    public final void a(xa xaVar) throws RemoteException {
        Parcel C = C();
        V.a(C, (IInterface) xaVar);
        c(6, C);
    }

    public final void disconnect() throws RemoteException {
        c(3, C());
    }
}
