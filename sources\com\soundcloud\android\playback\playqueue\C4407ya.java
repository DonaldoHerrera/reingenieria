package com.soundcloud.android.playback.playqueue;

import java.util.Map;

/* renamed from: com.soundcloud.android.playback.playqueue.ya reason: case insensitive filesystem */
/* compiled from: Singles.kt */
public final class C4407ya<T1, T2, T3, T4, R> implements C6912mQa<T1, T2, T3, T4, R> {
    public final R a(T1 t1, T2 t2, T3 t3, T4 t4) {
        Map map = (Map) t4;
        Map map2 = (Map) t3;
        Map map3 = (Map) t2;
        Map map4 = (Map) t1;
        C7471uYa.a((Object) map4, "t1");
        C7471uYa.a((Object) map3, "t2");
        Map a = LWa.a(map4, map3);
        C7471uYa.a((Object) map2, "t3");
        Map a2 = LWa.a(a, map2);
        C7471uYa.a((Object) map, "t4");
        return LWa.a(a2, map);
    }
}
