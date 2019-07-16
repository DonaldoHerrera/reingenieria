package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PlayHistoryPresenter.kt */
final class qa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ List a;

    qa(List list) {
        this.a = list;
    }

    /* renamed from: a */
    public final List<Q> apply(List<? extends C6185ma> list) {
        C7471uYa.b(list, "it");
        if (list.isEmpty()) {
            return C6850lWa.a(new S());
        }
        List a2 = C6850lWa.a(new T(this.a.size()));
        List<C6185ma> list2 = this.a;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list2, 10));
        for (C6185ma u : list2) {
            arrayList.add(new U(u));
        }
        return C7676xWa.c((Collection) a2, (Iterable) arrayList);
    }
}
