package defpackage;

/* renamed from: BI reason: default package and case insensitive filesystem */
/* compiled from: OMAdSessionData.kt */
public class C1948BI {
    private final C2066HG a;
    private final C2046GG b;
    private final C2313UG c;

    public C1948BI(C2066HG hg, C2046GG gg, C2313UG ug) {
        C7471uYa.b(hg, "session");
        C7471uYa.b(gg, "adEvents");
        C7471uYa.b(ug, "videoEvents");
        this.a = hg;
        this.b = gg;
        this.c = ug;
    }

    public C2046GG a() {
        return this.b;
    }

    public C2066HG b() {
        return this.a;
    }

    public C2313UG c() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) c(), (java.lang.Object) r3.c()) != false) goto L_0x0035;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1948BI) {
                C1948BI bi = (C1948BI) obj;
                if (C7471uYa.a((Object) b(), (Object) bi.b())) {
                    if (C7471uYa.a((Object) a(), (Object) bi.a())) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C2066HG b2 = b();
        int i = 0;
        int hashCode = (b2 != null ? b2.hashCode() : 0) * 31;
        C2046GG a2 = a();
        int hashCode2 = (hashCode + (a2 != null ? a2.hashCode() : 0)) * 31;
        C2313UG c2 = c();
        if (c2 != null) {
            i = c2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OMAdSessionData(session=");
        sb.append(b());
        sb.append(", adEvents=");
        sb.append(a());
        sb.append(", videoEvents=");
        sb.append(c());
        sb.append(")");
        return sb.toString();
    }
}
