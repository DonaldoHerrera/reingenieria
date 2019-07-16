package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PlayHistoryOperations.kt */
final class ha<T1, T2, R> implements C6504gQa<Map<C3508cda, ? extends C6185ma>, C4928GKa<C3508cda>, List<? extends C6185ma>> {
    final /* synthetic */ ia a;
    final /* synthetic */ List b;

    ha(ia iaVar, List list) {
        this.a = iaVar;
        this.b = list;
    }

    /* renamed from: a */
    public final List<C6185ma> apply(Map<C3508cda, ? extends C6185ma> map, C4928GKa<C3508cda> gKa) {
        C7471uYa.b(map, "tracks");
        C7471uYa.b(gKa, "urnOptional");
        List<C3508cda> list = this.b;
        C7471uYa.a((Object) list, "trackList");
        ArrayList arrayList = new ArrayList();
        for (C3508cda cda : list) {
            C6185ma maVar = (C6185ma) map.get(cda);
            if (maVar != null) {
                arrayList.add(maVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (this.a.a.a((C6185ma) next, gKa)) {
                arrayList2.add(next);
            }
        }
        return C7676xWa.d((Iterable) arrayList2, this.a.c);
    }
}
