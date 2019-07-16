package com.soundcloud.android.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: CollectionOperations.kt */
final class X<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Y a;
    final /* synthetic */ List b;

    X(Y y, List list) {
        this.a = y;
        this.b = list;
    }

    /* renamed from: a */
    public final List<Ga> apply(Map<C3508cda, C3509cea> map) {
        C7471uYa.b(map, "tracksMap");
        List<C3508cda> list = this.b;
        C7471uYa.a((Object) list, "likedUrns");
        ArrayList arrayList = new ArrayList();
        for (C3508cda cda : list) {
            C3509cea cea = (C3509cea) map.get(cda);
            Ga a2 = cea != null ? this.a.a.a(cea) : null;
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
