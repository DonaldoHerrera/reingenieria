package com.soundcloud.android.stations;

/* compiled from: AutoValue_StationsDbModel_StationPlayQueue */
final class A extends c {
    private final long c;
    private final C3508cda d;
    private final C3508cda e;
    private final C3508cda f;
    private final Long g;

    A(long j, C3508cda cda, C3508cda cda2, C3508cda cda3, Long l) {
        this.c = j;
        if (cda != null) {
            this.d = cda;
            if (cda2 != null) {
                this.e = cda2;
                this.f = cda3;
                this.g = l;
                return;
            }
            throw new NullPointerException("Null track_urn");
        }
        throw new NullPointerException("Null station_urn");
    }

    public long a() {
        return this.c;
    }

    public C3508cda b() {
        return this.e;
    }

    public C3508cda c() {
        return this.d;
    }

    public C3508cda d() {
        return this.f;
    }

    public Long e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.c == cVar.a() && this.d.equals(cVar.c()) && this.e.equals(cVar.b())) {
            C3508cda cda = this.f;
            if (cda != null ? cda.equals(cVar.d()) : cVar.d() == null) {
                Long l = this.g;
                if (l != null) {
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        long j = this.c;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        C3508cda cda = this.f;
        int i = 0;
        int hashCode2 = (hashCode ^ (cda == null ? 0 : cda.hashCode())) * 1000003;
        Long l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StationPlayQueue{_id=");
        sb.append(this.c);
        sb.append(", station_urn=");
        sb.append(this.d);
        sb.append(", track_urn=");
        sb.append(this.e);
        sb.append(", query_urn=");
        sb.append(this.f);
        sb.append(", track_position=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
