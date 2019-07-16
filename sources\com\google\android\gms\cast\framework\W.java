package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0732w;
import com.google.android.gms.internal.cast.V;

public final class W extends C0732w implements U {
    W(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    public final Dr d() throws RemoteException {
        Parcel a = a(1, C());
        Dr asInterface = a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    public final void g(int i) throws RemoteException {
        Parcel C = C();
        C.writeInt(i);
        b(15, C);
    }

    public final boolean isConnected() throws RemoteException {
        Parcel a = a(5, C());
        boolean a2 = V.a(a);
        a.recycle();
        return a2;
    }

    public final boolean isConnecting() throws RemoteException {
        Parcel a = a(6, C());
        boolean a2 = V.a(a);
        a.recycle();
        return a2;
    }

    public final void k(int i) throws RemoteException {
        Parcel C = C();
        C.writeInt(i);
        b(13, C);
    }

    public final void l(int i) throws RemoteException {
        Parcel C = C();
        C.writeInt(i);
        b(12, C);
    }

    public final boolean r() throws RemoteException {
        Parcel a = a(9, C());
        boolean a2 = V.a(a);
        a.recycle();
        return a2;
    }
}
