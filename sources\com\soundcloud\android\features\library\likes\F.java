package com.soundcloud.android.features.library.likes;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* compiled from: TrackLikesPresenter.kt */
final class F<T> implements C6776kQa<RVa> {
    final /* synthetic */ z a;

    F(z zVar) {
        this.a = zVar;
    }

    /* renamed from: a */
    public final void accept(RVa rVa) {
        C3700b a2 = this.a.y;
        Waa F = Waa.F();
        C7471uYa.a((Object) F, "UpgradeFunnelEvent.forLikesImpression()");
        a2.a((J) F);
    }
}
