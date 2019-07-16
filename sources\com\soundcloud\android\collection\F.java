package com.soundcloud.android.collection;

import com.soundcloud.android.tracks.Ca;

/* compiled from: CollectionItemTransformer_Factory */
public final class F implements C4961HMa<E> {
    private final C7054oVa<C2436_U> a;
    private final C7054oVa<C2746fa> b;
    private final C7054oVa<Ca> c;

    public F(C7054oVa<C2436_U> ova, C7054oVa<C2746fa> ova2, C7054oVa<Ca> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static F a(C7054oVa<C2436_U> ova, C7054oVa<C2746fa> ova2, C7054oVa<Ca> ova3) {
        return new F(ova, ova2, ova3);
    }

    public E get() {
        return new E((C2436_U) this.a.get(), (C2746fa) this.b.get(), (Ca) this.c.get());
    }
}
