package defpackage;

import java.util.Set;

@EVa(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005R\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0011\u0010\f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/soundcloud/android/playback/mediaplayer/MediaPlayerState;", "", "(Ljava/lang/String;I)V", "isError", "", "()Z", "isLoading", "isPausable", "isPreparing", "isSeekable", "isStartable", "isStoppable", "isSupposedToBePlaying", "canGetMPProgress", "canSetVolume", "STOPPED", "ERROR", "ERROR_RETRYING", "PREPARING", "PLAYING", "PAUSED", "PAUSED_FOR_BUFFERING", "COMPLETED", "Companion", "mediaplayer_release"}, mv = {1, 1, 15})
/* renamed from: zma reason: default package and case insensitive filesystem */
/* compiled from: MediaPlayerState.kt */
public enum C4730zma {
    STOPPED,
    ERROR,
    ERROR_RETRYING,
    PREPARING,
    PLAYING,
    PAUSED,
    PAUSED_FOR_BUFFERING,
    COMPLETED;
    
    private static final Set<C4730zma> j = null;
    private static final Set<C4730zma> k = null;
    private static final Set<C4730zma> l = null;
    private static final Set<C4730zma> m = null;
    private static final Set<C4730zma> n = null;
    public static final a o = null;

    /* renamed from: zma$a */
    /* compiled from: MediaPlayerState.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    static {
        o = new a(null);
        j = SWa.c(PREPARING, PLAYING, PAUSED, PAUSED_FOR_BUFFERING, COMPLETED);
        k = SWa.c(PLAYING, PAUSED, PAUSED_FOR_BUFFERING, COMPLETED);
        l = SWa.c(PLAYING, STOPPED, PAUSED, PAUSED_FOR_BUFFERING, COMPLETED);
        m = SWa.c(PLAYING, PAUSED_FOR_BUFFERING, PAUSED);
        n = SWa.c(PAUSED_FOR_BUFFERING, PREPARING);
    }

    public final boolean a() {
        return !c() && !f() && this != STOPPED;
    }

    public final boolean b() {
        return !f() && !c();
    }

    public final boolean c() {
        return this == ERROR || this == ERROR_RETRYING;
    }

    public final boolean d() {
        return n.contains(this);
    }

    public final boolean e() {
        return m.contains(this);
    }

    public final boolean f() {
        return this == PREPARING;
    }

    public final boolean g() {
        return j.contains(this);
    }

    public final boolean u() {
        return l.contains(this);
    }

    public final boolean v() {
        return f() || this == PLAYING || this == PAUSED_FOR_BUFFERING;
    }
}
