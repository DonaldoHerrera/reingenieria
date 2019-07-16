package com.soundcloud.android.features.discovery;

import com.soundcloud.android.playback.C4536zc;

/* compiled from: DiscoveryPresenter.kt */
final /* synthetic */ class w extends C7402tYa implements _Xa<C4536zc, RVa> {
    w(H h) {
        super(1, h);
    }

    public final void a(C4536zc zcVar) {
        C7471uYa.b(zcVar, "p1");
        ((H) this.c).a(zcVar);
    }

    public final String getName() {
        return "showPlaybackResult";
    }

    public final C7610wZa h() {
        return HYa.a(H.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C4536zc) obj);
        return RVa.a;
    }

    public final String j() {
        return "showPlaybackResult(Lcom/soundcloud/android/playback/PlaybackResult;)V";
    }
}
