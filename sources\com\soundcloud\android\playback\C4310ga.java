package com.soundcloud.android.playback;

import android.support.v4.media.session.MediaControllerCompat.TransportControls;

/* renamed from: com.soundcloud.android.playback.ga reason: case insensitive filesystem */
/* compiled from: DefaultPlaySessionController.kt */
final /* synthetic */ class C4310ga extends C7402tYa implements _Xa<TransportControls, RVa> {
    public static final C4310ga e = new C4310ga();

    C4310ga() {
        super(1);
    }

    public final void a(TransportControls transportControls) {
        C7471uYa.b(transportControls, "p1");
        transportControls.stop();
    }

    public final String getName() {
        return "stop";
    }

    public final C7610wZa h() {
        return HYa.a(TransportControls.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((TransportControls) obj);
        return RVa.a;
    }

    public final String j() {
        return "stop()V";
    }
}
