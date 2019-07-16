package com.soundcloud.android.search.suggestions.searchsuggestions;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: SearchSuggestionsUniflowPresenter.kt */
public final class j extends C7318sJa<m, String, RVa, l> {
    private l l;
    private final HPa m;
    /* access modifiers changed from: private */
    public final a n;
    /* access modifiers changed from: private */
    public final C3700b o;
    private final C7504uwa p;

    public j(HPa hPa, a aVar, C3700b bVar, C7504uwa uwa) {
        C7471uYa.b(hPa, "mainThreadScheduler");
        C7471uYa.b(aVar, "clickListenerFactory");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(uwa, "searchSuggestionOperations");
        super(hPa);
        this.m = hPa;
        this.n = aVar;
        this.o = bVar;
        this.p = uwa;
    }

    public void a(l lVar) {
        C7471uYa.b(lVar, "view");
        this.l = lVar;
        super.a(lVar);
        b().a((VPa) lVar.Ba().c(C5220Pua.a((C6776kQa<T>) new f<T>(lVar))), (VPa) lVar.Qa().c(C5220Pua.a((C6776kQa<T>) new g<T>(lVar))), (VPa) lVar.qa().c(C5220Pua.a((C6776kQa<T>) new h<T>(this, lVar))));
    }

    public void a() {
        super.a();
        this.l = null;
    }

    /* renamed from: a */
    public APa<m> f(String str) {
        C7471uYa.b(str, "pageParams");
        APa<m> h = this.p.a(str).h(i.a);
        C7471uYa.a((Object) h, "searchSuggestionOperatio…uggestionsViewModel(it) }");
        return h;
    }

    /* renamed from: a */
    public APa<m> g(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<m> e = APa.e();
        C7471uYa.a((Object) e, "Observable.empty()");
        return e;
    }
}
