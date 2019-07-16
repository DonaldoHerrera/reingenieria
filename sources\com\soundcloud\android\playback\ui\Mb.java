package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.Na;
import com.soundcloud.android.playback.ui.view.g;

/* compiled from: PlayerPagerScrollListener_Factory */
public final class Mb implements C4961HMa<Lb> {
    private final C7054oVa<C3814lca> a;
    private final C7054oVa<g> b;
    private final C7054oVa<Na> c;

    public static Lb a(C3814lca lca, g gVar, Na na) {
        return new Lb(lca, gVar, na);
    }

    public Lb get() {
        return new Lb((C3814lca) this.a.get(), (g) this.b.get(), (Na) this.c.get());
    }
}
