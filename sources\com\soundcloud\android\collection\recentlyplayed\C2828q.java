package com.soundcloud.android.collection.recentlyplayed;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.q reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedCleanupHelper.kt */
public final class C2828q extends Xda {
    private final String a = "RecentlyPlayed";
    private final Ga b;

    public C2828q(Ga ga) {
        C7471uYa.b(ga, "recentlyPlayedStorage");
        this.b = ga;
    }

    public Set<C3508cda> a() {
        Set<Number> a2 = this.b.a(4);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (Number longValue : a2) {
            arrayList.add(C3508cda.f(longValue.longValue()));
        }
        return C7676xWa.t(arrayList);
    }

    public Set<C3508cda> b() {
        Set<Number> a2 = this.b.a(1);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (Number longValue : a2) {
            arrayList.add(C3508cda.c(longValue.longValue()));
        }
        return C7676xWa.t(arrayList);
    }

    public String getKey() {
        return this.a;
    }
}
