package com.soundcloud.android.collection.recentlyplayed;

import java.util.List;
import java.util.Map;

/* compiled from: RecentlyPlayedOperations.kt */
final /* synthetic */ class V extends C7402tYa implements C6308dYa<List<? extends C3508cda>, Map<C3508cda, ? extends Long>, APa<List<? extends C2804ca>>> {
    V(J j) {
        super(2, j);
    }

    /* renamed from: a */
    public final APa<List<C2804ca>> invoke(List<C3508cda> list, Map<C3508cda, Long> map) {
        C7471uYa.b(list, "p1");
        C7471uYa.b(map, "p2");
        return ((J) this.c).a(list, map);
    }

    public final String getName() {
        return "loadArtists";
    }

    public final C7610wZa h() {
        return HYa.a(J.class);
    }

    public final String j() {
        return "loadArtists(Ljava/util/List;Ljava/util/Map;)Lio/reactivex/Observable;";
    }
}
