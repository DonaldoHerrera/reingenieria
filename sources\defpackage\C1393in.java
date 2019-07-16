package defpackage;

/* renamed from: in reason: default package and case insensitive filesystem */
/* compiled from: SeekPoint */
public final class C1393in {
    public static final C1393in a = new C1393in(0, 0);
    public final long b;
    public final long c;

    public C1393in(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1393in.class != obj.getClass()) {
            return false;
        }
        C1393in inVar = (C1393in) obj;
        if (!(this.b == inVar.b && this.c == inVar.c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((int) this.b) * 31) + ((int) this.c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[timeUs=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
