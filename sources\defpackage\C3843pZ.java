package defpackage;

/* renamed from: pZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_PurchaseEvent */
abstract class C3843pZ extends Raa {
    private final String a;
    private final long b;
    private final a c;
    private final String d;
    private final String e;

    C3843pZ(String str, long j, a aVar, String str2, String str3) {
        if (str != null) {
            this.a = str;
            this.b = j;
            if (aVar != null) {
                this.c = aVar;
                if (str2 != null) {
                    this.d = str2;
                    if (str3 != null) {
                        this.e = str3;
                        return;
                    }
                    throw new NullPointerException("Null currency");
                }
                throw new NullPointerException("Null price");
            }
            throw new NullPointerException("Null subscription");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Raa)) {
            return false;
        }
        Raa raa = (Raa) obj;
        if (!this.a.equals(raa.f()) || this.b != raa.g() || !this.c.equals(raa.k()) || !this.d.equals(raa.j()) || !this.e.equals(raa.i())) {
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

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String i() {
        return this.e;
    }

    public String j() {
        return this.d;
    }

    public a k() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", subscription=");
        sb.append(this.c);
        sb.append(", price=");
        sb.append(this.d);
        sb.append(", currency=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
