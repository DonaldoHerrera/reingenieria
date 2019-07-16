package defpackage;

/* renamed from: Gsa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistStorage_Factory */
public final class C4941Gsa implements C4961HMa<C6332dsa> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C4898FLa> b;
    private final C7054oVa<C5537_pa> c;
    private final C7054oVa<C1409jT> d;
    private final C7054oVa<C5694cGa> e;

    public C4941Gsa(C7054oVa<C5500ZKa> ova, C7054oVa<C4898FLa> ova2, C7054oVa<C5537_pa> ova3, C7054oVa<C1409jT> ova4, C7054oVa<C5694cGa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C4941Gsa a(C7054oVa<C5500ZKa> ova, C7054oVa<C4898FLa> ova2, C7054oVa<C5537_pa> ova3, C7054oVa<C1409jT> ova4, C7054oVa<C5694cGa> ova5) {
        C4941Gsa gsa = new C4941Gsa(ova, ova2, ova3, ova4, ova5);
        return gsa;
    }

    public C6332dsa get() {
        C6332dsa dsa = new C6332dsa((C5500ZKa) this.a.get(), (C4898FLa) this.b.get(), (C5537_pa) this.c.get(), (C1409jT) this.d.get(), (C5694cGa) this.e.get());
        return dsa;
    }
}
