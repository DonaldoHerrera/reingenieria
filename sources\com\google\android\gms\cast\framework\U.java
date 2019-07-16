package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0693a;

public interface U extends IInterface {

    public static abstract class a extends C0693a implements U {
        public static U a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof U) {
                return (U) queryLocalInterface;
            }
            return new W(iBinder);
        }
    }

    Dr d() throws RemoteException;

    void g(int i) throws RemoteException;

    boolean isConnected() throws RemoteException;

    boolean isConnecting() throws RemoteException;

    void k(int i) throws RemoteException;

    void l(int i) throws RemoteException;

    boolean r() throws RemoteException;
}
