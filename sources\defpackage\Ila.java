package defpackage;

import com.soundcloud.android.playback.core.PlaybackItem;

/* renamed from: Ila reason: default package */
/* compiled from: ProgressChangeEvent.kt */
public final class Ila {
    private final PlaybackItem a;
    private final long b;
    private final long c;

    public Ila(PlaybackItem playbackItem, long j, long j2) {
        C7471uYa.b(playbackItem, "playbackItem");
        this.a = playbackItem;
        this.b = j;
        this.c = j2;
    }

    public final long a() {
        return this.c;
    }

    public final PlaybackItem b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ila) {
                Ila ila = (Ila) obj;
                if (C7471uYa.a((Object) this.a, (Object) ila.a)) {
                    if (this.b == ila.b) {
                        if (this.c == ila.c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        PlaybackItem playbackItem = this.a;
        int hashCode = (playbackItem != null ? playbackItem.hashCode() : 0) * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProgressChangeEvent(playbackItem=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
