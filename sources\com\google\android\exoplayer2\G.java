package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.X.a;
import com.google.android.exoplayer2.X.b;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.trackselection.o;

/* compiled from: MediaPeriodQueue */
final class G {
    private final a a = new a();
    private final b b = new b();
    private long c;
    private X d = X.a;
    private int e;
    private boolean f;
    private E g;
    private E h;
    private E i;
    private int j;
    private Object k;
    private long l;

    private boolean b(long j2, long j3) {
        return j2 == -9223372036854775807L || j2 == j3;
    }

    private boolean i() {
        E c2 = c();
        boolean z = true;
        if (c2 == null) {
            return true;
        }
        int a2 = this.d.a(c2.b);
        while (true) {
            a2 = this.d.a(a2, this.a, this.b, this.e, this.f);
            while (c2.b() != null && !c2.f.f) {
                c2 = c2.b();
            }
            E b2 = c2.b();
            if (a2 == -1 || b2 == null || this.d.a(b2.b) != a2) {
                boolean a3 = a(c2);
                c2.f = a(c2.f);
            } else {
                c2 = b2;
            }
        }
        boolean a32 = a(c2);
        c2.f = a(c2.f);
        if (a32 && g()) {
            z = false;
        }
        return z;
    }

    public void a(X x) {
        this.d = x;
    }

    public boolean b(boolean z) {
        this.f = z;
        return i();
    }

    public E c() {
        return g() ? this.g : this.i;
    }

    public E d() {
        return this.i;
    }

    public E e() {
        return this.g;
    }

    public E f() {
        return this.h;
    }

    public boolean g() {
        return this.g != null;
    }

    public boolean h() {
        E e2 = this.i;
        return e2 == null || (!e2.f.g && e2.h() && this.i.f.e != -9223372036854775807L && this.j < 100);
    }

    public boolean a(int i2) {
        this.e = i2;
        return i();
    }

    public E b() {
        E e2 = this.h;
        C1852xq.b((e2 == null || e2.b() == null) ? false : true);
        this.h = this.h.b();
        return this.h;
    }

    public boolean a(q qVar) {
        E e2 = this.i;
        return e2 != null && e2.a == qVar;
    }

    public void a(long j2) {
        E e2 = this.i;
        if (e2 != null) {
            e2.b(j2);
        }
    }

    private r.a b(Object obj, long j2, long j3) {
        this.d.a(obj, this.a);
        int b2 = this.a.b(j2);
        if (b2 == -1) {
            return new r.a(obj, j3, this.a.a(j2));
        }
        r.a aVar = new r.a(obj, b2, this.a.c(b2), j3);
        return aVar;
    }

    public F a(long j2, I i2) {
        E e2 = this.i;
        if (e2 == null) {
            return a(i2);
        }
        return a(e2, j2);
    }

    public q a(P[] pArr, o oVar, Sp sp, r rVar, F f2) {
        long j2;
        E e2 = this.i;
        if (e2 == null) {
            j2 = f2.b;
        } else {
            j2 = e2.d() + this.i.f.e;
        }
        E e3 = new E(pArr, j2, oVar, sp, rVar, f2);
        if (this.i != null) {
            C1852xq.b(g());
            this.i.a(e3);
        }
        this.k = null;
        this.i = e3;
        this.j++;
        return e3.a;
    }

    public E a() {
        E e2 = this.g;
        if (e2 != null) {
            if (e2 == this.h) {
                this.h = e2.b();
            }
            this.g.i();
            this.j--;
            if (this.j == 0) {
                this.i = null;
                E e3 = this.g;
                this.k = e3.b;
                this.l = e3.f.a.d;
            }
            this.g = this.g.b();
        } else {
            E e4 = this.i;
            this.g = e4;
            this.h = e4;
        }
        return this.g;
    }

    public boolean a(E e2) {
        boolean z = false;
        C1852xq.b(e2 != null);
        this.i = e2;
        while (e2.b() != null) {
            e2 = e2.b();
            if (e2 == this.h) {
                this.h = this.g;
                z = true;
            }
            e2.i();
            this.j--;
        }
        this.i.a((E) null);
        return z;
    }

    public void a(boolean z) {
        E c2 = c();
        if (c2 != null) {
            this.k = z ? c2.b : null;
            this.l = c2.f.a.d;
            c2.i();
            a(c2);
        } else if (!z) {
            this.k = null;
        }
        this.g = null;
        this.i = null;
        this.h = null;
        this.j = 0;
    }

    public boolean a(long j2, long j3) {
        F f2;
        long j4;
        E c2 = c();
        E e2 = null;
        while (true) {
            E e3 = e2;
            e2 = c2;
            E e4 = e3;
            boolean z = true;
            if (e2 == null) {
                return true;
            }
            F f3 = e2.f;
            if (e4 == null) {
                f2 = a(f3);
            } else {
                F a2 = a(e4, j2);
                if (a2 == null) {
                    return !a(e4);
                }
                if (!a(f3, a2)) {
                    return !a(e4);
                }
                f2 = a2;
            }
            e2.f = f2.a(f3.c);
            if (!b(f3.e, f2.e)) {
                long j5 = f2.e;
                if (j5 == -9223372036854775807L) {
                    j4 = Long.MAX_VALUE;
                } else {
                    j4 = e2.d(j5);
                }
                boolean z2 = e2 == this.h && (j3 == Long.MIN_VALUE || j3 >= j4);
                if (a(e2) || z2) {
                    z = false;
                }
                return z;
            }
            c2 = e2.b();
        }
    }

    public F a(F f2) {
        long j2;
        r.a aVar = f2.a;
        boolean a2 = a(aVar);
        boolean a3 = a(aVar, a2);
        this.d.a(f2.a.a, this.a);
        if (aVar.a()) {
            j2 = this.a.a(aVar.b, aVar.c);
        } else {
            j2 = f2.d;
            if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
                j2 = this.a.c();
            }
        }
        F f3 = new F(aVar, f2.b, f2.c, f2.d, j2, a2, a3);
        return f3;
    }

    public r.a a(Object obj, long j2) {
        return b(obj, j2, a(obj));
    }

    private long a(Object obj) {
        int i2 = this.d.a(obj, this.a).c;
        Object obj2 = this.k;
        if (obj2 != null) {
            int a2 = this.d.a(obj2);
            if (a2 != -1 && this.d.a(a2, this.a).c == i2) {
                return this.l;
            }
        }
        for (E c2 = c(); c2 != null; c2 = c2.b()) {
            if (c2.b.equals(obj)) {
                return c2.f.a.d;
            }
        }
        for (E c3 = c(); c3 != null; c3 = c3.b()) {
            int a3 = this.d.a(c3.b);
            if (a3 != -1 && this.d.a(a3, this.a).c == i2) {
                return c3.f.a.d;
            }
        }
        long j2 = this.c;
        this.c = 1 + j2;
        return j2;
    }

    private boolean a(F f2, F f3) {
        return f2.b == f3.b && f2.a.equals(f3.a);
    }

    private F a(I i2) {
        return a(i2.d, i2.f, i2.e);
    }

    private F a(E e2, long j2) {
        long j3;
        long j4;
        Object obj;
        long j5;
        F f2 = e2.f;
        long d2 = (e2.d() + f2.e) - j2;
        long j6 = 0;
        F f3 = null;
        if (f2.f) {
            int a2 = this.d.a(f2.a.a);
            int a3 = this.d.a(a2, this.a, this.b, this.e, this.f);
            if (a3 == -1) {
                return null;
            }
            int i2 = this.d.a(a3, this.a, true).c;
            Object obj2 = this.a.b;
            long j7 = f2.a.d;
            if (this.d.a(i2, this.b).f == a3) {
                Pair a4 = this.d.a(this.b, this.a, i2, -9223372036854775807L, Math.max(0, d2));
                if (a4 == null) {
                    return null;
                }
                Object obj3 = a4.first;
                long longValue = ((Long) a4.second).longValue();
                E b2 = e2.b();
                if (b2 == null || !b2.b.equals(obj3)) {
                    j5 = this.c;
                    this.c = 1 + j5;
                } else {
                    j5 = b2.f.a.d;
                }
                j6 = longValue;
                j4 = j5;
                obj = obj3;
            } else {
                obj = obj2;
                j4 = j7;
            }
            long j8 = j6;
            return a(b(obj, j8, j4), j8, j6);
        }
        r.a aVar = f2.a;
        this.d.a(aVar.a, this.a);
        if (aVar.a()) {
            int i3 = aVar.b;
            int a5 = this.a.a(i3);
            if (a5 == -1) {
                return null;
            }
            int b3 = this.a.b(i3, aVar.c);
            if (b3 < a5) {
                if (this.a.c(i3, b3)) {
                    f3 = a(aVar.a, i3, b3, f2.c, aVar.d);
                }
                return f3;
            }
            long j9 = f2.c;
            if (this.a.a() == 1 && this.a.b(0) == 0) {
                X x = this.d;
                b bVar = this.b;
                a aVar2 = this.a;
                Pair a6 = x.a(bVar, aVar2, aVar2.c, -9223372036854775807L, Math.max(0, d2));
                if (a6 == null) {
                    return null;
                }
                j3 = ((Long) a6.second).longValue();
            } else {
                j3 = j9;
            }
            return a(aVar.a, j3, aVar.d);
        }
        int b4 = this.a.b(f2.d);
        if (b4 == -1) {
            return a(aVar.a, f2.e, aVar.d);
        }
        int c2 = this.a.c(b4);
        if (this.a.c(b4, c2)) {
            f3 = a(aVar.a, b4, c2, f2.e, aVar.d);
        }
        return f3;
    }

    private F a(r.a aVar, long j2, long j3) {
        this.d.a(aVar.a, this.a);
        if (!aVar.a()) {
            return a(aVar.a, j3, aVar.d);
        } else if (!this.a.c(aVar.b, aVar.c)) {
            return null;
        } else {
            return a(aVar.a, aVar.b, aVar.c, j2, aVar.d);
        }
    }

    private F a(Object obj, int i2, int i3, long j2, long j3) {
        r.a aVar = new r.a(obj, i2, i3, j3);
        F f2 = new F(aVar, i3 == this.a.c(i2) ? this.a.b() : 0, j2, -9223372036854775807L, this.d.a(aVar.a, this.a).a(aVar.b, aVar.c), false, false);
        return f2;
    }

    private F a(Object obj, long j2, long j3) {
        long j4;
        int a2 = this.a.a(j2);
        Object obj2 = obj;
        r.a aVar = new r.a(obj, j3, a2);
        boolean a3 = a(aVar);
        boolean a4 = a(aVar, a3);
        long b2 = a2 != -1 ? this.a.b(a2) : -9223372036854775807L;
        if (b2 == -9223372036854775807L || b2 == Long.MIN_VALUE) {
            j4 = this.a.d;
        } else {
            j4 = b2;
        }
        F f2 = new F(aVar, j2, -9223372036854775807L, b2, j4, a3, a4);
        return f2;
    }

    private boolean a(r.a aVar) {
        return !aVar.a() && aVar.e == -1;
    }

    private boolean a(r.a aVar, boolean z) {
        int a2 = this.d.a(aVar.a);
        return !this.d.a(this.d.a(a2, this.a).c, this.b).e && this.d.b(a2, this.a, this.b, this.e, this.f) && z;
    }
}
