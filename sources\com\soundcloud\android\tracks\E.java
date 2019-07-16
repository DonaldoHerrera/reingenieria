package com.soundcloud.android.tracks;

import com.soundcloud.android.sync.T;

/* compiled from: DefaultTrackRepository_Factory */
public final class E implements C4961HMa<D> {
    private final C7054oVa<Ya> a;
    private final C7054oVa<T> b;
    private final C7054oVa<HPa> c;

    public E(C7054oVa<Ya> ova, C7054oVa<T> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static E a(C7054oVa<Ya> ova, C7054oVa<T> ova2, C7054oVa<HPa> ova3) {
        return new E(ova, ova2, ova3);
    }

    public D get() {
        return new D((Ya) this.a.get(), (T) this.b.get(), (HPa) this.c.get());
    }
}
