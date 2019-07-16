package defpackage;

/* renamed from: GG reason: default package and case insensitive filesystem */
public final class C2046GG {
    private final C2218PG a;

    private C2046GG(C2218PG pg) {
        this.a = pg;
    }

    public static C2046GG a(C2066HG hg) {
        C2218PG pg = (C2218PG) hg;
        C3067jH.a((Object) hg, "AdSession is null");
        C3067jH.d(pg);
        C3067jH.b(pg);
        C2046GG gg = new C2046GG(pg);
        pg.k().a(gg);
        return gg;
    }

    public void a() {
        C3067jH.b(this.a);
        C3067jH.f(this.a);
        if (!this.a.g()) {
            try {
                this.a.c();
            } catch (Exception unused) {
            }
        }
        if (this.a.g()) {
            this.a.e();
        }
    }
}
