package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0732w;

public final class V extends C0732w implements T {
    V(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    public final int a(Intent intent, int i, int i2) throws RemoteException {
        Parcel C = C();
        com.google.android.gms.internal.cast.V.a(C, (Parcelable) intent);
        C.writeInt(i);
        C.writeInt(i2);
        Parcel a = a(2, C);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final void onCreate() throws RemoteException {
        b(1, C());
    }

    public final void onDestroy() throws RemoteException {
        b(4, C());
    }

    public final IBinder a(Intent intent) throws RemoteException {
        Parcel C = C();
        com.google.android.gms.internal.cast.V.a(C, (Parcelable) intent);
        Parcel a = a(3, C);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
