package com.soundcloud.android.tracks;

import com.soundcloud.android.likes.C3988l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.soundcloud.android.tracks.va reason: case insensitive filesystem */
/* compiled from: Observables.kt */
public final class C6203va<T1, T2, T3, T4, T5, R> implements C6980nQa<T1, T2, T3, T4, T5, R> {
    final /* synthetic */ Ca a;

    public C6203va(Ca ca) {
        this.a = ca;
    }

    public final R a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        C3807kda kda = (C3807kda) t5;
        C3508cda cda = (C3508cda) t4;
        C2057GR gr = (C2057GR) t3;
        C3988l lVar = (C3988l) t2;
        Map map = (Map) t1;
        R linkedHashMap = new LinkedHashMap(LWa.a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), this.a.c.a((C3509cea) entry.getValue(), kda, lVar, gr, cda));
        }
        return linkedHashMap;
    }
}
