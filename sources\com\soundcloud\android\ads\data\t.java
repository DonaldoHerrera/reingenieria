package com.soundcloud.android.ads.data;

import com.soundcloud.android.foundation.ads.C3686m;
import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: VideoAdStorage.kt */
public class t {
    /* access modifiers changed from: private */
    public final C6699jHa a;
    /* access modifiers changed from: private */
    public final v b;
    /* access modifiers changed from: private */
    public final C3700b c;
    /* access modifiers changed from: private */
    public final C3469VY d;

    public t(C6699jHa jha, v vVar, C3700b bVar, C3469VY vy) {
        C7471uYa.b(jha, "deviceHelper");
        C7471uYa.b(vVar, "videoAdsDao");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(vy, "errorReporter");
        this.a = jha;
        this.b = vVar;
        this.c = bVar;
        this.d = vy;
    }

    public C6979nPa a(long j, C3686m mVar) {
        C7471uYa.b(mVar, "ad");
        C6979nPa b2 = C6979nPa.b((C6368eQa) new s(this, mVar, j));
        C7471uYa.a((Object) b2, "Completable.fromAction {…        )\n        )\n    }");
        return b2;
    }

    public IPa<C4928GKa<g>> b(long j) {
        IPa<C4928GKa<g>> g = this.b.b(j, this.a.b()).c((C6776kQa<? super T>) new k<Object>(this)).e(l.a).c((C6776kQa<? super T>) new m<Object>(this)).e(o.a).a((C6776kQa<? super Throwable>) new p<Object>(this)).a((C6776kQa<? super Throwable>) new q<Object>(this)).g(r.a);
        C7471uYa.a((Object) g, "videoAdsDao.getAds(times…urn { Optional.absent() }");
        return g;
    }

    public C6979nPa a(long j) {
        C6979nPa b2 = C6979nPa.b((C6368eQa) new j(this, j));
        C7471uYa.a((Object) b2, "Completable.fromAction {…etAppVersionCode())\n    }");
        return b2;
    }

    public C6979nPa a() {
        C6979nPa b2 = C6979nPa.b((C6368eQa) new i(this));
        C7471uYa.a((Object) b2, "Completable.fromAction {…sDao.clearAll()\n        }");
        return b2;
    }
}
