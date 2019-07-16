package com.soundcloud.android.features.library.playlists;

import com.soundcloud.android.collection.C2746fa;
import com.soundcloud.android.foundation.events.C3700b;
import java.util.List;

/* compiled from: PlaylistCollectionPresenter.kt */
public final class D extends C7589wEa<List<? extends C3635l>, C6973nJa, RVa, RVa, F> {
    /* access modifiers changed from: private */
    public final C2287SS l;
    /* access modifiers changed from: private */
    public final C2746fa m;
    private final C4655rja n;
    private final C3700b o;
    /* access modifiers changed from: private */
    public final C3636m p;
    private final HPa q;
    private final C5606ava r;

    public D(C2287SS ss, C2746fa faVar, C4655rja rja, C3700b bVar, C3636m mVar, HPa hPa, C5606ava ava) {
        C7471uYa.b(ss, "myPlaylistsUniflowOperations");
        C7471uYa.b(faVar, "collectionOptionsStorage");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(mVar, "mapper");
        C7471uYa.b(hPa, "mainThreadScheduler");
        C7471uYa.b(ava, "observerFactory");
        super(hPa);
        this.l = ss;
        this.m = faVar;
        this.n = rja;
        this.o = bVar;
        this.p = mVar;
        this.q = hPa;
        this.r = ava;
    }

    public final C3700b f() {
        return this.o;
    }

    public final C4655rja g() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, List<C3635l>>> b(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<d<C6973nJa, List<C3635l>>> k = this.m.h().k(new z(this));
        C7471uYa.a((Object) k, "collectionOptionsStorage…acyPageResult()\n        }");
        return k;
    }

    public void a(F f) {
        C7471uYa.b(f, "view");
        super.a(f);
        b().a((VPa) f.Na().f((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new s<Object,Object>(this)).c(C5220Pua.a((C6776kQa<T>) new C<T>(new t(f)))), (VPa) f.Ka().c(this.r.b(new u(this.m))), (VPa) f.wa().c(this.r.b(new v(this))), (VPa) f.k().c(this.r.b(new w(this))), (VPa) f.d().c(this.r.b(new x(this))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, List<C3635l>>> c(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<d<C6973nJa, List<C3635l>>> k = this.m.h().k(new B(this));
        C7471uYa.a((Object) k, "collectionOptionsStorage…acyPageResult()\n        }");
        return k;
    }
}
