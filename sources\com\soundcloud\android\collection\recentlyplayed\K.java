package com.soundcloud.android.collection.recentlyplayed;

import com.google.common.base.Function;

/* compiled from: RecentlyPlayedOperations.kt */
final class K<F, T> implements Function<T, V> {
    final /* synthetic */ C3508cda a;

    K(C3508cda cda) {
        this.a = cda;
    }

    public final boolean a(C3508cda cda) {
        return C7471uYa.a((Object) this.a, (Object) cda);
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(a((C3508cda) obj));
    }
}
