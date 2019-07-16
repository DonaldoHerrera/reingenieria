package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0732w;

public final class Q extends C0732w implements S {
    Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    public final Dr i() throws RemoteException {
        Parcel a = a(5, C());
        Dr asInterface = a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }
}
