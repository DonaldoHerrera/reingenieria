package defpackage;

/* renamed from: Kna reason: default package */
/* compiled from: PlayerViewProgressState.kt */
public final class Kna {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    public Kna(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final long a() {
        return Math.max(0, Math.min(this.c, this.a));
    }

    public final long b() {
        return this.d;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.b;
    }

    public final long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Kna) {
                Kna kna = (Kna) obj;
                if (this.a == kna.a) {
                    if (this.b == kna.b) {
                        if (this.c == kna.c) {
                            if (this.d == kna.d) {
                                return true;
                            }
                        }
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
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.d;
        return i3 + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayerViewProgressState(position=");
        sb.append(this.a);
        sb.append(", playDuration=");
        sb.append(this.b);
        sb.append(", fullDuration=");
        sb.append(this.c);
        sb.append(", createdAt=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
