package defpackage;

/* renamed from: nS reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_RemoteTrack */
final class C3154nS extends C3341wS {
    private final C4928GKa<String> a;
    private final C3508cda b;

    C3154nS(C4928GKa<String> gKa, C3508cda cda) {
        if (gKa != null) {
            this.a = gKa;
            if (cda != null) {
                this.b = cda;
                return;
            }
            throw new NullPointerException("Null urn");
        }
        throw new NullPointerException("Null id");
    }

    public C4928GKa<String> a() {
        return this.a;
    }

    public C3508cda b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3341wS)) {
            return false;
        }
        C3341wS wSVar = (C3341wS) obj;
        if (!this.a.equals(wSVar.a()) || !this.b.equals(wSVar.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemoteTrack{id=");
        sb.append(this.a);
        sb.append(", urn=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
