package com.soundcloud.android.collection;

import com.soundcloud.android.collection.playhistory.Z;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.stations.Ga;
import java.util.List;

/* compiled from: CollectionPresenter.kt */
public final class ua extends C7037oEa<C2843y, List<? extends B>, C6973nJa, RVa, RVa, Ca> {
    private final H k;
    private final E l;
    /* access modifiers changed from: private */
    public final Z m;
    /* access modifiers changed from: private */
    public final C4425ta n;
    /* access modifiers changed from: private */
    public final C2746fa o;
    /* access modifiers changed from: private */
    public final C4655rja p;
    private final Ga q;
    /* access modifiers changed from: private */
    public final C3700b r;
    private final HPa s;

    public ua(H h, E e, Z z, C4425ta taVar, C2746fa faVar, C4655rja rja, Ga ga, C3700b bVar, HPa hPa) {
        C7471uYa.b(h, "collectionOperations");
        C7471uYa.b(e, "collectionItemTransformer");
        C7471uYa.b(z, "playHistoryOperations");
        C7471uYa.b(taVar, "expandPlayerCommand");
        C7471uYa.b(faVar, "collectionOptionsStorage");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(ga, "stationHandler");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.k = h;
        this.l = e;
        this.m = z;
        this.n = taVar;
        this.o = faVar;
        this.p = rja;
        this.q = ga;
        this.r = bVar;
        this.s = hPa;
    }

    /* access modifiers changed from: private */
    public final void c(C3508cda cda) {
        C3700b bVar = this.r;
        C3860raa a = C3860raa.a(cda, Yca.COLLECTIONS);
        C7471uYa.a((Object) a, "CollectionEvent.forRecen…(urn, Screen.COLLECTIONS)");
        bVar.a((J) a);
        this.q.a(cda);
    }

    public void a(Ca ca) {
        C7471uYa.b(ca, "view");
        super.a(ca);
        b().a(ca.q().f((C6776kQa<? super T>) new C2756ka<Object>(this)), ca.z().f((C6776kQa<? super T>) new C2758la<Object>(this)), ca.t().f((C6776kQa<? super T>) new C2760ma<Object>(this)), ca.s().f((C6776kQa<? super T>) new C2762na<Object>(this)), ca.y().f((C6776kQa<? super T>) new C2764oa<Object>(this)), ca.p().f((C6776kQa<? super T>) new pa<Object>(this)), ca.u().f((C6776kQa<? super T>) new qa<Object>(this)), ca.w().f((C6776kQa<? super T>) new ra<Object>(this)), ca.v().f((C6776kQa<? super T>) new sa<Object>(this)), ca.d().f((C6776kQa<? super T>) new C2754ja<Object>(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, C2843y>> c(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        return C7594wJa.a(this.k.c(), null, 1, null);
    }

    /* access modifiers changed from: private */
    public final void b(C3508cda cda) {
        C3700b bVar = this.r;
        C3860raa a = C3860raa.a(cda, Yca.COLLECTIONS);
        C7471uYa.a((Object) a, "CollectionEvent.forRecen…(urn, Screen.COLLECTIONS)");
        bVar.a((J) a);
        C4655rja rja = this.p;
        C4621nja a2 = C4621nja.a(cda, C4928GKa.a(), C4928GKa.c(Yca.COLLECTIONS), C4928GKa.a());
        C7471uYa.a((Object) a2, "NavigationTarget.forProf…IONS), Optional.absent())");
        rja.a(a2);
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
        C3700b bVar = this.r;
        C3860raa a = C3860raa.a(cda, Yca.COLLECTIONS);
        C7471uYa.a((Object) a, "CollectionEvent.forRecen…(urn, Screen.COLLECTIONS)");
        bVar.a((J) a);
        C4655rja rja = this.p;
        C4621nja a2 = C4621nja.a(cda, Yca.COLLECTIONS);
        C7471uYa.a((Object) a2, "NavigationTarget.forLega…(urn, Screen.COLLECTIONS)");
        rja.a(a2);
    }
}
