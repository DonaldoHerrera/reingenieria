package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class Bf extends C1034s implements zf {
    Bf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void h(Bundle bundle) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) bundle);
        b(1, C);
    }
}
