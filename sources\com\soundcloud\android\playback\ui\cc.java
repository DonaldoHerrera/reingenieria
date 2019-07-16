package com.soundcloud.android.playback.ui;

import com.soundcloud.android.playback.C4431ub;

/* compiled from: TrackPageExtensions.kt */
public final class cc {
    public static /* synthetic */ Ina a(C4431ub ubVar, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ubVar.getPosition();
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = ubVar.getDuration();
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = ubVar.b();
        }
        return a(ubVar, j4, j5, j3);
    }

    public static final Ina a(C4431ub ubVar, long j, long j2, long j3) {
        C4431ub ubVar2 = ubVar;
        C7471uYa.b(ubVar, "$this$toTrackPlaybackState");
        Ina ina = new Ina(a(ubVar), ubVar.h(), j, j2, j3);
        return ina;
    }

    public static final Jna a(C4431ub ubVar) {
        C7471uYa.b(ubVar, "$this$toPlayerPlayState");
        if (ubVar.f()) {
            return Jna.BUFFERING;
        }
        if (ubVar.j()) {
            return Jna.PLAYING;
        }
        return Jna.IDLE;
    }
}
