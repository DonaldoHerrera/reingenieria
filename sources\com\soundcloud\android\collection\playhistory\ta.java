package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.playback.C4425ta;

/* compiled from: PlayHistoryPresenter_Factory */
public final class ta implements C4961HMa<ka> {
    private final C7054oVa<Z> a;
    private final C7054oVa<C2014EO> b;
    private final C7054oVa<C4425ta> c;
    private final C7054oVa<C5327TLa> d;
    private final C7054oVa<C3700b> e;
    private final C7054oVa<C5052KJa> f;
    private final C7054oVa<HPa> g;

    public ta(C7054oVa<Z> ova, C7054oVa<C2014EO> ova2, C7054oVa<C4425ta> ova3, C7054oVa<C5327TLa> ova4, C7054oVa<C3700b> ova5, C7054oVa<C5052KJa> ova6, C7054oVa<HPa> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static ta a(C7054oVa<Z> ova, C7054oVa<C2014EO> ova2, C7054oVa<C4425ta> ova3, C7054oVa<C5327TLa> ova4, C7054oVa<C3700b> ova5, C7054oVa<C5052KJa> ova6, C7054oVa<HPa> ova7) {
        ta taVar = new ta(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return taVar;
    }

    public ka get() {
        ka kaVar = new ka((Z) this.a.get(), (C2014EO) this.b.get(), (C4425ta) this.c.get(), (C5327TLa) this.d.get(), (C3700b) this.e.get(), (C5052KJa) this.f.get(), (HPa) this.g.get());
        return kaVar;
    }
}
