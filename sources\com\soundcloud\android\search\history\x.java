package com.soundcloud.android.search.history;

import com.soundcloud.android.search.history.s.a;
import java.util.Collection;
import java.util.List;

/* compiled from: SearchHistoryPresenter.kt */
final class x<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ y a;

    x(y yVar) {
        this.a = yVar;
    }

    /* renamed from: a */
    public final List<s> apply(C4928GKa<List<String>> gKa) {
        C7471uYa.b(gKa, "it");
        y yVar = this.a;
        Object d = gKa.d(C6918mWa.a());
        C7471uYa.a(d, "it.or(emptyList())");
        List<s> a2 = yVar.a((List) d);
        return a2.isEmpty() ^ true ? C7676xWa.a((Collection) a2, (Object) a.a) : a2;
    }
}
