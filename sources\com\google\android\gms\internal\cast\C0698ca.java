package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzah;

/* renamed from: com.google.android.gms.internal.cast.ca reason: case insensitive filesystem */
public final class C0698ca extends C0732w implements Z {
    C0698ca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    public final void a(String str) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        c(5, C);
    }

    public final void b(String str, LaunchOptions launchOptions) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        V.a(C, (Parcelable) launchOptions);
        c(13, C);
    }

    public final void disconnect() throws RemoteException {
        c(1, C());
    }

    public final void e(String str) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        c(11, C);
    }

    public final void f(String str) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        c(12, C);
    }

    public final void a(boolean z, double d, boolean z2) throws RemoteException {
        Parcel C = C();
        V.a(C, z);
        C.writeDouble(d);
        V.a(C, z2);
        c(8, C);
    }

    public final void a(String str, String str2, long j) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        C.writeLong(j);
        c(9, C);
    }

    public final void a(String str, String str2, zzah zzah) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        V.a(C, (Parcelable) zzah);
        c(14, C);
    }
}
