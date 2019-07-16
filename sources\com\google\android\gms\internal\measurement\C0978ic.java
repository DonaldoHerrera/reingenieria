package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.ic reason: case insensitive filesystem */
public final class C0978ic extends C1034s implements Ib {
    C0978ic(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle i(Bundle bundle) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) bundle);
        Parcel a = a(1, C);
        Bundle bundle2 = (Bundle) Ia.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
