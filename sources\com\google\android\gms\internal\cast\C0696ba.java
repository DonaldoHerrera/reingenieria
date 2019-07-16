package com.google.android.gms.internal.cast;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;

/* renamed from: com.google.android.gms.internal.cast.ba reason: case insensitive filesystem */
public interface C0696ba extends IInterface {
    void a(int i) throws RemoteException;

    void a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) throws RemoteException;

    void a(zzcj zzcj) throws RemoteException;

    void a(zzdb zzdb) throws RemoteException;

    void a(String str, double d, boolean z) throws RemoteException;

    void a(String str, long j) throws RemoteException;

    void a(String str, long j, int i) throws RemoteException;

    void a(String str, String str2) throws RemoteException;

    void a(String str, byte[] bArr) throws RemoteException;

    void b(int i) throws RemoteException;

    void c(int i) throws RemoteException;

    void f(int i) throws RemoteException;

    void h(int i) throws RemoteException;
}
