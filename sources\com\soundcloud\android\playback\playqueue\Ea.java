package com.soundcloud.android.playback.playqueue;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PlayQueueOperations.kt */
final class Ea<T, R> implements C7118pQa<T, R> {
    public static final Ea a = new Ea();

    Ea() {
    }

    /* renamed from: a */
    public final Map<C3508cda, String> apply(List<? extends Eda> list) {
        C7471uYa.b(list, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable) list, 10)), 16));
        for (Eda eda : list) {
            linkedHashMap.put(eda.v(), eda.s());
        }
        return linkedHashMap;
    }
}
