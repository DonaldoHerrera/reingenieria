package defpackage;

/* renamed from: Mpb reason: default package */
/* compiled from: ClassLiteralValue.kt */
public final class Mpb {
    private final C7280rnb a;
    private final int b;

    public Mpb(C7280rnb rnb, int i) {
        C7471uYa.b(rnb, "classId");
        this.a = rnb;
        this.b = i;
    }

    public final C7280rnb a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final C7280rnb d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Mpb) {
                Mpb mpb = (Mpb) obj;
                if (C7471uYa.a((Object) this.a, (Object) mpb.a)) {
                    if (this.b == mpb.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C7280rnb rnb = this.a;
        return ((rnb != null ? rnb.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.a);
        int i3 = this.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
