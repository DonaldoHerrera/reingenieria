package com.google.android.gms.cast.framework;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;

public interface J extends IInterface {
    int a() throws RemoteException;

    void a(String str) throws RemoteException;

    void a(String str, LaunchOptions launchOptions) throws RemoteException;

    void b(String str, String str2) throws RemoteException;

    void j(int i) throws RemoteException;
}
