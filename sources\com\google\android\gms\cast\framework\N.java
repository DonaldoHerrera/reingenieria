package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.cast.C0732w;
import com.google.android.gms.internal.cast.V;

public final class N extends C0732w implements L {
    N(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    public final void a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) throws RemoteException {
        Parcel C = C();
        V.a(C, (Parcelable) applicationMetadata);
        C.writeString(str);
        C.writeString(str2);
        V.a(C, z);
        b(4, C);
    }

    public final void onConnected(Bundle bundle) throws RemoteException {
        Parcel C = C();
        V.a(C, (Parcelable) bundle);
        b(1, C);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) throws RemoteException {
        Parcel C = C();
        V.a(C, (Parcelable) connectionResult);
        b(3, C);
    }

    public final void onConnectionSuspended(int i) throws RemoteException {
        Parcel C = C();
        C.writeInt(i);
        b(2, C);
    }

    public final void a(int i) throws RemoteException {
        Parcel C = C();
        C.writeInt(i);
        b(5, C);
    }

    public final void a(boolean z, int i) throws RemoteException {
        Parcel C = C();
        V.a(C, z);
        C.writeInt(0);
        b(6, C);
    }
}
