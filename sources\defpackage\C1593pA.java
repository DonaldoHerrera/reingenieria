package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: pA reason: default package and case insensitive filesystem */
class C1593pA<T> extends C1594pB {
    private final C1893zA a;
    final YB<T> b;
    private final /* synthetic */ C1469lA c;

    C1593pA(C1469lA lAVar, C1893zA zAVar, YB<T> yb) {
        this.c = lAVar;
        this.a = zAVar;
        this.b = yb;
    }

    public void a(Bundle bundle) throws RemoteException {
        this.c.c.a();
        this.a.a("onCompleteUpdate", new Object[0]);
    }

    public void d(Bundle bundle) throws RemoteException {
        this.c.c.a();
        this.a.a("onRequestInfo", new Object[0]);
    }
}
