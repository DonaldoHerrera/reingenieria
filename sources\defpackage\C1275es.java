package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: es reason: default package and case insensitive filesystem */
public abstract class C1275es extends C0503bs implements C1244ds {
    public static C1244ds a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (queryLocalInterface instanceof C1244ds) {
            return (C1244ds) queryLocalInterface;
        }
        return new C1306fs(iBinder);
    }
}
