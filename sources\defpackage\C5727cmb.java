package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cmb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C5727cmb extends c<C5727cmb> implements C6323dmb {
    private static final C5727cmb c = new C5727cmb(true);
    public static Ynb<C5727cmb> d = new C5659bmb();
    /* access modifiers changed from: private */
    public final Fnb e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public int h;
    /* access modifiers changed from: private */
    public List<C6527gmb> i;
    /* access modifiers changed from: private */
    public _lb j;
    /* access modifiers changed from: private */
    public int k;
    /* access modifiers changed from: private */
    public _lb l;
    /* access modifiers changed from: private */
    public int m;
    /* access modifiers changed from: private */
    public List<C5590alb> n;
    /* access modifiers changed from: private */
    public List<Integer> o;
    private byte p;
    private int q;

    /* renamed from: cmb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends b<C5727cmb, a> implements C6323dmb {
        private int d;
        private int e = 6;
        private int f;
        private List<C6527gmb> g = Collections.emptyList();
        private _lb h = _lb.q();
        private int i;
        private _lb j = _lb.q();
        private int k;
        private List<C5590alb> l = Collections.emptyList();
        private List<Integer> m = Collections.emptyList();

        private a() {
            j();
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
            if ((this.d & 4) != 4) {
                this.g = new ArrayList(this.g);
                this.d |= 4;
            }
        }

        private void h() {
            if ((this.d & 256) != 256) {
                this.m = new ArrayList(this.m);
                this.d |= 256;
            }
        }

        private void j() {
        }

        public a b(int i2) {
            this.d |= 1;
            this.e = i2;
            return this;
        }

        public C5727cmb d() {
            C5727cmb cmb = new C5727cmb((b) this);
            int i2 = this.d;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            cmb.g = this.e;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            cmb.h = this.f;
            if ((this.d & 4) == 4) {
                this.g = Collections.unmodifiableList(this.g);
                this.d &= -5;
            }
            cmb.i = this.g;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            cmb.j = this.h;
            if ((i2 & 16) == 16) {
                i3 |= 8;
            }
            cmb.k = this.i;
            if ((i2 & 32) == 32) {
                i3 |= 16;
            }
            cmb.l = this.j;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            cmb.m = this.k;
            if ((this.d & 128) == 128) {
                this.l = Collections.unmodifiableList(this.l);
                this.d &= -129;
            }
            cmb.n = this.l;
            if ((this.d & 256) == 256) {
                this.m = Collections.unmodifiableList(this.m);
                this.d &= -257;
            }
            cmb.o = this.m;
            cmb.f = i3;
            return cmb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C5727cmb) mnb);
            return this;
        }

        public C5727cmb build() {
            C5727cmb d2 = d();
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

        public a b(_lb _lb) {
            if ((this.d & 8) != 8 || this.h == _lb.q()) {
                this.h = _lb;
            } else {
                c c = _lb.c(this.h);
                c.c(_lb);
                this.h = c.d();
            }
            this.d |= 8;
            return this;
        }

        public a clone() {
            a e2 = e();
            e2.a(d());
            return e2;
        }

        public a a(C5727cmb cmb) {
            if (cmb == C5727cmb.n()) {
                return this;
            }
            if (cmb.z()) {
                b(cmb.q());
            }
            if (cmb.A()) {
                c(cmb.r());
            }
            if (!cmb.i.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = cmb.i;
                    this.d &= -5;
                } else {
                    g();
                    this.g.addAll(cmb.i);
                }
            }
            if (cmb.B()) {
                b(cmb.u());
            }
            if (cmb.C()) {
                d(cmb.v());
            }
            if (cmb.x()) {
                a(cmb.o());
            }
            if (cmb.y()) {
                a(cmb.p());
            }
            if (!cmb.n.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = cmb.n;
                    this.d &= -129;
                } else {
                    f();
                    this.l.addAll(cmb.n);
                }
            }
            if (!cmb.o.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = cmb.o;
                    this.d &= -257;
                } else {
                    h();
                    this.m.addAll(cmb.o);
                }
            }
            a(cmb);
            a(b().b(cmb.e));
            return this;
        }

        public a d(int i2) {
            this.d |= 16;
            this.i = i2;
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            C5727cmb cmb;
            C5727cmb cmb2 = null;
            try {
                C5727cmb cmb3 = (C5727cmb) C5727cmb.d.a(gnb, inb);
                if (cmb3 != null) {
                    a(cmb3);
                }
                return this;
            } catch (Onb e2) {
                cmb = (C5727cmb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                cmb2 = cmb;
            }
            if (cmb2 != null) {
                a(cmb2);
            }
            throw th;
        }

        public a a(_lb _lb) {
            if ((this.d & 32) != 32 || this.j == _lb.q()) {
                this.j = _lb;
            } else {
                c c = _lb.c(this.j);
                c.c(_lb);
                this.j = c.d();
            }
            this.d |= 32;
            return this;
        }

        public a a(int i2) {
            this.d |= 64;
            this.k = i2;
            return this;
        }
    }

    static {
        c.E();
    }

    public static a D() {
        return a.e();
    }

    private void E() {
        this.g = 6;
        this.h = 0;
        this.i = Collections.emptyList();
        this.j = _lb.q();
        this.k = 0;
        this.l = _lb.q();
        this.m = 0;
        this.n = Collections.emptyList();
        this.o = Collections.emptyList();
    }

    public static C5727cmb n() {
        return c;
    }

    public boolean A() {
        return (this.f & 2) == 2;
    }

    public boolean B() {
        return (this.f & 4) == 4;
    }

    public boolean C() {
        return (this.f & 8) == 8;
    }

    public final boolean i() {
        byte b = this.p;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!A()) {
            this.p = 0;
            return false;
        }
        for (int i2 = 0; i2 < s(); i2++) {
            if (!b(i2).i()) {
                this.p = 0;
                return false;
            }
        }
        if (B() && !u().i()) {
            this.p = 0;
            return false;
        } else if (!x() || o().i()) {
            for (int i3 = 0; i3 < l(); i3++) {
                if (!a(i3).i()) {
                    this.p = 0;
                    return false;
                }
            }
            if (!h()) {
                this.p = 0;
                return false;
            }
            this.p = 1;
            return true;
        } else {
            this.p = 0;
            return false;
        }
    }

    public int l() {
        return this.n.size();
    }

    public List<C5590alb> m() {
        return this.n;
    }

    public _lb o() {
        return this.l;
    }

    public int p() {
        return this.m;
    }

    public int q() {
        return this.g;
    }

    public int r() {
        return this.h;
    }

    public int s() {
        return this.i.size();
    }

    public List<C6527gmb> t() {
        return this.i;
    }

    public _lb u() {
        return this.j;
    }

    public int v() {
        return this.k;
    }

    public List<Integer> w() {
        return this.o;
    }

    public boolean x() {
        return (this.f & 16) == 16;
    }

    public boolean y() {
        return (this.f & 32) == 32;
    }

    public boolean z() {
        return (this.f & 1) == 1;
    }

    public Ynb<C5727cmb> e() {
        return d;
    }

    private C5727cmb(b<C5727cmb, ?> bVar) {
        super(bVar);
        this.p = -1;
        this.q = -1;
        this.e = bVar.b();
    }

    public static a e(C5727cmb cmb) {
        a D = D();
        D.a(cmb);
        return D;
    }

    public int c() {
        int i2 = this.q;
        if (i2 != -1) {
            return i2;
        }
        int b = (this.f & 1) == 1 ? Hnb.b(1, this.g) + 0 : 0;
        if ((this.f & 2) == 2) {
            b += Hnb.b(2, this.h);
        }
        int i3 = b;
        for (int i4 = 0; i4 < this.i.size(); i4++) {
            i3 += Hnb.a(3, (Wnb) this.i.get(i4));
        }
        if ((this.f & 4) == 4) {
            i3 += Hnb.a(4, (Wnb) this.j);
        }
        if ((this.f & 8) == 8) {
            i3 += Hnb.b(5, this.k);
        }
        if ((this.f & 16) == 16) {
            i3 += Hnb.a(6, (Wnb) this.l);
        }
        if ((this.f & 32) == 32) {
            i3 += Hnb.b(7, this.m);
        }
        for (int i5 = 0; i5 < this.n.size(); i5++) {
            i3 += Hnb.a(8, (Wnb) this.n.get(i5));
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.o.size(); i7++) {
            i6 += Hnb.c(((Integer) this.o.get(i7)).intValue());
        }
        int size = i3 + i6 + (w().size() * 2) + j() + this.e.size();
        this.q = size;
        return size;
    }

    public a d() {
        return D();
    }

    public C5727cmb a() {
        return c;
    }

    public C6527gmb b(int i2) {
        return (C6527gmb) this.i.get(i2);
    }

    private C5727cmb(boolean z) {
        this.p = -1;
        this.q = -1;
        this.e = Fnb.a;
    }

    public C5590alb a(int i2) {
        return (C5590alb) this.n.get(i2);
    }

    public a b() {
        return e(this);
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
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            hnb.c(3, (Wnb) this.i.get(i2));
        }
        if ((this.f & 4) == 4) {
            hnb.c(4, (Wnb) this.j);
        }
        if ((this.f & 8) == 8) {
            hnb.d(5, this.k);
        }
        if ((this.f & 16) == 16) {
            hnb.c(6, (Wnb) this.l);
        }
        if ((this.f & 32) == 32) {
            hnb.d(7, this.m);
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            hnb.c(8, (Wnb) this.n.get(i3));
        }
        for (int i4 = 0; i4 < this.o.size(); i4++) {
            hnb.d(31, ((Integer) this.o.get(i4)).intValue());
        }
        k2.a(200, hnb);
        hnb.c(this.e);
    }

    private C5727cmb(Gnb gnb, Inb inb) throws Onb {
        this.p = -1;
        this.q = -1;
        E();
        b j2 = Fnb.j();
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
                        this.f |= 1;
                        this.g = gnb.j();
                        break;
                    case 16:
                        this.f |= 2;
                        this.h = gnb.j();
                        break;
                    case 26:
                        if (!(z2 & true)) {
                            this.i = new ArrayList();
                            z2 |= true;
                        }
                        this.i.add(gnb.a(C6527gmb.d, inb));
                        break;
                    case 34:
                        if ((this.f & 4) == 4) {
                            cVar = this.j.b();
                        }
                        this.j = (_lb) gnb.a(_lb.d, inb);
                        if (cVar != null) {
                            cVar.c(this.j);
                            this.j = cVar.d();
                        }
                        this.f |= 4;
                        break;
                    case 40:
                        this.f |= 8;
                        this.k = gnb.j();
                        break;
                    case 50:
                        if ((this.f & 16) == 16) {
                            cVar = this.l.b();
                        }
                        this.l = (_lb) gnb.a(_lb.d, inb);
                        if (cVar != null) {
                            cVar.c(this.l);
                            this.l = cVar.d();
                        }
                        this.f |= 16;
                        break;
                    case 56:
                        this.f |= 32;
                        this.m = gnb.j();
                        break;
                    case 66:
                        if (!(z2 & true)) {
                            this.n = new ArrayList();
                            z2 |= true;
                        }
                        this.n.add(gnb.a(C5590alb.c, inb));
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.o = new ArrayList();
                            z2 |= true;
                        }
                        this.o.add(Integer.valueOf(gnb.j()));
                        break;
                    case 250:
                        int d2 = gnb.d(gnb.o());
                        if (!(z2 & true) && gnb.a() > 0) {
                            this.o = new ArrayList();
                            z2 |= true;
                        }
                        while (gnb.a() > 0) {
                            this.o.add(Integer.valueOf(gnb.j()));
                        }
                        gnb.c(d2);
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
                if (z2 & true) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if (z2 & true) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if (z2 & true) {
                    this.o = Collections.unmodifiableList(this.o);
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
            this.i = Collections.unmodifiableList(this.i);
        }
        if (z2 & true) {
            this.n = Collections.unmodifiableList(this.n);
        }
        if (z2 & true) {
            this.o = Collections.unmodifiableList(this.o);
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

    public static C5727cmb a(InputStream inputStream, Inb inb) throws IOException {
        return (C5727cmb) d.b(inputStream, inb);
    }
}
