package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.zc reason: case insensitive filesystem */
/* compiled from: PlaybackResult */
public abstract class C4536zc {

    /* renamed from: com.soundcloud.android.playback.zc$a */
    /* compiled from: PlaybackResult */
    public enum a {
        NONE,
        UNSKIPPABLE,
        TRACK_UNAVAILABLE_OFFLINE,
        TRACK_UNAVAILABLE_CAST,
        MISSING_PLAYABLE_TRACKS
    }

    public static C4536zc a(a aVar) {
        return new H(false, aVar);
    }

    public static C4536zc c() {
        return new H(true, a.NONE);
    }

    public abstract a a();

    public abstract boolean b();
}
