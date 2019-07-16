package defpackage;

/* renamed from: kZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_PaymentFailureEvent */
abstract class C3803kZ extends Caa {
    private final String a;
    private final long b;
    private final String c;

    C3803kZ(String str, long j, String str2) {
        if (str != null) {
            this.a = str;
            this.b = j;
            if (str2 != null) {
                this.c = str2;
                return;
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
        if (!(obj instanceof Caa)) {
            return false;
        }
        Caa caa = (Caa) obj;
        if (!this.a.equals(caa.f()) || this.b != caa.g() || !this.c.equals(caa.h())) {
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

    public String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }
}
