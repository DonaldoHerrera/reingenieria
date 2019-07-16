package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;

/* compiled from: PlaybackUtils.kt */
public final class Cb extends IllegalStateException {
    public Cb(C3508cda cda, int i, PlaySessionSource playSessionSource) {
        C7471uYa.b(cda, "initialTrack");
        C7471uYa.b(playSessionSource, "playSessionSource");
        StringBuilder sb = new StringBuilder();
        sb.append("Attempting to play ");
        sb.append(cda);
        sb.append(" (position ");
        sb.append(i);
        sb.append(") that is not in the list from ");
        sb.append(playSessionSource);
        super(sb.toString());
    }
}
