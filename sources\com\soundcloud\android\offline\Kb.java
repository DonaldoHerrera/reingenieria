package com.soundcloud.android.offline;

/* compiled from: DefaultOfflinePropertiesProvider_Factory */
public final class Kb implements C4961HMa<C4180vb> {
    private final C7054oVa<De> a;
    private final C7054oVa<C4106ie> b;
    private final C7054oVa<C5327TLa> c;
    private final C7054oVa<HPa> d;
    private final C7054oVa<Ica> e;
    private final C7054oVa<Gd> f;

    public Kb(C7054oVa<De> ova, C7054oVa<C4106ie> ova2, C7054oVa<C5327TLa> ova3, C7054oVa<HPa> ova4, C7054oVa<Ica> ova5, C7054oVa<Gd> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static Kb a(C7054oVa<De> ova, C7054oVa<C4106ie> ova2, C7054oVa<C5327TLa> ova3, C7054oVa<HPa> ova4, C7054oVa<Ica> ova5, C7054oVa<Gd> ova6) {
        Kb kb = new Kb(ova, ova2, ova3, ova4, ova5, ova6);
        return kb;
    }

    public C4180vb get() {
        C4180vb vbVar = new C4180vb((De) this.a.get(), (C4106ie) this.b.get(), (C5327TLa) this.c.get(), (HPa) this.d.get(), (Ica) this.e.get(), (Gd) this.f.get());
        return vbVar;
    }
}
