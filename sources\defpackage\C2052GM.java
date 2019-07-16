package defpackage;

import android.os.Looper;

/* renamed from: GM reason: default package and case insensitive filesystem */
/* compiled from: TrackingHandlerFactory */
class C2052GM {
    private final C6834lGa a;
    private final C2129KM b;
    private final C1952BM c;
    private final C3469VY d;

    C2052GM(C6834lGa lga, C2129KM km, C1952BM bm, C3469VY vy) {
        this.a = lga;
        this.b = km;
        this.c = bm;
        this.d = vy;
    }

    /* access modifiers changed from: 0000 */
    public C2032FM a(Looper looper) {
        C2032FM fm = new C2032FM(looper, this.a, this.b, this.c, this.d);
        return fm;
    }
}
