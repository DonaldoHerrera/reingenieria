package defpackage;

/* renamed from: IP reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ApiSocialMediaLink */
final class C2094IP extends C1935AP {
    private final C4928GKa<String> a;
    private final String b;
    private final String c;

    C2094IP(C4928GKa<String> gKa, String str, String str2) {
        if (gKa != null) {
            this.a = gKa;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null url");
            }
            throw new NullPointerException("Null network");
        }
        throw new NullPointerException("Null title");
    }

    public String a() {
        return this.b;
    }

    public C4928GKa<String> b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1935AP)) {
            return false;
        }
        C1935AP ap = (C1935AP) obj;
        if (!this.a.equals(ap.b()) || !this.b.equals(ap.a()) || !this.c.equals(ap.c())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiSocialMediaLink{title=");
        sb.append(this.a);
        sb.append(", network=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
