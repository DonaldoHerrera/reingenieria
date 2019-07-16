package com.soundcloud.android.features.library.likes;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* compiled from: TrackLikesPresenter.kt */
final class E<T> implements C6776kQa<RVa> {
    final /* synthetic */ z a;

    E(z zVar) {
        this.a = zVar;
    }

    /* renamed from: a */
    public final void accept(RVa rVa) {
        C3700b a2 = this.a.y;
        Waa E = Waa.E();
        C7471uYa.a((Object) E, "UpgradeFunnelEvent.forLikesClick()");
        a2.a((J) E);
        C4655rja c = this.a.w;
        C4621nja a3 = C4621nja.a(C3920yea.OFFLINE);
        C7471uYa.a((Object) a3, "NavigationTarget.forUpgrade(UpsellContext.OFFLINE)");
        c.a(a3);
    }
}
