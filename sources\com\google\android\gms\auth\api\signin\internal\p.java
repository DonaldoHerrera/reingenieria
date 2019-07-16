package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public interface p extends IInterface {
    void a(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;

    void d(Status status) throws RemoteException;

    void e(Status status) throws RemoteException;
}
