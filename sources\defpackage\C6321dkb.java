package defpackage;

/* renamed from: dkb reason: default package and case insensitive filesystem */
/* compiled from: signatureEnhancement.kt */
final class C6321dkb {
    private final C7706xtb a;
    private final C6592hjb b;

    public C6321dkb(C7706xtb xtb, C6592hjb hjb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        this.a = xtb;
        this.b = hjb;
    }

    public final C7706xtb a() {
        return this.a;
    }

    public final C6592hjb b() {
        return this.b;
    }

    public final C7706xtb c() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6321dkb) {
                C6321dkb dkb = (C6321dkb) obj;
                if (C7471uYa.a((Object) this.a, (Object) dkb.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C7706xtb xtb = this.a;
        int i = 0;
        int hashCode = (xtb != null ? xtb.hashCode() : 0) * 31;
        C6592hjb hjb = this.b;
        if (hjb != null) {
            i = hjb.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TypeAndDefaultQualifiers(type=");
        sb.append(this.a);
        sb.append(", defaultQualifiers=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
