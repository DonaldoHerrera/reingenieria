package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: _lb reason: default package */
/* compiled from: ProtoBuf */
public final class _lb extends defpackage.Mnb.c<_lb> implements C6391emb {
    private static final _lb c = new _lb(true);
    public static Ynb<_lb> d = new Ylb();
    /* access modifiers changed from: private */
    public final Fnb e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public List<a> g;
    /* access modifiers changed from: private */
    public boolean h;
    /* access modifiers changed from: private */
    public int i;
    /* access modifiers changed from: private */
    public _lb j;
    /* access modifiers changed from: private */
    public int k;
    /* access modifiers changed from: private */
    public int l;
    /* access modifiers changed from: private */
    public int m;
    /* access modifiers changed from: private */
    public int n;
    /* access modifiers changed from: private */
    public int o;
    /* access modifiers changed from: private */
    public _lb p;
    /* access modifiers changed from: private */
    public int q;
    /* access modifiers changed from: private */
    public _lb r;
    /* access modifiers changed from: private */
    public int s;
    /* access modifiers changed from: private */
    public int t;
    private byte u;
    private int v;

    /* renamed from: _lb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends Mnb implements b {
        private static final a b = new a(true);
        public static Ynb<a> c = new Zlb();
        /* access modifiers changed from: private */
        public final Fnb d;
        /* access modifiers changed from: private */
        public int e;
        /* access modifiers changed from: private */
        public b f;
        /* access modifiers changed from: private */
        public _lb g;
        /* access modifiers changed from: private */
        public int h;
        private byte i;
        private int j;

        /* renamed from: _lb$a$a reason: collision with other inner class name */
        /* compiled from: ProtoBuf */
        public static final class C0161a extends defpackage.Mnb.a<a, C0161a> implements b {
            private int b;
            private b c = b.INV;
            private _lb d = _lb.q();
            private int e;

            private C0161a() {
                f();
            }

            /* access modifiers changed from: private */
            public static C0161a e() {
                return new C0161a();
            }

            private void f() {
            }

            public a d() {
                a aVar = new a((defpackage.Mnb.a) this);
                int i = this.b;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                aVar.f = this.c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                aVar.g = this.d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                aVar.h = this.e;
                aVar.e = i2;
                return aVar;
            }

            public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
                a((a) mnb);
                return this;
            }

            public a build() {
                a d2 = d();
                if (d2.i()) {
                    return d2;
                }
                throw defpackage.Bnb.a.a(d2);
            }

            public C0161a clone() {
                C0161a e2 = e();
                e2.a(d());
                return e2;
            }

            public C0161a a(a aVar) {
                if (aVar == a.h()) {
                    return this;
                }
                if (aVar.m()) {
                    a(aVar.j());
                }
                if (aVar.n()) {
                    a(aVar.k());
                }
                if (aVar.o()) {
                    a(aVar.l());
                }
                a(b().b(aVar.d));
                return this;
            }

            public C0161a a(Gnb gnb, Inb inb) throws IOException {
                a aVar;
                a aVar2 = null;
                try {
                    a aVar3 = (a) a.c.a(gnb, inb);
                    if (aVar3 != null) {
                        a(aVar3);
                    }
                    return this;
                } catch (Onb e2) {
                    aVar = (a) e2.a();
                    throw e2;
                } catch (Throwable th) {
                    th = th;
                    aVar2 = aVar;
                }
                if (aVar2 != null) {
                    a(aVar2);
                }
                throw th;
            }

            public C0161a a(b bVar) {
                if (bVar != null) {
                    this.b |= 1;
                    this.c = bVar;
                    return this;
                }
                throw new NullPointerException();
            }

            public C0161a a(_lb _lb) {
                if ((this.b & 2) != 2 || this.d == _lb.q()) {
                    this.d = _lb;
                } else {
                    c c2 = _lb.c(this.d);
                    c2.c(_lb);
                    this.d = c2.d();
                }
                this.b |= 2;
                return this;
            }

            public C0161a a(int i) {
                this.b |= 4;
                this.e = i;
                return this;
            }
        }

        /* renamed from: _lb$a$b */
        /* compiled from: ProtoBuf */
        public enum b implements defpackage.Nnb.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            
            private static defpackage.Nnb.b<b> e;
            private final int g;

            static {
                e = new C5591amb();
            }

            private b(int i, int i2) {
                this.g = i2;
            }

            public static b a(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i == 2) {
                    return INV;
                }
                if (i != 3) {
                    return null;
                }
                return STAR;
            }

            public final int i() {
                return this.g;
            }
        }

        static {
            b.q();
        }

        public static a h() {
            return b;
        }

        public static C0161a p() {
            return C0161a.e();
        }

        private void q() {
            this.f = b.INV;
            this.g = _lb.q();
            this.h = 0;
        }

        public int c() {
            int i2 = this.j;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.e & 1) == 1) {
                i3 = 0 + Hnb.a(1, this.f.i());
            }
            if ((this.e & 2) == 2) {
                i3 += Hnb.a(2, (Wnb) this.g);
            }
            if ((this.e & 4) == 4) {
                i3 += Hnb.b(3, this.h);
            }
            int size = i3 + this.d.size();
            this.j = size;
            return size;
        }

        public Ynb<a> e() {
            return c;
        }

        public final boolean i() {
            byte b2 = this.i;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!n() || k().i()) {
                this.i = 1;
                return true;
            }
            this.i = 0;
            return false;
        }

        public b j() {
            return this.f;
        }

        public _lb k() {
            return this.g;
        }

        public int l() {
            return this.h;
        }

        public boolean m() {
            return (this.e & 1) == 1;
        }

        public boolean n() {
            return (this.e & 2) == 2;
        }

        public boolean o() {
            return (this.e & 4) == 4;
        }

        public C0161a d() {
            return p();
        }

        private a(defpackage.Mnb.a aVar) {
            super(aVar);
            this.i = -1;
            this.j = -1;
            this.d = aVar.b();
        }

        public static C0161a b(a aVar) {
            C0161a p = p();
            p.a(aVar);
            return p;
        }

        public C0161a b() {
            return b(this);
        }

        public void a(Hnb hnb) throws IOException {
            c();
            if ((this.e & 1) == 1) {
                hnb.c(1, this.f.i());
            }
            if ((this.e & 2) == 2) {
                hnb.c(2, (Wnb) this.g);
            }
            if ((this.e & 4) == 4) {
                hnb.d(3, this.h);
            }
            hnb.c(this.d);
        }

        private a(boolean z) {
            this.i = -1;
            this.j = -1;
            this.d = Fnb.a;
        }

        private a(Gnb gnb, Inb inb) throws Onb {
            this.i = -1;
            this.j = -1;
            q();
            defpackage.Fnb.b j2 = Fnb.j();
            Hnb a = Hnb.a((OutputStream) j2, 1);
            boolean z = false;
            while (!z) {
                try {
                    int x = gnb.x();
                    if (x != 0) {
                        if (x == 8) {
                            int f2 = gnb.f();
                            b a2 = b.a(f2);
                            if (a2 == null) {
                                a.p(x);
                                a.p(f2);
                            } else {
                                this.e |= 1;
                                this.f = a2;
                            }
                        } else if (x == 18) {
                            c cVar = null;
                            if ((this.e & 2) == 2) {
                                cVar = this.g.b();
                            }
                            this.g = (_lb) gnb.a(_lb.d, inb);
                            if (cVar != null) {
                                cVar.c(this.g);
                                this.g = cVar.d();
                            }
                            this.e |= 2;
                        } else if (x == 24) {
                            this.e |= 4;
                            this.h = gnb.j();
                        } else if (!a(gnb, a, inb, x)) {
                        }
                    }
                    z = true;
                } catch (Onb e2) {
                    e2.a(this);
                    throw e2;
                } catch (IOException e3) {
                    Onb onb = new Onb(e3.getMessage());
                    onb.a(this);
                    throw onb;
                } catch (Throwable th) {
                    try {
                        a.a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.d = j2.a();
                        throw th2;
                    }
                    this.d = j2.a();
                    g();
                    throw th;
                }
            }
            try {
                a.a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = j2.a();
                throw th3;
            }
            this.d = j2.a();
            g();
        }
    }

    /* renamed from: _lb$b */
    public interface b extends Xnb {
    }

    /* renamed from: _lb$c */
    /* compiled from: ProtoBuf */
    public static final class c extends defpackage.Mnb.b<_lb, c> implements C6391emb {
        private int d;
        private List<a> e = Collections.emptyList();
        private boolean f;
        private int g;
        private _lb h = _lb.q();
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private _lb n = _lb.q();
        private int o;
        private _lb p = _lb.q();
        private int q;
        private int r;

        private c() {
            g();
        }

        /* access modifiers changed from: private */
        public static c e() {
            return new c();
        }

        private void f() {
            if ((this.d & 1) != 1) {
                this.e = new ArrayList(this.e);
                this.d |= 1;
            }
        }

        private void g() {
        }

        public c b(_lb _lb) {
            if ((this.d & 8) != 8 || this.h == _lb.q()) {
                this.h = _lb;
            } else {
                this.h = _lb.c(this.h).c(_lb).d();
            }
            this.d |= 8;
            return this;
        }

        public _lb d() {
            _lb _lb = new _lb((defpackage.Mnb.b) this);
            int i2 = this.d;
            int i3 = 1;
            if ((i2 & 1) == 1) {
                this.e = Collections.unmodifiableList(this.e);
                this.d &= -2;
            }
            _lb.g = this.e;
            if ((i2 & 2) != 2) {
                i3 = 0;
            }
            _lb.h = this.f;
            if ((i2 & 4) == 4) {
                i3 |= 2;
            }
            _lb.i = this.g;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            _lb.j = this.h;
            if ((i2 & 16) == 16) {
                i3 |= 8;
            }
            _lb.k = this.i;
            if ((i2 & 32) == 32) {
                i3 |= 16;
            }
            _lb.l = this.j;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            _lb.m = this.k;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            _lb.n = this.l;
            if ((i2 & 256) == 256) {
                i3 |= 128;
            }
            _lb.o = this.m;
            if ((i2 & 512) == 512) {
                i3 |= 256;
            }
            _lb.p = this.n;
            if ((i2 & 1024) == 1024) {
                i3 |= 512;
            }
            _lb.q = this.o;
            if ((i2 & 2048) == 2048) {
                i3 |= 1024;
            }
            _lb.r = this.p;
            if ((i2 & 4096) == 4096) {
                i3 |= 2048;
            }
            _lb.s = this.q;
            if ((i2 & 8192) == 8192) {
                i3 |= 4096;
            }
            _lb.t = this.r;
            _lb.f = i3;
            return _lb;
        }

        public c g(int i2) {
            this.d |= 256;
            this.m = i2;
            return this;
        }

        public c h(int i2) {
            this.d |= 64;
            this.k = i2;
            return this;
        }

        public c i(int i2) {
            this.d |= 128;
            this.l = i2;
            return this;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            c((_lb) mnb);
            return this;
        }

        public _lb build() {
            _lb d2 = d();
            if (d2.i()) {
                return d2;
            }
            throw defpackage.Bnb.a.a(d2);
        }

        public c c(_lb _lb) {
            if (_lb == _lb.q()) {
                return this;
            }
            if (!_lb.g.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = _lb.g;
                    this.d &= -2;
                } else {
                    f();
                    this.e.addAll(_lb.g);
                }
            }
            if (_lb.I()) {
                a(_lb.v());
            }
            if (_lb.F()) {
                d(_lb.s());
            }
            if (_lb.G()) {
                b(_lb.t());
            }
            if (_lb.H()) {
                e(_lb.u());
            }
            if (_lb.D()) {
                b(_lb.p());
            }
            if (_lb.M()) {
                h(_lb.z());
            }
            if (_lb.N()) {
                i(_lb.A());
            }
            if (_lb.L()) {
                g(_lb.y());
            }
            if (_lb.J()) {
                d(_lb.w());
            }
            if (_lb.K()) {
                f(_lb.x());
            }
            if (_lb.B()) {
                a(_lb.l());
            }
            if (_lb.C()) {
                a(_lb.m());
            }
            if (_lb.E()) {
                c(_lb.r());
            }
            a(_lb);
            a(b().b(_lb.e));
            return this;
        }

        public c e(int i2) {
            this.d |= 16;
            this.i = i2;
            return this;
        }

        public c clone() {
            c e2 = e();
            e2.c(d());
            return e2;
        }

        public c a(Gnb gnb, Inb inb) throws IOException {
            _lb _lb;
            _lb _lb2 = null;
            try {
                _lb _lb3 = (_lb) _lb.d.a(gnb, inb);
                if (_lb3 != null) {
                    c(_lb3);
                }
                return this;
            } catch (Onb e2) {
                _lb = (_lb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                _lb2 = _lb;
            }
            if (_lb2 != null) {
                c(_lb2);
            }
            throw th;
        }

        public c f(int i2) {
            this.d |= 1024;
            this.o = i2;
            return this;
        }

        public c b(int i2) {
            this.d |= 32;
            this.j = i2;
            return this;
        }

        public c a(boolean z) {
            this.d |= 2;
            this.f = z;
            return this;
        }

        public c a(_lb _lb) {
            if ((this.d & 2048) != 2048 || this.p == _lb.q()) {
                this.p = _lb;
            } else {
                this.p = _lb.c(this.p).c(_lb).d();
            }
            this.d |= 2048;
            return this;
        }

        public c a(int i2) {
            this.d |= 4096;
            this.q = i2;
            return this;
        }

        public c d(int i2) {
            this.d |= 4;
            this.g = i2;
            return this;
        }

        public c d(_lb _lb) {
            if ((this.d & 512) != 512 || this.n == _lb.q()) {
                this.n = _lb;
            } else {
                this.n = _lb.c(this.n).c(_lb).d();
            }
            this.d |= 512;
            return this;
        }

        public c c(int i2) {
            this.d |= 8192;
            this.r = i2;
            return this;
        }
    }

    static {
        c.P();
    }

    public static c O() {
        return c.e();
    }

    private void P() {
        this.g = Collections.emptyList();
        this.h = false;
        this.i = 0;
        this.j = q();
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = q();
        this.q = 0;
        this.r = q();
        this.s = 0;
        this.t = 0;
    }

    public static _lb q() {
        return c;
    }

    public int A() {
        return this.n;
    }

    public boolean B() {
        return (this.f & 1024) == 1024;
    }

    public boolean C() {
        return (this.f & 2048) == 2048;
    }

    public boolean D() {
        return (this.f & 16) == 16;
    }

    public boolean E() {
        return (this.f & 4096) == 4096;
    }

    public boolean F() {
        return (this.f & 2) == 2;
    }

    public boolean G() {
        return (this.f & 4) == 4;
    }

    public boolean H() {
        return (this.f & 8) == 8;
    }

    public boolean I() {
        return (this.f & 1) == 1;
    }

    public boolean J() {
        return (this.f & 256) == 256;
    }

    public boolean K() {
        return (this.f & 512) == 512;
    }

    public boolean L() {
        return (this.f & 128) == 128;
    }

    public boolean M() {
        return (this.f & 32) == 32;
    }

    public boolean N() {
        return (this.f & 64) == 64;
    }

    public _lb l() {
        return this.r;
    }

    public int m() {
        return this.s;
    }

    public int n() {
        return this.g.size();
    }

    public List<a> o() {
        return this.g;
    }

    public int p() {
        return this.l;
    }

    public int r() {
        return this.t;
    }

    public int s() {
        return this.i;
    }

    public _lb t() {
        return this.j;
    }

    public int u() {
        return this.k;
    }

    public boolean v() {
        return this.h;
    }

    public _lb w() {
        return this.p;
    }

    public int x() {
        return this.q;
    }

    public int y() {
        return this.o;
    }

    public int z() {
        return this.m;
    }

    public Ynb<_lb> e() {
        return d;
    }

    public final boolean i() {
        byte b2 = this.u;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < n(); i2++) {
            if (!a(i2).i()) {
                this.u = 0;
                return false;
            }
        }
        if (G() && !t().i()) {
            this.u = 0;
            return false;
        } else if (J() && !w().i()) {
            this.u = 0;
            return false;
        } else if (B() && !l().i()) {
            this.u = 0;
            return false;
        } else if (!h()) {
            this.u = 0;
            return false;
        } else {
            this.u = 1;
            return true;
        }
    }

    private _lb(defpackage.Mnb.b<_lb, ?> bVar) {
        super(bVar);
        this.u = -1;
        this.v = -1;
        this.e = bVar.b();
    }

    public int c() {
        int i2 = this.v;
        if (i2 != -1) {
            return i2;
        }
        int b2 = (this.f & 4096) == 4096 ? Hnb.b(1, this.t) + 0 : 0;
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            b2 += Hnb.a(2, (Wnb) this.g.get(i3));
        }
        if ((this.f & 1) == 1) {
            b2 += Hnb.a(3, this.h);
        }
        if ((this.f & 2) == 2) {
            b2 += Hnb.b(4, this.i);
        }
        if ((this.f & 4) == 4) {
            b2 += Hnb.a(5, (Wnb) this.j);
        }
        if ((this.f & 16) == 16) {
            b2 += Hnb.b(6, this.l);
        }
        if ((this.f & 32) == 32) {
            b2 += Hnb.b(7, this.m);
        }
        if ((this.f & 8) == 8) {
            b2 += Hnb.b(8, this.k);
        }
        if ((this.f & 64) == 64) {
            b2 += Hnb.b(9, this.n);
        }
        if ((this.f & 256) == 256) {
            b2 += Hnb.a(10, (Wnb) this.p);
        }
        if ((this.f & 512) == 512) {
            b2 += Hnb.b(11, this.q);
        }
        if ((this.f & 128) == 128) {
            b2 += Hnb.b(12, this.o);
        }
        if ((this.f & 1024) == 1024) {
            b2 += Hnb.a(13, (Wnb) this.r);
        }
        if ((this.f & 2048) == 2048) {
            b2 += Hnb.b(14, this.s);
        }
        int j2 = b2 + j() + this.e.size();
        this.v = j2;
        return j2;
    }

    public c d() {
        return O();
    }

    public c b() {
        return c(this);
    }

    private _lb(boolean z) {
        this.u = -1;
        this.v = -1;
        this.e = Fnb.a;
    }

    public _lb a() {
        return c;
    }

    public a a(int i2) {
        return (a) this.g.get(i2);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        a k2 = k();
        if ((this.f & 4096) == 4096) {
            hnb.d(1, this.t);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            hnb.c(2, (Wnb) this.g.get(i2));
        }
        if ((this.f & 1) == 1) {
            hnb.b(3, this.h);
        }
        if ((this.f & 2) == 2) {
            hnb.d(4, this.i);
        }
        if ((this.f & 4) == 4) {
            hnb.c(5, (Wnb) this.j);
        }
        if ((this.f & 16) == 16) {
            hnb.d(6, this.l);
        }
        if ((this.f & 32) == 32) {
            hnb.d(7, this.m);
        }
        if ((this.f & 8) == 8) {
            hnb.d(8, this.k);
        }
        if ((this.f & 64) == 64) {
            hnb.d(9, this.n);
        }
        if ((this.f & 256) == 256) {
            hnb.c(10, (Wnb) this.p);
        }
        if ((this.f & 512) == 512) {
            hnb.d(11, this.q);
        }
        if ((this.f & 128) == 128) {
            hnb.d(12, this.o);
        }
        if ((this.f & 1024) == 1024) {
            hnb.c(13, (Wnb) this.r);
        }
        if ((this.f & 2048) == 2048) {
            hnb.d(14, this.s);
        }
        k2.a(200, hnb);
        hnb.c(this.e);
    }

    private _lb(Gnb gnb, Inb inb) throws Onb {
        this.u = -1;
        this.v = -1;
        P();
        defpackage.Fnb.b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = gnb.x();
                c cVar = null;
                switch (x) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.f |= 4096;
                        this.t = gnb.j();
                        break;
                    case 18:
                        if (!z2 || !true) {
                            this.g = new ArrayList();
                            z2 |= true;
                        }
                        this.g.add(gnb.a(a.c, inb));
                        break;
                    case 24:
                        this.f |= 1;
                        this.h = gnb.c();
                        break;
                    case 32:
                        this.f |= 2;
                        this.i = gnb.j();
                        break;
                    case 42:
                        if ((this.f & 4) == 4) {
                            cVar = this.j.b();
                        }
                        this.j = (_lb) gnb.a(d, inb);
                        if (cVar != null) {
                            cVar.c(this.j);
                            this.j = cVar.d();
                        }
                        this.f |= 4;
                        break;
                    case 48:
                        this.f |= 16;
                        this.l = gnb.j();
                        break;
                    case 56:
                        this.f |= 32;
                        this.m = gnb.j();
                        break;
                    case 64:
                        this.f |= 8;
                        this.k = gnb.j();
                        break;
                    case 72:
                        this.f |= 64;
                        this.n = gnb.j();
                        break;
                    case 82:
                        if ((this.f & 256) == 256) {
                            cVar = this.p.b();
                        }
                        this.p = (_lb) gnb.a(d, inb);
                        if (cVar != null) {
                            cVar.c(this.p);
                            this.p = cVar.d();
                        }
                        this.f |= 256;
                        break;
                    case 88:
                        this.f |= 512;
                        this.q = gnb.j();
                        break;
                    case 96:
                        this.f |= 128;
                        this.o = gnb.j();
                        break;
                    case 106:
                        if ((this.f & 1024) == 1024) {
                            cVar = this.r.b();
                        }
                        this.r = (_lb) gnb.a(d, inb);
                        if (cVar != null) {
                            cVar.c(this.r);
                            this.r = cVar.d();
                        }
                        this.f |= 1024;
                        break;
                    case 112:
                        this.f |= 2048;
                        this.s = gnb.j();
                        break;
                    default:
                        if (a(gnb, a2, inb, x)) {
                            break;
                        }
                        z = true;
                        break;
                }
            } catch (Onb e2) {
                e2.a(this);
                throw e2;
            } catch (IOException e3) {
                Onb onb = new Onb(e3.getMessage());
                onb.a(this);
                throw onb;
            } catch (Throwable th) {
                if (z2 && true) {
                    this.g = Collections.unmodifiableList(this.g);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.e = j2.a();
                    throw th2;
                }
                this.e = j2.a();
                g();
                throw th;
            }
        }
        if (z2 && true) {
            this.g = Collections.unmodifiableList(this.g);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.e = j2.a();
            throw th3;
        }
        this.e = j2.a();
        g();
    }

    public static c c(_lb _lb) {
        c O = O();
        O.c(_lb);
        return O;
    }
}
