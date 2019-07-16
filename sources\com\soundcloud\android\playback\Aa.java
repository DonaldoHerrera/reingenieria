package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.q;

/* compiled from: PlaybackItemOperations.kt */
public final class Aa extends IllegalArgumentException {
    public Aa(q qVar) {
        C7471uYa.b(qVar, "playQueueItem");
        StringBuilder sb = new StringBuilder();
        sb.append("You cannot generate PlaybackItems for ");
        sb.append(qVar.b());
        sb.append(": ");
        sb.append(qVar.d());
        sb.append('!');
        super(sb.toString());
    }
}
