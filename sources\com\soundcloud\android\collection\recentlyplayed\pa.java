package com.soundcloud.android.collection.recentlyplayed;

import java.util.Collection;
import java.util.List;

/* compiled from: RecentlyPlayedPresenter.kt */
final class pa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ List a;

    pa(List list) {
        this.a = list;
    }

    /* renamed from: a */
    public final List<E> apply(List<? extends C2804ca> list) {
        C7471uYa.b(list, "it");
        return list.isEmpty() ? this.a : C7676xWa.c((Collection) C6850lWa.a(new B(list.size())), (Iterable) list);
    }
}
