package defpackage;

/* renamed from: lZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_PolicyUpdateFailureEvent */
abstract class C3811lZ extends Oaa {
    private final String a;
    private final long b;
    private final b c;
    private final a d;

    C3811lZ(String str, long j, b bVar, a aVar) {
        if (str != null) {
            this.a = str;
            this.b = j;
            if (bVar != null) {
                this.c = bVar;
                if (aVar != null) {
                    this.d = aVar;
                    return;
                }
                throw new NullPointerException("Null context");
            }
            throw new NullPointerException("Null reason");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Oaa)) {
            return false;
        }
        Oaa oaa = (Oaa) obj;
        if (!this.a.equals(oaa.f()) || this.b != oaa.g() || !this.c.equals(oaa.i()) || !this.d.equals(oaa.h())) {
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

    /* access modifiers changed from: 0000 */
    public a h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public b i() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PolicyUpdateFailureEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append(this.c);
        sb.append(", context=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
