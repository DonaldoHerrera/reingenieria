package com.soundcloud.android.features.library.playlists;

import java.util.List;

/* compiled from: PlaylistCollectionPresenter.kt */
final class A<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ B a;
    final /* synthetic */ C3871sda b;

    A(B b2, C3871sda sda) {
        this.a = b2;
        this.b = sda;
    }

    /* renamed from: a */
    public final List<C3635l> apply(List<? extends C3863rda> list) {
        C7471uYa.b(list, "it");
        return this.a.a.p.a(list, this.b);
    }
}
