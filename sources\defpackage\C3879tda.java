package defpackage;

/* renamed from: tda reason: default package and case insensitive filesystem */
/* compiled from: PromotedProperties.kt */
public final class C3879tda {
    private final C3508cda a;
    private final C3887uda b;
    private final C3895vda c;
    private boolean d;

    public C3879tda(C3508cda cda, C3887uda uda, C3895vda vda, boolean z) {
        C7471uYa.b(cda, "adUrn");
        C7471uYa.b(uda, "trackingUrls");
        this.a = cda;
        this.b = uda;
        this.c = vda;
        this.d = z;
    }

    public final C3508cda a() {
        return this.a;
    }

    public final C3895vda b() {
        return this.c;
    }

    public final C3887uda c() {
        return this.b;
    }

    public final void d() {
        this.d = true;
    }

    public final boolean e() {
        return !this.d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3879tda) {
                C3879tda tda = (C3879tda) obj;
                if (C7471uYa.a((Object) this.a, (Object) tda.a) && C7471uYa.a((Object) this.b, (Object) tda.b) && C7471uYa.a((Object) this.c, (Object) tda.c)) {
                    if (this.d == tda.d) {
                        return true;
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
        C3887uda uda = this.b;
        int hashCode2 = (hashCode + (uda != null ? uda.hashCode() : 0)) * 31;
        C3895vda vda = this.c;
        if (vda != null) {
            i = vda.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromotedProperties(adUrn=");
        sb.append(this.a);
        sb.append(", trackingUrls=");
        sb.append(this.b);
        sb.append(", promoter=");
        sb.append(this.c);
        sb.append(", impressionHasFired=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C3879tda(C3508cda cda, C3887uda uda, C3895vda vda, boolean z, int i, C7264rYa rya) {
        if ((i & 8) != 0) {
            z = false;
        }
        this(cda, uda, vda, z);
    }
}
