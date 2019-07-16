package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.playback.Db;

/* compiled from: DownloadsPresenter_Factory */
public final class F implements C4961HMa<E> {
    private final C7054oVa<C3577k> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<C4655rja> c;
    private final C7054oVa<Db> d;
    private final C7054oVa<C3700b> e;

    public F(C7054oVa<C3577k> ova, C7054oVa<HPa> ova2, C7054oVa<C4655rja> ova3, C7054oVa<Db> ova4, C7054oVa<C3700b> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static F a(C7054oVa<C3577k> ova, C7054oVa<HPa> ova2, C7054oVa<C4655rja> ova3, C7054oVa<Db> ova4, C7054oVa<C3700b> ova5) {
        F f = new F(ova, ova2, ova3, ova4, ova5);
        return f;
    }

    public E get() {
        E e2 = new E((C3577k) this.a.get(), (HPa) this.b.get(), (C4655rja) this.c.get(), (Db) this.d.get(), (C3700b) this.e.get());
        return e2;
    }
}
