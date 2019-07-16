package defpackage;

/* renamed from: iY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryCardSyncer_Factory */
public final class C3786iY implements C4961HMa<C3778hY> {
    private final C7054oVa<dfa> a;
    private final C7054oVa<C3898wY> b;
    private final C7054oVa<C3768fea> c;
    private final C7054oVa<C3800jea> d;

    public C3786iY(C7054oVa<dfa> ova, C7054oVa<C3898wY> ova2, C7054oVa<C3768fea> ova3, C7054oVa<C3800jea> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C3786iY a(C7054oVa<dfa> ova, C7054oVa<C3898wY> ova2, C7054oVa<C3768fea> ova3, C7054oVa<C3800jea> ova4) {
        return new C3786iY(ova, ova2, ova3, ova4);
    }

    public C3778hY get() {
        return new C3778hY((dfa) this.a.get(), (C3898wY) this.b.get(), (C3768fea) this.c.get(), (C3800jea) this.d.get());
    }
}
