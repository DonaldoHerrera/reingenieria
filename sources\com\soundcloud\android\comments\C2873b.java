package com.soundcloud.android.comments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.soundcloud.android.comments.b reason: case insensitive filesystem */
/* compiled from: TrackCommentOperations.kt */
public final class C2873b {
    private final C3508cda a;
    private final long b;
    private final Pca<C2870a> c;

    @JsonCreator
    public C2873b(@JsonProperty("track_urn") C3508cda cda, @JsonProperty("track_time") long j, @JsonProperty("comments") Pca<C2870a> pca) {
        C7471uYa.b(cda, "trackUrn");
        C7471uYa.b(pca, "comments");
        this.a = cda;
        this.b = j;
        this.c = pca;
    }

    public final Pca<C2870a> a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final C3508cda c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2873b) {
                C2873b bVar = (C2873b) obj;
                if (C7471uYa.a((Object) this.a, (Object) bVar.a)) {
                    if (!(this.b == bVar.b) || !C7471uYa.a((Object) this.c, (Object) bVar.c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        long j = this.b;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        Pca<C2870a> pca = this.c;
        if (pca != null) {
            i = pca.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiCommentThread(trackUrn=");
        sb.append(this.a);
        sb.append(", trackTime=");
        sb.append(this.b);
        sb.append(", comments=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
