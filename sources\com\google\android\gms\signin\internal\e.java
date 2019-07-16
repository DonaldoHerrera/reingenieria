package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public abstract class e extends C1368hs implements d {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 3) {
            zaa((ConnectionResult) C1398is.a(parcel, ConnectionResult.CREATOR), (zaa) C1398is.a(parcel, zaa.CREATOR));
        } else if (i == 4) {
            zag((Status) C1398is.a(parcel, Status.CREATOR));
        } else if (i == 6) {
            zah((Status) C1398is.a(parcel, Status.CREATOR));
        } else if (i == 7) {
            zaa((Status) C1398is.a(parcel, Status.CREATOR), (GoogleSignInAccount) C1398is.a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            zab((zaj) C1398is.a(parcel, zaj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
