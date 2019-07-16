package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.sync.T;

/* compiled from: StationsController_Factory */
public final class ac implements C4961HMa<_b> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<ic> b;
    private final C7054oVa<T> c;
    private final C7054oVa<r> d;
    private final C7054oVa<HPa> e;

    public static _b a(C5327TLa tLa, ic icVar, T t, r rVar, HPa hPa) {
        _b _bVar = new _b(tLa, icVar, t, rVar, hPa);
        return _bVar;
    }

    public _b get() {
        _b _bVar = new _b((C5327TLa) this.a.get(), (ic) this.b.get(), (T) this.c.get(), (r) this.d.get(), (HPa) this.e.get());
        return _bVar;
    }
}
