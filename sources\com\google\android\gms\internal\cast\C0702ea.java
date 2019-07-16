package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;

/* renamed from: com.google.android.gms.internal.cast.ea reason: case insensitive filesystem */
public abstract class C0702ea extends C0693a implements C0696ba {
    public C0702ea() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                b(parcel.readInt());
                break;
            case 2:
                a((ApplicationMetadata) V.a(parcel, ApplicationMetadata.CREATOR), parcel.readString(), parcel.readString(), V.a(parcel));
                break;
            case 3:
                a(parcel.readInt());
                break;
            case 4:
                a(parcel.readString(), parcel.readDouble(), V.a(parcel));
                break;
            case 5:
                a(parcel.readString(), parcel.readString());
                break;
            case 6:
                a(parcel.readString(), parcel.createByteArray());
                break;
            case 7:
                f(parcel.readInt());
                break;
            case 8:
                c(parcel.readInt());
                break;
            case 9:
                h(parcel.readInt());
                break;
            case 10:
                a(parcel.readString(), parcel.readLong(), parcel.readInt());
                break;
            case 11:
                a(parcel.readString(), parcel.readLong());
                break;
            case 12:
                a((zzcj) V.a(parcel, zzcj.CREATOR));
                break;
            case 13:
                a((zzdb) V.a(parcel, zzdb.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
