package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.internal.cast.C0693a;
import com.google.android.gms.internal.cast.V;

public abstract class I extends C0693a implements J {
    public I() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            b(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
        } else if (i == 2) {
            a(parcel.readString(), (LaunchOptions) V.a(parcel, LaunchOptions.CREATOR));
            parcel2.writeNoException();
        } else if (i == 3) {
            a(parcel.readString());
            parcel2.writeNoException();
        } else if (i == 4) {
            j(parcel.readInt());
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            a();
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
