package defpackage;

import android.support.v4.media.session.MediaControllerCompat.TransportControls;

/* renamed from: kna reason: default package and case insensitive filesystem */
/* compiled from: PlaybackManager.kt */
public final class C4601kna {
    public static final void a(TransportControls transportControls, long j) {
        C7471uYa.b(transportControls, "$this$playFromPosition");
        HVa[] hVaArr = {NVa.a("com.soundcloud.android.playback.action.args.ARG_POSITION", Long.valueOf(j))};
        transportControls.sendCustomAction("com.soundcloud.android.playback.action.PLAY_FROM_POSITION", C1687sb.a(hVaArr));
    }
}
