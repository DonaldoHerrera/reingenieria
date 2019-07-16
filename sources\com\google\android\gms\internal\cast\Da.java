package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class Da extends C0693a implements Aa {
    public Da() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        i(parcel.readInt());
        return true;
    }
}
