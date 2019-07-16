package defpackage;

/* renamed from: TE reason: default package and case insensitive filesystem */
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
final class C2292TE extends C2365XE {
    private final String a;
    private final String b;

    C2292TE(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2365XE)) {
            return false;
        }
        C2365XE xe = (C2365XE) obj;
        if (!this.a.equals(xe.a()) || !this.b.equals(xe.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
