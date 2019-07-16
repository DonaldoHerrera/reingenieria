package com.google.android.gms.cast.framework;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0693a;
import com.google.android.gms.internal.cast.V;

public abstract class ba extends C0693a implements C0670w {
    public ba() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Dr c = c(parcel.readString());
            parcel2.writeNoException();
            V.a(parcel2, (IInterface) c);
        } else if (i == 2) {
            boolean q = q();
            parcel2.writeNoException();
            V.a(parcel2, q);
        } else if (i == 3) {
            String u = u();
            parcel2.writeNoException();
            parcel2.writeString(u);
        } else if (i != 4) {
            return false;
        } else {
            a();
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
