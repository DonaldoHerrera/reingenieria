package com.soundcloud.android.collection.recentlyplayed;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: RecentlyPlayedOperations.kt */
final class L<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ J a;
    final /* synthetic */ List b;
    final /* synthetic */ Map c;

    L(J j, List list, Map map) {
        this.a = j;
        this.b = list;
        this.c = map;
    }

    /* renamed from: a */
    public final List<C2804ca> apply(Map<C3508cda, C4954HFa> map) {
        C7471uYa.b(map, "artistItems");
        List<C3508cda> list = this.b;
        ArrayList<C4954HFa> arrayList = new ArrayList<>();
        for (C3508cda cda : list) {
            C4954HFa hFa = (C4954HFa) map.get(cda);
            if (hFa != null) {
                arrayList.add(hFa);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) arrayList, 10));
        for (C4954HFa hFa2 : arrayList) {
            arrayList2.add(this.a.a(hFa2, ((Number) LWa.b(this.c, (Object) hFa2.a())).longValue()));
        }
        return arrayList2;
    }
}
