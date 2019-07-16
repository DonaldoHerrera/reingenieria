package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.B;
import com.google.android.exoplayer2.Format;

/* compiled from: SampleMetadataQueue */
final class v {
    private int a = 1000;
    private int[] b;
    private long[] c;
    private int[] d;
    private int[] e;
    private long[] f;
    private defpackage.C1424jn.a[] g;
    private Format[] h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;
    private boolean q;
    private Format r;
    private int s;

    /* compiled from: SampleMetadataQueue */
    public static final class a {
        public int a;
        public long b;
        public defpackage.C1424jn.a c;
    }

    public v() {
        int i2 = this.a;
        this.b = new int[i2];
        this.c = new long[i2];
        this.f = new long[i2];
        this.e = new int[i2];
        this.d = new int[i2];
        this.g = new defpackage.C1424jn.a[i2];
        this.h = new Format[i2];
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
        this.q = true;
        this.p = true;
    }

    public void a(boolean z) {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.p = true;
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
        this.o = false;
        if (z) {
            this.r = null;
            this.q = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        return -1;
     */
    public synchronized long b(long j2, boolean z, boolean z2) {
        if (this.i != 0) {
            if (j2 >= this.f[this.k]) {
                int a2 = a(this.k, (!z2 || this.l == this.i) ? this.i : this.l + 1, j2, z);
                if (a2 == -1) {
                    return -1;
                }
                return b(a2);
            }
        }
    }

    public synchronized long c() {
        return this.n;
    }

    public int d() {
        return this.j + this.l;
    }

    public synchronized Format e() {
        return this.q ? null : this.r;
    }

    public int f() {
        return this.j + this.i;
    }

    public synchronized boolean g() {
        return this.l != this.i;
    }

    public synchronized boolean h() {
        return this.o;
    }

    public synchronized void i() {
        this.l = 0;
    }

    private long c(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int d2 = d(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.f[d2]);
            if ((this.e[d2] & 1) != 0) {
                break;
            }
            d2--;
            if (d2 == -1) {
                d2 = this.a - 1;
            }
        }
        return j2;
    }

    private int d(int i2) {
        int i3 = this.k + i2;
        int i4 = this.a;
        return i3 < i4 ? i3 : i3 - i4;
    }

    public synchronized long b() {
        if (this.i == 0) {
            return -1;
        }
        return b(this.i);
    }

    private long b(int i2) {
        this.m = Math.max(this.m, c(i2));
        this.i -= i2;
        this.j += i2;
        this.k += i2;
        int i3 = this.k;
        int i4 = this.a;
        if (i3 >= i4) {
            this.k = i3 - i4;
        }
        this.l -= i2;
        if (this.l < 0) {
            this.l = 0;
        }
        if (this.i != 0) {
            return this.c[this.k];
        }
        int i5 = this.k;
        if (i5 == 0) {
            i5 = this.a;
        }
        int i6 = i5 - 1;
        return this.c[i6] + ((long) this.d[i6]);
    }

    public long a(int i2) {
        int f2 = f() - i2;
        boolean z = false;
        C1852xq.a(f2 >= 0 && f2 <= this.i - this.l);
        this.i -= f2;
        this.n = Math.max(this.m, c(this.i));
        if (f2 == 0 && this.o) {
            z = true;
        }
        this.o = z;
        int i3 = this.i;
        if (i3 == 0) {
            return 0;
        }
        int d2 = d(i3 - 1);
        return this.c[d2] + ((long) this.d[d2]);
    }

    public synchronized int a(B b2, Qm qm, boolean z, boolean z2, Format format, a aVar) {
        if (!g()) {
            if (!z2) {
                if (!this.o) {
                    if (this.r == null || (!z && this.r == format)) {
                        return -3;
                    }
                    b2.a = this.r;
                    return -5;
                }
            }
            qm.e(4);
            return -4;
        }
        int d2 = d(this.l);
        if (!z) {
            if (this.h[d2] == format) {
                qm.e(this.e[d2]);
                qm.d = this.f[d2];
                if (qm.u()) {
                    return -4;
                }
                aVar.a = this.d[d2];
                aVar.b = this.c[d2];
                aVar.c = this.g[d2];
                this.l++;
                return -4;
            }
        }
        b2.a = this.h[d2];
        return -5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        return -1;
     */
    public synchronized int a(long j2, boolean z, boolean z2) {
        int d2 = d(this.l);
        if (g() && j2 >= this.f[d2]) {
            if (j2 <= this.n || z2) {
                int a2 = a(d2, this.i - this.l, j2, z);
                if (a2 == -1) {
                    return -1;
                }
                this.l += a2;
                return a2;
            }
        }
    }

    public synchronized int a() {
        int i2;
        i2 = this.i - this.l;
        this.l = this.i;
        return i2;
    }

    public synchronized boolean a(Format format) {
        if (format == null) {
            this.q = true;
            return false;
        }
        this.q = false;
        if (C0471ar.a((Object) format, (Object) this.r)) {
            return false;
        }
        this.r = format;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e0, code lost:
        return;
     */
    public synchronized void a(long j2, int i2, long j3, int i3, defpackage.C1424jn.a aVar) {
        if (this.p) {
            if ((i2 & 1) != 0) {
                this.p = false;
            } else {
                return;
            }
        }
        C1852xq.b(!this.q);
        this.o = (536870912 & i2) != 0;
        this.n = Math.max(this.n, j2);
        int d2 = d(this.i);
        this.f[d2] = j2;
        this.c[d2] = j3;
        this.d[d2] = i3;
        this.e[d2] = i2;
        this.g[d2] = aVar;
        this.h[d2] = this.r;
        this.b[d2] = this.s;
        this.i++;
        if (this.i == this.a) {
            int i4 = this.a + 1000;
            int[] iArr = new int[i4];
            long[] jArr = new long[i4];
            long[] jArr2 = new long[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            defpackage.C1424jn.a[] aVarArr = new defpackage.C1424jn.a[i4];
            Format[] formatArr = new Format[i4];
            int i5 = this.a - this.k;
            System.arraycopy(this.c, this.k, jArr, 0, i5);
            System.arraycopy(this.f, this.k, jArr2, 0, i5);
            System.arraycopy(this.e, this.k, iArr2, 0, i5);
            System.arraycopy(this.d, this.k, iArr3, 0, i5);
            System.arraycopy(this.g, this.k, aVarArr, 0, i5);
            System.arraycopy(this.h, this.k, formatArr, 0, i5);
            System.arraycopy(this.b, this.k, iArr, 0, i5);
            int i6 = this.k;
            System.arraycopy(this.c, 0, jArr, i5, i6);
            System.arraycopy(this.f, 0, jArr2, i5, i6);
            System.arraycopy(this.e, 0, iArr2, i5, i6);
            System.arraycopy(this.d, 0, iArr3, i5, i6);
            System.arraycopy(this.g, 0, aVarArr, i5, i6);
            System.arraycopy(this.h, 0, formatArr, i5, i6);
            System.arraycopy(this.b, 0, iArr, i5, i6);
            this.c = jArr;
            this.f = jArr2;
            this.e = iArr2;
            this.d = iArr3;
            this.g = aVarArr;
            this.h = formatArr;
            this.b = iArr;
            this.k = 0;
            this.i = this.a;
            this.a = i4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return r1;
     */
    public synchronized boolean a(long j2) {
        boolean z = false;
        if (this.i == 0) {
            if (j2 > this.m) {
                z = true;
            }
        } else if (Math.max(this.m, c(this.l)) >= j2) {
            return false;
        } else {
            int i2 = this.i;
            int d2 = d(this.i - 1);
            while (i2 > this.l && this.f[d2] >= j2) {
                i2--;
                d2--;
                if (d2 == -1) {
                    d2 = this.a - 1;
                }
            }
            a(this.j + i2);
            return true;
        }
    }

    private int a(int i2, int i3, long j2, boolean z) {
        int i4 = i2;
        int i5 = -1;
        for (int i6 = 0; i6 < i3 && this.f[i4] <= j2; i6++) {
            if (!z || (this.e[i4] & 1) != 0) {
                i5 = i6;
            }
            i4++;
            if (i4 == this.a) {
                i4 = 0;
            }
        }
        return i5;
    }
}
