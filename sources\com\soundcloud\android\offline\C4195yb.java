package com.soundcloud.android.offline;

import java.util.Map;

/* renamed from: com.soundcloud.android.offline.yb reason: case insensitive filesystem */
/* compiled from: Singles.kt */
public final class C4195yb<T1, T2, T3, R> implements C6844lQa<T1, T2, T3, R> {
    final /* synthetic */ C4180vb a;

    public C4195yb(C4180vb vbVar) {
        this.a = vbVar;
    }

    public final R a(T1 t1, T2 t2, T3 t3) {
        C3823mda mda = (C3823mda) t3;
        Map map = (Map) t2;
        Map map2 = (Map) t1;
        C4180vb vbVar = this.a;
        C7471uYa.a((Object) map2, "tracksOfflineStates");
        C7471uYa.a((Object) map, "playlistOfflineStates");
        C7471uYa.a((Object) mda, "likedTracksState");
        return vbVar.a(map2, map, mda);
    }
}
