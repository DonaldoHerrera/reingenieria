package defpackage;

/* renamed from: VZ reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_FollowingStatusEvent */
final class C3470VZ extends C3900waa {
    private final C3508cda a;
    private final boolean b;
    private final long c;

    C3470VZ(C3508cda cda, boolean z, long j) {
        if (cda != null) {
            this.a = cda;
            this.b = z;
            this.c = j;
            return;
        }
        throw new NullPointerException("Null urn");
    }

    public long a() {
        return this.c;
    }

    public boolean b() {
        return this.b;
    }

    public C3508cda c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3900waa)) {
            return false;
        }
        C3900waa waa = (C3900waa) obj;
        if (!(this.a.equals(waa.c()) && this.b == waa.b() && this.c == waa.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        long j = this.c;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FollowingStatusEvent{urn=");
        sb.append(this.a);
        sb.append(", isFollowed=");
        sb.append(this.b);
        sb.append(", followingsCount=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
