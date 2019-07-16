package defpackage;

import com.fasterxml.jackson.annotation.JsonGetter;

/* renamed from: GP reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ApiPlayHistory */
final class C2055GP extends C3298uP {
    private final long a;
    private final String b;

    C2055GP(long j, String str) {
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
        if (!(obj instanceof C3298uP)) {
            return false;
        }
        C3298uP uPVar = (C3298uP) obj;
        if (this.a != uPVar.a() || !this.b.equals(uPVar.b())) {
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
        sb.append("ApiPlayHistory{playedAt=");
        sb.append(this.a);
        sb.append(", urn=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
