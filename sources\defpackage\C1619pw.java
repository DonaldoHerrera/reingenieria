package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;
import java.util.List;

/* renamed from: pw reason: default package and case insensitive filesystem */
final class C1619pw implements C1889yx {
    private final C1433jw a;
    private int b;
    private int c;
    private int d = 0;

    private C1619pw(C1433jw jwVar) {
        C0209Gw.a(jwVar, "input");
        this.a = jwVar;
        this.a.d = this;
    }

    public static C1619pw a(C1433jw jwVar) {
        C1619pw pwVar = jwVar.d;
        if (pwVar != null) {
            return pwVar;
        }
        return new C1619pw(jwVar);
    }

    public final int b() throws IOException {
        a(5);
        return this.a.i();
    }

    public final int c() throws IOException {
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

    public final long d() throws IOException {
        a(0);
        return this.a.f();
    }

    public final int e() throws IOException {
        a(0);
        return this.a.g();
    }

    public final C0289Zv f() throws IOException {
        a(2);
        return this.a.l();
    }

    public final int g() throws IOException {
        a(0);
        return this.a.m();
    }

    public final int getTag() {
        return this.b;
    }

    public final boolean h() throws IOException {
        a(0);
        return this.a.j();
    }

    public final String i() throws IOException {
        a(2);
        return this.a.k();
    }

    public final long j() throws IOException {
        a(1);
        return this.a.p();
    }

    public final int k() throws IOException {
        a(0);
        return this.a.q();
    }

    public final boolean l() throws IOException {
        if (!this.a.s()) {
            int i = this.b;
            if (i != this.c) {
                return this.a.e(i);
            }
        }
        return false;
    }

    public final int m() throws IOException {
        a(0);
        return this.a.n();
    }

    public final int n() throws IOException {
        a(5);
        return this.a.o();
    }

    public final long o() throws IOException {
        a(0);
        return this.a.e();
    }

    public final long p() throws IOException {
        a(0);
        return this.a.r();
    }

    public final void q(List<Float> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0194Bw) {
            C0194Bw bw = (C0194Bw) list;
            int i = this.b & 7;
            if (i == 2) {
                int m = this.a.m();
                c(m);
                int t = this.a.t() + m;
                do {
                    bw.a(this.a.b());
                } while (this.a.t() < t);
            } else if (i == 5) {
                do {
                    bw.a(this.a.b());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
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
            throw C0225Kw.f();
        }
    }

    private final <T> T d(C1859xx<T> xxVar, C1738tw twVar) throws IOException {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            T newInstance = xxVar.newInstance();
            xxVar.a(newInstance, this, twVar);
            xxVar.b(newInstance);
            if (this.b == this.c) {
                return newInstance;
            }
            throw C0225Kw.h();
        } finally {
            this.c = i;
        }
    }

    public final <T> T b(C1859xx<T> xxVar, C1738tw twVar) throws IOException {
        a(3);
        return d(xxVar, twVar);
    }

    public final void e(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0203Ew) {
            C0203Ew ew = (C0203Ew) list;
            int i = this.b & 7;
            if (i == 2) {
                int m = this.a.m();
                c(m);
                int t = this.a.t() + m;
                do {
                    ew.c(this.a.i());
                } while (this.a.t() < t);
            } else if (i == 5) {
                do {
                    ew.c(this.a.i());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    public final void f(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Yw) {
            Yw yw = (Yw) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    yw.a(this.a.e());
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
                    yw.a(this.a.e());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    public final void g(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Yw) {
            Yw yw = (Yw) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    yw.a(this.a.p());
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
                    yw.a(this.a.p());
                } while (this.a.t() < t);
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    public final void h(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0203Ew) {
            C0203Ew ew = (C0203Ew) list;
            int i = this.b & 7;
            if (i == 2) {
                int m = this.a.m();
                c(m);
                int t = this.a.t() + m;
                do {
                    ew.c(this.a.o());
                } while (this.a.t() < t);
            } else if (i == 5) {
                do {
                    ew.c(this.a.o());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.b);
                this.d = d3;
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    public final void i(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Yw) {
            Yw yw = (Yw) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    yw.a(this.a.r());
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
                    yw.a(this.a.r());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    public final void j(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0203Ew) {
            C0203Ew ew = (C0203Ew) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ew.c(this.a.q());
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
                    ew.c(this.a.q());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    public final void k(List<C0289Zv> list) throws IOException {
        int d2;
        if ((this.b & 7) == 2) {
            do {
                list.add(f());
                if (!this.a.s()) {
                    d2 = this.a.d();
                } else {
                    return;
                }
            } while (d2 == this.b);
            this.d = d2;
            return;
        }
        throw C0225Kw.f();
    }

    public final void l(List<String> list) throws IOException {
        a(list, true);
    }

    public final void m(List<String> list) throws IOException {
        a(list, false);
    }

    public final void n(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0203Ew) {
            C0203Ew ew = (C0203Ew) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ew.c(this.a.n());
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
                    ew.c(this.a.n());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    public final void o(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0203Ew) {
            C0203Ew ew = (C0203Ew) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ew.c(this.a.m());
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
                    ew.c(this.a.m());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    public final void p(List<Double> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C1649qw) {
            C1649qw qwVar = (C1649qw) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    qwVar.a(this.a.a());
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
                    qwVar.a(this.a.a());
                } while (this.a.t() < t);
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    public final long a() throws IOException {
        a(1);
        return this.a.h();
    }

    public final void b(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0203Ew) {
            C0203Ew ew = (C0203Ew) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ew.c(this.a.g());
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
                    ew.c(this.a.g());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    private final <T> T c(C1859xx<T> xxVar, C1738tw twVar) throws IOException {
        int m = this.a.m();
        C1433jw jwVar = this.a;
        if (jwVar.a < jwVar.b) {
            int a2 = jwVar.a(m);
            T newInstance = xxVar.newInstance();
            this.a.a++;
            xxVar.a(newInstance, this, twVar);
            xxVar.b(newInstance);
            this.a.d(0);
            C1433jw jwVar2 = this.a;
            jwVar2.a--;
            jwVar2.b(a2);
            return newInstance;
        }
        throw new C0225Kw("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final <T> T a(C1859xx<T> xxVar, C1738tw twVar) throws IOException {
        a(2);
        return c(xxVar, twVar);
    }

    public final void a(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Yw) {
            Yw yw = (Yw) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    yw.a(this.a.h());
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
                    yw.a(this.a.h());
                } while (this.a.t() < t);
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    public final void d(List<Boolean> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof C0280Xv) {
            C0280Xv xv = (C0280Xv) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    xv.a(this.a.j());
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
                    xv.a(this.a.j());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    public final void c(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof Yw) {
            Yw yw = (Yw) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    yw.a(this.a.f());
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
                    yw.a(this.a.f());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw C0225Kw.f();
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
                throw C0225Kw.f();
            }
        }
    }

    public final <T> void b(List<T> list, C1859xx<T> xxVar, C1738tw twVar) throws IOException {
        int d2;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                list.add(c(xxVar, twVar));
                if (!this.a.s() && this.d == 0) {
                    d2 = this.a.d();
                } else {
                    return;
                }
            } while (d2 == i);
            this.d = d2;
            return;
        }
        throw C0225Kw.f();
    }

    private final void a(List<String> list, boolean z) throws IOException {
        int d2;
        int d3;
        if ((this.b & 7) != 2) {
            throw C0225Kw.f();
        } else if (!(list instanceof C0249Qw) || z) {
            do {
                list.add(z ? i() : readString());
                if (!this.a.s()) {
                    d2 = this.a.d();
                } else {
                    return;
                }
            } while (d2 == this.b);
            this.d = d2;
        } else {
            C0249Qw qw = (C0249Qw) list;
            do {
                qw.a(f());
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
            throw C0225Kw.h();
        }
    }

    private final void d(int i) throws IOException {
        if (this.a.t() != i) {
            throw C0225Kw.a();
        }
    }

    private static void c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C0225Kw.h();
        }
    }

    public final <T> void a(List<T> list, C1859xx<T> xxVar, C1738tw twVar) throws IOException {
        int d2;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(d(xxVar, twVar));
                if (!this.a.s() && this.d == 0) {
                    d2 = this.a.d();
                } else {
                    return;
                }
            } while (d2 == i);
            this.d = d2;
            return;
        }
        throw C0225Kw.f();
    }
}
