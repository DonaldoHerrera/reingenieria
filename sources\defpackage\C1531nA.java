package defpackage;

import android.os.RemoteException;

/* renamed from: nA reason: default package and case insensitive filesystem */
final class C1531nA extends C1684sB {
    private final /* synthetic */ String b;
    private final /* synthetic */ YB c;
    private final /* synthetic */ C1469lA d;

    C1531nA(C1469lA lAVar, YB yb, String str, YB yb2) {
        this.d = lAVar;
        this.b = str;
        this.c = yb2;
        super(yb);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((C1501mB) this.d.c.b()).a(this.d.d, this.d.c(this.b), new C1624qA(this.d, this.c, this.b));
        } catch (RemoteException e) {
            C1469lA.a.a((Throwable) e, "requestUpdateInfo(%s)", this.b);
            this.c.a((Exception) new RuntimeException(e));
        }
    }
}
