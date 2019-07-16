package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: Ey reason: default package */
public class Ey implements IInterface {
    private final IBinder a;
    private final String b;

    protected Ey(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    public IBinder asBinder() {
        return this.a;
    }
}
