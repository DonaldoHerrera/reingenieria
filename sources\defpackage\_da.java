package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: _da reason: default package */
/* compiled from: ApiTrackStats.kt */
public final class _da {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    @JsonCreator
    public _da(@JsonProperty("playback_count") int i, @JsonProperty("comments_count") int i2, @JsonProperty("reposts_count") int i3, @JsonProperty("likes_count") int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof _da) {
                _da _da = (_da) obj;
                if (this.a == _da.a) {
                    if (this.b == _da.b) {
                        if (this.c == _da.c) {
                            if (this.d == _da.d) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiTrackStats(playbackCount=");
        sb.append(this.a);
        sb.append(", commentsCount=");
        sb.append(this.b);
        sb.append(", repostsCount=");
        sb.append(this.c);
        sb.append(", likesCount=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
