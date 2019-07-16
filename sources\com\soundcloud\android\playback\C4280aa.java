package com.soundcloud.android.playback;

import android.support.v4.media.session.MediaControllerCompat.TransportControls;

/* renamed from: com.soundcloud.android.playback.aa reason: case insensitive filesystem */
/* compiled from: DefaultPlaySessionController.kt */
final class C4280aa<T> implements C6776kQa<TransportControls> {
    final /* synthetic */ long a;

    C4280aa(long j) {
        this.a = j;
    }

    /* renamed from: a */
    public final void accept(TransportControls transportControls) {
        transportControls.seekTo(this.a);
    }
}
