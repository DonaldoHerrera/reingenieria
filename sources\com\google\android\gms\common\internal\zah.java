package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zah extends C1337gs implements ISignInButtonCreator {
    zah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final Dr newSignInButton(Dr dr, int i, int i2) throws RemoteException {
        Parcel zaa = zaa();
        C1398is.a(zaa, (IInterface) dr);
        zaa.writeInt(i);
        zaa.writeInt(i2);
        Parcel zaa2 = zaa(1, zaa);
        Dr asInterface = a.asInterface(zaa2.readStrongBinder());
        zaa2.recycle();
        return asInterface;
    }

    public final Dr newSignInButtonFromConfig(Dr dr, SignInButtonConfig signInButtonConfig) throws RemoteException {
        Parcel zaa = zaa();
        C1398is.a(zaa, (IInterface) dr);
        C1398is.a(zaa, (Parcelable) signInButtonConfig);
        Parcel zaa2 = zaa(2, zaa);
        Dr asInterface = a.asInterface(zaa2.readStrongBinder());
        zaa2.recycle();
        return asInterface;
    }
}
