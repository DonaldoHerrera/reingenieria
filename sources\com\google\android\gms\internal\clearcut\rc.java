package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class rc extends C0807y implements qc {
    public rc() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                a((Status) Z.a(parcel, Status.CREATOR));
                return true;
            case 2:
                b((Status) Z.a(parcel, Status.CREATOR));
                throw null;
            case 3:
                a((Status) Z.a(parcel, Status.CREATOR), parcel.readLong());
                throw null;
            case 4:
                c((Status) Z.a(parcel, Status.CREATOR));
                throw null;
            case 5:
                b((Status) Z.a(parcel, Status.CREATOR), parcel.readLong());
                throw null;
            case 6:
                a((Status) Z.a(parcel, Status.CREATOR), (zze[]) parcel.createTypedArray(zze.CREATOR));
                throw null;
            case 7:
                a((DataHolder) Z.a(parcel, DataHolder.CREATOR));
                throw null;
            case 8:
                a((Status) Z.a(parcel, Status.CREATOR), (zzc) Z.a(parcel, zzc.CREATOR));
                throw null;
            case 9:
                b((Status) Z.a(parcel, Status.CREATOR), (zzc) Z.a(parcel, zzc.CREATOR));
                throw null;
            default:
                return false;
        }
    }
}
