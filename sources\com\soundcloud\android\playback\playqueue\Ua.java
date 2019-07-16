package com.soundcloud.android.playback.playqueue;

/* compiled from: PlayQueueUIEvent */
public abstract class Ua {
    public static Ua a() {
        return new C4370fa(0);
    }

    public static Ua b() {
        return new C4370fa(1);
    }

    public abstract int c();

    public boolean d() {
        return c() == 0;
    }

    public boolean e() {
        return c() == 1;
    }
}
