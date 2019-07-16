package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.playback.Db;

/* renamed from: com.soundcloud.android.profile.fa reason: case insensitive filesystem */
/* compiled from: ProfileBucketsPresenter.kt */
public final class C5781fa extends C7318sJa<C5831pa, RVa, RVa, C5826oa> {
    private final I l;
    private final C5604aua m;
    private final Ica n;
    /* access modifiers changed from: private */
    public final Db o;
    private final C3508cda p;
    private final SearchQuerySourceInfo q;

    public C5781fa(I i, C5604aua aua, Ica ica, Db db, C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo, HPa hPa) {
        C7471uYa.b(i, "profileBucketsDataSource");
        C7471uYa.b(aua, "liveEntities");
        C7471uYa.b(ica, "sessionProvider");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(cda, "userUrn");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.l = i;
        this.m = aua;
        this.n = ica;
        this.o = db;
        this.p = cda;
        this.q = searchQuerySourceInfo;
    }

    /* renamed from: b */
    public APa<C5831pa> g(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        return f(rVa);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.soundcloud.android.profile.ca, eYa] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.soundcloud.android.profile.ea] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    public APa<C5831pa> f(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa a = this.l.a(this.p, this.q);
        APa h = this.m.b(this.p).h(C5761ba.a);
        APa a2 = C7662xIa.a(this.n.a(this.p));
        ? r2 = C5766ca.e;
        if (r2 != 0) {
            r2 = new C5776ea(r2);
        }
        APa<C5831pa> a3 = APa.a((EPa<? extends T1>) a, (EPa<? extends T2>) h, (EPa<? extends T3>) a2, (C6844lQa) r2);
        C7471uYa.a((Object) a3, "Observable.combineLatest…cketsViewModel)\n        )");
        return a3;
    }

    public void a(C5826oa oaVar) {
        C7471uYa.b(oaVar, "view");
        super.a(oaVar);
        b().a(oaVar.n().g(new X(this)).f((C6776kQa<? super T>) new C5771da<Object>(new Y(oaVar))), oaVar.r().f((C6776kQa<? super T>) new C5771da<Object>(new Z(oaVar))), oaVar.E().f((C6776kQa<? super T>) new C5771da<Object>(new C5756aa(oaVar))));
    }
}
