package com.soundcloud.android.collection;

import com.soundcloud.android.image.va;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Observables.kt */
public final class Z<T1, T2, T3, T4, T5, R> implements C6980nQa<T1, T2, T3, T4, T5, R> {
    public final R a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        List list = (List) t5;
        List list2 = (List) t4;
        List list3 = (List) t3;
        List list4 = (List) t2;
        List<C3863rda> list5 = (List) t1;
        C7471uYa.a((Object) list5, "playlists");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list5, 10));
        for (C3863rda a : list5) {
            arrayList.add(va.a(a));
        }
        C2843y yVar = new C2843y(list4, arrayList, list3, list2, list);
        return yVar;
    }
}
