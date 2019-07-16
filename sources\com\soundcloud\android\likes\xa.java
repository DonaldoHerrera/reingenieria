package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: TrackLikesUniflowPresenter.kt */
final class xa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ T a;

    xa(T t) {
        this.a = t;
    }

    /* renamed from: a */
    public final List<V> apply(Map<C3508cda, ? extends C6185ma> map) {
        C7471uYa.b(map, "urnsToTrackItems");
        List<C2862s> a2 = this.a.a();
        ArrayList arrayList = new ArrayList();
        for (C2862s a3 : a2) {
            C6185ma maVar = (C6185ma) map.get(a3.a());
            V v = maVar != null ? new V(maVar) : null;
            if (v != null) {
                arrayList.add(v);
            }
        }
        return arrayList;
    }
}
