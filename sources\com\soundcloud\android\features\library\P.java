package com.soundcloud.android.features.library;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* compiled from: LibraryPresenter.kt */
final class P<T> implements C6776kQa<RVa> {
    final /* synthetic */ T a;

    P(T t) {
        this.a = t;
    }

    /* renamed from: a */
    public final void accept(RVa rVa) {
        C4655rja c = this.a.o;
        C4621nja a2 = C4621nja.a(C3920yea.GENERAL);
        C7471uYa.a((Object) a2, "forUpgrade(UpsellContext.GENERAL)");
        c.a(a2);
        C3700b a3 = this.a.q;
        Waa b = Waa.b(h.UPSELL_HEADER_FROM_COLLECTION);
        C7471uYa.a((Object) b, "UpgradeFunnelEvent.forUp…L_HEADER_FROM_COLLECTION)");
        a3.a((J) b);
    }
}
