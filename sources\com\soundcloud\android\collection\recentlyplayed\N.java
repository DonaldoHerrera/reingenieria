package com.soundcloud.android.collection.recentlyplayed;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: RecentlyPlayedOperations.kt */
final class N<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ J a;
    final /* synthetic */ List b;
    final /* synthetic */ Map c;

    N(J j, List list, Map map) {
        this.a = j;
        this.b = list;
        this.c = map;
    }

    /* renamed from: a */
    public final List<C2804ca> apply(Map<C3508cda, ? extends C3863rda> map) {
        C7471uYa.b(map, "playlistItems");
        List<C3508cda> list = this.b;
        ArrayList<C3863rda> arrayList = new ArrayList<>();
        for (C3508cda cda : list) {
            C3863rda rda = (C3863rda) map.get(cda);
            if (rda != null) {
                arrayList.add(rda);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) arrayList, 10));
        for (C3863rda rda2 : arrayList) {
            J j = this.a;
            Map map2 = this.c;
            C3508cda a2 = rda2.a();
            C7471uYa.a((Object) a2, "it.urn");
            arrayList2.add(j.a(rda2, ((Number) LWa.b(map2, (Object) a2)).longValue()));
        }
        return arrayList2;
    }
}
