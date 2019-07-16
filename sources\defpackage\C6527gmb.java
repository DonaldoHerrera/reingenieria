package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: gmb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C6527gmb extends c<C6527gmb> implements C6663imb {
    private static final C6527gmb c = new C6527gmb(true);
    public static Ynb<C6527gmb> d = new C6459fmb();
    /* access modifiers changed from: private */
    public final Fnb e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public int h;
    /* access modifiers changed from: private */
    public boolean i;
    /* access modifiers changed from: private */
    public b j;
    /* access modifiers changed from: private */
    public List<_lb> k;
    /* access modifiers changed from: private */
    public List<Integer> l;
    private int m;
    private byte n;
    private int o;

    /* renamed from: gmb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends defpackage.Mnb.b<C6527gmb, a> implements C6663imb {
        private int d;
        private int e;
        private int f;
        private boolean g;
        private b h = b.INV;
        private List<_lb> i = Collections.emptyList();
        private List<Integer> j = Collections.emptyList();

        private a() {
            h();
        }

        /* access modifiers changed from: private */
        public static a e() {
            return new a();
        }

        private void f() {
            if ((this.d & 32) != 32) {
                this.j = new ArrayList(this.j);
                this.d |= 32;
            }
        }

        private void g() {
            if ((this.d & 16) != 16) {
                this.i = new ArrayList(this.i);
                this.d |= 16;
            }
        }

        private void h() {
        }

        public a b(int i2) {
            this.d |= 2;
            this.f = i2;
            return this;
        }

        public C6527gmb d() {
            C6527gmb gmb = new C6527gmb((defpackage.Mnb.b) this);
            int i2 = this.d;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            gmb.g = this.e;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            gmb.h = this.f;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            gmb.i = this.g;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            gmb.j = this.h;
            if ((this.d & 16) == 16) {
                this.i = Collections.unmodifiableList(this.i);
                this.d &= -17;
            }
            gmb.k = this.i;
            if ((this.d & 32) == 32) {
                this.j = Collections.unmodifiableList(this.j);
                this.d &= -33;
            }
            gmb.l = this.j;
            gmb.f = i3;
            return gmb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C6527gmb) mnb);
            return this;
        }

        public C6527gmb build() {
            C6527gmb d2 = d();
            if (d2.i()) {
                return d2;
            }
            throw defpackage.Bnb.a.a(d2);
        }

        public a clone() {
            a e2 = e();
            e2.a(d());
            return e2;
        }

        public a a(C6527gmb gmb) {
            if (gmb == C6527gmb.l()) {
                return this;
            }
            if (gmb.t()) {
                a(gmb.m());
            }
            if (gmb.u()) {
                b(gmb.n());
            }
            if (gmb.v()) {
                a(gmb.o());
            }
            if (gmb.w()) {
                a(gmb.s());
            }
            if (!gmb.k.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = gmb.k;
                    this.d &= -17;
                } else {
                    g();
                    this.i.addAll(gmb.k);
                }
            }
            if (!gmb.l.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = gmb.l;
                    this.d &= -33;
                } else {
                    f();
                    this.j.addAll(gmb.l);
                }
            }
            a(gmb);
            a(b().b(gmb.e));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            C6527gmb gmb;
            C6527gmb gmb2 = null;
            try {
                C6527gmb gmb3 = (C6527gmb) C6527gmb.d.a(gnb, inb);
                if (gmb3 != null) {
                    a(gmb3);
                }
                return this;
            } catch (Onb e2) {
                gmb = (C6527gmb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                gmb2 = gmb;
            }
            if (gmb2 != null) {
                a(gmb2);
            }
            throw th;
        }

        public a a(int i2) {
            this.d |= 1;
            this.e = i2;
            return this;
        }

        public a a(boolean z) {
            this.d |= 4;
            this.g = z;
            return this;
        }

        public a a(b bVar) {
            if (bVar != null) {
                this.d |= 8;
                this.h = bVar;
                return this;
            }
            throw new NullPointerException();
        }
    }

    /* renamed from: gmb$b */
    /* compiled from: ProtoBuf */
    public enum b implements defpackage.Nnb.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        
        private static defpackage.Nnb.b<b> d;
        private final int f;

        static {
            d = new C6595hmb();
        }

        private b(int i, int i2) {
            this.f = i2;
        }

        public static b a(int i) {
            if (i == 0) {
                return IN;
            }
            if (i == 1) {
                return OUT;
            }
            if (i != 2) {
                return null;
            }
            return INV;
        }

        public final int i() {
            return this.f;
        }
    }

    static {
        c.y();
    }

    public static C6527gmb l() {
        return c;
    }

    public static a x() {
        return a.e();
    }

    private void y() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = b.INV;
        this.k = Collections.emptyList();
        this.l = Collections.emptyList();
    }

    public Ynb<C6527gmb> e() {
        return d;
    }

    public final boolean i() {
        byte b2 = this.n;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!t()) {
            this.n = 0;
            return false;
        } else if (!u()) {
            this.n = 0;
            return false;
        } else {
            for (int i2 = 0; i2 < p(); i2++) {
                if (!a(i2).i()) {
                    this.n = 0;
                    return false;
                }
            }
            if (!h()) {
                this.n = 0;
                return false;
            }
            this.n = 1;
            return true;
        }
    }

    public int m() {
        return this.g;
    }

    public int n() {
        return this.h;
    }

    public boolean o() {
        return this.i;
    }

    public int p() {
        return this.k.size();
    }

    public List<Integer> q() {
        return this.l;
    }

    public List<_lb> r() {
        return this.k;
    }

    public b s() {
        return this.j;
    }

    public boolean t() {
        return (this.f & 1) == 1;
    }

    public boolean u() {
        return (this.f & 2) == 2;
    }

    public boolean v() {
        return (this.f & 4) == 4;
    }

    public boolean w() {
        return (this.f & 8) == 8;
    }

    public a d() {
        return x();
    }

    private C6527gmb(defpackage.Mnb.b<C6527gmb, ?> bVar) {
        super(bVar);
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.e = bVar.b();
    }

    public static a d(C6527gmb gmb) {
        a x = x();
        x.a(gmb);
        return x;
    }

    public int c() {
        int i2 = this.o;
        if (i2 != -1) {
            return i2;
        }
        int b2 = (this.f & 1) == 1 ? Hnb.b(1, this.g) + 0 : 0;
        if ((this.f & 2) == 2) {
            b2 += Hnb.b(2, this.h);
        }
        if ((this.f & 4) == 4) {
            b2 += Hnb.a(3, this.i);
        }
        if ((this.f & 8) == 8) {
            b2 += Hnb.a(4, this.j.i());
        }
        int i3 = b2;
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            i3 += Hnb.a(5, (Wnb) this.k.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.l.size(); i6++) {
            i5 += Hnb.c(((Integer) this.l.get(i6)).intValue());
        }
        int i7 = i3 + i5;
        if (!q().isEmpty()) {
            i7 = i7 + 1 + Hnb.c(i5);
        }
        this.m = i5;
        int j2 = i7 + j() + this.e.size();
        this.o = j2;
        return j2;
    }

    public a b() {
        return d(this);
    }

    public C6527gmb a() {
        return c;
    }

    private C6527gmb(boolean z) {
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.e = Fnb.a;
    }

    public _lb a(int i2) {
        return (_lb) this.k.get(i2);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        a k2 = k();
        if ((this.f & 1) == 1) {
            hnb.d(1, this.g);
        }
        if ((this.f & 2) == 2) {
            hnb.d(2, this.h);
        }
        if ((this.f & 4) == 4) {
            hnb.b(3, this.i);
        }
        if ((this.f & 8) == 8) {
            hnb.c(4, this.j.i());
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            hnb.c(5, (Wnb) this.k.get(i2));
        }
        if (q().size() > 0) {
            hnb.p(50);
            hnb.p(this.m);
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            hnb.m(((Integer) this.l.get(i3)).intValue());
        }
        k2.a(1000, hnb);
        hnb.c(this.e);
    }

    private C6527gmb(Gnb gnb, Inb inb) throws Onb {
        this.m = -1;
        this.n = -1;
        this.o = -1;
        y();
        defpackage.Fnb.b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = gnb.x();
                if (x != 0) {
                    if (x == 8) {
                        this.f |= 1;
                        this.g = gnb.j();
                    } else if (x == 16) {
                        this.f |= 2;
                        this.h = gnb.j();
                    } else if (x == 24) {
                        this.f |= 4;
                        this.i = gnb.c();
                    } else if (x == 32) {
                        int f2 = gnb.f();
                        b a3 = b.a(f2);
                        if (a3 == null) {
                            a2.p(x);
                            a2.p(f2);
                        } else {
                            this.f |= 8;
                            this.j = a3;
                        }
                    } else if (x == 42) {
                        if (!(z2 & true)) {
                            this.k = new ArrayList();
                            z2 |= true;
                        }
                        this.k.add(gnb.a(_lb.d, inb));
                    } else if (x == 48) {
                        if (!(z2 & true)) {
                            this.l = new ArrayList();
                            z2 |= true;
                        }
                        this.l.add(Integer.valueOf(gnb.j()));
                    } else if (x == 50) {
                        int d2 = gnb.d(gnb.o());
                        if (!(z2 & true) && gnb.a() > 0) {
                            this.l = new ArrayList();
                            z2 |= true;
                        }
                        while (gnb.a() > 0) {
                            this.l.add(Integer.valueOf(gnb.j()));
                        }
                        gnb.c(d2);
                    } else if (!a(gnb, a2, inb, x)) {
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
                if (z2 & true) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if (z2 & true) {
                    this.l = Collections.unmodifiableList(this.l);
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
        if (z2 & true) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if (z2 & true) {
            this.l = Collections.unmodifiableList(this.l);
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
}
