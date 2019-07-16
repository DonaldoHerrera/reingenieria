package com.soundcloud.android.collection;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* compiled from: CollectionPresenter.kt */
final class ra<T> implements C6776kQa<RVa> {
    final /* synthetic */ ua a;

    ra(ua uaVar) {
        this.a = uaVar;
    }

    /* renamed from: a */
    public final void accept(RVa rVa) {
        C4655rja d = this.a.p;
        C4621nja a2 = C4621nja.a(C3920yea.GENERAL);
        C7471uYa.a((Object) a2, "NavigationTarget.forUpgrade(UpsellContext.GENERAL)");
        d.a(a2);
        C3700b a3 = this.a.r;
        Waa b = Waa.b(h.UPSELL_HEADER_FROM_COLLECTION);
        C7471uYa.a((Object) b, "UpgradeFunnelEvent.forUp…L_HEADER_FROM_COLLECTION)");
        a3.a((J) b);
    }
}
