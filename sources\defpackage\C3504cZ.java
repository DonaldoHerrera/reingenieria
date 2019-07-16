package defpackage;

/* renamed from: cZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_AttributionEvent */
abstract class C3504cZ extends C3446NZ {
    private final String a;
    private final long b;
    private final C4928GKa<String> c;
    private final C4928GKa<String> d;
    private final C4928GKa<String> e;
    private final C4928GKa<String> f;

    C3504cZ(String str, long j, C4928GKa<String> gKa, C4928GKa<String> gKa2, C4928GKa<String> gKa3, C4928GKa<String> gKa4) {
        if (str != null) {
            this.a = str;
            this.b = j;
            if (gKa != null) {
                this.c = gKa;
                if (gKa2 != null) {
                    this.d = gKa2;
                    if (gKa3 != null) {
                        this.e = gKa3;
                        if (gKa4 != null) {
                            this.f = gKa4;
                            return;
                        }
                        throw new NullPointerException("Null creative");
                    }
                    throw new NullPointerException("Null adGroup");
                }
                throw new NullPointerException("Null campaign");
            }
            throw new NullPointerException("Null network");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3446NZ)) {
            return false;
        }
        C3446NZ nz = (C3446NZ) obj;
        if (!this.a.equals(nz.f()) || this.b != nz.g() || !this.c.equals(nz.k()) || !this.d.equals(nz.i()) || !this.e.equals(nz.h()) || !this.f.equals(nz.j())) {
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
        return this.e;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public C4928GKa<String> i() {
        return this.d;
    }

    public C4928GKa<String> j() {
        return this.f;
    }

    public C4928GKa<String> k() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributionEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", network=");
        sb.append(this.c);
        sb.append(", campaign=");
        sb.append(this.d);
        sb.append(", adGroup=");
        sb.append(this.e);
        sb.append(", creative=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
