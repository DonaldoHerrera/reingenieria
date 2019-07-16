package defpackage;

/* renamed from: Kla reason: default package */
/* compiled from: PlaybackState.kt */
public enum Kla {
    BUFFERING,
    PLAYING,
    IDLE;

    public final boolean a() {
        return this == BUFFERING;
    }

    public final boolean b() {
        return a() || c();
    }

    public final boolean c() {
        return this == PLAYING;
    }
}
