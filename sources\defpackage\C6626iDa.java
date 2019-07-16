package defpackage;

/* renamed from: iDa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_DbModel_MediaStreams */
final class C6626iDa extends b {
    private final C3508cda c;
    private final String d;

    C6626iDa(C3508cda cda, String str) {
        if (cda != null) {
            this.c = cda;
            if (str != null) {
                this.d = str;
                return;
            }
            throw new NullPointerException("Null payload");
        }
        throw new NullPointerException("Null urn");
    }

    public String a() {
        return this.d;
    }

    public C3508cda c() {
        return this.c;
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
        if (!this.c.equals(bVar.c()) || !this.d.equals(bVar.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaStreams{urn=");
        sb.append(this.c);
        sb.append(", payload=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
