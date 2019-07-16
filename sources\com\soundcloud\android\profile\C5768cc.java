package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.p;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.ia.i;
import java.util.Collection;
import java.util.List;

/* renamed from: com.soundcloud.android.profile.cc reason: case insensitive filesystem */
/* compiled from: UserListPresenter.kt */
public abstract class C5768cc extends C7037oEa<C2189NP<C4954HFa>, List<? extends C4954HFa>, C6973nJa, C5803jc, C5803jc, C5783fc> {
    /* access modifiers changed from: private */
    public final Zca k;
    /* access modifiers changed from: private */
    public final C3700b l;
    private final C5606ava m;

    public C5768cc(Zca zca, C3700b bVar, C5606ava ava, HPa hPa) {
        C7471uYa.b(zca, "screenData");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.k = zca;
        this.l = bVar;
        this.m = ava;
    }

    public abstract IPa<C2189NP<C4954HFa>> a(String str);

    public abstract IPa<C2189NP<C4954HFa>> b(C5803jc jcVar);

    /* access modifiers changed from: protected */
    public APa<d<C6973nJa, C2189NP<C4954HFa>>> c(C5803jc jcVar) {
        C7471uYa.b(jcVar, "pageParams");
        return b(jcVar);
    }

    /* access modifiers changed from: private */
    public final PXa<APa<d<C6973nJa, C2189NP<C4954HFa>>>> b(C2189NP<C4954HFa> np) {
        String str = (String) np.h().d();
        if (str != null) {
            return new C5758ac(str, this);
        }
        return null;
    }

    public void a(C5783fc fcVar) {
        C7471uYa.b(fcVar, "view");
        super.a(fcVar);
        b().a((VPa) fcVar.d().c(this.m.b(new Yb(this))), fcVar.K().f((C6776kQa<? super T>) new Zb<Object>(this, fcVar)));
    }

    /* access modifiers changed from: private */
    public final void a(C5783fc fcVar, Hb hb) {
        String a = hb.a().a();
        p pVar = p.SELF;
        v vVar = r1;
        v vVar2 = new v(fcVar.O(), i.position);
        C3710l lVar = r0;
        C3710l lVar2 = new C3710l(null, a, vVar, false, null, pVar, null, null, null, null, null, null, null, null, 16345, null);
        C4621nja a2 = C4621nja.a(hb.b(), K.a.e(hb.b(), lVar));
        C7471uYa.a((Object) a2, "NavigationTarget.forProf…xtMetadata)\n            )");
        fcVar.a(a2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, C2189NP<C4954HFa>>> b(C5803jc jcVar) {
        C7471uYa.b(jcVar, "pageParams");
        APa j = b(jcVar).j();
        C7471uYa.a((Object) j, "firstPageFunction(pagePa…          .toObservable()");
        return C7594wJa.a(j, new _b(this));
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
    public final APa<d<C6973nJa, C2189NP<C4954HFa>>> a(APa<C2189NP<C4954HFa>> aPa) {
        return C7594wJa.a(aPa, new C5763bc(this));
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
