package com.soundcloud.android.collections.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: RoomLikesReadStorage.kt */
public final class aa implements K {
    private final C2863t a;

    public aa(C2863t tVar) {
        C7471uYa.b(tVar, "likeDao");
        this.a = tVar;
    }

    public APa<List<C2862s>> b() {
        APa<List<C2862s>> h = this.a.a(ea.TRACK).h(new O(this));
        C7471uYa.a((Object) h, "likeDao.liveLoadLikesByT…map { mapToLikeList(it) }");
        return h;
    }

    public List<C2862s> c(ea eaVar) {
        C7471uYa.b(eaVar, "soundType");
        Object b = this.a.d(eaVar).e(new T(this)).b();
        C7471uYa.a(b, "likeDao.loadPendingRemov…eList(it) }.blockingGet()");
        return (List) b;
    }

    public APa<List<C3508cda>> d() {
        return this.a.b();
    }

    public IPa<List<C2862s>> e() {
        IPa<List<C2862s>> e = this.a.b(ea.PLAYLIST).e(new U(this));
        C7471uYa.a((Object) e, "likeDao.loadLikesByType(…map { mapToLikeList(it) }");
        return e;
    }

    public APa<List<C2862s>> f() {
        APa<List<C2862s>> h = this.a.a(ea.PLAYLIST).h(new N(this));
        C7471uYa.a((Object) h, "likeDao.liveLoadLikesByT…map { mapToLikeList(it) }");
        return h;
    }

    public IPa<List<C2862s>> b(long j, int i) {
        IPa<List<C2862s>> e = this.a.a(ea.TRACK, j, i).e(new W(this));
        C7471uYa.a((Object) e, "likeDao.loadLikesByTypeC…map { mapToLikeList(it) }");
        return e;
    }

    public IPa<List<C3508cda>> c() {
        IPa<List<C3508cda>> e = this.a.b(ea.TRACK).e(Z.a);
        C7471uYa.a((Object) e, "likeDao.loadLikesByType(…ity -> likeEntity.urn } }");
        return e;
    }

    public IPa<List<C2862s>> a(long j, long j2) {
        IPa<List<C2862s>> e = this.a.a(ea.TRACK, j, j2).e(new Y(this));
        C7471uYa.a((Object) e, "likeDao.loadLikesByTypeC…map { mapToLikeList(it) }");
        return e;
    }

    public List<C2862s> b(ea eaVar) {
        C7471uYa.b(eaVar, "soundType");
        Object b = this.a.c(eaVar).e(new S(this)).b();
        C7471uYa.a(b, "likeDao.loadPendingAddit…eList(it) }.blockingGet()");
        return (List) b;
    }

    public IPa<List<C2862s>> a() {
        IPa<List<C2862s>> e = this.a.b(ea.TRACK).e(new X(this));
        C7471uYa.a((Object) e, "likeDao.loadLikesByType(…map { mapToLikeList(it) }");
        return e;
    }

    public IPa<List<C2862s>> a(long j, int i) {
        IPa<List<C2862s>> e = this.a.a(ea.PLAYLIST, j, i).e(new V(this));
        C7471uYa.a((Object) e, "likeDao.loadLikesByTypeC…map { mapToLikeList(it) }");
        return e;
    }

    public List<C2862s> a(ea eaVar) {
        C7471uYa.b(eaVar, "soundType");
        Object b = this.a.b(eaVar).e(new P(this)).b();
        C7471uYa.a(b, "likeDao.loadLikesByType(…eList(it) }.blockingGet()");
        return (List) b;
    }

    /* access modifiers changed from: private */
    public final Map<C3508cda, Boolean> a(Collection<C3508cda> collection, Collection<C3508cda> collection2) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection, 10));
        for (C3508cda hVa : collection) {
            arrayList.add(new HVa(hVa, Boolean.valueOf(false)));
        }
        LWa.b((Map) hashMap, (Iterable) arrayList);
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) collection2, 10));
        for (C3508cda hVa2 : collection2) {
            arrayList2.add(new HVa(hVa2, Boolean.valueOf(true)));
        }
        LWa.b((Map) hashMap, (Iterable) arrayList2);
        return hashMap;
    }

    private final C2862s a(I i) {
        return new C2862s(i.e(), new Date(i.b()));
    }

    /* access modifiers changed from: private */
    public final List<C2862s> a(List<I> list) {
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (I a2 : list) {
            arrayList.add(a(a2));
        }
        return arrayList;
    }
}
