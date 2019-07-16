package defpackage;

/* renamed from: kgb reason: default package and case insensitive filesystem */
/* compiled from: specialBuiltinMembers.kt */
final class C6793kgb {
    private final C7694xnb a;
    private final String b;

    public C6793kgb(C7694xnb xnb, String str) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(str, "signature");
        this.a = xnb;
        this.b = str;
    }

    public final C7694xnb a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6793kgb) {
                C6793kgb kgb = (C6793kgb) obj;
                if (C7471uYa.a((Object) this.a, (Object) kgb.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C7694xnb xnb = this.a;
        int i = 0;
        int hashCode = (xnb != null ? xnb.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NameAndSignature(name=");
        sb.append(this.a);
        sb.append(", signature=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
