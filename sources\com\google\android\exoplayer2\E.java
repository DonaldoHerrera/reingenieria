package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.r.a;
import com.google.android.exoplayer2.source.x;
import com.google.android.exoplayer2.trackselection.l;
import com.google.android.exoplayer2.trackselection.m;
import com.google.android.exoplayer2.trackselection.o;
import com.google.android.exoplayer2.trackselection.p;

/* compiled from: MediaPeriodHolder */
final class E {
    public final q a;
    public final Object b;
    public final x[] c;
    public boolean d;
    public boolean e;
    public F f;
    private final boolean[] g;
    private final P[] h;
    private final o i;
    private final r j;
    private E k;
    private TrackGroupArray l;
    private p m;
    private long n;

    public E(P[] pArr, long j2, o oVar, Sp sp, r rVar, F f2) {
        this.h = pArr;
        long j3 = f2.b;
        this.n = j2 - j3;
        this.i = oVar;
        this.j = rVar;
        a aVar = f2.a;
        this.b = aVar.a;
        this.f = f2;
        this.c = new x[pArr.length];
        this.g = new boolean[pArr.length];
        this.a = a(aVar, rVar, sp, j3, f2.d);
    }

    private void j() {
        p pVar = this.m;
        if (l() && pVar != null) {
            for (int i2 = 0; i2 < pVar.a; i2++) {
                boolean a2 = pVar.a(i2);
                l a3 = pVar.c.a(i2);
                if (a2 && a3 != null) {
                    a3.d();
                }
            }
        }
    }

    private void k() {
        p pVar = this.m;
        if (l() && pVar != null) {
            for (int i2 = 0; i2 < pVar.a; i2++) {
                boolean a2 = pVar.a(i2);
                l a3 = pVar.c.a(i2);
                if (a2 && a3 != null) {
                    a3.e();
                }
            }
        }
    }

    private boolean l() {
        return this.k == null;
    }

    public long a() {
        if (!this.d) {
            return this.f.b;
        }
        long e2 = this.e ? this.a.e() : Long.MIN_VALUE;
        if (e2 == Long.MIN_VALUE) {
            e2 = this.f.e;
        }
        return e2;
    }

    public void b(long j2) {
        C1852xq.b(l());
        if (this.d) {
            this.a.c(c(j2));
        }
    }

    public long c(long j2) {
        return j2 - d();
    }

    public long d(long j2) {
        return j2 + d();
    }

    public long e() {
        return this.f.b + this.n;
    }

    public TrackGroupArray f() {
        TrackGroupArray trackGroupArray = this.l;
        C1852xq.a(trackGroupArray);
        return trackGroupArray;
    }

    public p g() {
        p pVar = this.m;
        C1852xq.a(pVar);
        return pVar;
    }

    public boolean h() {
        return this.d && (!this.e || this.a.e() == Long.MIN_VALUE);
    }

    public void i() {
        j();
        this.m = null;
        a(this.f.d, this.j, this.a);
    }

    public long c() {
        if (!this.d) {
            return 0;
        }
        return this.a.a();
    }

    public long d() {
        return this.n;
    }

    public p b(float f2, X x) throws C0618s {
        l[] a2;
        p a3 = this.i.a(this.h, f(), this.f.a, x);
        if (a3.a(this.m)) {
            return null;
        }
        for (l lVar : a3.c.a()) {
            if (lVar != null) {
                lVar.a(f2);
            }
        }
        return a3;
    }

    public void a(float f2, X x) throws C0618s {
        this.d = true;
        this.l = this.a.d();
        p b2 = b(f2, x);
        C1852xq.a(b2);
        long a2 = a(b2, this.f.b, false);
        long j2 = this.n;
        F f3 = this.f;
        this.n = j2 + (f3.b - a2);
        this.f = f3.b(a2);
    }

    public E b() {
        return this.k;
    }

    private void b(x[] xVarArr) {
        int i2 = 0;
        while (true) {
            P[] pArr = this.h;
            if (i2 < pArr.length) {
                if (pArr[i2].e() == 6) {
                    xVarArr[i2] = null;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void a(long j2) {
        C1852xq.b(l());
        this.a.b(c(j2));
    }

    public long a(p pVar, long j2, boolean z) {
        return a(pVar, j2, z, new boolean[this.h.length]);
    }

    public long a(p pVar, long j2, boolean z, boolean[] zArr) {
        p pVar2 = pVar;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= pVar2.a) {
                break;
            }
            boolean[] zArr2 = this.g;
            if (z || !pVar.a(this.m, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        b(this.c);
        j();
        this.m = pVar2;
        k();
        m mVar = pVar2.c;
        long a2 = this.a.a(mVar.a(), this.g, this.c, zArr, j2);
        a(this.c);
        this.e = false;
        int i3 = 0;
        while (true) {
            x[] xVarArr = this.c;
            if (i3 >= xVarArr.length) {
                return a2;
            }
            if (xVarArr[i3] != null) {
                C1852xq.b(pVar.a(i3));
                if (this.h[i3].e() != 6) {
                    this.e = true;
                }
            } else {
                C1852xq.b(mVar.a(i3) == null);
            }
            i3++;
        }
    }

    public void a(E e2) {
        if (e2 != this.k) {
            j();
            this.k = e2;
            k();
        }
    }

    private void a(x[] xVarArr) {
        p pVar = this.m;
        C1852xq.a(pVar);
        p pVar2 = pVar;
        int i2 = 0;
        while (true) {
            P[] pArr = this.h;
            if (i2 < pArr.length) {
                if (pArr[i2].e() == 6 && pVar2.a(i2)) {
                    xVarArr[i2] = new com.google.android.exoplayer2.source.m();
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private static q a(a aVar, r rVar, Sp sp, long j2, long j3) {
        q a2 = rVar.a(aVar, sp, j2);
        if (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) {
            return a2;
        }
        com.google.android.exoplayer2.source.l lVar = new com.google.android.exoplayer2.source.l(a2, true, 0, j3);
        return lVar;
    }

    private static void a(long j2, r rVar, q qVar) {
        if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
            rVar.a(qVar);
            return;
        }
        try {
            rVar.a(((com.google.android.exoplayer2.source.l) qVar).a);
        } catch (RuntimeException e2) {
            Iq.a("MediaPeriodHolder", "Period release failed.", e2);
        }
    }
}
