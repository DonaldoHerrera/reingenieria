package defpackage;

import java.io.IOException;

/* renamed from: on reason: default package and case insensitive filesystem */
/* compiled from: FlvExtractor */
public final class C1579on implements _m {
    public static final C0529cn a = C1517mn.a;
    private static final int b = C0471ar.b("FLV");
    private final Pq c = new Pq(4);
    private final Pq d = new Pq(9);
    private final Pq e = new Pq(11);
    private final Pq f = new Pq();
    private final C1610pn g = new C1610pn();
    private C0498bn h;
    private int i = 1;
    private long j = -9223372036854775807L;
    private int k;
    private int l;
    private int m;
    private long n;
    private boolean o;
    private C1548nn p;
    private C1669rn q;

    static /* synthetic */ _m[] a() {
        return new _m[]{new C1579on()};
    }

    private Pq b(C0313an anVar) throws IOException, InterruptedException {
        if (this.m > this.f.b()) {
            Pq pq = this.f;
            pq.a(new byte[Math.max(pq.b() * 2, this.m)], 0);
        } else {
            this.f.e(0);
        }
        this.f.d(this.m);
        anVar.readFully(this.f.a, 0, this.m);
        return this.f;
    }

    private boolean c(C0313an anVar) throws IOException, InterruptedException {
        boolean z = false;
        if (!anVar.b(this.d.a, 0, 9, true)) {
            return false;
        }
        this.d.e(0);
        this.d.f(4);
        int t = this.d.t();
        boolean z2 = (t & 4) != 0;
        if ((t & 1) != 0) {
            z = true;
        }
        if (z2 && this.p == null) {
            this.p = new C1548nn(this.h.a(8, 1));
        }
        if (z && this.q == null) {
            this.q = new C1669rn(this.h.a(9, 2));
        }
        this.h.g();
        this.k = (this.d.h() - 9) + 4;
        this.i = 2;
        return true;
    }

    private boolean d(C0313an anVar) throws IOException, InterruptedException {
        boolean z = true;
        if (this.l == 8 && this.p != null) {
            b();
            this.p.a(b(anVar), this.j + this.n);
        } else if (this.l == 9 && this.q != null) {
            b();
            this.q.a(b(anVar), this.j + this.n);
        } else if (this.l != 18 || this.o) {
            anVar.c(this.m);
            z = false;
        } else {
            this.g.a(b(anVar), this.n);
            long a2 = this.g.a();
            if (a2 != -9223372036854775807L) {
                this.h.a(new b(a2));
                this.o = true;
            }
        }
        this.k = 4;
        this.i = 2;
        return z;
    }

    private boolean e(C0313an anVar) throws IOException, InterruptedException {
        if (!anVar.b(this.e.a, 0, 11, true)) {
            return false;
        }
        this.e.e(0);
        this.l = this.e.t();
        this.m = this.e.w();
        this.n = (long) this.e.w();
        this.n = (((long) (this.e.t() << 24)) | this.n) * 1000;
        this.e.f(3);
        this.i = 4;
        return true;
    }

    private void f(C0313an anVar) throws IOException, InterruptedException {
        anVar.c(this.k);
        this.k = 0;
        this.i = 3;
    }

    public void release() {
    }

    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        boolean z = false;
        anVar.a(this.c.a, 0, 3);
        this.c.e(0);
        if (this.c.w() != b) {
            return false;
        }
        anVar.a(this.c.a, 0, 2);
        this.c.e(0);
        if ((this.c.z() & 250) != 0) {
            return false;
        }
        anVar.a(this.c.a, 0, 4);
        this.c.e(0);
        int h2 = this.c.h();
        anVar.a();
        anVar.a(h2);
        anVar.a(this.c.a, 0, 4);
        this.c.e(0);
        if (this.c.h() == 0) {
            z = true;
        }
        return z;
    }

    private void b() {
        if (!this.o) {
            this.h.a(new b(-9223372036854775807L));
            this.o = true;
        }
        if (this.j == -9223372036854775807L) {
            this.j = this.g.a() == -9223372036854775807L ? -this.n : 0;
        }
    }

    public void a(C0498bn bnVar) {
        this.h = bnVar;
    }

    public void a(long j2, long j3) {
        this.i = 1;
        this.j = -9223372036854775807L;
        this.k = 0;
    }

    public int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        while (true) {
            int i2 = this.i;
            if (i2 != 1) {
                if (i2 == 2) {
                    f(anVar);
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException();
                    } else if (d(anVar)) {
                        return 0;
                    }
                } else if (!e(anVar)) {
                    return -1;
                }
            } else if (!c(anVar)) {
                return -1;
            }
        }
    }
}
