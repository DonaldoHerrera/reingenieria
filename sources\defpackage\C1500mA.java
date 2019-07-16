package defpackage;

import android.os.RemoteException;

/* renamed from: mA reason: default package and case insensitive filesystem */
final class C1500mA extends C1684sB {
    private final /* synthetic */ YB b;
    private final /* synthetic */ String c;
    private final /* synthetic */ C1469lA d;

    C1500mA(C1469lA lAVar, YB yb, YB yb2, String str) {
        this.d = lAVar;
        this.b = yb2;
        this.c = str;
        super(yb);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((C1501mB) this.d.c.b()).b(this.d.d, C1469lA.c(), new C1562oA(this.d, this.b));
        } catch (RemoteException e) {
            C1469lA.a.a((Throwable) e, "completeUpdate(%s)", this.c);
            this.b.a((Exception) new RuntimeException(e));
        }
    }
}
