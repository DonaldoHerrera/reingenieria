package com.soundcloud.android.features.library.artists;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.p;
import com.soundcloud.android.profile.C5803jc;
import com.soundcloud.android.profile.Lc;
import java.util.Collection;
import java.util.List;

/* compiled from: ArtistsPresenter.kt */
public final class o extends C7037oEa<C2189NP<C4954HFa>, List<? extends C4954HFa>, C6973nJa, C5803jc, C5803jc, a> {
    private final Lc k;
    /* access modifiers changed from: private */
    public final C3700b l;
    private final C5606ava m;
    private final HPa n;

    public o(Lc lc, C3700b bVar, C5606ava ava, HPa hPa) {
        C7471uYa.b(lc, "operations");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.k = lc;
        this.l = bVar;
        this.m = ava;
        this.n = hPa;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, C2189NP<C4954HFa>>> c(C5803jc jcVar) {
        C7471uYa.b(jcVar, "pageParams");
        return b(jcVar);
    }

    /* access modifiers changed from: private */
    public final PXa<APa<d<C6973nJa, C2189NP<C4954HFa>>>> b(C2189NP<C4954HFa> np) {
        String str = (String) np.h().d();
        if (str != null) {
            return new n(str, this);
        }
        return null;
    }

    public void a(a aVar) {
        C7471uYa.b(aVar, "view");
        super.a(aVar);
        b().a((VPa) aVar.d().c(this.m.b(new i(this))), aVar.K().f((C6776kQa<? super T>) new j<Object>(this, aVar)), aVar.X().f((C6776kQa<? super T>) new k<Object>(aVar)));
    }

    /* access modifiers changed from: private */
    public final void a(a aVar, q qVar) {
        C3710l lVar = r0;
        C3710l lVar2 = new C3710l(null, qVar.a().a(), null, false, null, p.SELF, null, null, null, null, null, null, null, null, 16349, null);
        C4621nja a = C4621nja.a(qVar.b(), K.a.e(qVar.b(), lVar));
        C7471uYa.a((Object) a, "NavigationTarget.forProf…xtMetadata)\n            )");
        aVar.a(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, C2189NP<C4954HFa>>> b(C5803jc jcVar) {
        C7471uYa.b(jcVar, "pageParams");
        APa j = this.k.b(jcVar.a()).j();
        C7471uYa.a((Object) j, "operations.pagedFollowin…          .toObservable()");
        return C7594wJa.a(j, new l(this));
    }

    /* access modifiers changed from: protected */
    public C2189NP<C4954HFa> a(C2189NP<C4954HFa> np, C2189NP<C4954HFa> np2) {
        C7471uYa.b(np, "firstPage");
        C7471uYa.b(np2, "nextPage");
        Pca f = np.f();
        C7471uYa.a((Object) f, "firstPage.items()");
        List f2 = f.f();
        C7471uYa.a((Object) f2, "firstPage.items().collection");
        Pca f3 = np2.f();
        String str = "nextPage.items()";
        C7471uYa.a((Object) f3, str);
        List f4 = f3.f();
        C7471uYa.a((Object) f4, "nextPage.items().collection");
        List c = C7676xWa.c((Collection) f2, (Iterable) f4);
        Pca f5 = np2.f();
        C7471uYa.a((Object) f5, str);
        return new C2189NP<>(new Pca(c, f5.g()));
    }

    /* access modifiers changed from: private */
    public final IPa<C2189NP<C4954HFa>> a(String str) {
        return this.k.b(str);
    }

    /* access modifiers changed from: protected */
    public APa<List<C4954HFa>> a(C2189NP<C4954HFa> np) {
        C7471uYa.b(np, "domainModel");
        Pca f = np.f();
        C7471uYa.a((Object) f, "domainModel.items()");
        APa<List<C4954HFa>> c = APa.c(f.f());
        C7471uYa.a((Object) c, "Observable.just(domainModel.items().collection)");
        return c;
    }
}
