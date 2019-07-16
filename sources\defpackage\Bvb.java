package defpackage;

/* renamed from: Bvb reason: default package */
/* compiled from: numbers.kt */
public final class Bvb {
    private final String a;
    private final int b;

    public Bvb(String str, int i) {
        C7471uYa.b(str, "number");
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Bvb) {
                Bvb bvb = (Bvb) obj;
                if (C7471uYa.a((Object) this.a, (Object) bvb.a)) {
                    if (this.b == bvb.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberWithRadix(number=");
        sb.append(this.a);
        sb.append(", radix=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
