package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0693a;

public interface K extends IInterface {

    public static abstract class a extends C0693a implements K {
        public static K a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            if (queryLocalInterface instanceof K) {
                return (K) queryLocalInterface;
            }
            return new M(iBinder);
        }
    }

    boolean B() throws RemoteException;

    void a(H h) throws RemoteException;

    void b(H h) throws RemoteException;

    boolean b() throws RemoteException;

    Y c() throws RemoteException;

    S k() throws RemoteException;

    Bundle m() throws RemoteException;
}
