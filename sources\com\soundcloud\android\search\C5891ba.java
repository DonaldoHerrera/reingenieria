package com.soundcloud.android.search;

import com.soundcloud.android.playback.C4536zc;

/* renamed from: com.soundcloud.android.search.ba reason: case insensitive filesystem */
/* compiled from: SearchResultsPresenter.kt */
final /* synthetic */ class C5891ba extends C7402tYa implements _Xa<C4536zc, RVa> {
    C5891ba(C5917ja jaVar) {
        super(1, jaVar);
    }

    public final void a(C4536zc zcVar) {
        C7471uYa.b(zcVar, "p1");
        ((C5917ja) this.c).a(zcVar);
    }

    public final String getName() {
        return "showPlaybackResult";
    }

    public final C7610wZa h() {
        return HYa.a(C5917ja.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C4536zc) obj);
        return RVa.a;
    }

    public final String j() {
        return "showPlaybackResult(Lcom/soundcloud/android/playback/PlaybackResult;)V";
    }
}
