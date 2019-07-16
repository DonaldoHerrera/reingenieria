package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class j extends C1824ws implements i {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final Dr a(Dr dr, String str, int i) throws RemoteException {
        Parcel zza = zza();
        C1884ys.a(zza, (IInterface) dr);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zza2 = zza(2, zza);
        Dr asInterface = a.asInterface(zza2.readStrongBinder());
        zza2.recycle();
        return asInterface;
    }

    public final int b(Dr dr, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        C1884ys.a(zza, (IInterface) dr);
        zza.writeString(str);
        C1884ys.a(zza, z);
        Parcel zza2 = zza(3, zza);
        int readInt = zza2.readInt();
        zza2.recycle();
        return readInt;
    }

    public final int t() throws RemoteException {
        Parcel zza = zza(6, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final int a(Dr dr, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        C1884ys.a(zza, (IInterface) dr);
        zza.writeString(str);
        C1884ys.a(zza, z);
        Parcel zza2 = zza(5, zza);
        int readInt = zza2.readInt();
        zza2.recycle();
        return readInt;
    }

    public final Dr b(Dr dr, String str, int i) throws RemoteException {
        Parcel zza = zza();
        C1884ys.a(zza, (IInterface) dr);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zza2 = zza(4, zza);
        Dr asInterface = a.asInterface(zza2.readStrongBinder());
        zza2.recycle();
        return asInterface;
    }
}
