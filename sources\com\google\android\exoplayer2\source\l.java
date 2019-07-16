package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.B;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.T;
import java.io.IOException;

/* compiled from: ClippingMediaPeriod */
public final class l implements q, com.google.android.exoplayer2.source.q.a {
    public final q a;
    private com.google.android.exoplayer2.source.q.a b;
    private a[] c = new a[0];
    private long d;
    long e;
    long f;

    /* compiled from: ClippingMediaPeriod */
    private final class a implements x {
        public final x a;
        private boolean b;

        public a(x xVar) {
            this.a = xVar;
        }

        public void a() throws IOException {
            this.a.a();
        }

        public boolean b() {
            return !l.this.f() && this.a.b();
        }

        public void c() {
            this.b = false;
        }

        public int a(B b2, Qm qm, boolean z) {
            if (l.this.f()) {
                return -3;
            }
            if (this.b) {
                qm.e(4);
                return -4;
            }
            int a2 = this.a.a(b2, qm, z);
            if (a2 == -5) {
                Format format = b2.a;
                if (!(format.y == 0 && format.z == 0)) {
                    int i = 0;
                    int i2 = l.this.e != 0 ? 0 : format.y;
                    if (l.this.f == Long.MIN_VALUE) {
                        i = format.z;
                    }
                    b2.a = format.a(i2, i);
                }
                return -5;
            }
            long j = l.this.f;
            if (j == Long.MIN_VALUE || ((a2 != -4 || qm.d < j) && (a2 != -3 || l.this.e() != Long.MIN_VALUE))) {
                return a2;
            }
            qm.b();
            qm.e(4);
            this.b = true;
            return -4;
        }

        public int a(long j) {
            if (l.this.f()) {
                return -3;
            }
            return this.a.a(j);
        }
    }

    public l(q qVar, boolean z, long j, long j2) {
        this.a = qVar;
        this.d = z ? j : -9223372036854775807L;
        this.e = j;
        this.f = j2;
    }

    public long b() {
        if (f()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long b2 = b();
            if (b2 != -9223372036854775807L) {
                j = b2;
            }
            return j;
        }
        long b3 = this.a.b();
        if (b3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C1852xq.b(b3 >= this.e);
        long j2 = this.f;
        if (j2 != Long.MIN_VALUE && b3 > j2) {
            z = false;
        }
        C1852xq.b(z);
        return b3;
    }

    public void c() throws IOException {
        this.a.c();
    }

    public TrackGroupArray d() {
        return this.a.d();
    }

    public long e() {
        long e2 = this.a.e();
        if (e2 != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || e2 < j) {
                return e2;
            }
        }
        return Long.MIN_VALUE;
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return this.d != -9223372036854775807L;
    }

    public void a(com.google.android.exoplayer2.source.q.a aVar, long j) {
        this.b = aVar;
        this.a.a((com.google.android.exoplayer2.source.q.a) this, j);
    }

    public void c(long j) {
        this.a.c(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r2 > r4) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    public long a(com.google.android.exoplayer2.trackselection.l[] lVarArr, boolean[] zArr, x[] xVarArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        x[] xVarArr2 = xVarArr;
        this.c = new a[xVarArr2.length];
        x[] xVarArr3 = new x[xVarArr2.length];
        int i = 0;
        while (true) {
            x xVar = null;
            if (i >= xVarArr2.length) {
                break;
            }
            a[] aVarArr = this.c;
            aVarArr[i] = (a) xVarArr2[i];
            if (aVarArr[i] != null) {
                xVar = aVarArr[i].a;
            }
            xVarArr3[i] = xVar;
            i++;
        }
        long a2 = this.a.a(lVarArr, zArr, xVarArr3, zArr2, j);
        if (f()) {
            long j3 = this.e;
            if (j == j3) {
                com.google.android.exoplayer2.trackselection.l[] lVarArr2 = lVarArr;
                if (a(j3, lVarArr)) {
                    j2 = a2;
                    this.d = j2;
                    if (a2 != j) {
                        if (a2 >= this.e) {
                            long j4 = this.f;
                            if (j4 != Long.MIN_VALUE) {
                            }
                        }
                        z = false;
                        C1852xq.b(z);
                        for (int i2 = 0; i2 < xVarArr2.length; i2++) {
                            if (xVarArr3[i2] == null) {
                                this.c[i2] = null;
                            } else if (xVarArr2[i2] == null || this.c[i2].a != xVarArr3[i2]) {
                                this.c[i2] = new a(xVarArr3[i2]);
                            }
                            xVarArr2[i2] = this.c[i2];
                        }
                        return a2;
                    }
                    z = true;
                    C1852xq.b(z);
                    while (i2 < xVarArr2.length) {
                    }
                    return a2;
                }
            }
        }
        j2 = -9223372036854775807L;
        this.d = j2;
        if (a2 != j) {
        }
        z = true;
        C1852xq.b(z);
        while (i2 < xVarArr2.length) {
        }
        return a2;
    }

    public boolean b(long j) {
        return this.a.b(j);
    }

    /* renamed from: b */
    public void a(q qVar) {
        this.b.a(this);
    }

    private T b(long j, T t) {
        long b2 = C0471ar.b(t.f, 0, j - this.e);
        long j2 = t.g;
        long j3 = this.f;
        long b3 = C0471ar.b(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (b2 == t.f && b3 == t.g) {
            return t;
        }
        return new T(b2, b3);
    }

    public void a(long j, boolean z) {
        this.a.a(j, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r7) goto L_0x0035;
     */
    public long a(long j) {
        a[] aVarArr;
        this.d = -9223372036854775807L;
        boolean z = false;
        for (a aVar : this.c) {
            if (aVar != null) {
                aVar.c();
            }
        }
        long a2 = this.a.a(j);
        if (a2 != j) {
            if (a2 >= this.e) {
                long j2 = this.f;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            C1852xq.b(z);
            return a2;
        }
        z = true;
        C1852xq.b(z);
        return a2;
    }

    public long a(long j, T t) {
        long j2 = this.e;
        if (j == j2) {
            return j2;
        }
        return this.a.a(j, b(j, t));
    }

    public long a() {
        long a2 = this.a.a();
        if (a2 != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || a2 < j) {
                return a2;
            }
        }
        return Long.MIN_VALUE;
    }

    public void a(q qVar) {
        this.b.a(this);
    }

    private static boolean a(long j, com.google.android.exoplayer2.trackselection.l[] lVarArr) {
        if (j != 0) {
            for (com.google.android.exoplayer2.trackselection.l lVar : lVarArr) {
                if (lVar != null && !Lq.d(lVar.f().i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
