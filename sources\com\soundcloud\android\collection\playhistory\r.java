package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.collection.playhistory.Q.a;

/* compiled from: PlayHistoryAdapter.kt */
public class r extends C5407WEa<Q> {
    private final O g;
    private final Ca h;

    public r(O o, Ca ca, I i) {
        C7471uYa.b(o, "headerRenderer");
        C7471uYa.b(ca, "trackRenderer");
        C7471uYa.b(i, "emptyRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(a.HEADER.ordinal(), o), new C5693cFa(a.TRACK.ordinal(), ca), new C5693cFa(a.EMPTY.ordinal(), i)});
        this.g = o;
        this.h = ca;
    }

    public int f(int i) {
        return ((Q) g(i)).a().ordinal();
    }

    public APa<RVa> j() {
        C6781kVa<RVa> kva = this.g.a;
        C7471uYa.a((Object) kva, "headerRenderer.clearClicked");
        return kva;
    }

    public APa<C3508cda> k() {
        return this.h.a();
    }
}
