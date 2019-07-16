package defpackage;

/* renamed from: Qb reason: default package and case insensitive filesystem */
/* compiled from: Pair */
public class C0247Qb<F, S> {
    public final F a;
    public final S b;

    public C0247Qb(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0247Qb)) {
            return false;
        }
        C0247Qb qb = (C0247Qb) obj;
        if (C0243Pb.a(qb.a, this.a) && C0243Pb.a(qb.b, this.b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        F f = this.a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(String.valueOf(this.a));
        sb.append(" ");
        sb.append(String.valueOf(this.b));
        sb.append("}");
        return sb.toString();
    }
}
