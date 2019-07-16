package com.soundcloud.android.search;

import java.util.ArrayList;
import java.util.List;

/* compiled from: SearchStrategyFactory.kt */
final class za<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ La a;
    final /* synthetic */ String b;

    za(La la, String str) {
        this.a = la;
        this.b = str;
    }

    /* renamed from: a */
    public final I apply(C5926o<C3776gea> oVar) {
        C7471uYa.b(oVar, "searchCollection");
        List<C3776gea> f = oVar.f();
        C7471uYa.a((Object) f, "searchCollection.collection");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) f, 10));
        for (C3776gea l : f) {
            arrayList.add(l.l());
        }
        Oca oca = (Oca) oVar.h().d();
        Object d = oVar.j().d(C3508cda.a);
        C7471uYa.a(d, "searchCollection.queryUrn.or(Urn.NOT_SET)");
        I i = new I(arrayList, oca, (C3508cda) d, oVar.l(), this.a, this.b);
        return i;
    }
}
