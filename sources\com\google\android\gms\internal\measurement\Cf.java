package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class Cf extends C1034s implements Af {
    Cf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final int id() throws RemoteException {
        Parcel a = a(2, C());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        Ia.a(C, (Parcelable) bundle);
        C.writeLong(j);
        b(1, C);
    }
}
