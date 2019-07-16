package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzn extends C1854xs implements zzm {
    public static zzm zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof zzm) {
            return (zzm) queryLocalInterface;
        }
        return new zzo(iBinder);
    }
}
