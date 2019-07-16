package defpackage;

import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.Stream;
import java.util.Map;

/* renamed from: Ela reason: default package */
/* compiled from: AudioPerformanceEvent.kt */
public final class Ela {
    private final long a;
    private final PlaybackItem b;
    private final Stream c;
    private final Map<String, Object> d;

    public Ela(long j, PlaybackItem playbackItem, Stream stream, Map<String, ? extends Object> map) {
        C7471uYa.b(map, "payload");
        this.a = j;
        this.b = playbackItem;
        this.c = stream;
        this.d = map;
    }

    public final Map<String, Object> a() {
        return this.d;
    }

    public final PlaybackItem b() {
        return this.b;
    }

    public final Stream c() {
        return this.c;
    }

    public final long d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ela) {
                Ela ela = (Ela) obj;
                if (!(this.a == ela.a) || !C7471uYa.a((Object) this.b, (Object) ela.b) || !C7471uYa.a((Object) this.c, (Object) ela.c) || !C7471uYa.a((Object) this.d, (Object) ela.d)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        PlaybackItem playbackItem = this.b;
        int i2 = 0;
        int hashCode = (i + (playbackItem != null ? playbackItem.hashCode() : 0)) * 31;
        Stream stream = this.c;
        int hashCode2 = (hashCode + (stream != null ? stream.hashCode() : 0)) * 31;
        Map<String, Object> map = this.d;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioPerformanceEvent(timestamp=");
        sb.append(this.a);
        sb.append(", playbackItem=");
        sb.append(this.b);
        sb.append(", stream=");
        sb.append(this.c);
        sb.append(", payload=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Ela(long j, PlaybackItem playbackItem, Stream stream, Map map, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        this(j, (i & 2) != 0 ? null : playbackItem, (i & 4) != 0 ? null : stream, map);
    }
}
