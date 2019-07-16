package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0732w;
import com.google.android.gms.internal.cast.V;

public final class M extends C0732w implements K {
    M(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    public final boolean B() throws RemoteException {
        Parcel a = a(2, C());
        boolean a2 = V.a(a);
        a.recycle();
        return a2;
    }

    public final void a(H h) throws RemoteException {
        Parcel C = C();
        V.a(C, (IInterface) h);
        b(3, C);
    }

    public final void b(H h) throws RemoteException {
        Parcel C = C();
        V.a(C, (IInterface) h);
        b(4, C);
    }

    public final Y c() throws RemoteException {
        Y y;
        Parcel a = a(5, C());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            y = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            if (queryLocalInterface instanceof Y) {
                y = (Y) queryLocalInterface;
            } else {
                y = new X(readStrongBinder);
            }
        }
        a.recycle();
        return y;
    }

    public final S k() throws RemoteException {
        S s;
        Parcel a = a(6, C());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            s = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            if (queryLocalInterface instanceof S) {
                s = (S) queryLocalInterface;
            } else {
                s = new Q(readStrongBinder);
            }
        }
        a.recycle();
        return s;
    }

    public final Bundle m() throws RemoteException {
        Parcel a = a(1, C());
        Bundle bundle = (Bundle) V.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final boolean b() throws RemoteException {
        Parcel a = a(12, C());
        boolean a2 = V.a(a);
        a.recycle();
        return a2;
    }
}
