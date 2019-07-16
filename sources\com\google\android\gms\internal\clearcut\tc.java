package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zze;

public final class tc extends C0736a implements sc {
    tc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void a(qc qcVar, zze zze) throws RemoteException {
        Parcel C = C();
        Z.a(C, (IInterface) qcVar);
        Z.a(C, (Parcelable) zze);
        a(1, C);
    }
}
