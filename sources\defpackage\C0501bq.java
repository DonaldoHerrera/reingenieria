package defpackage;

import java.util.Arrays;

/* renamed from: bq reason: default package and case insensitive filesystem */
/* compiled from: DefaultAllocator */
public final class C0501bq implements Sp {
    private final boolean a;
    private final int b;
    private final byte[] c;
    private final Rp[] d;
    private int e;
    private int f;
    private int g;
    private Rp[] h;

    public C0501bq(boolean z, int i) {
        this(z, i, 0);
    }

    public synchronized void a(int i) {
        boolean z = i < this.e;
        this.e = i;
        if (z) {
            b();
        }
    }

    public synchronized void b() {
        int i = 0;
        int max = Math.max(0, C0471ar.a(this.e, this.b) - this.f);
        if (max < this.g) {
            if (this.c != null) {
                int i2 = this.g - 1;
                while (i <= i2) {
                    Rp rp = this.h[i];
                    if (rp.a == this.c) {
                        i++;
                    } else {
                        Rp rp2 = this.h[i2];
                        if (rp2.a != this.c) {
                            i2--;
                        } else {
                            int i3 = i + 1;
                            this.h[i] = rp2;
                            int i4 = i2 - 1;
                            this.h[i2] = rp;
                            i2 = i4;
                            i = i3;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.g) {
                    return;
                }
            }
            Arrays.fill(this.h, max, this.g, null);
            this.g = max;
        }
    }

    public int c() {
        return this.b;
    }

    public synchronized int d() {
        return this.f * this.b;
    }

    public synchronized void e() {
        if (this.a) {
            a(0);
        }
    }

    public C0501bq(boolean z, int i, int i2) {
        C1852xq.a(i > 0);
        C1852xq.a(i2 >= 0);
        this.a = z;
        this.b = i;
        this.g = i2;
        this.h = new Rp[(i2 + 100)];
        if (i2 > 0) {
            this.c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.h[i3] = new Rp(this.c, i3 * i);
            }
        } else {
            this.c = null;
        }
        this.d = new Rp[1];
    }

    public synchronized Rp a() {
        Rp rp;
        this.f++;
        if (this.g > 0) {
            Rp[] rpArr = this.h;
            int i = this.g - 1;
            this.g = i;
            rp = rpArr[i];
            this.h[this.g] = null;
        } else {
            rp = new Rp(new byte[this.b], 0);
        }
        return rp;
    }

    public synchronized void a(Rp rp) {
        this.d[0] = rp;
        a(this.d);
    }

    public synchronized void a(Rp[] rpArr) {
        if (this.g + rpArr.length >= this.h.length) {
            this.h = (Rp[]) Arrays.copyOf(this.h, Math.max(this.h.length * 2, this.g + rpArr.length));
        }
        for (Rp rp : rpArr) {
            Rp[] rpArr2 = this.h;
            int i = this.g;
            this.g = i + 1;
            rpArr2[i] = rp;
        }
        this.f -= rpArr.length;
        notifyAll();
    }
}
