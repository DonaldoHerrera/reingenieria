package com.soundcloud.android.stream;

/* compiled from: StreamPlaylistItemRenderer_Factory */
public final class Ba implements C4961HMa<Aa> {
    private final C7054oVa<C7287rra> a;
    private final C7054oVa<A> b;
    private final C7054oVa<C5204PIa> c;

    public static Aa a(C7287rra rra, Object obj, C5204PIa pIa) {
        return new Aa(rra, (A) obj, pIa);
    }

    public Aa get() {
        return new Aa((C7287rra) this.a.get(), (A) this.b.get(), (C5204PIa) this.c.get());
    }
}
