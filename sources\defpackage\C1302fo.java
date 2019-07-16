package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: fo reason: default package and case insensitive filesystem */
/* compiled from: AdtsReader */
public final class C1302fo implements C1425jo {
    private static final byte[] a = {73, 68, 51};
    private final boolean b;
    private final Oq c;
    private final Pq d;
    private final String e;
    private String f;
    private C1424jn g;
    private C1424jn h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private long r;
    private int s;
    private long t;
    private C1424jn u;
    private long v;

    public C1302fo(boolean z) {
        this(z, null);
    }

    public static boolean a(int i2) {
        return (i2 & 65526) == 65520;
    }

    private void b(Pq pq) {
        if (pq.a() != 0) {
            this.c.a[0] = pq.a[pq.c()];
            this.c.b(2);
            int a2 = this.c.a(4);
            int i2 = this.o;
            if (i2 == -1 || a2 == i2) {
                if (!this.m) {
                    this.m = true;
                    this.n = this.p;
                    this.o = a2;
                }
                i();
                return;
            }
            f();
        }
    }

    private void d() throws H {
        this.c.b(0);
        if (!this.q) {
            int a2 = this.c.a(2) + 1;
            if (a2 != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Detected audio object type: ");
                sb.append(a2);
                sb.append(", but assuming AAC LC.");
                Iq.d("AdtsReader", sb.toString());
                a2 = 2;
            }
            this.c.c(5);
            byte[] a3 = C1912zq.a(a2, this.o, this.c.a(3));
            Pair a4 = C1912zq.a(a3);
            Format a5 = Format.a(this.f, "audio/mp4a-latm", null, -1, -1, ((Integer) a4.second).intValue(), ((Integer) a4.first).intValue(), Collections.singletonList(a3), null, 0, this.e);
            this.r = 1024000000 / ((long) a5.w);
            this.g.a(a5);
            this.q = true;
        } else {
            this.c.c(10);
        }
        this.c.c(4);
        int a6 = (this.c.a(13) - 2) - 5;
        if (this.l) {
            a6 -= 2;
        }
        int i2 = a6;
        a(this.g, this.r, 0, i2);
    }

    private void e() {
        this.h.a(this.d, 10);
        this.d.e(6);
        a(this.h, 0, 10, this.d.s() + 10);
    }

    private void f() {
        this.m = false;
        h();
    }

    private void g() {
        this.i = 1;
        this.j = 0;
    }

    private void h() {
        this.i = 0;
        this.j = 0;
        this.k = 256;
    }

    private void i() {
        this.i = 3;
        this.j = 0;
    }

    private void j() {
        this.i = 2;
        this.j = a.length;
        this.s = 0;
        this.d.e(0);
    }

    public void a() {
        f();
    }

    public void b() {
    }

    public long c() {
        return this.r;
    }

    public C1302fo(boolean z, String str) {
        this.c = new Oq(new byte[7]);
        this.d = new Pq(Arrays.copyOf(a, 10));
        h();
        this.n = -1;
        this.o = -1;
        this.r = -9223372036854775807L;
        this.b = z;
        this.e = str;
    }

    private void c(Pq pq) {
        byte[] bArr = pq.a;
        int c2 = pq.c();
        int d2 = pq.d();
        while (c2 < d2) {
            int i2 = c2 + 1;
            byte b2 = bArr[c2] & 255;
            if (this.k != 512 || !a(-1, (byte) b2) || (!this.m && !a(pq, i2 - 2))) {
                int i3 = this.k;
                byte b3 = b2 | i3;
                if (b3 == 329) {
                    this.k = 768;
                } else if (b3 == 511) {
                    this.k = 512;
                } else if (b3 == 836) {
                    this.k = 1024;
                } else if (b3 == 1075) {
                    j();
                    pq.e(i2);
                    return;
                } else if (i3 != 256) {
                    this.k = 256;
                    i2--;
                }
                c2 = i2;
            } else {
                this.p = (b2 & 8) >> 3;
                boolean z = true;
                if ((b2 & 1) != 0) {
                    z = false;
                }
                this.l = z;
                if (!this.m) {
                    g();
                } else {
                    i();
                }
                pq.e(i2);
                return;
            }
        }
        pq.e(c2);
    }

    public void a(C0498bn bnVar, d dVar) {
        dVar.a();
        this.f = dVar.b();
        this.g = bnVar.a(dVar.c(), 1);
        if (this.b) {
            dVar.a();
            this.h = bnVar.a(dVar.c(), 4);
            this.h.a(Format.a(dVar.b(), "application/id3", (String) null, -1, (DrmInitData) null));
            return;
        }
        this.h = new Zm();
    }

    public void a(long j2, int i2) {
        this.t = j2;
    }

    public void a(Pq pq) throws H {
        while (pq.a() > 0) {
            int i2 = this.i;
            if (i2 == 0) {
                c(pq);
            } else if (i2 == 1) {
                b(pq);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (a(pq, this.c.a, this.l ? 7 : 5)) {
                        d();
                    }
                } else if (i2 == 4) {
                    d(pq);
                } else {
                    throw new IllegalStateException();
                }
            } else if (a(pq, this.d.a, 10)) {
                e();
            }
        }
    }

    private boolean b(Pq pq, byte[] bArr, int i2) {
        if (pq.a() < i2) {
            return false;
        }
        pq.a(bArr, 0, i2);
        return true;
    }

    private boolean a(Pq pq, byte[] bArr, int i2) {
        int min = Math.min(pq.a(), i2 - this.j);
        pq.a(bArr, this.j, min);
        this.j += min;
        return this.j == i2;
    }

    private void d(Pq pq) {
        int min = Math.min(pq.a(), this.s - this.j);
        this.u.a(pq, min);
        this.j += min;
        int i2 = this.j;
        int i3 = this.s;
        if (i2 == i3) {
            this.u.a(this.t, 1, i3, 0, null);
            this.t += this.v;
            h();
        }
    }

    private void a(C1424jn jnVar, long j2, int i2, int i3) {
        this.i = 4;
        this.j = i2;
        this.u = jnVar;
        this.v = j2;
        this.s = i3;
    }

    private boolean a(Pq pq, int i2) {
        pq.e(i2 + 1);
        boolean z = true;
        if (!b(pq, this.c.a, 1)) {
            return false;
        }
        this.c.b(4);
        int a2 = this.c.a(1);
        int i3 = this.n;
        if (i3 != -1 && a2 != i3) {
            return false;
        }
        if (this.o != -1) {
            if (!b(pq, this.c.a, 1)) {
                return true;
            }
            this.c.b(2);
            if (this.c.a(4) != this.o) {
                return false;
            }
            pq.e(i2 + 2);
        }
        if (!b(pq, this.c.a, 4)) {
            return true;
        }
        this.c.b(14);
        int a3 = this.c.a(13);
        if (a3 <= 6) {
            return false;
        }
        int i4 = i2 + a3;
        int i5 = i4 + 1;
        if (i5 >= pq.d()) {
            return true;
        }
        byte[] bArr = pq.a;
        if (!a(bArr[i4], bArr[i5]) || !(this.n == -1 || ((pq.a[i5] & 8) >> 3) == a2)) {
            z = false;
        }
        return z;
    }

    private boolean a(byte b2, byte b3) {
        return a((int) ((b2 & 255) << 8) | (b3 & 255));
    }
}
