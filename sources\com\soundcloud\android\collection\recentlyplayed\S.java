package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.sync.ia;
import java.util.List;

/* compiled from: RecentlyPlayedOperations.kt */
final class S<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ J a;
    final /* synthetic */ int b;

    S(J j, int i) {
        this.a = j;
        this.b = i;
    }

    /* renamed from: a */
    public final APa<List<C2804ca>> apply(ia iaVar) {
        C7471uYa.b(iaVar, "it");
        return this.a.c(this.b);
    }
}
