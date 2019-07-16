package com.soundcloud.android.features.library.playlists;

import com.soundcloud.android.collection.C2746fa;

/* compiled from: PlaylistCollectionPresenter.kt */
final /* synthetic */ class u extends C7402tYa implements _Xa<C3871sda, RVa> {
    u(C2746fa faVar) {
        super(1, faVar);
    }

    public final void a(C3871sda sda) {
        C7471uYa.b(sda, "p1");
        ((C2746fa) this.c).a(sda);
    }

    public final String getName() {
        return "store";
    }

    public final C7610wZa h() {
        return HYa.a(C2746fa.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C3871sda) obj);
        return RVa.a;
    }

    public final String j() {
        return "store(Lcom/soundcloud/android/foundation/domain/playable/PlaylistsOptions;)V";
    }
}
