package com.soundcloud.android.collection;

import com.soundcloud.android.collection.Fa.a;

/* renamed from: com.soundcloud.android.collection.o reason: case insensitive filesystem */
/* compiled from: AutoValue_DbModel_PlayHistory */
final class C2763o extends a {
    private final long b;
    private final long c;
    private final Boolean d;

    C2763o(long j, long j2, Boolean bool) {
        this.b = j;
        this.c = j2;
        this.d = bool;
    }

    public long a() {
        return this.b;
    }

    public Boolean b() {
        return this.d;
    }

    public long c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.b == aVar.a() && this.c == aVar.c()) {
            Boolean bool = this.d;
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
        int i2 = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Boolean bool = this.d;
        return (bool == null ? 0 : bool.hashCode()) ^ i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayHistory{timestamp=");
        sb.append(this.b);
        sb.append(", track_id=");
        sb.append(this.c);
        sb.append(", synced=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
