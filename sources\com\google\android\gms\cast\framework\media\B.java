package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0732w;

public final class B extends C0732w implements v {
    B(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    public final Dr l() throws RemoteException {
        Parcel a = a(2, C());
        Dr asInterface = a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }
}
