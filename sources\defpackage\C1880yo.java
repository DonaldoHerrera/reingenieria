package defpackage;

/* renamed from: yo reason: default package and case insensitive filesystem */
/* compiled from: SectionReader */
public final class C1880yo implements Eo {
    private final C1850xo a;
    private final Pq b = new Pq(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public C1880yo(C1850xo xoVar) {
        this.a = xoVar;
    }

    public void a(Zq zq, C0498bn bnVar, d dVar) {
        this.a.a(zq, bnVar, dVar);
        this.f = true;
    }

    public void a() {
        this.f = true;
    }

    public void a(Pq pq, int i) {
        boolean z = (i & 1) != 0;
        int t = z ? pq.t() + pq.c() : -1;
        if (this.f) {
            if (z) {
                this.f = false;
                pq.e(t);
                this.d = 0;
            } else {
                return;
            }
        }
        while (pq.a() > 0) {
            int i2 = this.d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int t2 = pq.t();
                    pq.e(pq.c() - 1);
                    if (t2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(pq.a(), 3 - this.d);
                pq.a(this.b.a, this.d, min);
                this.d += min;
                if (this.d == 3) {
                    this.b.c(3);
                    this.b.f(1);
                    int t3 = this.b.t();
                    int t4 = this.b.t();
                    this.e = (t3 & 128) != 0;
                    this.c = (((t3 & 15) << 8) | t4) + 3;
                    int b2 = this.b.b();
                    int i3 = this.c;
                    if (b2 < i3) {
                        Pq pq2 = this.b;
                        byte[] bArr = pq2.a;
                        pq2.c(Math.min(4098, Math.max(i3, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.b.a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(pq.a(), this.c - this.d);
                pq.a(this.b.a, this.d, min2);
                this.d += min2;
                int i4 = this.d;
                int i5 = this.c;
                if (i4 != i5) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.c(i5);
                    } else if (C0471ar.a(this.b.a, 0, i5, -1) != 0) {
                        this.f = true;
                        return;
                    } else {
                        this.b.c(this.c - 4);
                    }
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }
}
