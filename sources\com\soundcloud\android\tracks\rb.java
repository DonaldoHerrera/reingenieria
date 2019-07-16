package com.soundcloud.android.tracks;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TrackStorage.kt */
final class rb<T, R> implements C7118pQa<T, R> {
    public static final rb a = new rb();

    rb() {
    }

    /* renamed from: a */
    public final Map<C3508cda, C3509cea> apply(List<C3509cea> list) {
        C7471uYa.b(list, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable<? extends T>) list, 10)), 16));
        for (Object next : list) {
            linkedHashMap.put(((C3509cea) next).y(), next);
        }
        return linkedHashMap;
    }
}
