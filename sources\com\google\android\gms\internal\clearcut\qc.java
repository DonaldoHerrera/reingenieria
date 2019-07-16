package com.google.android.gms.internal.clearcut;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public interface qc extends IInterface {
    void a(Status status) throws RemoteException;

    void a(Status status, long j) throws RemoteException;

    void a(Status status, zzc zzc) throws RemoteException;

    void a(Status status, zze[] zzeArr) throws RemoteException;

    void a(DataHolder dataHolder) throws RemoteException;

    void b(Status status) throws RemoteException;

    void b(Status status, long j) throws RemoteException;

    void b(Status status, zzc zzc) throws RemoteException;

    void c(Status status) throws RemoteException;
}
