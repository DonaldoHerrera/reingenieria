package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzk extends C1824ws implements zzi {
    zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final Dr zzb() throws RemoteException {
        Parcel zza = zza(1, zza());
        Dr asInterface = a.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    public final int zzc() throws RemoteException {
        Parcel zza = zza(2, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
