package com.soundcloud.android.search;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.soundcloud.android.search.ma reason: case insensitive filesystem */
/* compiled from: SearchStrategyFactory.kt */
final class C5923ma<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ La a;
    final /* synthetic */ String b;

    C5923ma(La la, String str) {
        this.a = la;
        this.b = str;
    }

    /* renamed from: a */
    public final I apply(C5926o<C3927zda> oVar) {
        C7471uYa.b(oVar, "searchCollection");
        List<C3927zda> f = oVar.f();
        C7471uYa.a((Object) f, "searchCollection.collection");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) f, 10));
        for (C3927zda a2 : f) {
            arrayList.add(a2.a());
        }
        Oca oca = (Oca) oVar.h().d();
        Object d = oVar.j().d(C3508cda.a);
        C7471uYa.a(d, "searchCollection.queryUrn.or(Urn.NOT_SET)");
        I i = new I(arrayList, oca, (C3508cda) d, oVar.l(), this.a, this.b);
        return i;
    }
}
