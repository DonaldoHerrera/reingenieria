package com.soundcloud.android.search;

import com.soundcloud.android.tracks.C6185ma;
import java.util.Map;

/* renamed from: com.soundcloud.android.search.q reason: case insensitive filesystem */
/* compiled from: SearchOperations.kt */
final class C5930q<T1, T2, T3, R> implements C6844lQa<Map<C3508cda, ? extends C6185ma>, Map<C3508cda, ? extends C3863rda>, Map<C3508cda, ? extends C4954HFa>, J> {
    final /* synthetic */ C5933s a;
    final /* synthetic */ I b;

    C5930q(C5933s sVar, I i) {
        this.a = sVar;
        this.b = i;
    }

    public final J a(Map<C3508cda, ? extends C6185ma> map, Map<C3508cda, ? extends C3863rda> map2, Map<C3508cda, C4954HFa> map3) {
        C7471uYa.b(map, "track");
        C7471uYa.b(map2, "playlist");
        C7471uYa.b(map3, "user");
        C5933s sVar = this.a;
        I i = this.b;
        La f = i.f();
        if (f != null) {
            C3508cda d = this.b.d();
            String c = this.b.c();
            if (c != null) {
                return sVar.a(i, map, map2, map3, f, d, c);
            }
            throw new IllegalArgumentException("QueryString required to convert to view model.");
        }
        throw new IllegalArgumentException("SearchType required to convert to view model.");
    }
}
