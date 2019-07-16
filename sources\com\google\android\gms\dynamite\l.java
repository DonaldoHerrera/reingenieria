package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class l extends C1824ws implements k {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final Dr a(Dr dr, String str, int i, Dr dr2) throws RemoteException {
        Parcel zza = zza();
        C1884ys.a(zza, (IInterface) dr);
        zza.writeString(str);
        zza.writeInt(i);
        C1884ys.a(zza, (IInterface) dr2);
        Parcel zza2 = zza(2, zza);
        Dr asInterface = a.asInterface(zza2.readStrongBinder());
        zza2.recycle();
        return asInterface;
    }

    public final Dr b(Dr dr, String str, int i, Dr dr2) throws RemoteException {
        Parcel zza = zza();
        C1884ys.a(zza, (IInterface) dr);
        zza.writeString(str);
        zza.writeInt(i);
        C1884ys.a(zza, (IInterface) dr2);
        Parcel zza2 = zza(3, zza);
        Dr asInterface = a.asInterface(zza2.readStrongBinder());
        zza2.recycle();
        return asInterface;
    }
}
