package com.soundcloud.android.image;

import com.squareup.picasso.E;

/* compiled from: ImageOperations_Factory */
public final class Q implements C4961HMa<N> {
    private final C7054oVa<r> a;
    private final C7054oVa<X> b;
    private final C7054oVa<qa> c;
    private final C7054oVa<E> d;

    public Q(C7054oVa<r> ova, C7054oVa<X> ova2, C7054oVa<qa> ova3, C7054oVa<E> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static Q a(C7054oVa<r> ova, C7054oVa<X> ova2, C7054oVa<qa> ova3, C7054oVa<E> ova4) {
        return new Q(ova, ova2, ova3, ova4);
    }

    public N get() {
        return new N((r) this.a.get(), (X) this.b.get(), (qa) this.c.get(), (E) this.d.get());
    }
}
