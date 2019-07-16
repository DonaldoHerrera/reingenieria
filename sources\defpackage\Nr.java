package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: Nr reason: default package */
public abstract class Nr extends Kr implements Mr {
    public static Mr a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof Mr ? (Mr) queryLocalInterface : new Or(iBinder);
    }
}
