package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.likes.la.a;
import java.util.List;

/* compiled from: TrackLikesSearchAdapter.kt */
public final class v extends C5407WEa<x> {
    private final z g;

    public v(z zVar) {
        C7471uYa.b(zVar, "trackLikesTrackItemRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(a.TRACK.ordinal(), zVar)});
        this.g = zVar;
        a(true);
    }

    public long a(int i) {
        return (long) ((x) g(i)).c().a().hashCode();
    }

    public int f(int i) {
        return ((x) g(i)).d();
    }

    public final APa<HVa<Integer, List<x>>> j() {
        APa<HVa<Integer, List<x>>> h = this.g.a().h(new u(this));
        C7471uYa.a((Object) h, "trackLikesTrackItemRende…ick().map { it to items }");
        return h;
    }
}
