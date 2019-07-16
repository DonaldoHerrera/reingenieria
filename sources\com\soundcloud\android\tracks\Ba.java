package com.soundcloud.android.tracks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: TrackItemRepository.kt */
final class Ba<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ List a;

    Ba(List list) {
        this.a = list;
    }

    /* renamed from: a */
    public final List<C6185ma> apply(Map<C3508cda, ? extends C6185ma> map) {
        C7471uYa.b(map, "urnTrackMap");
        List<C3508cda> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (C3508cda cda : list) {
            C6185ma maVar = (C6185ma) map.get(cda);
            if (maVar != null) {
                arrayList.add(maVar);
            }
        }
        return arrayList;
    }
}
