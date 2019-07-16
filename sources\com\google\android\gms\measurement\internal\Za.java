package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C0919a;
import com.google.android.gms.internal.measurement.Ia;
import java.util.List;

public abstract class Za extends C0919a implements _a {
    public Za() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                a((zzai) Ia.a(parcel, zzai.CREATOR), (zzn) Ia.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                a((zzjn) Ia.a(parcel, zzjn.CREATOR), (zzn) Ia.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                a((zzn) Ia.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                a((zzai) Ia.a(parcel, zzai.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                b((zzn) Ia.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                List a = a((zzn) Ia.a(parcel, zzn.CREATOR), Ia.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                break;
            case 9:
                byte[] a2 = a((zzai) Ia.a(parcel, zzai.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                break;
            case 10:
                a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String c = c((zzn) Ia.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 12:
                a((zzq) Ia.a(parcel, zzq.CREATOR), (zzn) Ia.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                a((zzq) Ia.a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                List a3 = a(parcel.readString(), parcel.readString(), Ia.a(parcel), (zzn) Ia.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                break;
            case 15:
                List a4 = a(parcel.readString(), parcel.readString(), parcel.readString(), Ia.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                break;
            case 16:
                List a5 = a(parcel.readString(), parcel.readString(), (zzn) Ia.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                break;
            case 17:
                List a6 = a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                break;
            case 18:
                d((zzn) Ia.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
