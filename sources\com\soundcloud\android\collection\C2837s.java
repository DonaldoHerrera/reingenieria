package com.soundcloud.android.collection;

import com.soundcloud.android.collection.playhistory.C2792u;
import com.soundcloud.android.collection.recentlyplayed.C2826o;

/* renamed from: com.soundcloud.android.collection.s reason: case insensitive filesystem */
/* compiled from: CollectionAdapter.kt */
public final class C2837s extends C5407WEa<B> {
    private final C2350WH<RVa> g;
    private final APa<C3508cda> h;
    private final APa<C3508cda> i;
    private final APa<C3508cda> j;
    private final APa<C3508cda> k;
    private final APa<RVa> l;
    private final APa<RVa> m;
    private final APa<RVa> n;
    private final APa<RVa> o;
    private final C2826o p;
    private final C2792u q;

    public C2837s(Ha ha, Na na, wa waVar, Cca<B> cca, C2826o oVar, C2792u uVar) {
        C7471uYa.b(ha, "onboardingItemCellRenderer");
        C7471uYa.b(na, "upsellItemCellRenderer");
        C7471uYa.b(waVar, "collectionPreviewRenderer");
        C7471uYa.b(cca, "upsellHeaderItemRenderer");
        C7471uYa.b(oVar, "recentlyPlayedBucketRenderer");
        C7471uYa.b(uVar, "playHistoryBucketRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(1, ha), new C5693cFa(3, na), new C5693cFa(0, waVar), new C5693cFa(4, oVar), new C5693cFa(5, uVar), new C5693cFa(6, cca)});
        this.p = oVar;
        this.q = uVar;
        this.g = cca.a();
        APa<C3508cda> a = this.p.a();
        C7471uYa.a((Object) a, "recentlyPlayedBucketRenderer.playlistItemClicked()");
        this.h = a;
        APa<C3508cda> b = this.p.b();
        C7471uYa.a((Object) b, "recentlyPlayedBucketRenderer.profileItemClicked()");
        this.i = b;
        APa<C3508cda> c = this.p.c();
        C7471uYa.a((Object) c, "recentlyPlayedBucketRenderer.stationItemClicked()");
        this.j = c;
        APa<C3508cda> a2 = this.q.a();
        C7471uYa.a((Object) a2, "playHistoryBucketRenderer.trackItemClick()");
        this.k = a2;
        C6781kVa<RVa> kva = ha.a;
        C7471uYa.a((Object) kva, "onboardingItemCellRenderer.onboardingItemClosed");
        this.l = kva;
        C6781kVa<RVa> kva2 = na.b;
        C7471uYa.a((Object) kva2, "upsellItemCellRenderer.upsellShown");
        this.m = kva2;
        C6781kVa<RVa> kva3 = na.d;
        C7471uYa.a((Object) kva3, "upsellItemCellRenderer.upsellClick");
        this.n = kva3;
        C6781kVa<RVa> kva4 = na.c;
        C7471uYa.a((Object) kva4, "upsellItemCellRenderer.upsellClose");
        this.o = kva4;
    }

    public int f(int i2) {
        return ((B) g(i2)).c();
    }

    public final APa<RVa> j() {
        return this.l;
    }

    public final APa<C3508cda> k() {
        return this.h;
    }

    public final APa<C3508cda> l() {
        return this.i;
    }

    public final APa<C3508cda> m() {
        return this.j;
    }

    public final APa<C3508cda> n() {
        return this.k;
    }

    public final APa<RVa> o() {
        return this.n;
    }

    public final APa<RVa> p() {
        return this.o;
    }

    public final C2350WH<RVa> q() {
        return this.g;
    }

    public final APa<RVa> r() {
        return this.m;
    }
}
