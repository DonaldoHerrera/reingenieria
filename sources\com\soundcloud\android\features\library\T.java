package com.soundcloud.android.features.library;

import com.soundcloud.android.collection.B;
import com.soundcloud.android.collection.C2746fa;
import com.soundcloud.android.collection.C2843y;
import com.soundcloud.android.collection.E;
import com.soundcloud.android.collection.H;
import com.soundcloud.android.collection.playhistory.Z;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.stations.Ga;
import java.util.List;

/* compiled from: LibraryPresenter.kt */
public final class T extends C7037oEa<C2843y, List<? extends B>, C6973nJa, RVa, RVa, Z> {
    private final H k;
    private final E l;
    /* access modifiers changed from: private */
    public final Z m;
    /* access modifiers changed from: private */
    public final C2746fa n;
    /* access modifiers changed from: private */
    public final C4655rja o;
    private final Ga p;
    /* access modifiers changed from: private */
    public final C3700b q;
    private final C5606ava r;
    private final HPa s;
    /* access modifiers changed from: private */
    public final Ica t;
    private final C2436_U u;

    public T(H h, E e, Z z, C2746fa faVar, C4655rja rja, Ga ga, C3700b bVar, C5606ava ava, HPa hPa, Ica ica, C2436_U _u) {
        C7471uYa.b(h, "collectionOperations");
        C7471uYa.b(e, "collectionItemTransformer");
        C7471uYa.b(z, "playHistoryOperations");
        C7471uYa.b(faVar, "collectionOptionsStorage");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(ga, "stationHandler");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(hPa, "mainThreadScheduler");
        C7471uYa.b(ica, "sessionProvider");
        C7471uYa.b(_u, "featureOperations");
        super(hPa);
        this.k = h;
        this.l = e;
        this.m = z;
        this.n = faVar;
        this.o = rja;
        this.p = ga;
        this.q = bVar;
        this.r = ava;
        this.s = hPa;
        this.t = ica;
        this.u = _u;
    }

    /* access modifiers changed from: private */
    public final void c(C3508cda cda) {
        C3700b bVar = this.q;
        C3860raa a = C3860raa.a(cda, Yca.COLLECTIONS);
        C7471uYa.a((Object) a, "CollectionEvent.forRecen…(urn, Screen.COLLECTIONS)");
        bVar.a((J) a);
        this.p.a(cda);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, C2843y>> c(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        return C7594wJa.a(this.k.c(), null, 1, null);
    }

    /* access modifiers changed from: private */
    public final void b(C3508cda cda) {
        C3700b bVar = this.q;
        C3860raa a = C3860raa.a(cda, Yca.COLLECTIONS);
        C7471uYa.a((Object) a, "CollectionEvent.forRecen…(urn, Screen.COLLECTIONS)");
        bVar.a((J) a);
        C4655rja rja = this.o;
        C4621nja a2 = C4621nja.a(cda, C4928GKa.a(), C4928GKa.c(Yca.COLLECTIONS), C4928GKa.a());
        C7471uYa.a((Object) a2, "forProfile(urn, Optional…IONS), Optional.absent())");
        rja.a(a2);
    }

    public void a(Z z) {
        C7471uYa.b(z, "view");
        super.a(z);
        b().a((VPa) z.q().c(this.r.b(new I(this, z))), (VPa) z.z().c(this.r.b(new J(this))), (VPa) z.t().c(this.r.b(new K(this))), (VPa) z.s().c(this.r.b(new L(this))), (VPa) z.y().c(this.r.b(new M(this))), (VPa) z.p().c(this.r.b(new N(this))), (VPa) z.u().c(this.r.b(new O(this))), z.w().f((C6776kQa<? super T>) new P<Object>(this)), (VPa) z.v().c(this.r.b(new Q(this))), (VPa) z.d().c(this.r.b(new B(this))), z.j().f((C6776kQa<? super T>) new C<Object>(z)), z.g().f((C6776kQa<? super T>) new D<Object>(z)), z.h().g(new E(this)).f((C6776kQa<? super T>) new F<Object>(z)), z.i().f((C6776kQa<? super T>) new G<Object>(z)), z.m().f((C6776kQa<? super T>) new H<Object>(this, z)));
    }

    /* access modifiers changed from: private */
    public final void b(Z z) {
        if (this.u.l()) {
            C4621nja f = C4621nja.f();
            C7471uYa.a((Object) f, "downloads()");
            z.a(f);
        } else if (this.u.b()) {
            C3700b bVar = this.q;
            Waa S = Waa.S();
            C7471uYa.a((Object) S, "UpgradeFunnelEvent.fromDownloadsClick()");
            bVar.a((J) S);
            C4655rja rja = this.o;
            C4621nja a = C4621nja.a(C3920yea.OFFLINE);
            C7471uYa.a((Object) a, "forUpgrade(UpsellContext.OFFLINE)");
            rja.a(a);
        } else {
            throw new IllegalAccessException("User has clicked Downloads but should never have seen the option in their Library");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, C2843y>> b(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        return C7594wJa.a(this.k.a(), null, 1, null);
    }

    /* access modifiers changed from: protected */
    public APa<List<B>> a(C2843y yVar) {
        C7471uYa.b(yVar, "domainModel");
        return this.l.a(yVar);
    }

    /* access modifiers changed from: private */
    public final void a(C3508cda cda) {
        C3700b bVar = this.q;
        C3860raa a = C3860raa.a(cda, Yca.COLLECTIONS);
        C7471uYa.a((Object) a, "CollectionEvent.forRecen…(urn, Screen.COLLECTIONS)");
        bVar.a((J) a);
        C4655rja rja = this.o;
        C4621nja a2 = C4621nja.a(cda, Yca.COLLECTIONS);
        C7471uYa.a((Object) a2, "forLegacyPlaylist(urn, Screen.COLLECTIONS)");
        rja.a(a2);
    }
}
