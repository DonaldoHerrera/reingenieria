package defpackage;

import com.fasterxml.jackson.annotation.JsonGetter;

/* renamed from: HP reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ApiRecentlyPlayed */
final class C2075HP extends C3398zP {
    private final long a;
    private final String b;

    C2075HP(long j, String str) {
        this.a = j;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null urn");
    }

    @JsonGetter("played_at")
    public long a() {
        return this.a;
    }

    @JsonGetter("urn")
    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3398zP)) {
            return false;
        }
        C3398zP zPVar = (C3398zP) obj;
        if (this.a != zPVar.a() || !this.b.equals(zPVar.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiRecentlyPlayed{playedAt=");
        sb.append(this.a);
        sb.append(", urn=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
