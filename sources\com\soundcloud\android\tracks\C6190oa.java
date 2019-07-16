package com.soundcloud.android.tracks;

import android.content.Context;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.likes.C3983h;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.stations.Ga;

/* renamed from: com.soundcloud.android.tracks.oa reason: case insensitive filesystem */
/* compiled from: TrackItemMenuPresenter_Factory */
public final class C6190oa implements C4961HMa<C6188na> {
    private final C7054oVa<a> a;
    private final C7054oVa<Ca> b;
    private final C7054oVa<C5327TLa> c;
    private final C7054oVa<Context> d;
    private final C7054oVa<C3983h> e;
    private final C7054oVa<C1997DR> f;
    private final C7054oVa<C4909Fra> g;
    private final C7054oVa<F> h;
    private final C7054oVa<Lca> i;
    private final C7054oVa<Ga> j;
    private final C7054oVa<C2526g> k;
    private final C7054oVa<C3814lca> l;
    private final C7054oVa<Db> m;
    private final C7054oVa<C3700b> n;
    private final C7054oVa<C4655rja> o;
    private final C7054oVa<C4425ta> p;
    private final C7054oVa<Na> q;

    public static C6188na a(a aVar, Ca ca, C5327TLa tLa, Context context, C3983h hVar, C1997DR dr, C4909Fra fra, F f2, Lca lca, Ga ga, C2526g gVar, C3814lca lca2, Db db, C3700b bVar, C4655rja rja, C4425ta taVar, Na na) {
        C6188na naVar = new C6188na(aVar, ca, tLa, context, hVar, dr, fra, f2, lca, ga, gVar, lca2, db, bVar, rja, taVar, na);
        return naVar;
    }

    public C6188na get() {
        C6188na naVar = new C6188na((a) this.a.get(), (Ca) this.b.get(), (C5327TLa) this.c.get(), (Context) this.d.get(), (C3983h) this.e.get(), (C1997DR) this.f.get(), (C4909Fra) this.g.get(), (F) this.h.get(), (Lca) this.i.get(), (Ga) this.j.get(), (C2526g) this.k.get(), (C3814lca) this.l.get(), (Db) this.m.get(), (C3700b) this.n.get(), (C4655rja) this.o.get(), (C4425ta) this.p.get(), (Na) this.q.get());
        return naVar;
    }
}
