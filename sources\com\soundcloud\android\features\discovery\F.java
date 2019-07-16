package com.soundcloud.android.features.discovery;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* compiled from: DiscoveryPresenter.kt */
final class F<T> implements C6776kQa<RVa> {
    final /* synthetic */ C3551i a;
    final /* synthetic */ H b;

    F(C3551i iVar, H h) {
        this.a = iVar;
        this.b = h;
    }

    /* renamed from: a */
    public final void accept(RVa rVa) {
        H h = this.b;
        C4621nja a2 = C4621nja.a(C3920yea.GENERAL);
        C7471uYa.a((Object) a2, "NavigationTarget.forUpgrade(UpsellContext.GENERAL)");
        h.a(a2);
        C3700b a3 = this.a.o;
        Waa b2 = Waa.b(h.UPSELL_HEADER_FROM_DISCOVERY);
        C7471uYa.a((Object) b2, "UpgradeFunnelEvent.forUp…LL_HEADER_FROM_DISCOVERY)");
        a3.a((J) b2);
    }
}
