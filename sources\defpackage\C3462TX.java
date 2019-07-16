package defpackage;

/* renamed from: TX reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_DbModel_DiscoveryCard */
final class C3462TX extends a {
    private final long d;
    private final Long e;
    private final Long f;

    C3462TX(long j, Long l, Long l2) {
        this.d = j;
        this.e = l;
        this.f = l2;
    }

    public long a() {
        return this.d;
    }

    public Long b() {
        return this.f;
    }

    public Long c() {
        return this.e;
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
        if (this.d == aVar.a()) {
            Long l = this.e;
            if (l != null ? l.equals(aVar.c()) : aVar.c() == null) {
                Long l2 = this.f;
                if (l2 != null) {
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        long j = this.d;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Long l = this.e;
        int i2 = 0;
        int hashCode = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.f;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoveryCard{_id=");
        sb.append(this.d);
        sb.append(", single_selection_card_id=");
        sb.append(this.e);
        sb.append(", multiple_selection_card_id=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
