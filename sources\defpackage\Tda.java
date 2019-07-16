package defpackage;

/* renamed from: Tda reason: default package */
/* compiled from: StationTrack.kt */
public final class Tda {
    private final C3508cda a;
    private final C3508cda b;

    public Tda(C3508cda cda, C3508cda cda2) {
        C7471uYa.b(cda, "trackUrn");
        C7471uYa.b(cda2, "queryUrn");
        this.a = cda;
        this.b = cda2;
    }

    public final C3508cda a() {
        return this.b;
    }

    public final C3508cda b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Tda) {
                Tda tda = (Tda) obj;
                if (C7471uYa.a((Object) this.a, (Object) tda.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        C3508cda cda2 = this.b;
        if (cda2 != null) {
            i = cda2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StationTrack(trackUrn=");
        sb.append(this.a);
        sb.append(", queryUrn=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
