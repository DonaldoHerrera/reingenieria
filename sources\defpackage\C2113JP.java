package defpackage;

/* renamed from: JP reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ApiUserProfileInfo */
final class C2113JP extends C2035FP {
    private final Pca<C1935AP> a;
    private final C4928GKa<String> b;
    private final C3776gea c;

    C2113JP(Pca<C1935AP> pca, C4928GKa<String> gKa, C3776gea gea) {
        if (pca != null) {
            this.a = pca;
            if (gKa != null) {
                this.b = gKa;
                if (gea != null) {
                    this.c = gea;
                    return;
                }
                throw new NullPointerException("Null user");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null socialMediaLinks");
    }

    public C4928GKa<String> a() {
        return this.b;
    }

    public Pca<C1935AP> b() {
        return this.a;
    }

    public C3776gea c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2035FP)) {
            return false;
        }
        C2035FP fp = (C2035FP) obj;
        if (!this.a.equals(fp.b()) || !this.b.equals(fp.a()) || !this.c.equals(fp.c())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiUserProfileInfo{socialMediaLinks=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", user=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
