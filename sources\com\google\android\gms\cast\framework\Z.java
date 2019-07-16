package com.google.android.gms.cast.framework;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0693a;
import com.google.android.gms.internal.cast.V;

public abstract class Z extends C0693a implements aa {
    public Z() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Dr f = f();
                parcel2.writeNoException();
                V.a(parcel2, (IInterface) f);
                break;
            case 2:
                b(a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 3:
                b(a.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 4:
                c(a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 5:
                a(a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 6:
                d(a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 7:
                a(a.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 8:
                a(a.asInterface(parcel.readStrongBinder()), V.a(parcel));
                parcel2.writeNoException();
                break;
            case 9:
                a(a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 10:
                b(a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 11:
                a();
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                break;
            default:
                return false;
        }
        return true;
    }
}
