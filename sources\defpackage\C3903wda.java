package defpackage;

/* renamed from: wda reason: default package and case insensitive filesystem */
/* compiled from: RepostedProperties.kt */
public final class C3903wda {
    private final String a;
    private final C3508cda b;

    public C3903wda(String str, C3508cda cda) {
        C7471uYa.b(str, "reposter");
        C7471uYa.b(cda, "reposterUrn");
        this.a = str;
        this.b = cda;
    }

    public final String a() {
        return this.a;
    }

    public final C3508cda b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3903wda) {
                C3903wda wda = (C3903wda) obj;
                if (C7471uYa.a((Object) this.a, (Object) wda.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C3508cda cda = this.b;
        if (cda != null) {
            i = cda.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RepostedProperties(reposter=");
        sb.append(this.a);
        sb.append(", reposterUrn=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
