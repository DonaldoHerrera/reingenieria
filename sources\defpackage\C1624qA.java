package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: qA reason: default package and case insensitive filesystem */
final class C1624qA extends C1593pA<C1284fA> {
    private final String d;

    C1624qA(C1469lA lAVar, YB<C1284fA> yb, String str) {
        super(lAVar, new C1893zA("OnRequestInstallCallback"), yb);
        this.d = str;
    }

    public final void d(Bundle bundle) throws RemoteException {
        super.d(bundle);
        if (C1469lA.b(bundle) == 0 || C1469lA.b(bundle) == 1) {
            this.b.a(C1469lA.b(bundle, this.d));
        } else {
            this.b.a((Exception) new C1653rA(C1469lA.b(bundle)));
        }
    }
}
