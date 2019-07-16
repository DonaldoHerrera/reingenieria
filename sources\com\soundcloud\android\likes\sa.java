package com.soundcloud.android.likes;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* compiled from: TrackLikesUniflowPresenter.kt */
final class sa<T> implements C6776kQa<RVa> {
    final /* synthetic */ ma a;

    sa(ma maVar) {
        this.a = maVar;
    }

    /* renamed from: a */
    public final void accept(RVa rVa) {
        C3700b a2 = this.a.w;
        Waa E = Waa.E();
        C7471uYa.a((Object) E, "UpgradeFunnelEvent.forLikesClick()");
        a2.a((J) E);
        C4655rja c = this.a.u;
        C4621nja a3 = C4621nja.a(C3920yea.OFFLINE);
        C7471uYa.a((Object) a3, "NavigationTarget.forUpgrade(UpsellContext.OFFLINE)");
        c.a(a3);
    }
}
