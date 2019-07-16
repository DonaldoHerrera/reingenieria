package com.soundcloud.android.playback.playqueue;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PlayQueueOperations.kt */
final class Ia<T, R> implements C7118pQa<T, R> {
    public static final Ia a = new Ia();

    Ia() {
    }

    /* renamed from: a */
    public final Map<C3508cda, String> apply(List<C3784hea> list) {
        C7471uYa.b(list, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable) list, 10)), 16));
        for (C3784hea hea : list) {
            linkedHashMap.put(hea.a, hea.c);
        }
        return linkedHashMap;
    }
}
