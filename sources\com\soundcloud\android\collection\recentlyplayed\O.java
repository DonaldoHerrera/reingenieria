package com.soundcloud.android.collection.recentlyplayed;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: RecentlyPlayedOperations.kt */
final class O<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ J a;
    final /* synthetic */ Map b;

    O(J j, Map map) {
        this.a = j;
        this.b = map;
    }

    /* renamed from: a */
    public final List<C2804ca> apply(List<Rda> list) {
        C7471uYa.b(list, "stations");
        ArrayList arrayList = new ArrayList();
        for (Rda rda : list) {
            C2804ca a2 = this.a.a(rda, ((Number) LWa.b(this.b, (Object) rda.c())).longValue());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
