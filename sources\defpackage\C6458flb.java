package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: flb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C6458flb extends c<C6458flb> implements C6594hlb {
    private static final C6458flb c = new C6458flb(true);
    public static Ynb<C6458flb> d = new C6390elb();
    private int A;
    /* access modifiers changed from: private */
    public final Fnb e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public int h;
    /* access modifiers changed from: private */
    public int i;
    /* access modifiers changed from: private */
    public List<C6527gmb> j;
    /* access modifiers changed from: private */
    public List<_lb> k;
    /* access modifiers changed from: private */
    public List<Integer> l;
    private int m;
    /* access modifiers changed from: private */
    public List<Integer> n;
    private int o;
    /* access modifiers changed from: private */
    public List<C6730jlb> p;
    /* access modifiers changed from: private */
    public List<Blb> q;
    /* access modifiers changed from: private */
    public List<Olb> r;
    /* access modifiers changed from: private */
    public List<C5727cmb> s;
    /* access modifiers changed from: private */
    public List<C7485ulb> t;
    /* access modifiers changed from: private */
    public List<Integer> u;
    private int v;
    /* access modifiers changed from: private */
    public C6799kmb w;
    /* access modifiers changed from: private */
    public List<Integer> x;
    /* access modifiers changed from: private */
    public C7555vmb y;
    private byte z;

    /* renamed from: flb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends defpackage.Mnb.b<C6458flb, a> implements C6594hlb {
        private int d;
        private int e = 6;
        private int f;
        private int g;
        private List<C6527gmb> h = Collections.emptyList();
        private List<_lb> i = Collections.emptyList();
        private List<Integer> j = Collections.emptyList();
        private List<Integer> k = Collections.emptyList();
        private List<C6730jlb> l = Collections.emptyList();
        private List<Blb> m = Collections.emptyList();
        private List<Olb> n = Collections.emptyList();
        private List<C5727cmb> o = Collections.emptyList();
        private List<C7485ulb> p = Collections.emptyList();
        private List<Integer> q = Collections.emptyList();
        private C6799kmb r = C6799kmb.h();
        private List<Integer> s = Collections.emptyList();
        private C7555vmb t = C7555vmb.h();

        private a() {
            r();
        }

        /* access modifiers changed from: private */
        public static a e() {
            return new a();
        }

        private void f() {
            if ((this.d & 128) != 128) {
                this.l = new ArrayList(this.l);
                this.d |= 128;
            }
        }

        private void g() {
            if ((this.d & 2048) != 2048) {
                this.p = new ArrayList(this.p);
                this.d |= 2048;
            }
        }

        private void h() {
            if ((this.d & 256) != 256) {
                this.m = new ArrayList(this.m);
                this.d |= 256;
            }
        }

        private void j() {
            if ((this.d & 64) != 64) {
                this.k = new ArrayList(this.k);
                this.d |= 64;
            }
        }

        private void k() {
            if ((this.d & 512) != 512) {
                this.n = new ArrayList(this.n);
                this.d |= 512;
            }
        }

        private void l() {
            if ((this.d & 4096) != 4096) {
                this.q = new ArrayList(this.q);
                this.d |= 4096;
            }
        }

        private void m() {
            if ((this.d & 32) != 32) {
                this.j = new ArrayList(this.j);
                this.d |= 32;
            }
        }

        private void n() {
            if ((this.d & 16) != 16) {
                this.i = new ArrayList(this.i);
                this.d |= 16;
            }
        }

        private void o() {
            if ((this.d & 1024) != 1024) {
                this.o = new ArrayList(this.o);
                this.d |= 1024;
            }
        }

        private void p() {
            if ((this.d & 8) != 8) {
                this.h = new ArrayList(this.h);
                this.d |= 8;
            }
        }

        private void q() {
            if ((this.d & 16384) != 16384) {
                this.s = new ArrayList(this.s);
                this.d |= 16384;
            }
        }

        private void r() {
        }

        public a b(int i2) {
            this.d |= 1;
            this.e = i2;
            return this;
        }

        public C6458flb d() {
            C6458flb flb = new C6458flb((defpackage.Mnb.b) this);
            int i2 = this.d;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            flb.g = this.e;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            flb.h = this.f;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            flb.i = this.g;
            if ((this.d & 8) == 8) {
                this.h = Collections.unmodifiableList(this.h);
                this.d &= -9;
            }
            flb.j = this.h;
            if ((this.d & 16) == 16) {
                this.i = Collections.unmodifiableList(this.i);
                this.d &= -17;
            }
            flb.k = this.i;
            if ((this.d & 32) == 32) {
                this.j = Collections.unmodifiableList(this.j);
                this.d &= -33;
            }
            flb.l = this.j;
            if ((this.d & 64) == 64) {
                this.k = Collections.unmodifiableList(this.k);
                this.d &= -65;
            }
            flb.n = this.k;
            if ((this.d & 128) == 128) {
                this.l = Collections.unmodifiableList(this.l);
                this.d &= -129;
            }
            flb.p = this.l;
            if ((this.d & 256) == 256) {
                this.m = Collections.unmodifiableList(this.m);
                this.d &= -257;
            }
            flb.q = this.m;
            if ((this.d & 512) == 512) {
                this.n = Collections.unmodifiableList(this.n);
                this.d &= -513;
            }
            flb.r = this.n;
            if ((this.d & 1024) == 1024) {
                this.o = Collections.unmodifiableList(this.o);
                this.d &= -1025;
            }
            flb.s = this.o;
            if ((this.d & 2048) == 2048) {
                this.p = Collections.unmodifiableList(this.p);
                this.d &= -2049;
            }
            flb.t = this.p;
            if ((this.d & 4096) == 4096) {
                this.q = Collections.unmodifiableList(this.q);
                this.d &= -4097;
            }
            flb.u = this.q;
            if ((i2 & 8192) == 8192) {
                i3 |= 8;
            }
            flb.w = this.r;
            if ((this.d & 16384) == 16384) {
                this.s = Collections.unmodifiableList(this.s);
                this.d &= -16385;
            }
            flb.x = this.s;
            if ((i2 & 32768) == 32768) {
                i3 |= 16;
            }
            flb.y = this.t;
            flb.f = i3;
            return flb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C6458flb) mnb);
            return this;
        }

        public C6458flb build() {
            C6458flb d2 = d();
            if (d2.i()) {
                return d2;
            }
            throw defpackage.Bnb.a.a(d2);
        }

        public a c(int i2) {
            this.d |= 2;
            this.f = i2;
            return this;
        }

        public a clone() {
            a e2 = e();
            e2.a(d());
            return e2;
        }

        public a a(C6458flb flb) {
            if (flb == C6458flb.o()) {
                return this;
            }
            if (flb.K()) {
                b(flb.r());
            }
            if (flb.L()) {
                c(flb.s());
            }
            if (flb.J()) {
                a(flb.l());
            }
            if (!flb.j.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = flb.j;
                    this.d &= -9;
                } else {
                    p();
                    this.h.addAll(flb.j);
                }
            }
            if (!flb.k.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = flb.k;
                    this.d &= -17;
                } else {
                    n();
                    this.i.addAll(flb.k);
                }
            }
            if (!flb.l.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = flb.l;
                    this.d &= -33;
                } else {
                    m();
                    this.j.addAll(flb.l);
                }
            }
            if (!flb.n.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = flb.n;
                    this.d &= -65;
                } else {
                    j();
                    this.k.addAll(flb.n);
                }
            }
            if (!flb.p.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = flb.p;
                    this.d &= -129;
                } else {
                    f();
                    this.l.addAll(flb.p);
                }
            }
            if (!flb.q.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = flb.q;
                    this.d &= -257;
                } else {
                    h();
                    this.m.addAll(flb.q);
                }
            }
            if (!flb.r.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = flb.r;
                    this.d &= -513;
                } else {
                    k();
                    this.n.addAll(flb.r);
                }
            }
            if (!flb.s.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = flb.s;
                    this.d &= -1025;
                } else {
                    o();
                    this.o.addAll(flb.s);
                }
            }
            if (!flb.t.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = flb.t;
                    this.d &= -2049;
                } else {
                    g();
                    this.p.addAll(flb.t);
                }
            }
            if (!flb.u.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = flb.u;
                    this.d &= -4097;
                } else {
                    l();
                    this.q.addAll(flb.u);
                }
            }
            if (flb.M()) {
                a(flb.G());
            }
            if (!flb.x.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = flb.x;
                    this.d &= -16385;
                } else {
                    q();
                    this.s.addAll(flb.x);
                }
            }
            if (flb.N()) {
                a(flb.I());
            }
            a(flb);
            a(b().b(flb.e));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            C6458flb flb;
            C6458flb flb2 = null;
            try {
                C6458flb flb3 = (C6458flb) C6458flb.d.a(gnb, inb);
                if (flb3 != null) {
                    a(flb3);
                }
                return this;
            } catch (Onb e2) {
                flb = (C6458flb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                flb2 = flb;
            }
            if (flb2 != null) {
                a(flb2);
            }
            throw th;
        }

        public a a(int i2) {
            this.d |= 4;
            this.g = i2;
            return this;
        }

        public a a(C6799kmb kmb) {
            if ((this.d & 8192) != 8192 || this.r == C6799kmb.h()) {
                this.r = kmb;
            } else {
                defpackage.C6799kmb.a c = C6799kmb.c(this.r);
                c.a(kmb);
                this.r = c.d();
            }
            this.d |= 8192;
            return this;
        }

        public a a(C7555vmb vmb) {
            if ((this.d & 32768) != 32768 || this.t == C7555vmb.h()) {
                this.t = vmb;
            } else {
                defpackage.C7555vmb.a c = C7555vmb.c(this.t);
                c.a(vmb);
                this.t = c.d();
            }
            this.d |= 32768;
            return this;
        }
    }

    /* renamed from: flb$b */
    /* compiled from: ProtoBuf */
    public enum b implements defpackage.Nnb.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        
        private static defpackage.Nnb.b<b> h;
        private final int j;

        static {
            h = new C6526glb();
        }

        private b(int i2, int i3) {
            this.j = i3;
        }

        public static b a(int i2) {
            switch (i2) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        public final int i() {
            return this.j;
        }
    }

    static {
        c.P();
    }

    public static a O() {
        return a.e();
    }

    private void P() {
        this.g = 6;
        this.h = 0;
        this.i = 0;
        this.j = Collections.emptyList();
        this.k = Collections.emptyList();
        this.l = Collections.emptyList();
        this.n = Collections.emptyList();
        this.p = Collections.emptyList();
        this.q = Collections.emptyList();
        this.r = Collections.emptyList();
        this.s = Collections.emptyList();
        this.t = Collections.emptyList();
        this.u = Collections.emptyList();
        this.w = C6799kmb.h();
        this.x = Collections.emptyList();
        this.y = C7555vmb.h();
    }

    public static C6458flb o() {
        return c;
    }

    public List<Integer> A() {
        return this.l;
    }

    public List<_lb> B() {
        return this.k;
    }

    public int C() {
        return this.s.size();
    }

    public List<C5727cmb> D() {
        return this.s;
    }

    public int E() {
        return this.j.size();
    }

    public List<C6527gmb> F() {
        return this.j;
    }

    public C6799kmb G() {
        return this.w;
    }

    public List<Integer> H() {
        return this.x;
    }

    public C7555vmb I() {
        return this.y;
    }

    public boolean J() {
        return (this.f & 4) == 4;
    }

    public boolean K() {
        return (this.f & 1) == 1;
    }

    public boolean L() {
        return (this.f & 2) == 2;
    }

    public boolean M() {
        return (this.f & 8) == 8;
    }

    public boolean N() {
        return (this.f & 16) == 16;
    }

    public int m() {
        return this.p.size();
    }

    public List<C6730jlb> n() {
        return this.p;
    }

    public int p() {
        return this.t.size();
    }

    public List<C7485ulb> q() {
        return this.t;
    }

    public int r() {
        return this.g;
    }

    public int s() {
        return this.h;
    }

    public int t() {
        return this.q.size();
    }

    public List<Blb> u() {
        return this.q;
    }

    public List<Integer> v() {
        return this.n;
    }

    public int w() {
        return this.r.size();
    }

    public List<Olb> x() {
        return this.r;
    }

    public List<Integer> y() {
        return this.u;
    }

    public int z() {
        return this.k.size();
    }

    public static a m(C6458flb flb) {
        a O = O();
        O.a(flb);
        return O;
    }

    public int l() {
        return this.i;
    }

    private C6458flb(defpackage.Mnb.b<C6458flb, ?> bVar) {
        super(bVar);
        this.m = -1;
        this.o = -1;
        this.v = -1;
        this.z = -1;
        this.A = -1;
        this.e = bVar.b();
    }

    public Ynb<C6458flb> e() {
        return d;
    }

    public C5727cmb f(int i2) {
        return (C5727cmb) this.s.get(i2);
    }

    public C6527gmb g(int i2) {
        return (C6527gmb) this.j.get(i2);
    }

    public final boolean i() {
        byte b2 = this.z;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!L()) {
            this.z = 0;
            return false;
        }
        for (int i2 = 0; i2 < E(); i2++) {
            if (!g(i2).i()) {
                this.z = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < z(); i3++) {
            if (!e(i3).i()) {
                this.z = 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < m(); i4++) {
            if (!a(i4).i()) {
                this.z = 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < t(); i5++) {
            if (!c(i5).i()) {
                this.z = 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < w(); i6++) {
            if (!d(i6).i()) {
                this.z = 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < C(); i7++) {
            if (!f(i7).i()) {
                this.z = 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < p(); i8++) {
            if (!b(i8).i()) {
                this.z = 0;
                return false;
            }
        }
        if (M() && !G().i()) {
            this.z = 0;
            return false;
        } else if (!h()) {
            this.z = 0;
            return false;
        } else {
            this.z = 1;
            return true;
        }
    }

    public Blb c(int i2) {
        return (Blb) this.q.get(i2);
    }

    public _lb e(int i2) {
        return (_lb) this.k.get(i2);
    }

    public C7485ulb b(int i2) {
        return (C7485ulb) this.t.get(i2);
    }

    public int c() {
        int i2 = this.A;
        if (i2 != -1) {
            return i2;
        }
        int b2 = (this.f & 1) == 1 ? Hnb.b(1, this.g) + 0 : 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.l.size(); i4++) {
            i3 += Hnb.c(((Integer) this.l.get(i4)).intValue());
        }
        int i5 = b2 + i3;
        if (!A().isEmpty()) {
            i5 = i5 + 1 + Hnb.c(i3);
        }
        this.m = i3;
        if ((this.f & 2) == 2) {
            i5 += Hnb.b(3, this.h);
        }
        if ((this.f & 4) == 4) {
            i5 += Hnb.b(4, this.i);
        }
        int i6 = i5;
        for (int i7 = 0; i7 < this.j.size(); i7++) {
            i6 += Hnb.a(5, (Wnb) this.j.get(i7));
        }
        for (int i8 = 0; i8 < this.k.size(); i8++) {
            i6 += Hnb.a(6, (Wnb) this.k.get(i8));
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.n.size(); i10++) {
            i9 += Hnb.c(((Integer) this.n.get(i10)).intValue());
        }
        int i11 = i6 + i9;
        if (!v().isEmpty()) {
            i11 = i11 + 1 + Hnb.c(i9);
        }
        this.o = i9;
        for (int i12 = 0; i12 < this.p.size(); i12++) {
            i11 += Hnb.a(8, (Wnb) this.p.get(i12));
        }
        for (int i13 = 0; i13 < this.q.size(); i13++) {
            i11 += Hnb.a(9, (Wnb) this.q.get(i13));
        }
        for (int i14 = 0; i14 < this.r.size(); i14++) {
            i11 += Hnb.a(10, (Wnb) this.r.get(i14));
        }
        for (int i15 = 0; i15 < this.s.size(); i15++) {
            i11 += Hnb.a(11, (Wnb) this.s.get(i15));
        }
        for (int i16 = 0; i16 < this.t.size(); i16++) {
            i11 += Hnb.a(13, (Wnb) this.t.get(i16));
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.u.size(); i18++) {
            i17 += Hnb.c(((Integer) this.u.get(i18)).intValue());
        }
        int i19 = i11 + i17;
        if (!y().isEmpty()) {
            i19 = i19 + 2 + Hnb.c(i17);
        }
        this.v = i17;
        if ((this.f & 8) == 8) {
            i19 += Hnb.a(30, (Wnb) this.w);
        }
        int i20 = 0;
        for (int i21 = 0; i21 < this.x.size(); i21++) {
            i20 += Hnb.c(((Integer) this.x.get(i21)).intValue());
        }
        int size = i19 + i20 + (H().size() * 2);
        if ((this.f & 16) == 16) {
            size += Hnb.a(32, (Wnb) this.y);
        }
        int j2 = size + j() + this.e.size();
        this.A = j2;
        return j2;
    }

    public Olb d(int i2) {
        return (Olb) this.r.get(i2);
    }

    public a b() {
        return m(this);
    }

    public a d() {
        return O();
    }

    public C6458flb a() {
        return c;
    }

    public C6730jlb a(int i2) {
        return (C6730jlb) this.p.get(i2);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        a k2 = k();
        if ((this.f & 1) == 1) {
            hnb.d(1, this.g);
        }
        if (A().size() > 0) {
            hnb.p(18);
            hnb.p(this.m);
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            hnb.m(((Integer) this.l.get(i2)).intValue());
        }
        if ((this.f & 2) == 2) {
            hnb.d(3, this.h);
        }
        if ((this.f & 4) == 4) {
            hnb.d(4, this.i);
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            hnb.c(5, (Wnb) this.j.get(i3));
        }
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            hnb.c(6, (Wnb) this.k.get(i4));
        }
        if (v().size() > 0) {
            hnb.p(58);
            hnb.p(this.o);
        }
        for (int i5 = 0; i5 < this.n.size(); i5++) {
            hnb.m(((Integer) this.n.get(i5)).intValue());
        }
        for (int i6 = 0; i6 < this.p.size(); i6++) {
            hnb.c(8, (Wnb) this.p.get(i6));
        }
        for (int i7 = 0; i7 < this.q.size(); i7++) {
            hnb.c(9, (Wnb) this.q.get(i7));
        }
        for (int i8 = 0; i8 < this.r.size(); i8++) {
            hnb.c(10, (Wnb) this.r.get(i8));
        }
        for (int i9 = 0; i9 < this.s.size(); i9++) {
            hnb.c(11, (Wnb) this.s.get(i9));
        }
        for (int i10 = 0; i10 < this.t.size(); i10++) {
            hnb.c(13, (Wnb) this.t.get(i10));
        }
        if (y().size() > 0) {
            hnb.p(130);
            hnb.p(this.v);
        }
        for (int i11 = 0; i11 < this.u.size(); i11++) {
            hnb.m(((Integer) this.u.get(i11)).intValue());
        }
        if ((this.f & 8) == 8) {
            hnb.c(30, (Wnb) this.w);
        }
        for (int i12 = 0; i12 < this.x.size(); i12++) {
            hnb.d(31, ((Integer) this.x.get(i12)).intValue());
        }
        if ((this.f & 16) == 16) {
            hnb.c(32, (Wnb) this.y);
        }
        k2.a(19000, hnb);
        hnb.c(this.e);
    }

    private C6458flb(boolean z2) {
        this.m = -1;
        this.o = -1;
        this.v = -1;
        this.z = -1;
        this.A = -1;
        this.e = Fnb.a;
    }

    /* JADX WARNING: type inference failed for: r16v0 */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r16v2, types: [kmb$a] */
    /* JADX WARNING: type inference failed for: r16v4 */
    /* JADX WARNING: type inference failed for: r16v5, types: [vmb$a] */
    /* JADX WARNING: type inference failed for: r16v6 */
    /* JADX WARNING: type inference failed for: r16v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c4, code lost:
        r7 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    private C6458flb(Gnb gnb, Inb inb) throws Onb {
        Gnb gnb2 = gnb;
        Inb inb2 = inb;
        this.m = -1;
        this.o = -1;
        this.v = -1;
        this.z = -1;
        this.A = -1;
        P();
        defpackage.Fnb.b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                int x2 = gnb.x();
                ? r16 = 0;
                switch (x2) {
                    case 0:
                        break;
                    case 8:
                        this.f |= 1;
                        this.g = gnb.j();
                        break;
                    case 16:
                        if (!(z3 & true)) {
                            this.l = new ArrayList();
                            z3 |= true;
                        }
                        this.l.add(Integer.valueOf(gnb.j()));
                        break;
                    case 18:
                        int d2 = gnb2.d(gnb.o());
                        if (!(z3 & true) && gnb.a() > 0) {
                            this.l = new ArrayList();
                            z3 |= true;
                        }
                        while (gnb.a() > 0) {
                            this.l.add(Integer.valueOf(gnb.j()));
                        }
                        gnb2.c(d2);
                        break;
                    case 24:
                        this.f |= 2;
                        this.h = gnb.j();
                        break;
                    case 32:
                        this.f |= 4;
                        this.i = gnb.j();
                        break;
                    case 42:
                        if (!(z3 & true)) {
                            this.j = new ArrayList();
                            z3 |= true;
                        }
                        this.j.add(gnb2.a(C6527gmb.d, inb2));
                        break;
                    case 50:
                        if (!(z3 & true)) {
                            this.k = new ArrayList();
                            z3 |= true;
                        }
                        this.k.add(gnb2.a(_lb.d, inb2));
                        break;
                    case 56:
                        if (!(z3 & true)) {
                            this.n = new ArrayList();
                            z3 |= true;
                        }
                        this.n.add(Integer.valueOf(gnb.j()));
                        break;
                    case 58:
                        int d3 = gnb2.d(gnb.o());
                        if (!(z3 & true) && gnb.a() > 0) {
                            this.n = new ArrayList();
                            z3 |= true;
                        }
                        while (gnb.a() > 0) {
                            this.n.add(Integer.valueOf(gnb.j()));
                        }
                        gnb2.c(d3);
                        break;
                    case 66:
                        if (!(z3 & true)) {
                            this.p = new ArrayList();
                            z3 |= true;
                        }
                        this.p.add(gnb2.a(C6730jlb.d, inb2));
                        break;
                    case 74:
                        if (!(z3 & true)) {
                            this.q = new ArrayList();
                            z3 |= true;
                        }
                        this.q.add(gnb2.a(Blb.d, inb2));
                        break;
                    case 82:
                        if (!(z3 & true)) {
                            this.r = new ArrayList();
                            z3 |= true;
                        }
                        this.r.add(gnb2.a(Olb.d, inb2));
                        break;
                    case 90:
                        if (!(z3 & true)) {
                            this.s = new ArrayList();
                            z3 |= true;
                        }
                        this.s.add(gnb2.a(C5727cmb.d, inb2));
                        break;
                    case 106:
                        if (!(z3 & true)) {
                            this.t = new ArrayList();
                            z3 |= true;
                        }
                        this.t.add(gnb2.a(C7485ulb.d, inb2));
                        break;
                    case 128:
                        if (!(z3 & true)) {
                            this.u = new ArrayList();
                            z3 |= true;
                        }
                        this.u.add(Integer.valueOf(gnb.j()));
                        break;
                    case 130:
                        int d4 = gnb2.d(gnb.o());
                        if (!(z3 & true) && gnb.a() > 0) {
                            this.u = new ArrayList();
                            z3 |= true;
                        }
                        while (gnb.a() > 0) {
                            this.u.add(Integer.valueOf(gnb.j()));
                        }
                        gnb2.c(d4);
                        break;
                    case 242:
                        if ((this.f & 8) == 8) {
                            r16 = this.w.b();
                        }
                        defpackage.C6799kmb.a aVar = r16;
                        this.w = (C6799kmb) gnb2.a(C6799kmb.c, inb2);
                        if (aVar != 0) {
                            aVar.a(this.w);
                            this.w = aVar.d();
                        }
                        this.f |= 8;
                        break;
                    case 248:
                        if (!(z3 & true)) {
                            this.x = new ArrayList();
                            z3 |= true;
                        }
                        this.x.add(Integer.valueOf(gnb.j()));
                        break;
                    case 250:
                        int d5 = gnb2.d(gnb.o());
                        if (!(z3 & true) && gnb.a() > 0) {
                            this.x = new ArrayList();
                            z3 |= true;
                        }
                        while (gnb.a() > 0) {
                            this.x.add(Integer.valueOf(gnb.j()));
                        }
                        gnb2.c(d5);
                        break;
                    case 258:
                        if ((this.f & 16) == 16) {
                            r16 = this.y.b();
                        }
                        defpackage.C7555vmb.a aVar2 = r16;
                        this.y = (C7555vmb) gnb2.a(C7555vmb.c, inb2);
                        if (aVar2 != 0) {
                            aVar2.a(this.y);
                            this.y = aVar2.d();
                        }
                        this.f |= 16;
                        break;
                    default:
                        if (a(gnb2, a2, inb2, x2)) {
                            break;
                        }
                        break;
                }
            } catch (Onb e2) {
                Onb onb = e2;
                onb.a(this);
                throw onb;
            } catch (IOException e3) {
                Onb onb2 = new Onb(e3.getMessage());
                onb2.a(this);
                throw onb2;
            } catch (Throwable th) {
                Throwable th2 = th;
                if (z3 & true) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if (z3 & true) {
                    this.j = Collections.unmodifiableList(this.j);
                }
                if (z3 & true) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if (z3 & true) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if (z3 & true) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if (z3 & true) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                if (z3 & true) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                if (z3 & true) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                if (z3 & true) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if (z3 & true) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if (z3 & true) {
                    this.x = Collections.unmodifiableList(this.x);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    this.e = j2.a();
                    throw th4;
                }
                this.e = j2.a();
                g();
                throw th2;
            }
        }
        if (z3 & true) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if (z3 & true) {
            this.j = Collections.unmodifiableList(this.j);
        }
        if (z3 & true) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if (z3 & true) {
            this.n = Collections.unmodifiableList(this.n);
        }
        if (z3 & true) {
            this.p = Collections.unmodifiableList(this.p);
        }
        if (z3 & true) {
            this.q = Collections.unmodifiableList(this.q);
        }
        if (z3 & true) {
            this.r = Collections.unmodifiableList(this.r);
        }
        if (z3 & true) {
            this.s = Collections.unmodifiableList(this.s);
        }
        if (z3 & true) {
            this.t = Collections.unmodifiableList(this.t);
        }
        if (z3 & true) {
            this.u = Collections.unmodifiableList(this.u);
        }
        if (z3 & true) {
            this.x = Collections.unmodifiableList(this.x);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            Throwable th6 = th5;
            this.e = j2.a();
            throw th6;
        }
        this.e = j2.a();
        g();
    }

    public static C6458flb a(InputStream inputStream, Inb inb) throws IOException {
        return (C6458flb) d.a(inputStream, inb);
    }
}
