package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0732w;
import com.google.android.gms.internal.cast.V;

public final class X extends C0732w implements Y {
    X(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    public final void a(aa aaVar) throws RemoteException {
        Parcel C = C();
        V.a(C, (IInterface) aaVar);
        b(3, C);
    }

    public final void b(aa aaVar) throws RemoteException {
        Parcel C = C();
        V.a(C, (IInterface) aaVar);
        b(2, C);
    }

    public final Dr e() throws RemoteException {
        Parcel a = a(1, C());
        Dr asInterface = a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    public final Dr i() throws RemoteException {
        Parcel a = a(7, C());
        Dr asInterface = a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    public final void a(P p) throws RemoteException {
        Parcel C = C();
        V.a(C, (IInterface) p);
        b(4, C);
    }

    public final void a(boolean z, boolean z2) throws RemoteException {
        Parcel C = C();
        V.a(C, true);
        V.a(C, z2);
        b(6, C);
    }
}
