package com.soundcloud.android.features.discovery;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* compiled from: DiscoveryPresenter.kt */
final class E<T> implements C6776kQa<c> {
    final /* synthetic */ C3551i a;

    E(C3551i iVar) {
        this.a = iVar;
    }

    /* renamed from: a */
    public final void accept(c cVar) {
        C3700b a2 = this.a.o;
        Qaa d = Qaa.d(cVar.g(), cVar.e(), Yca.DISCOVER.a());
        C7471uYa.a((Object) d, "PromotedTrackingEvent.fo…t()\n                    )");
        a2.a((J) d);
        this.a.n.a(cVar.e().a());
        cVar.e().d();
    }
}
