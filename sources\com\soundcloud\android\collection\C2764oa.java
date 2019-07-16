package com.soundcloud.android.collection;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* renamed from: com.soundcloud.android.collection.oa reason: case insensitive filesystem */
/* compiled from: CollectionPresenter.kt */
final class C2764oa<T> implements C6776kQa<RVa> {
    final /* synthetic */ ua a;

    C2764oa(ua uaVar) {
        this.a = uaVar;
    }

    /* renamed from: a */
    public final void accept(RVa rVa) {
        C3700b a2 = this.a.r;
        Waa v = Waa.v();
        C7471uYa.a((Object) v, "UpgradeFunnelEvent.forCollectionImpression()");
        a2.a((J) v);
    }
}
