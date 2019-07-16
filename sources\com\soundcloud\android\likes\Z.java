package com.soundcloud.android.likes;

import java.util.ArrayList;
import java.util.List;

/* compiled from: TrackLikesUniflowAdapter.kt */
final class Z<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3970aa a;

    Z(C3970aa aaVar) {
        this.a = aaVar;
    }

    /* renamed from: a */
    public final HVa<Integer, List<V>> apply(Integer num) {
        C7471uYa.b(num, "it");
        List h = this.a.h();
        ArrayList arrayList = new ArrayList();
        for (Object next : h) {
            if (next instanceof V) {
                arrayList.add(next);
            }
        }
        return NVa.a(num, C7676xWa.q(arrayList));
    }
}
