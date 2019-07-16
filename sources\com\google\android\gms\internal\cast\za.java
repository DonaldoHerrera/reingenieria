package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;

public abstract class za extends C0693a implements xa {
    public za() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i == 2) {
                onError(parcel.readInt());
            } else if (i == 3) {
                A();
            } else if (i != 4) {
                return false;
            } else {
                zzd();
                throw null;
            }
            parcel2.writeNoException();
            return true;
        }
        a(parcel.readInt(), parcel.readInt(), (Surface) V.a(parcel, Surface.CREATOR));
        throw null;
    }
}
