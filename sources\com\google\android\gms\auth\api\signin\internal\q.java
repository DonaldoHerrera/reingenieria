package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class q extends Qr implements p {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                a((GoogleSignInAccount) Rr.a(parcel, GoogleSignInAccount.CREATOR), (Status) Rr.a(parcel, Status.CREATOR));
                throw null;
            case 102:
                d((Status) Rr.a(parcel, Status.CREATOR));
                throw null;
            case 103:
                e((Status) Rr.a(parcel, Status.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
