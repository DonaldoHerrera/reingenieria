package com.soundcloud.android.features.library;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* compiled from: LibraryPresenter.kt */
final class O extends C7540vYa implements _Xa<RVa, RVa> {
    final /* synthetic */ T a;

    O(T t) {
        this.a = t;
        super(1);
    }

    public final void a(RVa rVa) {
        C4655rja c = this.a.o;
        C4621nja a2 = C4621nja.a(C3920yea.GENERAL);
        C7471uYa.a((Object) a2, "forUpgrade(UpsellContext.GENERAL)");
        c.a(a2);
        C3700b a3 = this.a.q;
        Waa u = Waa.u();
        C7471uYa.a((Object) u, "UpgradeFunnelEvent.forCollectionClick()");
        a3.a((J) u);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((RVa) obj);
        return RVa.a;
    }
}
