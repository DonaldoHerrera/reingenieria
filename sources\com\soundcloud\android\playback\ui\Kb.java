package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.Na;
import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.comments.Ea;
import com.soundcloud.android.comments.Ua;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.likes.C3989m;
import com.soundcloud.android.playback.C4416rb;
import com.soundcloud.android.playback.Ic;
import com.soundcloud.android.playback.ke;
import com.soundcloud.android.stations.ic;
import com.soundcloud.android.tracks.Ca;

/* compiled from: PlayerPagerPresenter_Factory */
public final class Kb implements C4961HMa<PlayerPagerPresenter> {
    private final C7054oVa<C3814lca> a;
    private final C7054oVa<C4416rb> b;
    private final C7054oVa<Ca> c;
    private final C7054oVa<ic> d;
    private final C7054oVa<mc> e;
    private final C7054oVa<Fea> f;
    private final C7054oVa<La> g;
    private final C7054oVa<rc> h;
    private final C7054oVa<C2732f> i;
    private final C7054oVa<Na> j;
    private final C7054oVa<ke> k;
    private final C7054oVa<Eb> l;
    private final C7054oVa<C5327TLa> m;
    private final C7054oVa<Ic> n;
    private final C7054oVa<Ua> o;
    private final C7054oVa<Ea> p;
    private final C7054oVa<r> q;
    private final C7054oVa<C3989m> r;
    private final C7054oVa<C5039Jwa> s;
    private final C7054oVa<C6699jHa> t;

    public static PlayerPagerPresenter a(C3814lca lca, C4416rb rbVar, Ca ca, ic icVar, Object obj, Fea fea, La la, Object obj2, C2732f fVar, Na na, ke keVar, Eb eb, C5327TLa tLa, Ic ic, Ua ua, Ea ea, r rVar, C3989m mVar, C5039Jwa jwa, C6699jHa jha) {
        PlayerPagerPresenter playerPagerPresenter = new PlayerPagerPresenter(lca, rbVar, ca, icVar, (mc) obj, fea, la, (rc) obj2, fVar, na, keVar, eb, tLa, ic, ua, ea, rVar, mVar, jwa, jha);
        return playerPagerPresenter;
    }

    public PlayerPagerPresenter get() {
        PlayerPagerPresenter playerPagerPresenter = new PlayerPagerPresenter((C3814lca) this.a.get(), (C4416rb) this.b.get(), (Ca) this.c.get(), (ic) this.d.get(), (mc) this.e.get(), (Fea) this.f.get(), (La) this.g.get(), (rc) this.h.get(), (C2732f) this.i.get(), (Na) this.j.get(), (ke) this.k.get(), (Eb) this.l.get(), (C5327TLa) this.m.get(), (Ic) this.n.get(), (Ua) this.o.get(), (Ea) this.p.get(), (r) this.q.get(), (C3989m) this.r.get(), (C5039Jwa) this.s.get(), (C6699jHa) this.t.get());
        return playerPagerPresenter;
    }
}
