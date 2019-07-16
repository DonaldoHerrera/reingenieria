package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.H;
import java.util.Collections;

/* renamed from: po reason: default package and case insensitive filesystem */
/* compiled from: LatmReader */
public final class C1611po implements C1425jo {
    private final String a;
    private final Pq b = new Pq(1024);
    private final Oq c = new Oq(this.b.a);
    private C1424jn d;
    private Format e;
    private String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;

    public C1611po(String str) {
        this.a = str;
    }

    private void b(Oq oq) throws H {
        if (!oq.e()) {
            this.l = true;
            f(oq);
        } else if (!this.l) {
            return;
        }
        if (this.m != 0) {
            throw new H();
        } else if (this.n == 0) {
            a(oq, e(oq));
            if (this.p) {
                oq.c((int) this.q);
            }
        } else {
            throw new H();
        }
    }

    private int c(Oq oq) throws H {
        int a2 = oq.a();
        Pair a3 = C1912zq.a(oq, true);
        this.r = ((Integer) a3.first).intValue();
        this.t = ((Integer) a3.second).intValue();
        return a2 - oq.a();
    }

    private void d(Oq oq) {
        this.o = oq.a(3);
        int i2 = this.o;
        if (i2 == 0) {
            oq.c(8);
        } else if (i2 == 1) {
            oq.c(9);
        } else if (i2 == 3 || i2 == 4 || i2 == 5) {
            oq.c(6);
        } else if (i2 == 6 || i2 == 7) {
            oq.c(1);
        } else {
            throw new IllegalStateException();
        }
    }

    private int e(Oq oq) throws H {
        int a2;
        if (this.o == 0) {
            int i2 = 0;
            do {
                a2 = oq.a(8);
                i2 += a2;
            } while (a2 == 255);
            return i2;
        }
        throw new H();
    }

    private void f(Oq oq) throws H {
        boolean e2;
        Oq oq2 = oq;
        int a2 = oq2.a(1);
        this.m = a2 == 1 ? oq2.a(1) : 0;
        if (this.m == 0) {
            if (a2 == 1) {
                a(oq);
            }
            if (oq.e()) {
                this.n = oq2.a(6);
                int a3 = oq2.a(4);
                int a4 = oq2.a(3);
                if (a3 == 0 && a4 == 0) {
                    if (a2 == 0) {
                        int d2 = oq.d();
                        int c2 = c(oq);
                        oq2.b(d2);
                        byte[] bArr = new byte[((c2 + 7) / 8)];
                        oq2.a(bArr, 0, c2);
                        Format a5 = Format.a(this.f, "audio/mp4a-latm", null, -1, -1, this.t, this.r, Collections.singletonList(bArr), null, 0, this.a);
                        if (!a5.equals(this.e)) {
                            this.e = a5;
                            this.s = 1024000000 / ((long) a5.w);
                            this.d.a(a5);
                        }
                    } else {
                        oq2.c(((int) a(oq)) - c(oq));
                    }
                    d(oq);
                    this.p = oq.e();
                    this.q = 0;
                    if (this.p) {
                        if (a2 == 1) {
                            this.q = a(oq);
                        } else {
                            do {
                                e2 = oq.e();
                                this.q = (this.q << 8) + ((long) oq2.a(8));
                            } while (e2);
                        }
                    }
                    if (oq.e()) {
                        oq2.c(8);
                        return;
                    }
                    return;
                }
                throw new H();
            }
            throw new H();
        }
        throw new H();
    }

    public void a() {
        this.g = 0;
        this.l = false;
    }

    public void b() {
    }

    public void a(C0498bn bnVar, d dVar) {
        dVar.a();
        this.d = bnVar.a(dVar.c(), 1);
        this.f = dVar.b();
    }

    public void a(long j2, int i2) {
        this.k = j2;
    }

    public void a(Pq pq) throws H {
        while (pq.a() > 0) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 == 1) {
                    int t2 = pq.t();
                    if ((t2 & 224) == 224) {
                        this.j = t2;
                        this.g = 2;
                    } else if (t2 != 86) {
                        this.g = 0;
                    }
                } else if (i2 == 2) {
                    this.i = ((this.j & -225) << 8) | pq.t();
                    int i3 = this.i;
                    if (i3 > this.b.a.length) {
                        a(i3);
                    }
                    this.h = 0;
                    this.g = 3;
                } else if (i2 == 3) {
                    int min = Math.min(pq.a(), this.i - this.h);
                    pq.a(this.c.a, this.h, min);
                    this.h += min;
                    if (this.h == this.i) {
                        this.c.b(0);
                        b(this.c);
                        this.g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (pq.t() == 86) {
                this.g = 1;
            }
        }
    }

    private void a(Oq oq, int i2) {
        int d2 = oq.d();
        if ((d2 & 7) == 0) {
            this.b.e(d2 >> 3);
        } else {
            oq.a(this.b.a, 0, i2 * 8);
            this.b.e(0);
        }
        this.d.a(this.b, i2);
        this.d.a(this.k, 1, i2, 0, null);
        this.k += this.s;
    }

    private void a(int i2) {
        this.b.c(i2);
        this.c.a(this.b.a);
    }

    private static long a(Oq oq) {
        return (long) oq.a((oq.a(2) + 1) * 8);
    }
}
