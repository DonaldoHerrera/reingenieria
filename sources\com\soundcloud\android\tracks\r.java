package com.soundcloud.android.tracks;

import java.util.ArrayList;
import java.util.List;

/* compiled from: DefaultTrackRepository.kt */
final class r<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ List a;

    r(List list) {
        this.a = list;
    }

    /* renamed from: a */
    public final Ida<C3509cea> apply(List<C3509cea> list) {
        C7471uYa.b(list, "found");
        List list2 = this.a;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (C3509cea y : list) {
            arrayList.add(y.y());
        }
        List c = C7676xWa.c((Iterable) list2, (Iterable) arrayList);
        if (c.isEmpty()) {
            return c.a.a(list);
        }
        return b.a.a(list, c, null);
    }
}
