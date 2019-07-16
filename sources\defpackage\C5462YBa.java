package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: YBa reason: default package and case insensitive filesystem */
/* compiled from: ApiPostItem */
public class C5462YBa {
    private final C4928GKa<C5433XBa> a;
    private final C4928GKa<C5491ZBa> b;
    private final C4928GKa<C5433XBa> c;
    private final C4928GKa<C5491ZBa> d;

    @JsonCreator
    public C5462YBa(@JsonProperty("track_post") C5433XBa xBa, @JsonProperty("track_repost") C5491ZBa zBa, @JsonProperty("playlist_post") C5433XBa xBa2, @JsonProperty("playlist_repost") C5491ZBa zBa2) {
        this.a = C4928GKa.b(xBa);
        this.b = C4928GKa.b(zBa);
        this.c = C4928GKa.b(xBa2);
        this.d = C4928GKa.b(zBa2);
    }

    public C6760kCa a() {
        if (this.a.c()) {
            return (C6760kCa) this.a.b();
        }
        if (this.b.c()) {
            return (C6760kCa) this.b.b();
        }
        if (this.c.c()) {
            return (C6760kCa) this.c.b();
        }
        return (C6760kCa) this.d.b();
    }
}
