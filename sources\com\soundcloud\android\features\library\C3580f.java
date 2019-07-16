package com.soundcloud.android.features.library;

import com.soundcloud.android.collection.B;
import com.soundcloud.android.collection.Na;
import com.soundcloud.android.collection.playhistory.C2792u;
import com.soundcloud.android.collection.recentlyplayed.C2826o;

/* renamed from: com.soundcloud.android.features.library.f reason: case insensitive filesystem */
/* compiled from: LibraryAdapter.kt */
public final class C3580f extends C5407WEa<B> {
    private final C2350WH<RVa> g;
    private final APa<C3508cda> h;
    private final APa<C3508cda> i;
    private final APa<C3508cda> j;
    private final APa<C3508cda> k;
    private final APa<RVa> l;
    private final APa<RVa> m;
    private final APa<RVa> n;
    private final APa<RVa> o;
    private final APa<RVa> p;
    private final APa<RVa> q;
    private final APa<RVa> r;
    private final APa<RVa> s;
    private final APa<RVa> t;
    private final C2826o u;
    private final C2792u v;

    public C3580f(C3647y yVar, Na na, V v2, Cca<B> cca, C2826o oVar, C2792u uVar) {
        C7471uYa.b(yVar, "onboardingItemCellRenderer");
        C7471uYa.b(na, "upsellItemCellRenderer");
        C7471uYa.b(v2, "collectionPreviewRenderer");
        C7471uYa.b(cca, "upsellHeaderItemRenderer");
        C7471uYa.b(oVar, "recentlyPlayedBucketRenderer");
        C7471uYa.b(uVar, "playHistoryBucketRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(1, yVar), new C5693cFa(3, na), new C5693cFa(6, cca), new C5693cFa(0, v2), new C5693cFa(4, oVar), new C5693cFa(5, uVar)});
        this.u = oVar;
        this.v = uVar;
        this.g = cca.a();
        APa<C3508cda> a = this.u.a();
        C7471uYa.a((Object) a, "recentlyPlayedBucketRenderer.playlistItemClicked()");
        this.h = a;
        APa<C3508cda> b = this.u.b();
        C7471uYa.a((Object) b, "recentlyPlayedBucketRenderer.profileItemClicked()");
        this.i = b;
        APa<C3508cda> c = this.u.c();
        C7471uYa.a((Object) c, "recentlyPlayedBucketRenderer.stationItemClicked()");
        this.j = c;
        APa<C3508cda> a2 = this.v.a();
        C7471uYa.a((Object) a2, "playHistoryBucketRenderer.trackItemClick()");
        this.k = a2;
        this.l = v2.h();
        this.m = v2.i();
        this.n = v2.b();
        this.o = v2.j();
        this.p = v2.a();
        this.q = yVar.a();
        C6781kVa<RVa> kva = na.b;
        C7471uYa.a((Object) kva, "upsellItemCellRenderer.upsellShown");
        this.r = kva;
        C6781kVa<RVa> kva2 = na.d;
        C7471uYa.a((Object) kva2, "upsellItemCellRenderer.upsellClick");
        this.s = kva2;
        C6781kVa<RVa> kva3 = na.c;
        C7471uYa.a((Object) kva3, "upsellItemCellRenderer.upsellClose");
        this.t = kva3;
    }

    public int f(int i2) {
        return ((B) g(i2)).c();
    }

    public final APa<RVa> j() {
        return this.p;
    }

    public final APa<RVa> k() {
        return this.n;
    }

    public final APa<RVa> l() {
        return this.l;
    }

    public final APa<RVa> m() {
        return this.m;
    }

    public final APa<RVa> n() {
        return this.o;
    }

    public final APa<RVa> o() {
        return this.q;
    }

    public final APa<C3508cda> p() {
        return this.h;
    }

    public final APa<C3508cda> q() {
        return this.i;
    }

    public final APa<C3508cda> r() {
        return this.j;
    }

    public final APa<C3508cda> s() {
        return this.k;
    }

    public final APa<RVa> t() {
        return this.s;
    }

    public final APa<RVa> u() {
        return this.t;
    }

    public final C2350WH<RVa> v() {
        return this.g;
    }

    public final APa<RVa> w() {
        return this.r;
    }
}
