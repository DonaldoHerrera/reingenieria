package com.soundcloud.android.collection.recentlyplayed;

import java.util.ArrayList;
import java.util.List;

/* compiled from: RecentlyPlayedOperations.kt */
final class Y<T1, T2, R> implements C6504gQa<List<? extends C2804ca>, C4928GKa<C3508cda>, List<? extends C2804ca>> {
    final /* synthetic */ J a;

    Y(J j) {
        this.a = j;
    }

    /* renamed from: a */
    public final List<C2804ca> apply(List<? extends C2804ca> list, C4928GKa<C3508cda> gKa) {
        C7471uYa.b(list, "playlists");
        C7471uYa.b(gKa, "userUrnOptional");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (this.a.a((C2804ca) next, gKa)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
