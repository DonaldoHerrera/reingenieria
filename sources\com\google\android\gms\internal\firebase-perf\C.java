package com.google.android.gms.internal.firebase-perf;

import android.support.v4.media.session.PlaybackStateCompat;

public enum C {
    TERABYTES(1099511627776L),
    GIGABYTES(1073741824),
    MEGABYTES(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED),
    KILOBYTES(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID),
    BYTES(1);
    
    private long g;

    private C(long j) {
        this.g = j;
    }

    public final long a(long j) {
        return (j * this.g) / KILOBYTES.g;
    }
}
