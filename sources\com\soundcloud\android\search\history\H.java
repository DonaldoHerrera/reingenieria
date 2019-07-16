package com.soundcloud.android.search.history;

/* compiled from: SearchHistoryStorageProxy_Factory */
public final class H implements C4961HMa<G> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<A> b;
    private final C7054oVa<HPa> c;

    public H(C7054oVa<C5327TLa> ova, C7054oVa<A> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static H a(C7054oVa<C5327TLa> ova, C7054oVa<A> ova2, C7054oVa<HPa> ova3) {
        return new H(ova, ova2, ova3);
    }

    public G get() {
        return new G((C5327TLa) this.a.get(), C4930GMa.a(this.b), (HPa) this.c.get());
    }
}
