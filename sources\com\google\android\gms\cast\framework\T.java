package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0693a;

public interface T extends IInterface {

    public static abstract class a extends C0693a implements T {
        public static T a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            if (queryLocalInterface instanceof T) {
                return (T) queryLocalInterface;
            }
            return new V(iBinder);
        }
    }

    int a(Intent intent, int i, int i2) throws RemoteException;

    IBinder a(Intent intent) throws RemoteException;

    void onCreate() throws RemoteException;

    void onDestroy() throws RemoteException;
}
