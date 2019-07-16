package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.cast.C0693a;

public interface L extends IInterface {

    public static abstract class a extends C0693a implements L {
        public static L a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof L) {
                return (L) queryLocalInterface;
            }
            return new N(iBinder);
        }
    }

    void a(int i) throws RemoteException;

    void a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) throws RemoteException;

    void a(boolean z, int i) throws RemoteException;

    void onConnected(Bundle bundle) throws RemoteException;

    void onConnectionFailed(ConnectionResult connectionResult) throws RemoteException;

    void onConnectionSuspended(int i) throws RemoteException;
}
