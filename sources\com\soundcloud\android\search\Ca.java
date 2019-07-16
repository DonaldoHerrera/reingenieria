package com.soundcloud.android.search;

/* compiled from: SearchStrategyFactory_Factory */
public final class Ca implements C4961HMa<C5927oa> {
    private final C7054oVa<efa> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<C3768fea> c;
    private final C7054oVa<C3800jea> d;
    private final C7054oVa<C6332dsa> e;

    public Ca(C7054oVa<efa> ova, C7054oVa<HPa> ova2, C7054oVa<C3768fea> ova3, C7054oVa<C3800jea> ova4, C7054oVa<C6332dsa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static Ca a(C7054oVa<efa> ova, C7054oVa<HPa> ova2, C7054oVa<C3768fea> ova3, C7054oVa<C3800jea> ova4, C7054oVa<C6332dsa> ova5) {
        Ca ca = new Ca(ova, ova2, ova3, ova4, ova5);
        return ca;
    }

    public C5927oa get() {
        C5927oa oaVar = new C5927oa((efa) this.a.get(), (HPa) this.b.get(), (C3768fea) this.c.get(), (C3800jea) this.d.get(), (C6332dsa) this.e.get());
        return oaVar;
    }
}
