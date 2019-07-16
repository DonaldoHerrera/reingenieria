package defpackage;

/* renamed from: Rma reason: default package */
/* compiled from: MetadataOperations.kt */
final class Rma {
    private final C3508cda a;
    private final String b;
    private final String c;
    private final boolean d;
    private final long e;
    private final C3823mda f;
    private final C4928GKa<String> g;

    public Rma(C3508cda cda, String str, String str2, boolean z, long j, C3823mda mda, C4928GKa<String> gKa) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(str, "title");
        C7471uYa.b(str2, "creatorName");
        C7471uYa.b(mda, "offlineState");
        C7471uYa.b(gKa, "imageUrlTemplate");
        this.a = cda;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = j;
        this.f = mda;
        this.g = gKa;
    }

    public final String a() {
        return this.c;
    }

    public final long b() {
        return this.e;
    }

    public final C4928GKa<String> c() {
        return this.g;
    }

    public final C3823mda d() {
        return this.f;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Rma) {
                Rma rma = (Rma) obj;
                if (C7471uYa.a((Object) this.a, (Object) rma.a) && C7471uYa.a((Object) this.b, (Object) rma.b) && C7471uYa.a((Object) this.c, (Object) rma.c)) {
                    if (this.d == rma.d) {
                        if (!(this.e == rma.e) || !C7471uYa.a((Object) this.f, (Object) rma.f) || !C7471uYa.a((Object) this.g, (Object) rma.g)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C3508cda f() {
        return this.a;
    }

    public final boolean g() {
        return this.d;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        long j = this.e;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
        C3823mda mda = this.f;
        int hashCode4 = (i3 + (mda != null ? mda.hashCode() : 0)) * 31;
        C4928GKa<String> gKa = this.g;
        if (gKa != null) {
            i = gKa.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationMetadata(urn=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", creatorName=");
        sb.append(this.c);
        sb.append(", isUserLike=");
        sb.append(this.d);
        sb.append(", duration=");
        sb.append(this.e);
        sb.append(", offlineState=");
        sb.append(this.f);
        sb.append(", imageUrlTemplate=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
