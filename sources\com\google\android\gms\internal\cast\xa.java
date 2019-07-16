package com.google.android.gms.internal.cast;

import android.os.IInterface;
import android.os.RemoteException;
import android.view.Surface;

public interface xa extends IInterface {
    void A() throws RemoteException;

    void a(int i, int i2, Surface surface) throws RemoteException;

    void onError(int i) throws RemoteException;

    void zzd() throws RemoteException;
}
