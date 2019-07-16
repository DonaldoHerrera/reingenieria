package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class La extends C0732w implements Ma {
    La(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    public final void a(String str, Bundle bundle) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        V.a(C, (Parcelable) bundle);
        b(4, C);
    }

    public final void b(String str, Bundle bundle) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        V.a(C, (Parcelable) bundle);
        b(3, C);
    }

    public final void c(String str, Bundle bundle) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        V.a(C, (Parcelable) bundle);
        b(2, C);
    }

    public final void d(String str, Bundle bundle) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        V.a(C, (Parcelable) bundle);
        b(1, C);
    }

    public final void a(String str, Bundle bundle, int i) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        V.a(C, (Parcelable) bundle);
        C.writeInt(i);
        b(6, C);
    }
}
