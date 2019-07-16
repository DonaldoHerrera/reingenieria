package com.soundcloud.android.features.discovery;

import com.soundcloud.android.foundation.playqueue.m;

/* compiled from: DiscoveryPresenter.kt */
final class C<T> implements C6776kQa<C3445NY> {
    final /* synthetic */ H a;

    C(H h) {
        this.a = h;
    }

    /* renamed from: a */
    public final void accept(C3445NY ny) {
        String h = ny.h();
        if (h != null) {
            H h2 = this.a;
            C4621nja a2 = C4621nja.a(h, C4928GKa.b(ny.g()), Yca.DISCOVER, C4928GKa.c(m.RECOMMENDATIONS));
            C7471uYa.a((Object) a2, "NavigationTarget.forNavi…                        )");
            h2.a(a2);
        }
    }
}
