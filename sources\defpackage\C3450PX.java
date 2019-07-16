package defpackage;

/* renamed from: PX reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ApiDiscoveryCard */
final class C3450PX extends C3435KX {
    private final C4928GKa<C3447OX> a;
    private final C4928GKa<C3438LX> b;
    private final C4928GKa<C3441MX> c;

    C3450PX(C4928GKa<C3447OX> gKa, C4928GKa<C3438LX> gKa2, C4928GKa<C3441MX> gKa3) {
        if (gKa != null) {
            this.a = gKa;
            if (gKa2 != null) {
                this.b = gKa2;
                if (gKa3 != null) {
                    this.c = gKa3;
                    return;
                }
                throw new NullPointerException("Null promotedTrackCard");
            }
            throw new NullPointerException("Null multipleContentSelectionCard");
        }
        throw new NullPointerException("Null singleContentSelectionCard");
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<C3438LX> a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<C3441MX> b() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<C3447OX> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3435KX)) {
            return false;
        }
        C3435KX kx = (C3435KX) obj;
        if (!this.a.equals(kx.c()) || !this.b.equals(kx.a()) || !this.c.equals(kx.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiDiscoveryCard{singleContentSelectionCard=");
        sb.append(this.a);
        sb.append(", multipleContentSelectionCard=");
        sb.append(this.b);
        sb.append(", promotedTrackCard=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
