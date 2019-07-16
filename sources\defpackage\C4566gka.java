package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: gka reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_DateOfBirth */
final class C4566gka extends C4638pka {
    private final long a;
    private final long b;

    C4566gka(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("month")
    public long a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("year")
    public long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4638pka)) {
            return false;
        }
        C4638pka pka = (C4638pka) obj;
        if (!(this.a == pka.b() && this.b == pka.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((int) ((j2 >>> 32) ^ j2)) ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DateOfBirth{year=");
        sb.append(this.a);
        sb.append(", month=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
