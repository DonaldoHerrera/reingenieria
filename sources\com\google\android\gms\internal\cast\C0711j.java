package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.cast.j reason: case insensitive filesystem */
public abstract class C0711j extends C0693a implements C0705g {
    public C0711j() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            a(parcel.readLong(), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            a();
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
