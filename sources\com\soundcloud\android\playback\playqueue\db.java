package com.soundcloud.android.playback.playqueue;

/* compiled from: QueueUtils */
public class db {
    static float a(b bVar, bb bbVar) {
        int i = cb.a[bVar.ordinal()];
        if (i == 1) {
            return bbVar == bb.PLAYED ? 0.3f : 1.0f;
        }
        if (i == 2) {
            return (bbVar == bb.PLAYING || bbVar == bb.PAUSED) ? 1.0f : 0.3f;
        }
        if (i == 3) {
            return 1.0f;
        }
        throw new IllegalStateException("Unknown value of repeat mode");
    }
}
