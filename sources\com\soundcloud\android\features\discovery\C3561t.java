package com.soundcloud.android.features.discovery;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* renamed from: com.soundcloud.android.features.discovery.t reason: case insensitive filesystem */
/* compiled from: DiscoveryPresenter.kt */
final class C3561t<T> implements C6776kQa<c> {
    final /* synthetic */ C3551i a;

    C3561t(C3551i iVar) {
        this.a = iVar;
    }

    /* renamed from: a */
    public final void accept(c cVar) {
        C3700b a2 = this.a.o;
        Qaa a3 = Qaa.a(cVar.g(), cVar.e(), Yca.DISCOVER.a(), C3551i.m.a());
        C7471uYa.a((Object) a3, "PromotedTrackingEvent.fo…ion\n                    )");
        a2.a((J) a3);
    }
}
