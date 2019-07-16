package com.google.android.gms.measurement.internal;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

public interface _a extends IInterface {
    List<zzjn> a(zzn zzn, boolean z) throws RemoteException;

    List<zzq> a(String str, String str2, zzn zzn) throws RemoteException;

    List<zzq> a(String str, String str2, String str3) throws RemoteException;

    List<zzjn> a(String str, String str2, String str3, boolean z) throws RemoteException;

    List<zzjn> a(String str, String str2, boolean z, zzn zzn) throws RemoteException;

    void a(long j, String str, String str2, String str3) throws RemoteException;

    void a(zzai zzai, zzn zzn) throws RemoteException;

    void a(zzai zzai, String str, String str2) throws RemoteException;

    void a(zzjn zzjn, zzn zzn) throws RemoteException;

    void a(zzn zzn) throws RemoteException;

    void a(zzq zzq) throws RemoteException;

    void a(zzq zzq, zzn zzn) throws RemoteException;

    byte[] a(zzai zzai, String str) throws RemoteException;

    void b(zzn zzn) throws RemoteException;

    String c(zzn zzn) throws RemoteException;

    void d(zzn zzn) throws RemoteException;
}
