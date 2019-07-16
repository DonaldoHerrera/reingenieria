package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;

/* compiled from: PlaybackUtils.kt */
public final class Cc {
    public static final Cc a = new Cc();

    private Cc() {
    }

    @NXa
    public static /* synthetic */ int a(o oVar, int i, C3508cda cda, PlaySessionSource playSessionSource, Dc dc, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            dc = new Dc();
        }
        return a(oVar, i, cda, playSessionSource, dc);
    }

    @NXa
    public static final int a(o oVar, int i, C3508cda cda, PlaySessionSource playSessionSource, Dc dc) {
        C7471uYa.b(oVar, "playQueue");
        C7471uYa.b(cda, "initialTrack");
        C7471uYa.b(playSessionSource, "playSessionSource");
        C7471uYa.b(dc, "exceptionHandler");
        if (oVar.i() && i < oVar.size()) {
            if (i >= 0 && C7471uYa.a((Object) oVar.m(i), (Object) cda)) {
                return i;
            }
            int a2 = oVar.a(cda);
            if (a2 >= 0) {
                return a2;
            }
            dc.a(new Cb(cda, i, playSessionSource));
        }
        return 0;
    }
}
