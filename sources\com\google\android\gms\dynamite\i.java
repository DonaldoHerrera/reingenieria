package com.google.android.gms.dynamite;

import android.os.IInterface;
import android.os.RemoteException;

public interface i extends IInterface {
    int a(Dr dr, String str, boolean z) throws RemoteException;

    Dr a(Dr dr, String str, int i) throws RemoteException;

    int b(Dr dr, String str, boolean z) throws RemoteException;

    Dr b(Dr dr, String str, int i) throws RemoteException;

    int t() throws RemoteException;
}
