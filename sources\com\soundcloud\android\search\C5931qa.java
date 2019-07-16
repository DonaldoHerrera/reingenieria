package com.soundcloud.android.search;

import java.util.List;

/* renamed from: com.soundcloud.android.search.qa reason: case insensitive filesystem */
/* compiled from: SearchStrategyFactory.kt */
final class C5931qa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ c a;

    C5931qa(c cVar) {
        this.a = cVar;
    }

    /* renamed from: a */
    public final IPa<C5926o<Yda>> apply(C5926o<Yda> oVar) {
        C7471uYa.b(oVar, "results");
        C5927oa oaVar = C5927oa.this;
        List f = oVar.f();
        C7471uYa.a((Object) f, "results.collection");
        return oaVar.b(f).e(new C5929pa(oVar));
    }
}
