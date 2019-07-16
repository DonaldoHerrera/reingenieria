package defpackage;

/* renamed from: iBa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_LocalPlaylistChange */
final class C6622iBa extends C7376tBa {
    private final C3508cda a;
    private final String b;
    private final boolean c;

    C6622iBa(C3508cda cda, String str, boolean z) {
        if (cda != null) {
            this.a = cda;
            if (str != null) {
                this.b = str;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null urn");
    }

    public boolean a() {
        return this.c;
    }

    public String b() {
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
        if (!(obj instanceof C7376tBa)) {
            return false;
        }
        C7376tBa tba = (C7376tBa) obj;
        if (!this.a.equals(tba.c()) || !this.b.equals(tba.b()) || this.c != tba.a()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocalPlaylistChange{urn=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isPrivate=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
