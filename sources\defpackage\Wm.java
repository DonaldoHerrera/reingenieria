package defpackage;

/* renamed from: Wm reason: default package */
/* compiled from: ConstantBitrateSeekMap */
public class Wm implements C1363hn {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public Wm(long j, long j2, int i, int i2) {
        this.a = j;
        this.b = j2;
        if (i2 == -1) {
            i2 = 1;
        }
        this.c = i2;
        this.e = i;
        if (j == -1) {
            this.d = -1;
            this.f = -9223372036854775807L;
            return;
        }
        this.d = j - j2;
        this.f = a(j, j2, i);
    }

    private long d(long j) {
        long j2 = (j * ((long) this.e)) / 8000000;
        int i = this.c;
        return this.b + C0471ar.b((j2 / ((long) i)) * ((long) i), 0, this.d - ((long) i));
    }

    public a a(long j) {
        if (this.d == -1) {
            return new a(new C1393in(0, this.b));
        }
        long d2 = d(j);
        long c2 = c(d2);
        C1393in inVar = new C1393in(c2, d2);
        if (c2 < j) {
            int i = this.c;
            if (((long) i) + d2 < this.a) {
                long j2 = d2 + ((long) i);
                return new a(inVar, new C1393in(c(j2), j2));
            }
        }
        return new a(inVar);
    }

    public boolean b() {
        return this.d != -1;
    }

    public long c() {
        return this.f;
    }

    public long c(long j) {
        return a(j, this.b, this.e);
    }

    private static long a(long j, long j2, int i) {
        return ((Math.max(0, j - j2) * 8) * 1000000) / ((long) i);
    }
}
