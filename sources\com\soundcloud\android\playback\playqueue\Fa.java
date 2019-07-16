package com.soundcloud.android.playback.playqueue;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PlayQueueOperations.kt */
final class Fa<T, R> implements C7118pQa<T, R> {
    public static final Fa a = new Fa();

    Fa() {
    }

    /* renamed from: a */
    public final Map<C3508cda, String> apply(List<Rda> list) {
        C7471uYa.b(list, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable) list, 10)), 16));
        for (Rda rda : list) {
            linkedHashMap.put(rda.c(), rda.b());
        }
        return linkedHashMap;
    }
}
