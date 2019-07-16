package com.soundcloud.android.profile;

/* compiled from: UserProfileOperations_Factory */
public final class Id implements C4961HMa<Lc> {
    private final C7054oVa<C5879z> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<C3800jea> c;
    private final C7054oVa<C5604aua> d;
    private final C7054oVa<re> e;
    private final C7054oVa<C5327TLa> f;

    public Id(C7054oVa<C5879z> ova, C7054oVa<HPa> ova2, C7054oVa<C3800jea> ova3, C7054oVa<C5604aua> ova4, C7054oVa<re> ova5, C7054oVa<C5327TLa> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static Id a(C7054oVa<C5879z> ova, C7054oVa<HPa> ova2, C7054oVa<C3800jea> ova3, C7054oVa<C5604aua> ova4, C7054oVa<re> ova5, C7054oVa<C5327TLa> ova6) {
        Id id = new Id(ova, ova2, ova3, ova4, ova5, ova6);
        return id;
    }

    public Lc get() {
        Lc lc = new Lc((C5879z) this.a.get(), (HPa) this.b.get(), (C3800jea) this.c.get(), (C5604aua) this.d.get(), (re) this.e.get(), (C5327TLa) this.f.get());
        return lc;
    }
}
