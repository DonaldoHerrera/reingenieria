package defpackage;

/* renamed from: ZY reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_AdImageErrorEvent */
abstract class C3481ZY extends C3419EZ {
    private final String a;
    private final long b;
    private final C3508cda c;
    private final C3508cda d;

    C3481ZY(String str, long j, C3508cda cda, C3508cda cda2) {
        if (str != null) {
            this.a = str;
            this.b = j;
            if (cda != null) {
                this.c = cda;
                if (cda2 != null) {
                    this.d = cda2;
                    return;
                }
                throw new NullPointerException("Null adUrn");
            }
            throw new NullPointerException("Null monetizableTrackUrn");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3419EZ)) {
            return false;
        }
        C3419EZ ez = (C3419EZ) obj;
        if (!this.a.equals(ez.f()) || this.b != ez.g() || !this.c.equals(ez.i()) || !this.d.equals(ez.h())) {
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

    public C3508cda h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public C3508cda i() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdImageErrorEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", monetizableTrackUrn=");
        sb.append(this.c);
        sb.append(", adUrn=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
