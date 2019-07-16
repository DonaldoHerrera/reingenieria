package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class Ja extends C0693a implements Ka {
    public Ja() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Ma ma;
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) V.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ma = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    if (queryLocalInterface instanceof Ma) {
                        ma = (Ma) queryLocalInterface;
                    } else {
                        ma = new La(readStrongBinder);
                    }
                }
                a(bundle, ma);
                parcel2.writeNoException();
                break;
            case 2:
                b((Bundle) V.a(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 3:
                g((Bundle) V.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                boolean a = a((Bundle) V.a(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                V.a(parcel2, a);
                break;
            case 5:
                b(parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                n();
                parcel2.writeNoException();
                break;
            case 7:
                boolean p = p();
                parcel2.writeNoException();
                V.a(parcel2, p);
                break;
            case 8:
                Bundle d = d(parcel.readString());
                parcel2.writeNoException();
                V.b(parcel2, d);
                break;
            case 9:
                String x = x();
                parcel2.writeNoException();
                parcel2.writeString(x);
                break;
            case 10:
                a();
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                break;
            case 11:
                y();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
