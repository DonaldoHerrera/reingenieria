package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.lb reason: case insensitive filesystem */
final class C0995lb implements Fc {
    private final C0989kb a;
    private int b;
    private int c;
    private int d = 0;

    private C0995lb(C0989kb kbVar) {
        Hb.a(kbVar, "input");
        this.a = kbVar;
        this.a.d = this;
    }

    public static C0995lb a(C0989kb kbVar) {
        C0995lb lbVar = kbVar.d;
        if (lbVar != null) {
            return lbVar;
        }
        return new C0995lb(kbVar);
    }

    public final int b() throws IOException {
        a(5);
        return this.a.i();
    }

    public final long c() throws IOException {
        a(1);
        return this.a.h();
    }

    public final int d() throws IOException {
        a(0);
        return this.a.g();
    }

    public final int e() throws IOException {
        a(0);
        return this.a.n();
    }

    public final int f() throws IOException {
        a(0);
        return this.a.m();
    }

    public final Ya g() throws IOException {
        a(2);
        return this.a.l();
    }

    public final int getTag() {
        return this.b;
    }

    public final String h() throws IOException {
        a(2);
        return this.a.k();
    }

    public final int i() throws IOException {
        a(0);
        return this.a.q();
    }

    public final long j() throws IOException {
        a(0);
        return this.a.r();
    }

    public final long k() throws IOException {
        a(1);
        return this.a.p();
    }

    public final int l() throws IOException {
        a(5);
        return this.a.o();
    }

    public final boolean m() throws IOException {
        if (!this.a.s()) {
            int i = this.b;
            if (i != this.c) {
                return this.a.b(i);
            }
        }
        return false;
    }

    public final long n() throws IOException {
        a(0);
        return this.a.f();
    }

    public final int o() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.d();
        }
        int i2 = this.b;
        return (i2 == 0 || i2 == this.c) ? BaseClientBuilder.API_PRIORITY_OTHER : i2 >>> 3;
    }

    public final long p() throws IOException {
        a(0);
        return this.a.e();
    }

    public final void q(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Jb) {
            Jb jb = (Jb) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    jb.c(this.a.q());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    jb.c(this.a.q());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.q()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw Rb.f();
            }
        }
    }

    public final double readDouble() throws IOException {
        a(1);
        return this.a.a();
    }

    public final float readFloat() throws IOException {
        a(5);
        return this.a.b();
    }

    public final String readString() throws IOException {
        a(2);
        return this.a.c();
    }

    private final void a(int i) throws IOException {
        if ((this.b & 7) != i) {
            throw Rb.f();
        }
    }

    private final <T> T c(Ec<T> ec, C1042tb tbVar) throws IOException {
        int m = this.a.m();
        C0989kb kbVar = this.a;
        if (kbVar.a < kbVar.b) {
            int d2 = kbVar.d(m);
            T newInstance = ec.newInstance();
            this.a.a++;
            ec.a(newInstance, this, tbVar);
            ec.b(newInstance);
            this.a.a(0);
            C0989kb kbVar2 = this.a;
            kbVar2.a--;
            kbVar2.e(d2);
            return newInstance;
        }
        throw Rb.g();
    }

    private final <T> T d(Ec<T> ec, C1042tb tbVar) throws IOException {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            T newInstance = ec.newInstance();
            ec.a(newInstance, this, tbVar);
            ec.b(newInstance);
            if (this.b == this.c) {
                return newInstance;
            }
            throw Rb.h();
        } finally {
            this.c = i;
        }
    }

    public final <T> T b(Ec<T> ec, C1042tb tbVar) throws IOException {
        a(2);
        return c(ec, tbVar);
    }

    public final void e(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Jb) {
            Jb jb = (Jb) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    jb.c(this.a.g());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    jb.c(this.a.g());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.g()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.g()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw Rb.f();
            }
        }
    }

    public final void f(List<Double> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C1019pb) {
            C1019pb pbVar = (C1019pb) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    pbVar.a(this.a.a());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else if (i == 2) {
                int m = this.a.m();
                b(m);
                int t = this.a.t() + m;
                do {
                    pbVar.a(this.a.a());
                } while (this.a.t() < t);
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.a.a()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else if (i2 == 2) {
                int m2 = this.a.m();
                b(m2);
                int t2 = this.a.t() + m2;
                do {
                    list.add(Double.valueOf(this.a.a()));
                } while (this.a.t() < t2);
            } else {
                throw Rb.f();
            }
        }
    }

    public final void g(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Jb) {
            Jb jb = (Jb) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    jb.c(this.a.n());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    jb.c(this.a.n());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.n()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw Rb.f();
            }
        }
    }

    public final void h(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Jb) {
            Jb jb = (Jb) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    jb.c(this.a.m());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    jb.c(this.a.m());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.m()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.m()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw Rb.f();
            }
        }
    }

    public final void i(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0950ec) {
            C0950ec ecVar = (C0950ec) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    ecVar.h(this.a.p());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else if (i == 2) {
                int m = this.a.m();
                b(m);
                int t = this.a.t() + m;
                do {
                    ecVar.h(this.a.p());
                } while (this.a.t() < t);
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.a.p()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else if (i2 == 2) {
                int m2 = this.a.m();
                b(m2);
                int t2 = this.a.t() + m2;
                do {
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.t() < t2);
            } else {
                throw Rb.f();
            }
        }
    }

    public final void j(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Jb) {
            Jb jb = (Jb) list;
            int i = this.b & 7;
            if (i == 2) {
                int m = this.a.m();
                c(m);
                int t = this.a.t() + m;
                do {
                    jb.c(this.a.o());
                } while (this.a.t() < t);
            } else if (i == 5) {
                do {
                    jb.c(this.a.o());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                int m2 = this.a.m();
                c(m2);
                int t2 = this.a.t() + m2;
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.o()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else {
                throw Rb.f();
            }
        }
    }

    public final void k(List<Boolean> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Wa) {
            Wa wa = (Wa) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    wa.a(this.a.j());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    wa.a(this.a.j());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.j()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Boolean.valueOf(this.a.j()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw Rb.f();
            }
        }
    }

    public final void l(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Jb) {
            Jb jb = (Jb) list;
            int i = this.b & 7;
            if (i == 2) {
                int m = this.a.m();
                c(m);
                int t = this.a.t() + m;
                do {
                    jb.c(this.a.i());
                } while (this.a.t() < t);
            } else if (i == 5) {
                do {
                    jb.c(this.a.i());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                int m2 = this.a.m();
                c(m2);
                int t2 = this.a.t() + m2;
                do {
                    list.add(Integer.valueOf(this.a.i()));
                } while (this.a.t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.i()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else {
                throw Rb.f();
            }
        }
    }

    public final void m(List<String> list) throws IOException {
        a(list, false);
    }

    public final void n(List<Ya> list) throws IOException {
        int d2;
        if ((this.b & 7) == 2) {
            do {
                list.add(g());
                if (!this.a.s()) {
                    d2 = this.a.d();
                } else {
                    return;
                }
            } while (d2 == this.b);
            this.d = d2;
            return;
        }
        throw Rb.f();
    }

    public final void p(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0950ec) {
            C0950ec ecVar = (C0950ec) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ecVar.h(this.a.r());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    ecVar.h(this.a.r());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.r()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Long.valueOf(this.a.r()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw Rb.f();
            }
        }
    }

    public final boolean a() throws IOException {
        a(0);
        return this.a.j();
    }

    public final void b(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0950ec) {
            C0950ec ecVar = (C0950ec) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ecVar.h(this.a.e());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    ecVar.h(this.a.e());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.e()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Long.valueOf(this.a.e()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw Rb.f();
            }
        }
    }

    public final void o(List<String> list) throws IOException {
        a(list, true);
    }

    public final <T> T a(Ec<T> ec, C1042tb tbVar) throws IOException {
        a(3);
        return d(ec, tbVar);
    }

    public final void a(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0950ec) {
            C0950ec ecVar = (C0950ec) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ecVar.h(this.a.f());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    ecVar.h(this.a.f());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.f()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Long.valueOf(this.a.f()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw Rb.f();
            }
        }
    }

    public final void d(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0950ec) {
            C0950ec ecVar = (C0950ec) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    ecVar.h(this.a.h());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else if (i == 2) {
                int m = this.a.m();
                b(m);
                int t = this.a.t() + m;
                do {
                    ecVar.h(this.a.h());
                } while (this.a.t() < t);
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.a.h()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else if (i2 == 2) {
                int m2 = this.a.m();
                b(m2);
                int t2 = this.a.t() + m2;
                do {
                    list.add(Long.valueOf(this.a.h()));
                } while (this.a.t() < t2);
            } else {
                throw Rb.f();
            }
        }
    }

    public final void c(List<Float> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Cb) {
            Cb cb = (Cb) list;
            int i = this.b & 7;
            if (i == 2) {
                int m = this.a.m();
                c(m);
                int t = this.a.t() + m;
                do {
                    cb.a(this.a.b());
                } while (this.a.t() < t);
            } else if (i == 5) {
                do {
                    cb.a(this.a.b());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else {
                throw Rb.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                int m2 = this.a.m();
                c(m2);
                int t2 = this.a.t() + m2;
                do {
                    list.add(Float.valueOf(this.a.b()));
                } while (this.a.t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.a.b()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.b);
                this.d = d2;
            } else {
                throw Rb.f();
            }
        }
    }

    public final <T> void b(List<T> list, Ec<T> ec, C1042tb tbVar) throws IOException {
        int d2;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(d(ec, tbVar));
                if (!this.a.s() && this.d == 0) {
                    d2 = this.a.d();
                } else {
                    return;
                }
            } while (d2 == i);
            this.d = d2;
            return;
        }
        throw Rb.f();
    }

    private final void a(List<String> list, boolean z) throws IOException {
        int d2;
        int d3;
        if ((this.b & 7) != 2) {
            throw Rb.f();
        } else if (!(list instanceof Yb) || z) {
            do {
                list.add(z ? h() : readString());
                if (!this.a.s()) {
                    d2 = this.a.d();
                } else {
                    return;
                }
            } while (d2 == this.b);
            this.d = d2;
        } else {
            Yb yb = (Yb) list;
            do {
                yb.a(g());
                if (!this.a.s()) {
                    d3 = this.a.d();
                } else {
                    return;
                }
            } while (d3 == this.b);
            this.d = d3;
        }
    }

    private static void b(int i) throws IOException {
        if ((i & 7) != 0) {
            throw Rb.h();
        }
    }

    private final void d(int i) throws IOException {
        if (this.a.t() != i) {
            throw Rb.a();
        }
    }

    private static void c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw Rb.h();
        }
    }

    public final <T> void a(List<T> list, Ec<T> ec, C1042tb tbVar) throws IOException {
        int d2;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                list.add(c(ec, tbVar));
                if (!this.a.s() && this.d == 0) {
                    d2 = this.a.d();
                } else {
                    return;
                }
            } while (d2 == i);
            this.d = d2;
            return;
        }
        throw Rb.f();
    }
}
