package com.soundcloud.android.stations;

/* renamed from: com.soundcloud.android.stations.z reason: case insensitive filesystem */
/* compiled from: AutoValue_StationsDbModel_StationCollection */
final class C6064z extends b {
    private final long c;
    private final C3508cda d;
    private final long e;
    private final Long f;
    private final Long g;
    private final Long h;

    C6064z(long j, C3508cda cda, long j2, Long l, Long l2, Long l3) {
        this.c = j;
        if (cda != null) {
            this.d = cda;
            this.e = j2;
            this.f = l;
            this.g = l2;
            this.h = l3;
            return;
        }
        throw new NullPointerException("Null station_urn");
    }

    public long a() {
        return this.c;
    }

    public Long b() {
        return this.h;
    }

    public C3508cda c() {
        return this.d;
    }

    public Long d() {
        return this.g;
    }

    public long e() {
        return this.e;
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
        if (this.c == bVar.a() && this.d.equals(bVar.c()) && this.e == bVar.e()) {
            Long l = this.f;
            if (l != null ? l.equals(bVar.position()) : bVar.position() == null) {
                Long l2 = this.g;
                if (l2 != null ? l2.equals(bVar.d()) : bVar.d() == null) {
                    Long l3 = this.h;
                    if (l3 != null) {
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        long j = this.c;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003;
        long j2 = this.e;
        int i = (hashCode ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Long l = this.f;
        int i2 = 0;
        int hashCode2 = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.g;
        int hashCode3 = (hashCode2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.h;
        if (l3 != null) {
            i2 = l3.hashCode();
        }
        return hashCode3 ^ i2;
    }

    public Long position() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StationCollection{_id=");
        sb.append(this.c);
        sb.append(", station_urn=");
        sb.append(this.d);
        sb.append(", collection_type=");
        sb.append(this.e);
        sb.append(", position=");
        sb.append(this.f);
        sb.append(", added_at=");
        sb.append(this.g);
        sb.append(", removed_at=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
