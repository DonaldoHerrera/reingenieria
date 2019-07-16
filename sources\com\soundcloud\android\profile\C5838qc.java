package com.soundcloud.android.profile;

import com.soundcloud.android.playback.C4536zc;

/* renamed from: com.soundcloud.android.profile.qc reason: case insensitive filesystem */
/* compiled from: UserPlayablePresenter.kt */
final /* synthetic */ class C5838qc extends C7402tYa implements _Xa<C4536zc, RVa> {
    C5838qc(C5849t tVar) {
        super(1, tVar);
    }

    public final void a(C4536zc zcVar) {
        C7471uYa.b(zcVar, "p1");
        ((C5849t) this.c).a(zcVar);
    }

    public final String getName() {
        return "showPlaybackResult";
    }

    public final C7610wZa h() {
        return HYa.a(C5849t.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C4536zc) obj);
        return RVa.a;
    }

    public final String j() {
        return "showPlaybackResult(Lcom/soundcloud/android/playback/PlaybackResult;)V";
    }
}
