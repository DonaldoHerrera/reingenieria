package com.soundcloud.android.collection;

import java.util.List;

/* compiled from: CollectionOperations.kt */
final class Y<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ H a;

    Y(H h) {
        this.a = h;
    }

    /* renamed from: a */
    public final APa<List<Ga>> apply(List<C3508cda> list) {
        C7471uYa.b(list, "likedUrns");
        return QV.a(this.a.h.a(list, a.LOCAL_ONLY)).h(W.a).h(new X(this, list));
    }
}
