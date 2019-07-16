package defpackage;

/* renamed from: Jna reason: default package */
/* compiled from: PlayerPlayState.kt */
public enum Jna {
    IDLE,
    BUFFERING,
    PLAYING;

    public final boolean a() {
        return this == BUFFERING || this == PLAYING;
    }
}
