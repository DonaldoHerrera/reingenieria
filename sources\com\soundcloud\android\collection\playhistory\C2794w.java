package com.soundcloud.android.collection.playhistory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: com.soundcloud.android.collection.playhistory.w reason: case insensitive filesystem */
/* compiled from: PlayHistoryCleanupHelper.kt */
public final class C2794w extends Xda {
    private final String a = "PlayHistory";
    private final va b;

    public C2794w(va vaVar) {
        C7471uYa.b(vaVar, "playHistoryStorage");
        this.b = vaVar;
    }

    public Set<C3508cda> b() {
        List<ua> c = this.b.c();
        C7471uYa.a((Object) c, "playHistoryStorage.loadAll()");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) c, 10));
        for (ua b2 : c) {
            arrayList.add(b2.b());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            C3508cda cda = (C3508cda) next;
            C7471uYa.a((Object) cda, "it");
            if (cda.u()) {
                arrayList2.add(next);
            }
        }
        return C7676xWa.t(arrayList2);
    }

    public Set<C3508cda> c() {
        List<ua> c = this.b.c();
        C7471uYa.a((Object) c, "playHistoryStorage.loadAll()");
        ArrayList arrayList = new ArrayList();
        for (ua uaVar : c) {
            C7331sWa.a((Collection) arrayList, (Iterable) C6918mWa.b((Object[]) new C3508cda[]{uaVar.i(), uaVar.b()}));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            C3508cda cda = (C3508cda) next;
            C7471uYa.a((Object) cda, "it");
            if (cda.x()) {
                arrayList2.add(next);
            }
        }
        return C7676xWa.t(arrayList2);
    }

    public String getKey() {
        return this.a;
    }
}
