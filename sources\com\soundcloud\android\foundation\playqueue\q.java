package com.soundcloud.android.foundation.playqueue;

import com.soundcloud.android.foundation.ads.C3676c;

/* compiled from: PlayQueueItem */
public abstract class q {
    public static final q a = new a();
    protected C4928GKa<C3676c> b = C4928GKa.c(this.c);

    /* compiled from: PlayQueueItem */
    private static class a extends q {
        public b b() {
            return b.EMPTY;
        }

        public C3508cda c() {
            throw new IllegalArgumentException("Attempting to access URN of Empty PlayQueueItem");
        }
    }

    /* compiled from: PlayQueueItem */
    public enum b {
        EMPTY,
        TRACK,
        PLAYLIST,
        VIDEO_AD,
        AUDIO_AD
    }

    public C4928GKa<C3676c> a() {
        return this.b;
    }

    public abstract b b();

    public abstract C3508cda c();

    @Deprecated
    public C3508cda d() {
        return j() ? c() : C3508cda.a;
    }

    public boolean e() {
        return k() || f();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public boolean f() {
        return b() == b.AUDIO_AD;
    }

    public boolean g() {
        return b() == b.EMPTY;
    }

    public boolean h() {
        return j() || i();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public boolean i() {
        return b() == b.PLAYLIST;
    }

    public boolean j() {
        return b() == b.TRACK;
    }

    public boolean k() {
        return b() == b.VIDEO_AD;
    }
}
