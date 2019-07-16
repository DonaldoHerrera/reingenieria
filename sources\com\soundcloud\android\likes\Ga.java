package com.soundcloud.android.likes;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.offline.C4070ce;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.tracks.Ca;

/* compiled from: TrackLikesUniflowPresenter_Factory */
public final class Ga implements C4961HMa<ma> {
    private final C7054oVa<C4001z> a;
    private final C7054oVa<Ca> b;
    private final C7054oVa<C2436_U> c;
    private final C7054oVa<C4197yd> d;
    private final C7054oVa<C4070ce> e;
    private final C7054oVa<C6834lGa> f;
    private final C7054oVa<Db> g;
    private final C7054oVa<C4425ta> h;
    private final C7054oVa<C4655rja> i;
    private final C7054oVa<C4088fe> j;
    private final C7054oVa<C3700b> k;
    private final C7054oVa<C3815lda> l;
    private final C7054oVa<HPa> m;

    public Ga(C7054oVa<C4001z> ova, C7054oVa<Ca> ova2, C7054oVa<C2436_U> ova3, C7054oVa<C4197yd> ova4, C7054oVa<C4070ce> ova5, C7054oVa<C6834lGa> ova6, C7054oVa<Db> ova7, C7054oVa<C4425ta> ova8, C7054oVa<C4655rja> ova9, C7054oVa<C4088fe> ova10, C7054oVa<C3700b> ova11, C7054oVa<C3815lda> ova12, C7054oVa<HPa> ova13) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
        this.j = ova10;
        this.k = ova11;
        this.l = ova12;
        this.m = ova13;
    }

    public static Ga a(C7054oVa<C4001z> ova, C7054oVa<Ca> ova2, C7054oVa<C2436_U> ova3, C7054oVa<C4197yd> ova4, C7054oVa<C4070ce> ova5, C7054oVa<C6834lGa> ova6, C7054oVa<Db> ova7, C7054oVa<C4425ta> ova8, C7054oVa<C4655rja> ova9, C7054oVa<C4088fe> ova10, C7054oVa<C3700b> ova11, C7054oVa<C3815lda> ova12, C7054oVa<HPa> ova13) {
        Ga ga = new Ga(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11, ova12, ova13);
        return ga;
    }

    public ma get() {
        ma maVar = new ma((C4001z) this.a.get(), (Ca) this.b.get(), (C2436_U) this.c.get(), (C4197yd) this.d.get(), (C4070ce) this.e.get(), (C6834lGa) this.f.get(), (Db) this.g.get(), (C4425ta) this.h.get(), (C4655rja) this.i.get(), (C4088fe) this.j.get(), (C3700b) this.k.get(), (C3815lda) this.l.get(), (HPa) this.m.get());
        return maVar;
    }
}
