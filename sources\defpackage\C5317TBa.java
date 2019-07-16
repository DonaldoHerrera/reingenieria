package defpackage;

import com.soundcloud.android.sync.C6135s;

/* renamed from: TBa reason: default package and case insensitive filesystem */
/* compiled from: SinglePlaylistSyncerFactory_Factory */
public final class C5317TBa implements C4961HMa<C5287SBa> {
    private final C7054oVa<C7238rBa> a;
    private final C7054oVa<dfa> b;
    private final C7054oVa<Fda> c;
    private final C7054oVa<Hda> d;
    private final C7054oVa<C5128Msa> e;
    private final C7054oVa<C3768fea> f;
    private final C7054oVa<C6332dsa> g;
    private final C7054oVa<C5075LBa> h;
    private final C7054oVa<C5327TLa> i;
    private final C7054oVa<C6135s> j;

    public C5317TBa(C7054oVa<C7238rBa> ova, C7054oVa<dfa> ova2, C7054oVa<Fda> ova3, C7054oVa<Hda> ova4, C7054oVa<C5128Msa> ova5, C7054oVa<C3768fea> ova6, C7054oVa<C6332dsa> ova7, C7054oVa<C5075LBa> ova8, C7054oVa<C5327TLa> ova9, C7054oVa<C6135s> ova10) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
        this.j = ova10;
    }

    public static C5317TBa a(C7054oVa<C7238rBa> ova, C7054oVa<dfa> ova2, C7054oVa<Fda> ova3, C7054oVa<Hda> ova4, C7054oVa<C5128Msa> ova5, C7054oVa<C3768fea> ova6, C7054oVa<C6332dsa> ova7, C7054oVa<C5075LBa> ova8, C7054oVa<C5327TLa> ova9, C7054oVa<C6135s> ova10) {
        C5317TBa tBa = new C5317TBa(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10);
        return tBa;
    }

    public C5287SBa get() {
        C5287SBa sBa = new C5287SBa(this.a, (dfa) this.b.get(), (Fda) this.c.get(), (Hda) this.d.get(), (C5128Msa) this.e.get(), (C3768fea) this.f.get(), (C6332dsa) this.g.get(), this.h, (C5327TLa) this.i.get(), (C6135s) this.j.get());
        return sBa;
    }
}
