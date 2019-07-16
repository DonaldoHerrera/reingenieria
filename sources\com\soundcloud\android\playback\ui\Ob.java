package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.Na;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.main.ba;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.playqueue.C4395sa;
import com.soundcloud.android.view.U;

/* compiled from: PlayerPresenter_Factory */
public final class Ob implements C4961HMa<PlayerPresenter> {
    private final C7054oVa<PlayerPagerPresenter> a;
    private final C7054oVa<C5327TLa> b;
    private final C7054oVa<C3700b> c;
    private final C7054oVa<C3814lca> d;
    private final C7054oVa<C4412qb> e;
    private final C7054oVa<Lb> f;
    private final C7054oVa<Na> g;
    private final C7054oVa<C4395sa> h;
    private final C7054oVa<r> i;
    private final C7054oVa<U> j;
    private final C7054oVa<ba> k;

    public static PlayerPresenter a(PlayerPagerPresenter playerPagerPresenter, C5327TLa tLa, C3700b bVar, C3814lca lca, C4412qb qbVar, Lb lb, Na na, C4395sa saVar, r rVar, U u, ba baVar) {
        PlayerPresenter playerPresenter = new PlayerPresenter(playerPagerPresenter, tLa, bVar, lca, qbVar, lb, na, saVar, rVar, u, baVar);
        return playerPresenter;
    }

    public PlayerPresenter get() {
        PlayerPresenter playerPresenter = new PlayerPresenter((PlayerPagerPresenter) this.a.get(), (C5327TLa) this.b.get(), (C3700b) this.c.get(), (C3814lca) this.d.get(), (C4412qb) this.e.get(), (Lb) this.f.get(), (Na) this.g.get(), (C4395sa) this.h.get(), (r) this.i.get(), (U) this.j.get(), (ba) this.k.get());
        return playerPresenter;
    }
}
