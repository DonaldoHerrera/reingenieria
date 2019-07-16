package com.soundcloud.android.collection;

import com.soundcloud.android.collection.Fa.b;

/* renamed from: com.soundcloud.android.collection.p reason: case insensitive filesystem */
/* compiled from: AutoValue_DbModel_RecentlyPlayed */
final class C2765p extends b {
    private final long b;
    private final long c;
    private final long d;
    private final Boolean e;

    C2765p(long j, long j2, long j3, Boolean bool) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = bool;
    }

    public long a() {
        return this.b;
    }

    public Boolean b() {
        return this.e;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b == bVar.a() && this.c == bVar.c() && this.d == bVar.d()) {
            Boolean bool = this.e;
            if (bool != null) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        long j = this.b;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.c;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.d;
        int i3 = (i2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        Boolean bool = this.e;
        return (bool == null ? 0 : bool.hashCode()) ^ i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecentlyPlayed{timestamp=");
        sb.append(this.b);
        sb.append(", context_type=");
        sb.append(this.c);
        sb.append(", context_id=");
        sb.append(this.d);
        sb.append(", synced=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
