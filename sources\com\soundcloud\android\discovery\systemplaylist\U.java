package com.soundcloud.android.discovery.systemplaylist;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.playback.Db;

/* compiled from: SystemPlaylistPresenter_Factory */
public final class U implements C4961HMa<T> {
    private final C7054oVa<E> a;
    private final C7054oVa<B> b;
    private final C7054oVa<Db> c;
    private final C7054oVa<C3700b> d;
    private final C7054oVa<HPa> e;

    public U(C7054oVa<E> ova, C7054oVa<B> ova2, C7054oVa<Db> ova3, C7054oVa<C3700b> ova4, C7054oVa<HPa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static U a(C7054oVa<E> ova, C7054oVa<B> ova2, C7054oVa<Db> ova3, C7054oVa<C3700b> ova4, C7054oVa<HPa> ova5) {
        U u = new U(ova, ova2, ova3, ova4, ova5);
        return u;
    }

    public T get() {
        T t = new T((E) this.a.get(), (B) this.b.get(), (Db) this.c.get(), (C3700b) this.d.get(), (HPa) this.e.get());
        return t;
    }
}
