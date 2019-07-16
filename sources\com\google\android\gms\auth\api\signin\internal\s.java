package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class s extends Pr implements r {
    s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void a(p pVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel C = C();
        Rr.a(C, (IInterface) pVar);
        Rr.a(C, (Parcelable) googleSignInOptions);
        a(103, C);
    }
}
