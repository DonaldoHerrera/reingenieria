package defpackage;

/* renamed from: vda reason: default package and case insensitive filesystem */
/* compiled from: PromotedProperties.kt */
public final class C3895vda {
    private final C3508cda a;
    private final String b;
    private final String c;

    public C3895vda(C3508cda cda, String str, String str2) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(str, "name");
        this.a = cda;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final C3508cda c() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3895vda) {
                C3895vda vda = (C3895vda) obj;
                if (C7471uYa.a((Object) this.a, (Object) vda.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) vda.b)) {
                    }
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
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Promoter(urn=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", avatarUrlTemplate=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
