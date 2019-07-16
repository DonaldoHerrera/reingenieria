package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.u;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.profile.Lc.a;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.soundcloud.android.profile.wc reason: case insensitive filesystem */
/* compiled from: UserPlayablePresenter.kt */
public abstract class C5867wc extends C7037oEa<C2189NP<a>, List<? extends C5818mc>, C6973nJa, RVa, RVa, C5849t> {
    private final PlaySessionSource k;
    /* access modifiers changed from: private */
    public final C3700b l;
    /* access modifiers changed from: private */
    public final Db m;
    /* access modifiers changed from: private */
    public final C3508cda n;
    /* access modifiers changed from: private */
    public final SearchQuerySourceInfo o;
    /* access modifiers changed from: private */
    public final Yca p;

    public C5867wc(C3700b bVar, Db db, C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo, Yca yca, HPa hPa) {
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(cda, "user");
        C7471uYa.b(yca, "screen");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.l = bVar;
        this.m = db;
        this.n = cda;
        this.o = searchQuerySourceInfo;
        this.p = yca;
        PlaySessionSource a = PlaySessionSource.a(this.p, this.n);
        a.a(this.o);
        C7471uYa.a((Object) a, "PlaySessionSource.forArt…r.searchQuerySourceInfo }");
        this.k = a;
    }

    public abstract APa<C2189NP<a>> a(String str);

    public abstract APa<C2189NP<a>> f();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, C2189NP<a>>> c(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        return b(rVa);
    }

    /* access modifiers changed from: private */
    public final PXa<APa<d<C6973nJa, C2189NP<a>>>> b(C2189NP<a> np) {
        String str = (String) np.h().d();
        if (str != null) {
            return new C5852tc(str, this);
        }
        return null;
    }

    private final C2189NP<a> b(C2189NP<a> np, C2189NP<a> np2) {
        Pca f = np.f();
        C7471uYa.a((Object) f, "items()");
        List f2 = f.f();
        C7471uYa.a((Object) f2, "items().collection");
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

    public void a(C5849t tVar) {
        C7471uYa.b(tVar, "view");
        super.a(tVar);
        b().a(tVar.d().h(new C5823nc(this)).f((C6776kQa<? super T>) new C5828oc<Object>(this)), tVar.l().g(new C5833pc(this)).f((C6776kQa<? super T>) new C5857uc<Object>(new C5838qc(tVar))), tVar.k().h(new C5842rc(this)).f((C6776kQa<? super T>) new C5857uc<Object>(new C5847sc(tVar))));
    }

    /* access modifiers changed from: protected */
    public C2189NP<a> a(C2189NP<a> np, C2189NP<a> np2) {
        C7471uYa.b(np, "firstPage");
        C7471uYa.b(np2, "nextPage");
        return b(np, np2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, C2189NP<a>>> b(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        return a(f());
    }

    /* access modifiers changed from: protected */
    public APa<List<C5818mc>> a(C2189NP<a> np) {
        Object obj;
        C7471uYa.b(np, "domainModel");
        Pca<a> f = np.f();
        C7471uYa.a((Object) f, "domainModel.items()");
        ArrayList<C6185ma> arrayList = new ArrayList<>();
        for (a b : f) {
            C6185ma b2 = b.b();
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList, 10));
        for (C6185ma maVar : arrayList) {
            arrayList2.add(u.a(maVar.a(), C4928GKa.b(maVar.y())));
        }
        int i = 0;
        ArrayList arrayList3 = new ArrayList();
        for (a aVar : np) {
            C6185ma b3 = aVar.b();
            if (b3 != null) {
                int i2 = i + 1;
                obj = new be(b3, new ce(i, arrayList2, this.k));
                i = i2;
            } else {
                C3863rda a = aVar.a();
                C3508cda cda = null;
                if (a != null) {
                    C3508cda a2 = a.a();
                    C7471uYa.a((Object) a2, "it.urn");
                    C5882zc zcVar = new C5882zc(a2, this.o);
                    SearchQuerySourceInfo searchQuerySourceInfo = this.o;
                    if (searchQuerySourceInfo != null) {
                        cda = searchQuerySourceInfo.e();
                    }
                    obj = new C5877yc(a, zcVar, cda);
                } else {
                    obj = null;
                }
            }
            if (obj != null) {
                arrayList3.add(obj);
            }
        }
        APa<List<C5818mc>> c = APa.c(arrayList3);
        C7471uYa.a((Object) c, "Observable.just(domainMo…             }\n        })");
        return c;
    }

    /* access modifiers changed from: private */
    public final APa<d<C6973nJa, C2189NP<a>>> a(APa<C2189NP<a>> aPa) {
        return C7594wJa.a(aPa, new C5862vc(this));
    }
}
