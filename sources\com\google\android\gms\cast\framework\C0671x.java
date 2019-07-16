package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0693a;
import com.google.android.gms.internal.cast.V;

/* renamed from: com.google.android.gms.cast.framework.x reason: case insensitive filesystem */
public abstract class C0671x extends C0693a implements C0672y {
    public C0671x() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Dr z = z();
                parcel2.writeNoException();
                V.a(parcel2, (IInterface) z);
                break;
            case 2:
                e((Bundle) V.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                c((Bundle) V.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                c(V.a(parcel));
                parcel2.writeNoException();
                break;
            case 5:
                long w = w();
                parcel2.writeNoException();
                parcel2.writeLong(w);
                break;
            case 6:
                a();
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                break;
            case 7:
                f((Bundle) V.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                b((Bundle) V.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
