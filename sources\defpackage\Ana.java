package defpackage;

/* renamed from: Ana reason: default package */
/* compiled from: FadeRequest.kt */
public final class Ana {
    private final long a;
    private final long b;
    private final float c;
    private final float d;

    public Ana(long j, long j2, float f, float f2) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = f2;
    }

    public final long a() {
        return this.a;
    }

    public final float b() {
        return this.d;
    }

    public final long c() {
        return this.b;
    }

    public final float d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ana) {
                Ana ana = (Ana) obj;
                if (this.a == ana.a) {
                    if (!((this.b == ana.b) && Float.compare(this.c, ana.c) == 0 && Float.compare(this.d, ana.d) == 0)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FadeRequest(duration=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", startValue=");
        sb.append(this.c);
        sb.append(", endValue=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
