package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;

public final class g extends C1337gs implements f {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel zaa = zaa();
        C1398is.a(zaa, (IInterface) iAccountAccessor);
        zaa.writeInt(i);
        C1398is.a(zaa, z);
        zab(9, zaa);
    }

    public final void e(int i) throws RemoteException {
        Parcel zaa = zaa();
        zaa.writeInt(i);
        zab(7, zaa);
    }

    public final void a(zah zah, d dVar) throws RemoteException {
        Parcel zaa = zaa();
        C1398is.a(zaa, (Parcelable) zah);
        C1398is.a(zaa, (IInterface) dVar);
        zab(12, zaa);
    }
}
