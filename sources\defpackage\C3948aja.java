package defpackage;

/* renamed from: aja reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_NavigationTarget_StationsInfoMetaData */
final class C3948aja extends f {
    private final C4928GKa<C3508cda> a;

    C3948aja(C4928GKa<C3508cda> gKa) {
        if (gKa != null) {
            this.a = gKa;
            return;
        }
        throw new NullPointerException("Null seedTrack");
    }

    public C4928GKa<C3508cda> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.a.equals(((f) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StationsInfoMetaData{seedTrack=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
