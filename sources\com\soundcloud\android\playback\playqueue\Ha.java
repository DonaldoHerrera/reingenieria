package com.soundcloud.android.playback.playqueue;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PlayQueueOperations.kt */
final class Ha<T, R> implements C7118pQa<T, R> {
    public static final Ha a = new Ha();

    Ha() {
    }

    /* renamed from: a */
    public final Map<C3508cda, String> apply(Map<C3508cda, C3509cea> map) {
        C7471uYa.b(map, "it");
        Set<Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable) entrySet, 10)), 16));
        for (Entry entry : entrySet) {
            HVa a2 = NVa.a(entry.getKey(), ((C3509cea) entry.getValue()).w());
            linkedHashMap.put(a2.c(), a2.d());
        }
        return linkedHashMap;
    }
}
