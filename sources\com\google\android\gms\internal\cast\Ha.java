package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.C0672y;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.J;
import com.google.android.gms.cast.framework.K;
import com.google.android.gms.cast.framework.K.a;
import com.google.android.gms.cast.framework.L;
import com.google.android.gms.cast.framework.T;
import com.google.android.gms.cast.framework.U;
import java.util.Map;

public final class Ha extends C0732w implements Ia {
    Ha(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    public final K a(Dr dr, CastOptions castOptions, Ka ka, Map map) throws RemoteException {
        Parcel C = C();
        V.a(C, (IInterface) dr);
        V.a(C, (Parcelable) castOptions);
        V.a(C, (IInterface) ka);
        C.writeMap(map);
        Parcel a = a(1, C);
        K a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final U a(String str, String str2, C0672y yVar) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        V.a(C, (IInterface) yVar);
        Parcel a = a(2, C);
        U a2 = U.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final L a(CastOptions castOptions, Dr dr, J j) throws RemoteException {
        Parcel C = C();
        V.a(C, (Parcelable) castOptions);
        V.a(C, (IInterface) dr);
        V.a(C, (IInterface) j);
        Parcel a = a(3, C);
        L a2 = L.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final T a(Dr dr, Dr dr2, Dr dr3) throws RemoteException {
        Parcel C = C();
        V.a(C, (IInterface) dr);
        V.a(C, (IInterface) dr2);
        V.a(C, (IInterface) dr3);
        Parcel a = a(5, C);
        T a2 = T.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final C0703f a(Dr dr, C0705g gVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) throws RemoteException {
        Parcel C = C();
        V.a(C, (IInterface) dr);
        V.a(C, (IInterface) gVar);
        C.writeInt(i);
        C.writeInt(i2);
        V.a(C, z);
        C.writeLong(j);
        C.writeInt(i3);
        C.writeInt(i4);
        C.writeInt(i5);
        Parcel a = a(6, C);
        C0703f a2 = C0703f.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
