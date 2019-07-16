package com.soundcloud.android.features.library.likes;

import com.soundcloud.android.likes.V;
import com.soundcloud.android.likes.X;
import com.soundcloud.android.likes.la;
import com.soundcloud.android.likes.la.a;
import java.util.List;

/* renamed from: com.soundcloud.android.features.library.likes.b reason: case insensitive filesystem */
/* compiled from: TrackLikesAdapter.kt */
public final class C3588b extends C5407WEa<la> {
    private final w g;
    private final X h;

    public C3588b(w wVar, X x) {
        C7471uYa.b(wVar, "trackLikesHeaderRenderer");
        C7471uYa.b(x, "trackLikesTrackItemRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(a.HEADER.ordinal(), wVar), new C5693cFa(a.TRACK.ordinal(), x)});
        this.g = wVar;
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

    public final APa<RVa> l() {
        return this.g.c();
    }

    public final APa<HVa<Integer, List<V>>> m() {
        APa<HVa<Integer, List<V>>> h2 = this.h.a().h(new C3587a(this));
        C7471uYa.a((Object) h2, "trackLikesTrackItemRende…m::class.java).toList() }");
        return h2;
    }

    public final APa<RVa> n() {
        return this.g.d();
    }

    public final APa<RVa> o() {
        return this.g.e();
    }
}
