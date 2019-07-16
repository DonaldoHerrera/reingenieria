package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: nB reason: default package and case insensitive filesystem */
public final class C1532nB extends C1378iB implements C1501mB {
    C1532nB(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    public final void a(String str, Bundle bundle, C1625qB qBVar) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C1439kB.a(C, (Parcelable) bundle);
        C1439kB.a(C, (IInterface) qBVar);
        a(2, C);
    }

    public final void b(String str, Bundle bundle, C1625qB qBVar) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        C1439kB.a(C, (Parcelable) bundle);
        C1439kB.a(C, (IInterface) qBVar);
        a(3, C);
    }
}
