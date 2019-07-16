package com.soundcloud.android.search;

import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.playback.Db;
import java.util.List;

/* renamed from: com.soundcloud.android.search.ha reason: case insensitive filesystem */
/* compiled from: SearchResultsPresenter.kt */
public final class C5903ha extends C7037oEa<I, List<? extends Wca>, C6973nJa, SearchFragmentArgs, SearchFragmentArgs, C5917ja> {
    private final C6376eYa<SearchFragmentArgs, I, Boolean, RVa> k = new V(this);
    /* access modifiers changed from: private */
    public final C5933s l;
    /* access modifiers changed from: private */
    public final Ja m;
    private final F n;
    private final Db o;
    private final C2390YL p;
    private final C3240rR q;
    private final HPa r;

    public C5903ha(C5933s sVar, Ja ja, F f, Db db, C2390YL yl, C3240rR rRVar, HPa hPa) {
        C7471uYa.b(sVar, "searchOperations");
        C7471uYa.b(ja, "searchTracker");
        C7471uYa.b(f, "screenProvider");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(yl, "engagementsTracking");
        C7471uYa.b(rRVar, "followingOperations");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.l = sVar;
        this.m = ja;
        this.n = f;
        this.o = db;
        this.p = yl;
        this.q = rRVar;
        this.r = hPa;
    }

    private final void d(SearchFragmentArgs searchFragmentArgs) {
        this.m.a(this.n.b(), searchFragmentArgs.f(), C4928GKa.b(searchFragmentArgs.d()), C4928GKa.b(searchFragmentArgs.c()));
    }

    public final C2390YL f() {
        return this.p;
    }

    public final C3240rR g() {
        return this.q;
    }

    public final Db h() {
        return this.o;
    }

    private final VPa c(APa<Na> aPa, C5917ja jaVar) {
        VPa f = aPa.d((C6776kQa<? super T>) new C5893ca<Object>(this)).h(C5895da.a).f((C6776kQa<? super T>) new U<Object>(new C5897ea(jaVar)));
        C7471uYa.a((Object) f, "userClickSource\n        …bscribe(view::navigateTo)");
        return f;
    }

    private final VPa b(C5917ja jaVar) {
        VPa g = jaVar.B().d((C6776kQa<? super T>) new C5899fa<Object>(this)).d((C7118pQa<? super T, ? extends C7255rPa>) new C5901ga<Object,Object>(this)).g();
        C7471uYa.a((Object) g, "view.onUserToggleFollow(…\n            .subscribe()");
        return g;
    }

    /* access modifiers changed from: private */
    public final _Xa<I, PXa<APa<d<C6973nJa, I>>>> c(SearchFragmentArgs searchFragmentArgs) {
        return new T(this, searchFragmentArgs);
    }

    public void a(C5917ja jaVar) {
        C7471uYa.b(jaVar, "view");
        super.a(jaVar);
        b().a(b(jaVar.n(), jaVar), a(jaVar.r(), jaVar), c(jaVar.I(), jaVar), b(jaVar));
    }

    private final VPa b(APa<Ea> aPa, C5917ja jaVar) {
        VPa f = aPa.d((C6776kQa<? super T>) new Z<Object>(this)).g(new C5889aa(this)).f((C6776kQa<? super T>) new U<Object>(new C5891ba(jaVar)));
        C7471uYa.a((Object) f, "trackClickSource\n       …view::showPlaybackResult)");
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, I>> c(SearchFragmentArgs searchFragmentArgs) {
        C7471uYa.b(searchFragmentArgs, "pageParams");
        APa j = this.l.a(searchFragmentArgs.e(), searchFragmentArgs.a(), searchFragmentArgs.d()).j();
        C7471uYa.a((Object) j, "searchOperations.searchR…\n        ).toObservable()");
        return C7594wJa.a(j, c(searchFragmentArgs));
    }

    private final VPa a(APa<C5941x> aPa, C5917ja jaVar) {
        VPa f = aPa.d((C6776kQa<? super T>) new W<Object>(this)).h(X.a).f((C6776kQa<? super T>) new U<Object>(new Y(jaVar)));
        C7471uYa.a((Object) f, "playlistClickSource\n    …bscribe(view::navigateTo)");
        return f;
    }

    /* access modifiers changed from: protected */
    public I a(I i, I i2) {
        C7471uYa.b(i, "firstPage");
        C7471uYa.b(i2, "nextPage");
        return i.a(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, I>> b(SearchFragmentArgs searchFragmentArgs) {
        C7471uYa.b(searchFragmentArgs, "pageParams");
        APa a = this.l.a(searchFragmentArgs.e(), searchFragmentArgs.a(), searchFragmentArgs.d()).j().a((DPa<? extends R, ? super T>) new C7500uua<Object,Object>(new Q(this, searchFragmentArgs)));
        C7471uYa.a((Object) a, "searchOperations.searchR…chPage(pageParams, it) })");
        return C7594wJa.a(a, c(searchFragmentArgs));
    }

    /* access modifiers changed from: private */
    public final void a(SearchFragmentArgs searchFragmentArgs, I i) {
        if (searchFragmentArgs.b()) {
            d(searchFragmentArgs);
        }
        this.k.a(searchFragmentArgs, i, Boolean.valueOf(this.m.a(searchFragmentArgs.e())));
    }

    /* access modifiers changed from: protected */
    public APa<List<Wca>> a(I i) {
        C7471uYa.b(i, "domainModel");
        return this.l.a(i);
    }
}
