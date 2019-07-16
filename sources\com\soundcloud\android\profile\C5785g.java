package com.soundcloud.android.profile;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.soundcloud.android.profile.g reason: case insensitive filesystem */
/* compiled from: ApiUserProfile.kt */
public final class C5785g {
    private final C3776gea a;
    private final Pca<C5775e> b;
    private final Pca<C1995DP> c;
    private final Pca<C1995DP> d;
    private final Pca<C3338wP> e;
    private final Pca<C3338wP> f;
    private final Pca<C5775e> g;
    private final Pca<C5775e> h;

    @JsonCreator
    public C5785g(@JsonProperty("user") C3776gea gea, @JsonProperty("spotlight") Pca<C5775e> pca, @JsonProperty("tracks") Pca<C1995DP> pca2, @JsonProperty("top_tracks") Pca<C1995DP> pca3, @JsonProperty("albums") Pca<C3338wP> pca4, @JsonProperty("playlists") Pca<C3338wP> pca5, @JsonProperty("reposts") Pca<C5775e> pca6, @JsonProperty("likes") Pca<C5775e> pca7) {
        C7471uYa.b(gea, "user");
        C7471uYa.b(pca, "spotlight");
        C7471uYa.b(pca2, "tracks");
        C7471uYa.b(pca3, "topTracks");
        C7471uYa.b(pca4, "albums");
        C7471uYa.b(pca5, "playlists");
        C7471uYa.b(pca6, "reposts");
        C7471uYa.b(pca7, "likes");
        this.a = gea;
        this.b = pca;
        this.c = pca2;
        this.d = pca3;
        this.e = pca4;
        this.f = pca5;
        this.g = pca6;
        this.h = pca7;
    }

    public final Pca<C3338wP> a() {
        return this.e;
    }

    public final Pca<C5775e> b() {
        return this.h;
    }

    public final Pca<C3338wP> c() {
        return this.f;
    }

    public final Pca<C5775e> d() {
        return this.g;
    }

    public final Pca<C5775e> e() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.h, (java.lang.Object) r3.h) != false) goto L_0x005b;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5785g) {
                C5785g gVar = (C5785g) obj;
                if (C7471uYa.a((Object) this.a, (Object) gVar.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) gVar.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) gVar.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) gVar.d)) {
                                if (C7471uYa.a((Object) this.e, (Object) gVar.e)) {
                                    if (C7471uYa.a((Object) this.f, (Object) gVar.f)) {
                                        if (C7471uYa.a((Object) this.g, (Object) gVar.g)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Pca<C1995DP> f() {
        return this.d;
    }

    public final Pca<C1995DP> g() {
        return this.c;
    }

    public final C3776gea h() {
        return this.a;
    }

    public int hashCode() {
        C3776gea gea = this.a;
        int i = 0;
        int hashCode = (gea != null ? gea.hashCode() : 0) * 31;
        Pca<C5775e> pca = this.b;
        int hashCode2 = (hashCode + (pca != null ? pca.hashCode() : 0)) * 31;
        Pca<C1995DP> pca2 = this.c;
        int hashCode3 = (hashCode2 + (pca2 != null ? pca2.hashCode() : 0)) * 31;
        Pca<C1995DP> pca3 = this.d;
        int hashCode4 = (hashCode3 + (pca3 != null ? pca3.hashCode() : 0)) * 31;
        Pca<C3338wP> pca4 = this.e;
        int hashCode5 = (hashCode4 + (pca4 != null ? pca4.hashCode() : 0)) * 31;
        Pca<C3338wP> pca5 = this.f;
        int hashCode6 = (hashCode5 + (pca5 != null ? pca5.hashCode() : 0)) * 31;
        Pca<C5775e> pca6 = this.g;
        int hashCode7 = (hashCode6 + (pca6 != null ? pca6.hashCode() : 0)) * 31;
        Pca<C5775e> pca7 = this.h;
        if (pca7 != null) {
            i = pca7.hashCode();
        }
        return hashCode7 + i;
    }

    public final C3508cda i() {
        return this.a.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiUserProfile(user=");
        sb.append(this.a);
        sb.append(", spotlight=");
        sb.append(this.b);
        sb.append(", tracks=");
        sb.append(this.c);
        sb.append(", topTracks=");
        sb.append(this.d);
        sb.append(", albums=");
        sb.append(this.e);
        sb.append(", playlists=");
        sb.append(this.f);
        sb.append(", reposts=");
        sb.append(this.g);
        sb.append(", likes=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
