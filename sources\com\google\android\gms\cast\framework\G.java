package com.google.android.gms.cast.framework;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0693a;
import com.google.android.gms.internal.cast.V;

public abstract class G extends C0693a implements H {
    public G() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Dr f = f();
            parcel2.writeNoException();
            V.a(parcel2, (IInterface) f);
        } else if (i == 2) {
            g();
            parcel2.writeNoException();
        } else if (i == 3) {
            h();
            parcel2.writeNoException();
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
