package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: pB reason: default package and case insensitive filesystem */
public abstract class C1594pB extends C1470lB implements C1625qB {
    public C1594pB() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel) throws RemoteException {
        if (i == 2) {
            d((Bundle) C1439kB.a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            a((Bundle) C1439kB.a(parcel, Bundle.CREATOR));
        }
        return true;
    }
}
