package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;

public interface f extends IInterface {
    void a(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException;

    void a(zah zah, d dVar) throws RemoteException;

    void e(int i) throws RemoteException;
}
