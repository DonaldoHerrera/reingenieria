package com.soundcloud.android.playback;

import android.support.v4.media.session.MediaControllerCompat.TransportControls;

/* compiled from: DefaultPlaySessionController.kt */
final /* synthetic */ class V extends C7402tYa implements _Xa<TransportControls, RVa> {
    public static final V e = new V();

    V() {
        super(1);
    }

    public final void a(TransportControls transportControls) {
        C7471uYa.b(transportControls, "p1");
        transportControls.pause();
    }

    public final String getName() {
        return "pause";
    }

    public final C7610wZa h() {
        return HYa.a(TransportControls.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((TransportControls) obj);
        return RVa.a;
    }

    public final String j() {
        return "pause()V";
    }
}
