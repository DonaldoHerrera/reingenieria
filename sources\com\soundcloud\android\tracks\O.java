package com.soundcloud.android.tracks;

/* compiled from: FullTracksVaultFactory_Factory */
public final class O implements C4961HMa<N> {
    private final C7054oVa<Ja> a;
    private final C7054oVa<G> b;
    private final C7054oVa<Eb> c;
    private final C7054oVa<K> d;
    private final C7054oVa<WV> e;
    private final C7054oVa<C4643qga> f;
    private final C7054oVa<YV> g;
    private final C7054oVa<_V> h;
    private final C7054oVa<HPa> i;

    public O(C7054oVa<Ja> ova, C7054oVa<G> ova2, C7054oVa<Eb> ova3, C7054oVa<K> ova4, C7054oVa<WV> ova5, C7054oVa<C4643qga> ova6, C7054oVa<YV> ova7, C7054oVa<_V> ova8, C7054oVa<HPa> ova9) {
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

    public static O a(C7054oVa<Ja> ova, C7054oVa<G> ova2, C7054oVa<Eb> ova3, C7054oVa<K> ova4, C7054oVa<WV> ova5, C7054oVa<C4643qga> ova6, C7054oVa<YV> ova7, C7054oVa<_V> ova8, C7054oVa<HPa> ova9) {
        O o = new O(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9);
        return o;
    }

    public N get() {
        N n = new N((Ja) this.a.get(), (G) this.b.get(), (Eb) this.c.get(), (K) this.d.get(), (WV) this.e.get(), (C4643qga) this.f.get(), (YV) this.g.get(), (_V) this.h.get(), (HPa) this.i.get());
        return n;
    }
}
