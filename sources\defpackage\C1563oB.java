package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: oB reason: default package and case insensitive filesystem */
public abstract class C1563oB extends C1470lB implements C1501mB {
    public static C1501mB a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof C1501mB ? (C1501mB) queryLocalInterface : new C1532nB(iBinder);
    }
}
