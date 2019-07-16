package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C1034s;
import com.google.android.gms.internal.measurement.Ia;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.bb reason: case insensitive filesystem */
public final class C1089bb extends C1034s implements _a {
    C1089bb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void a(zzai zzai, zzn zzn) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) zzai);
        Ia.a(C, (Parcelable) zzn);
        b(1, C);
    }

    public final void b(zzn zzn) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) zzn);
        b(6, C);
    }

    public final String c(zzn zzn) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) zzn);
        Parcel a = a(11, C);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void d(zzn zzn) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) zzn);
        b(18, C);
    }

    public final void a(zzjn zzjn, zzn zzn) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) zzjn);
        Ia.a(C, (Parcelable) zzn);
        b(2, C);
    }

    public final void a(zzn zzn) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) zzn);
        b(4, C);
    }

    public final void a(zzai zzai, String str, String str2) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) zzai);
        C.writeString(str);
        C.writeString(str2);
        b(5, C);
    }

    public final List<zzjn> a(zzn zzn, boolean z) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) zzn);
        Ia.a(C, z);
        Parcel a = a(7, C);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzjn.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final byte[] a(zzai zzai, String str) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) zzai);
        C.writeString(str);
        Parcel a = a(9, C);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }

    public final void a(long j, String str, String str2, String str3) throws RemoteException {
        Parcel C = C();
        C.writeLong(j);
        C.writeString(str);
        C.writeString(str2);
        C.writeString(str3);
        b(10, C);
    }

    public final void a(zzq zzq, zzn zzn) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) zzq);
        Ia.a(C, (Parcelable) zzn);
        b(12, C);
    }

    public final void a(zzq zzq) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) zzq);
        b(13, C);
    }

    public final List<zzjn> a(String str, String str2, boolean z, zzn zzn) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        Ia.a(C, z);
        Ia.a(C, (Parcelable) zzn);
        Parcel a = a(14, C);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzjn.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<zzjn> a(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        C.writeString(str3);
        Ia.a(C, z);
        Parcel a = a(15, C);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzjn.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<zzq> a(String str, String str2, zzn zzn) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        Ia.a(C, (Parcelable) zzn);
        Parcel a = a(16, C);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzq.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<zzq> a(String str, String str2, String str3) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        C.writeString(str3);
        Parcel a = a(17, C);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzq.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }
}
