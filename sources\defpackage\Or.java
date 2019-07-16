package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Or reason: default package */
public final class Or extends Jr implements Mr {
    Or(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final boolean b(boolean z) throws RemoteException {
        Parcel C = C();
        Lr.a(C, true);
        Parcel a = a(2, C);
        boolean a2 = Lr.a(a);
        a.recycle();
        return a2;
    }

    public final String getId() throws RemoteException {
        Parcel a = a(1, C());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean zzc() throws RemoteException {
        Parcel a = a(6, C());
        boolean a2 = Lr.a(a);
        a.recycle();
        return a2;
    }
}
