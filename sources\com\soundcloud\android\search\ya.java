package com.soundcloud.android.search;

import java.util.List;

/* compiled from: SearchStrategyFactory.kt */
final class ya<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ e a;

    ya(e eVar) {
        this.a = eVar;
    }

    /* renamed from: a */
    public final IPa<C5926o<C3776gea>> apply(C5926o<C3776gea> oVar) {
        C7471uYa.b(oVar, "results");
        C5927oa oaVar = C5927oa.this;
        List f = oVar.f();
        C7471uYa.a((Object) f, "results.collection");
        return oaVar.d(f).e(new xa(oVar));
    }
}
