package defpackage;

/* renamed from: Jo reason: default package */
/* compiled from: WavHeader */
final class Jo implements C1363hn {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private long g;
    private long h;

    public Jo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public void a(long j, long j2) {
        this.g = j;
        this.h = j2;
    }

    public long b(long j) {
        return (Math.max(0, j - this.g) * 1000000) / ((long) this.c);
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return ((this.h / ((long) this.d)) * 1000000) / ((long) this.b);
    }

    public int d() {
        return this.b * this.e * this.a;
    }

    public int e() {
        return this.d;
    }

    public long f() {
        if (j()) {
            return this.g + this.h;
        }
        return -1;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.a;
    }

    public int i() {
        return this.b;
    }

    public boolean j() {
        return (this.g == 0 || this.h == 0) ? false : true;
    }

    public a a(long j) {
        long j2 = (((long) this.c) * j) / 1000000;
        int i = this.d;
        long b2 = C0471ar.b((j2 / ((long) i)) * ((long) i), 0, this.h - ((long) i));
        long j3 = this.g + b2;
        long b3 = b(j3);
        C1393in inVar = new C1393in(b3, j3);
        if (b3 < j) {
            long j4 = this.h;
            int i2 = this.d;
            if (b2 != j4 - ((long) i2)) {
                long j5 = j3 + ((long) i2);
                return new a(inVar, new C1393in(b(j5), j5));
            }
        }
        return new a(inVar);
    }
}
