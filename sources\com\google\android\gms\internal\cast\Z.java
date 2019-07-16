package com.google.android.gms.internal.cast;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzah;

public interface Z extends IInterface {
    void a(String str) throws RemoteException;

    void a(String str, String str2, long j) throws RemoteException;

    void a(String str, String str2, zzah zzah) throws RemoteException;

    void a(boolean z, double d, boolean z2) throws RemoteException;

    void b(String str, LaunchOptions launchOptions) throws RemoteException;

    void disconnect() throws RemoteException;

    void e(String str) throws RemoteException;

    void f(String str) throws RemoteException;
}
