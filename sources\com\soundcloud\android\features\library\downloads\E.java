package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.features.library.downloads.s.a;
import com.soundcloud.android.features.library.downloads.s.b;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.playqueue.u;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import java.util.List;

/* compiled from: DownloadsPresenter.kt */
public final class E extends C7658xEa<List<? extends s>, L, RVa, RVa, K> {
    private final C3577k l;
    private final HPa m;
    /* access modifiers changed from: private */
    public final C4655rja n;
    /* access modifiers changed from: private */
    public final Db o;
    /* access modifiers changed from: private */
    public final C3700b p;

    public E(C3577k kVar, HPa hPa, C4655rja rja, Db db, C3700b bVar) {
        C7471uYa.b(kVar, "dataSource");
        C7471uYa.b(hPa, "mainScheduler");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(bVar, "analytics");
        super(hPa);
        this.l = kVar;
        this.m = hPa;
        this.n = rja;
        this.o = db;
        this.p = bVar;
    }

    private final APa<d<L, List<s>>> f() {
        APa<d<L, List<s>>> h = this.l.a().h(D.a);
        C7471uYa.a((Object) h, "dataSource.loadTracksAnd…nloadsLibraryItem>>(it) }");
        return h;
    }

    /* renamed from: b */
    public APa<d<L, List<s>>> e(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        return f();
    }

    /* renamed from: a */
    public APa<d<L, List<s>>> d(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        return f();
    }

    public void a(K k) {
        C7471uYa.b(k, "view");
        super.a(k);
        b().a(k.d().f((C6776kQa<? super T>) new y<Object>(this)), k.x().f((C6776kQa<? super T>) new z<Object>(this)), k.k().f((C6776kQa<? super T>) new A<Object>(k)), a(k.l()).f((C6776kQa<? super T>) new B<Object>(k)));
    }

    private final APa<C4536zc> a(APa<HVa<s, List<s>>> aPa) {
        APa<C4536zc> g = aPa.g(new C(this));
        C7471uYa.a((Object) g, "flatMapSingle { (track, …)\n            )\n        }");
        return g;
    }

    /* access modifiers changed from: private */
    public final u a(s sVar) {
        if (sVar instanceof b) {
            u a = u.a(((b) sVar).c().a());
            C7471uYa.a((Object) a, "PlayableWithReposter.from(track.urn)");
            return a;
        } else if (sVar instanceof a) {
            u a2 = u.a(((a) sVar).c().a());
            C7471uYa.a((Object) a2, "PlayableWithReposter.from(playlist.urn)");
            return a2;
        } else {
            throw new IllegalArgumentException("item can be either a track or a playlist");
        }
    }
}
