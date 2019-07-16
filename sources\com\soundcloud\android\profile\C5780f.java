package com.soundcloud.android.profile;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.soundcloud.android.profile.f reason: case insensitive filesystem */
/* compiled from: ApiPostSource */
public abstract class C5780f implements C5770d {
    @JsonCreator
    public static C5780f a(@JsonProperty("track_post") C1995DP dp, @JsonProperty("track_repost") C2015EP ep, @JsonProperty("playlist_post") C3338wP wPVar, @JsonProperty("playlist_repost") C3358xP xPVar) {
        return new C5790h(C4928GKa.b(dp), C4928GKa.b(ep), C4928GKa.b(wPVar), C4928GKa.b(xPVar));
    }

    public abstract C4928GKa<C3338wP> b();

    public abstract C4928GKa<C3358xP> c();

    public abstract C4928GKa<C1995DP> d();

    public abstract C4928GKa<C2015EP> e();

    public C4928GKa<Sca> a() {
        if (d().c()) {
            return C4928GKa.c(d().b());
        }
        if (e().c()) {
            return C4928GKa.c(e().b());
        }
        if (b().c()) {
            return C4928GKa.c(b().b());
        }
        if (c().c()) {
            return C4928GKa.c(c().b());
        }
        return C4928GKa.a();
    }
}
