package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.collection.playhistory.ua;
import java.util.List;

/* compiled from: RecentlyPlayedOperations.kt */
final class Q<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ J a;

    Q(J j) {
        this.a = j;
    }

    /* renamed from: a */
    public final APa<List<C2804ca>> apply(List<? extends ua> list) {
        C7471uYa.b(list, "it");
        return this.a.a(list);
    }
}
