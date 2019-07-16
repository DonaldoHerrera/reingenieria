package defpackage;

/* renamed from: Rda reason: default package */
/* compiled from: StationMetadata.kt */
public final class Rda {
    private final C3508cda a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public Rda(C3508cda cda, String str, String str2, String str3, String str4) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(str, "title");
        C7471uYa.b(str2, C1325gg.TYPE);
        this.a = cda;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.b;
    }

    public final C3508cda c() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.e, (java.lang.Object) r3.e) != false) goto L_0x003d;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Rda) {
                Rda rda = (Rda) obj;
                if (C7471uYa.a((Object) this.a, (Object) rda.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) rda.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) rda.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) rda.d)) {
                            }
                        }
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
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StationMetadata(urn=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", permalink=");
        sb.append(this.d);
        sb.append(", imageUrlTemplate=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
