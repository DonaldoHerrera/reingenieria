package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.if reason: invalid class name */
public final class Cif extends C1034s implements C0973he {
    Cif(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeLong(j);
        b(23, C);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        Ia.a(C, (Parcelable) bundle);
        b(9, C);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeLong(j);
        b(24, C);
    }

    public final void generateEventId(zf zfVar) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) zfVar);
        b(22, C);
    }

    public final void getCachedAppInstanceId(zf zfVar) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) zfVar);
        b(19, C);
    }

    public final void getConditionalUserProperties(String str, String str2, zf zfVar) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        Ia.a(C, (IInterface) zfVar);
        b(10, C);
    }

    public final void getCurrentScreenClass(zf zfVar) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) zfVar);
        b(17, C);
    }

    public final void getCurrentScreenName(zf zfVar) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) zfVar);
        b(16, C);
    }

    public final void getGmpAppId(zf zfVar) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) zfVar);
        b(21, C);
    }

    public final void getMaxUserProperties(String str, zf zfVar) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        Ia.a(C, (IInterface) zfVar);
        b(6, C);
    }

    public final void getUserProperties(String str, String str2, boolean z, zf zfVar) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        Ia.a(C, z);
        Ia.a(C, (IInterface) zfVar);
        b(5, C);
    }

    public final void initialize(Dr dr, zzx zzx, long j) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) dr);
        Ia.a(C, (Parcelable) zzx);
        C.writeLong(j);
        b(1, C);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        Ia.a(C, (Parcelable) bundle);
        Ia.a(C, z);
        Ia.a(C, z2);
        C.writeLong(j);
        b(2, C);
    }

    public final void logHealthData(int i, String str, Dr dr, Dr dr2, Dr dr3) throws RemoteException {
        Parcel C = C();
        C.writeInt(i);
        C.writeString(str);
        Ia.a(C, (IInterface) dr);
        Ia.a(C, (IInterface) dr2);
        Ia.a(C, (IInterface) dr3);
        b(33, C);
    }

    public final void onActivityCreated(Dr dr, Bundle bundle, long j) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) dr);
        Ia.a(C, (Parcelable) bundle);
        C.writeLong(j);
        b(27, C);
    }

    public final void onActivityDestroyed(Dr dr, long j) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) dr);
        C.writeLong(j);
        b(28, C);
    }

    public final void onActivityPaused(Dr dr, long j) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) dr);
        C.writeLong(j);
        b(29, C);
    }

    public final void onActivityResumed(Dr dr, long j) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) dr);
        C.writeLong(j);
        b(30, C);
    }

    public final void onActivitySaveInstanceState(Dr dr, zf zfVar, long j) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) dr);
        Ia.a(C, (IInterface) zfVar);
        C.writeLong(j);
        b(31, C);
    }

    public final void onActivityStarted(Dr dr, long j) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) dr);
        C.writeLong(j);
        b(25, C);
    }

    public final void onActivityStopped(Dr dr, long j) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) dr);
        C.writeLong(j);
        b(26, C);
    }

    public final void registerOnMeasurementEventListener(Af af) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) af);
        b(35, C);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (Parcelable) bundle);
        C.writeLong(j);
        b(8, C);
    }

    public final void setCurrentScreen(Dr dr, String str, String str2, long j) throws RemoteException {
        Parcel C = C();
        Ia.a(C, (IInterface) dr);
        C.writeString(str);
        C.writeString(str2);
        C.writeLong(j);
        b(15, C);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel C = C();
        Ia.a(C, z);
        b(39, C);
    }

    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel C = C();
        Ia.a(C, z);
        C.writeLong(j);
        b(11, C);
    }

    public final void setUserProperty(String str, String str2, Dr dr, boolean z, long j) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C.writeString(str2);
        Ia.a(C, (IInterface) dr);
        Ia.a(C, z);
        C.writeLong(j);
        b(4, C);
    }
}
