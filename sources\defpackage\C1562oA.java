package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: oA reason: default package and case insensitive filesystem */
final class C1562oA extends C1593pA<Void> {
    C1562oA(C1469lA lAVar, YB<Void> yb) {
        super(lAVar, new C1893zA("OnCompleteUpdateCallback"), yb);
    }

    public final void a(Bundle bundle) throws RemoteException {
        super.a(bundle);
        if (C1469lA.b(bundle) != 0) {
            this.b.a((Exception) new C1653rA(C1469lA.b(bundle)));
        } else {
            this.b.a(null);
        }
    }
}
