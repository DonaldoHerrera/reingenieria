package defpackage;

/* renamed from: fZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_GoOnboardingTooltipEvent */
abstract class C3763fZ extends C3908xaa {
    private final String a;
    private final long b;
    private final C4928GKa<String> c;
    private final String d;
    private final C4928GKa<String> e;
    private final String f;
    private final String g;

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3908xaa)) {
            return false;
        }
        C3908xaa xaa = (C3908xaa) obj;
        if (!this.a.equals(xaa.f()) || this.b != xaa.g() || !this.c.equals(xaa.h()) || !this.d.equals(xaa.k()) || !this.e.equals(xaa.l()) || !this.f.equals(xaa.i()) || !this.g.equals(xaa.j())) {
            z = false;
        }
        return z;
    }

    @C3783hda
    public String f() {
        return this.a;
    }

    @C3783hda
    public long g() {
        return this.b;
    }

    public C4928GKa<String> h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public String i() {
        return this.f;
    }

    public String j() {
        return this.g;
    }

    public String k() {
        return this.d;
    }

    public C4928GKa<String> l() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GoOnboardingTooltipEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", appboyEventName=");
        sb.append(this.c);
        sb.append(", pageName=");
        sb.append(this.d);
        sb.append(", pageUrn=");
        sb.append(this.e);
        sb.append(", impressionCategory=");
        sb.append(this.f);
        sb.append(", impressionName=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
