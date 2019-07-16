package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.collection.recentlyplayed.C2817j;
import com.soundcloud.android.collection.recentlyplayed.Ga;
import com.soundcloud.android.foundation.playqueue.r;

/* compiled from: PlayHistoryController_Factory */
public final class H implements C4961HMa<G> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<va> b;
    private final C7054oVa<Ga> c;
    private final C7054oVa<Fa> d;
    private final C7054oVa<C2817j> e;
    private final C7054oVa<r> f;
    private final C7054oVa<HPa> g;

    public H(C7054oVa<C5327TLa> ova, C7054oVa<va> ova2, C7054oVa<Ga> ova3, C7054oVa<Fa> ova4, C7054oVa<C2817j> ova5, C7054oVa<r> ova6, C7054oVa<HPa> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static H a(C7054oVa<C5327TLa> ova, C7054oVa<va> ova2, C7054oVa<Ga> ova3, C7054oVa<Fa> ova4, C7054oVa<C2817j> ova5, C7054oVa<r> ova6, C7054oVa<HPa> ova7) {
        H h = new H(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return h;
    }

    public G get() {
        G g2 = new G((C5327TLa) this.a.get(), (va) this.b.get(), (Ga) this.c.get(), (Fa) this.d.get(), (C2817j) this.e.get(), (r) this.f.get(), (HPa) this.g.get());
        return g2;
    }
}
