package com.soundcloud.android.likes;

import com.soundcloud.android.likes.la.a;
import java.util.List;

/* renamed from: com.soundcloud.android.likes.aa reason: case insensitive filesystem */
/* compiled from: TrackLikesUniflowAdapter.kt */
public final class C3970aa extends C5407WEa<la> {
    private final P g;
    private final X h;

    public C3970aa(P p, X x) {
        C7471uYa.b(p, "trackLikesHeaderPresenter");
        C7471uYa.b(x, "trackLikesTrackItemRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(a.HEADER.ordinal(), p), new C5693cFa(a.TRACK.ordinal(), x)});
        this.g = p;
        this.h = x;
    }

    public int f(int i) {
        return ((la) g(i)).a().ordinal();
    }

    public final APa<Boolean> j() {
        return this.g.a();
    }

    public final APa<RVa> k() {
        return this.g.b();
    }

    public final APa<HVa<Integer, List<V>>> l() {
        APa<HVa<Integer, List<V>>> h2 = this.h.a().h(new Z(this));
        C7471uYa.a((Object) h2, "trackLikesTrackItemRende…UniflowItem>().toList() }");
        return h2;
    }

    public final APa<RVa> m() {
        return this.g.c();
    }

    public final APa<RVa> n() {
        return this.g.d();
    }
}
