package com.soundcloud.android.search;

import java.util.List;

/* renamed from: com.soundcloud.android.search.la reason: case insensitive filesystem */
/* compiled from: SearchStrategyFactory.kt */
final class C5921la<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ a a;

    C5921la(a aVar) {
        this.a = aVar;
    }

    /* renamed from: a */
    public final IPa<C5926o<C3927zda>> apply(C5926o<C3927zda> oVar) {
        C7471uYa.b(oVar, "results");
        C5927oa oaVar = this.a.d;
        List f = oVar.f();
        C7471uYa.a((Object) f, "results.collection");
        return oaVar.a(f).e(new C5919ka(oVar));
    }
}
