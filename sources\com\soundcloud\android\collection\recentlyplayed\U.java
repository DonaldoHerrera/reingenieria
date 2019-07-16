package com.soundcloud.android.collection.recentlyplayed;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: RecentlyPlayedOperations.kt */
final class U<T1, T2, T3, R> implements C6844lQa<List<? extends C2804ca>, List<? extends C2804ca>, List<? extends C2804ca>, List<? extends C2804ca>> {
    public static final U a = new U();

    U() {
    }

    public final List<C2804ca> a(List<? extends C2804ca> list, List<? extends C2804ca> list2, List<? extends C2804ca> list3) {
        C7471uYa.b(list, "t1");
        C7471uYa.b(list2, "t2");
        C7471uYa.b(list3, "t3");
        return C7676xWa.q(C7676xWa.a((Iterable) C7676xWa.c((Collection) C7676xWa.c((Collection) list, (Iterable) list2), (Iterable) list3), (Comparator) new T()));
    }
}
