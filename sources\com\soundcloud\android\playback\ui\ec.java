package com.soundcloud.android.playback.ui;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.likes.C3983h;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.Ic;

/* compiled from: TrackPageListener_Factory */
public final class ec implements C4961HMa<dc> {
    private final C7054oVa<C4412qb> a;
    private final C7054oVa<C3814lca> b;
    private final C7054oVa<C5327TLa> c;
    private final C7054oVa<C3983h> d;
    private final C7054oVa<C2390YL> e;
    private final C7054oVa<Ic> f;
    private final C7054oVa<C4655rja> g;
    private final C7054oVa<C3700b> h;

    public static dc a(C4412qb qbVar, C3814lca lca, C5327TLa tLa, C3983h hVar, C2390YL yl, Ic ic, C4655rja rja, C3700b bVar) {
        dc dcVar = new dc(qbVar, lca, tLa, hVar, yl, ic, rja, bVar);
        return dcVar;
    }

    public dc get() {
        dc dcVar = new dc((C4412qb) this.a.get(), (C3814lca) this.b.get(), (C5327TLa) this.c.get(), (C3983h) this.d.get(), (C2390YL) this.e.get(), (Ic) this.f.get(), (C4655rja) this.g.get(), (C3700b) this.h.get());
        return dcVar;
    }
}
