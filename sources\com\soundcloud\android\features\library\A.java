package com.soundcloud.android.features.library;

import com.soundcloud.android.playback.C4536zc;

/* compiled from: LibraryPresenter.kt */
final /* synthetic */ class A extends C7402tYa implements _Xa<C4536zc, RVa> {
    A(Z z) {
        super(1, z);
    }

    public final void a(C4536zc zcVar) {
        C7471uYa.b(zcVar, "p1");
        ((Z) this.c).a(zcVar);
    }

    public final String getName() {
        return "showPlaybackResult";
    }

    public final C7610wZa h() {
        return HYa.a(Z.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C4536zc) obj);
        return RVa.a;
    }

    public final String j() {
        return "showPlaybackResult(Lcom/soundcloud/android/playback/PlaybackResult;)V";
    }
}
