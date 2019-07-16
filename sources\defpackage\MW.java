package defpackage;

/* renamed from: MW reason: default package */
/* compiled from: UsersVaultFactory_Factory */
public final class MW implements C4961HMa<LW> {
    private final C7054oVa<C1349hW> a;
    private final C7054oVa<C1256eW> b;
    private final C7054oVa<HW> c;
    private final C7054oVa<BW> d;
    private final C7054oVa<WV> e;
    private final C7054oVa<C4643qga> f;
    private final C7054oVa<YV> g;
    private final C7054oVa<_V> h;
    private final C7054oVa<HPa> i;

    public MW(C7054oVa<C1349hW> ova, C7054oVa<C1256eW> ova2, C7054oVa<HW> ova3, C7054oVa<BW> ova4, C7054oVa<WV> ova5, C7054oVa<C4643qga> ova6, C7054oVa<YV> ova7, C7054oVa<_V> ova8, C7054oVa<HPa> ova9) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
    }

    public static MW a(C7054oVa<C1349hW> ova, C7054oVa<C1256eW> ova2, C7054oVa<HW> ova3, C7054oVa<BW> ova4, C7054oVa<WV> ova5, C7054oVa<C4643qga> ova6, C7054oVa<YV> ova7, C7054oVa<_V> ova8, C7054oVa<HPa> ova9) {
        MW mw = new MW(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9);
        return mw;
    }

    public LW get() {
        LW lw = new LW((C1349hW) this.a.get(), (C1256eW) this.b.get(), (HW) this.c.get(), (BW) this.d.get(), (WV) this.e.get(), (C4643qga) this.f.get(), (YV) this.g.get(), (_V) this.h.get(), (HPa) this.i.get());
        return lw;
    }
}
