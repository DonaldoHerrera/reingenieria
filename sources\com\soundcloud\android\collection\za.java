package com.soundcloud.android.collection;

import com.soundcloud.android.sync.ia;
import com.soundcloud.android.sync.na;

/* compiled from: CollectionSyncer.kt */
final class za<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Aa a;

    za(Aa aa) {
        this.a = aa;
    }

    /* renamed from: a */
    public final IPa<ia> apply(Boolean bool) {
        C7471uYa.b(bool, "it");
        return this.a.e().b(na.COLLECTIONS_DELTA);
    }
}
