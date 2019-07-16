package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.RemoteException;

public interface ISignInButtonCreator extends IInterface {
    Dr newSignInButton(Dr dr, int i, int i2) throws RemoteException;

    Dr newSignInButtonFromConfig(Dr dr, SignInButtonConfig signInButtonConfig) throws RemoteException;
}
