package com.soundcloud.android.playback;

import android.support.v4.media.session.MediaControllerCompat.TransportControls;

/* compiled from: DefaultPlaySessionController.kt */
final class X<T> implements C6776kQa<TransportControls> {
    final /* synthetic */ long a;

    X(long j) {
        this.a = j;
    }

    /* renamed from: a */
    public final void accept(TransportControls transportControls) {
        if (this.a == -1) {
            transportControls.play();
            return;
        }
        C7471uYa.a((Object) transportControls, "transportControls");
        C4601kna.a(transportControls, this.a);
    }
}
