package com.soundcloud.android.features.library;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* compiled from: LibraryPresenter.kt */
final class M extends C7540vYa implements _Xa<RVa, RVa> {
    final /* synthetic */ T a;

    M(T t) {
        this.a = t;
        super(1);
    }

    public final void a(RVa rVa) {
        C3700b a2 = this.a.q;
        Waa v = Waa.v();
        C7471uYa.a((Object) v, "UpgradeFunnelEvent.forCollectionImpression()");
        a2.a((J) v);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((RVa) obj);
        return RVa.a;
    }
}
