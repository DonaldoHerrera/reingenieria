package defpackage;

/* renamed from: rCa reason: default package and case insensitive filesystem */
/* compiled from: PostsSyncModule_ProvideMyPostsSyncerFactory */
public final class C7240rCa implements C4961HMa<C7309sCa> {
    private final C7054oVa<C6556hCa> a;
    private final C7054oVa<C6352eCa> b;
    private final C7054oVa<C7516vCa> c;
    private final C7054oVa<C7378tCa> d;
    private final C7054oVa<C6620iAa> e;
    private final C7054oVa<C3768fea> f;
    private final C7054oVa<C5327TLa> g;

    public C7240rCa(C7054oVa<C6556hCa> ova, C7054oVa<C6352eCa> ova2, C7054oVa<C7516vCa> ova3, C7054oVa<C7378tCa> ova4, C7054oVa<C6620iAa> ova5, C7054oVa<C3768fea> ova6, C7054oVa<C5327TLa> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static C7240rCa a(C7054oVa<C6556hCa> ova, C7054oVa<C6352eCa> ova2, C7054oVa<C7516vCa> ova3, C7054oVa<C7378tCa> ova4, C7054oVa<C6620iAa> ova5, C7054oVa<C3768fea> ova6, C7054oVa<C5327TLa> ova7) {
        C7240rCa rca = new C7240rCa(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return rca;
    }

    public static C7309sCa a(C6556hCa hca, Object obj, C7516vCa vca, Object obj2, C6620iAa iaa, C3768fea fea, C5327TLa tLa) {
        C7309sCa a2 = C6828lCa.a(hca, (C6352eCa) obj, vca, (C7378tCa) obj2, iaa, fea, tLa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C7309sCa get() {
        return a((C6556hCa) this.a.get(), this.b.get(), (C7516vCa) this.c.get(), this.d.get(), (C6620iAa) this.e.get(), (C3768fea) this.f.get(), (C5327TLa) this.g.get());
    }
}
