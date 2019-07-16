package defpackage;

import com.soundcloud.android.playback.core.PlaybackItem;

/* renamed from: Gla reason: default package */
/* compiled from: PlayerNotFoundDiagnostics.kt */
public final class Gla {
    private final PlaybackItem a;
    private final String b;

    public Gla(PlaybackItem playbackItem, String str) {
        C7471uYa.b(playbackItem, "playbackItem");
        C7471uYa.b(str, "currentPlayer");
        this.a = playbackItem;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final PlaybackItem b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Gla) {
                Gla gla = (Gla) obj;
                if (C7471uYa.a((Object) this.a, (Object) gla.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        PlaybackItem playbackItem = this.a;
        int i = 0;
        int hashCode = (playbackItem != null ? playbackItem.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayerNotFoundDiagnostics(playbackItem=");
        sb.append(this.a);
        sb.append(", currentPlayer=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
