package com.soundcloud.android.collection;

import com.soundcloud.android.collection.playhistory.Z;
import com.soundcloud.android.collection.recentlyplayed.J;
import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.likes.C3989m;

/* renamed from: com.soundcloud.android.collection.ea reason: case insensitive filesystem */
/* compiled from: CollectionOperations_Factory */
public final class C2744ea implements C4961HMa<H> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<Aa> b;
    private final C7054oVa<Vda> c;
    private final C7054oVa<Z> d;
    private final C7054oVa<J> e;
    private final C7054oVa<C2287SS> f;
    private final C7054oVa<C3760eea> g;
    private final C7054oVa<C3989m> h;
    private final C7054oVa<K> i;
    private final C7054oVa<C2746fa> j;
    private final C7054oVa<HPa> k;

    public C2744ea(C7054oVa<C5327TLa> ova, C7054oVa<Aa> ova2, C7054oVa<Vda> ova3, C7054oVa<Z> ova4, C7054oVa<J> ova5, C7054oVa<C2287SS> ova6, C7054oVa<C3760eea> ova7, C7054oVa<C3989m> ova8, C7054oVa<K> ova9, C7054oVa<C2746fa> ova10, C7054oVa<HPa> ova11) {
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
        this.k = ova11;
    }

    public static C2744ea a(C7054oVa<C5327TLa> ova, C7054oVa<Aa> ova2, C7054oVa<Vda> ova3, C7054oVa<Z> ova4, C7054oVa<J> ova5, C7054oVa<C2287SS> ova6, C7054oVa<C3760eea> ova7, C7054oVa<C3989m> ova8, C7054oVa<K> ova9, C7054oVa<C2746fa> ova10, C7054oVa<HPa> ova11) {
        C2744ea eaVar = new C2744ea(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11);
        return eaVar;
    }

    public H get() {
        H h2 = new H((C5327TLa) this.a.get(), (Aa) this.b.get(), (Vda) this.c.get(), (Z) this.d.get(), (J) this.e.get(), (C2287SS) this.f.get(), (C3760eea) this.g.get(), (C3989m) this.h.get(), (K) this.i.get(), (C2746fa) this.j.get(), (HPa) this.k.get());
        return h2;
    }
}
