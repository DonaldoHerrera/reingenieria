package com.soundcloud.android.search;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.soundcloud.android.search.ua reason: case insensitive filesystem */
/* compiled from: SearchStrategyFactory.kt */
final class C5938ua<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ d a;

    C5938ua(d dVar) {
        this.a = dVar;
    }

    /* renamed from: a */
    public final IPa<C5926o<C5914i>> apply(C5926o<C5914i> oVar) {
        C7471uYa.b(oVar, "results");
        C5927oa oaVar = C5927oa.this;
        List f = oVar.f();
        C7471uYa.a((Object) f, "results.collection");
        return oaVar.c(f).b((Callable<? extends T>) new C5936ta<Object>(oVar));
    }
}
