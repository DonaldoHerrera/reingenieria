package defpackage;

/* renamed from: aea reason: default package and case insensitive filesystem */
/* compiled from: FullTrack.kt */
public final class C3493aea {
    private final C3509cea a;
    private final String b;

    public C3493aea(C3509cea cea, String str) {
        C7471uYa.b(cea, "track");
        this.a = cea;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final C3509cea b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3493aea) {
                C3493aea aea = (C3493aea) obj;
                if (C7471uYa.a((Object) this.a, (Object) aea.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3509cea cea = this.a;
        int i = 0;
        int hashCode = (cea != null ? cea.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FullTrack(track=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
