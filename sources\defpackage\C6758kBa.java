package defpackage;

/* renamed from: kBa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PlaylistTrackChange */
final class C6758kBa extends C4733ABa {
    private final C3508cda a;
    private final boolean b;
    private final boolean c;

    C6758kBa(C3508cda cda, boolean z, boolean z2) {
        if (cda != null) {
            this.a = cda;
            this.b = z;
            this.c = z2;
            return;
        }
        throw new NullPointerException("Null urn");
    }

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public C3508cda c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4733ABa)) {
            return false;
        }
        C4733ABa aBa = (C4733ABa) obj;
        if (!(this.a.equals(aBa.c()) && this.b == aBa.a() && this.c == aBa.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaylistTrackChange{urn=");
        sb.append(this.a);
        sb.append(", added=");
        sb.append(this.b);
        sb.append(", removed=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
