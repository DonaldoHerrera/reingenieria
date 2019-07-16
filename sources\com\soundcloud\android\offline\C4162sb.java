package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.sb reason: case insensitive filesystem */
/* compiled from: AutoValue_TrackDownloadsDbModel */
final class C4162sb extends Be {
    private final C3508cda b;
    private final Long c;
    private final Long d;
    private final Long e;
    private final Long f;

    C4162sb(C3508cda cda, Long l, Long l2, Long l3, Long l4) {
        if (cda != null) {
            this.b = cda;
            this.c = l;
            this.d = l2;
            this.e = l3;
            this.f = l4;
            return;
        }
        throw new NullPointerException("Null urn");
    }

    public Long b() {
        return this.e;
    }

    public C3508cda c() {
        return this.b;
    }

    public Long d() {
        return this.c;
    }

    public Long e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Be)) {
            return false;
        }
        Be be = (Be) obj;
        if (this.b.equals(be.c())) {
            Long l = this.c;
            if (l != null ? l.equals(be.d()) : be.d() == null) {
                Long l2 = this.d;
                if (l2 != null ? l2.equals(be.f()) : be.f() == null) {
                    Long l3 = this.e;
                    if (l3 != null ? l3.equals(be.b()) : be.b() == null) {
                        Long l4 = this.f;
                        if (l4 != null) {
                        }
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public Long f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        Long l = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.d;
        int hashCode3 = (hashCode2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.e;
        int hashCode4 = (hashCode3 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Long l4 = this.f;
        if (l4 != null) {
            i = l4.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackDownloadsDbModel{urn=");
        sb.append(this.b);
        sb.append(", requested_at=");
        sb.append(this.c);
        sb.append(", downloaded_at=");
        sb.append(this.d);
        sb.append(", removed_at=");
        sb.append(this.e);
        sb.append(", unavailable_at=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
