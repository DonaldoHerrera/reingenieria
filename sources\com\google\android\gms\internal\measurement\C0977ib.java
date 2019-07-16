package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.ib reason: case insensitive filesystem */
public abstract class C0977ib extends C0919a implements Ib {
    public static Ib a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof Ib) {
            return (Ib) queryLocalInterface;
        }
        return new C0978ic(iBinder);
    }
}
