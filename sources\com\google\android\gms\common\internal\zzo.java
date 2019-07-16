package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.zzk;

public final class zzo extends C1824ws implements zzm {
    zzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean zza(zzk zzk, Dr dr) throws RemoteException {
        Parcel zza = zza();
        C1884ys.a(zza, (Parcelable) zzk);
        C1884ys.a(zza, (IInterface) dr);
        Parcel zza2 = zza(5, zza);
        boolean a = C1884ys.a(zza2);
        zza2.recycle();
        return a;
    }
}
