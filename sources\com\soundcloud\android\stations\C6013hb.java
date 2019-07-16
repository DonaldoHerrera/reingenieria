package com.soundcloud.android.stations;

import com.soundcloud.android.playback.C4536zc;

/* renamed from: com.soundcloud.android.stations.hb reason: case insensitive filesystem */
/* compiled from: StationInfoPresenter.kt */
final /* synthetic */ class C6013hb extends C7402tYa implements _Xa<C4536zc, RVa> {
    C6013hb(C6051ub ubVar) {
        super(1, ubVar);
    }

    public final void a(C4536zc zcVar) {
        C7471uYa.b(zcVar, "p1");
        ((C6051ub) this.c).a(zcVar);
    }

    public final String getName() {
        return "showPlaybackResult";
    }

    public final C7610wZa h() {
        return HYa.a(C6051ub.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C4536zc) obj);
        return RVa.a;
    }

    public final String j() {
        return "showPlaybackResult(Lcom/soundcloud/android/playback/PlaybackResult;)V";
    }
}
