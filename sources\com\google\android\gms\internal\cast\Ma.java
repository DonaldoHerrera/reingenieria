package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

public interface Ma extends IInterface {
    void a(String str, Bundle bundle) throws RemoteException;

    void a(String str, Bundle bundle, int i) throws RemoteException;

    void b(String str, Bundle bundle) throws RemoteException;

    void c(String str, Bundle bundle) throws RemoteException;

    void d(String str, Bundle bundle) throws RemoteException;
}
