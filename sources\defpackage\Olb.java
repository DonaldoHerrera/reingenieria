package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Olb reason: default package */
/* compiled from: ProtoBuf */
public final class Olb extends c<Olb> implements Plb {
    private static final Olb c = new Olb(true);
    public static Ynb<Olb> d = new Nlb();
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
    public _lb j;
    /* access modifiers changed from: private */
    public int k;
    /* access modifiers changed from: private */
    public List<C6527gmb> l;
    /* access modifiers changed from: private */
    public _lb m;
    /* access modifiers changed from: private */
    public int n;
    /* access modifiers changed from: private */
    public C7003nmb o;
    /* access modifiers changed from: private */
    public int p;
    /* access modifiers changed from: private */
    public int q;
    /* access modifiers changed from: private */
    public List<Integer> r;
    private byte s;
    private int t;

    /* renamed from: Olb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends b<Olb, a> implements Plb {
        private int d;
        private int e = 518;
        private int f = 2054;
        private int g;
        private _lb h = _lb.q();
        private int i;
        private List<C6527gmb> j = Collections.emptyList();
        private _lb k = _lb.q();
        private int l;
        private C7003nmb m = C7003nmb.l();
        private int n;
        private int o;
        private List<Integer> p = Collections.emptyList();

        private a() {
            h();
        }

        /* access modifiers changed from: private */
        public static a e() {
            return new a();
        }

        private void h() {
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

        public Olb d() {
            Olb olb = new Olb((b) this);
            int i2 = this.d;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            olb.g = this.e;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            olb.h = this.f;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            olb.i = this.g;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            olb.j = this.h;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            olb.k = this.i;
            if ((this.d & 32) == 32) {
                this.j = Collections.unmodifiableList(this.j);
                this.d &= -33;
            }
            olb.l = this.j;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            olb.m = this.k;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            olb.n = this.l;
            if ((i2 & 256) == 256) {
                i3 |= 128;
            }
            olb.o = this.m;
            if ((i2 & 512) == 512) {
                i3 |= 256;
            }
            olb.p = this.n;
            if ((i2 & 1024) == 1024) {
                i3 |= 512;
            }
            olb.q = this.o;
            if ((this.d & 2048) == 2048) {
                this.p = Collections.unmodifiableList(this.p);
                this.d &= -2049;
            }
            olb.r = this.p;
            olb.f = i3;
            return olb;
        }

        public a f(int i2) {
            this.d |= 16;
            this.i = i2;
            return this;
        }

        public a g(int i2) {
            this.d |= 1024;
            this.o = i2;
            return this;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((Olb) mnb);
            return this;
        }

        public Olb build() {
            Olb d2 = d();
            if (d2.i()) {
                return d2;
            }
            throw defpackage.Bnb.a.a(d2);
        }

        public a c(int i2) {
            this.d |= 4;
            this.g = i2;
            return this;
        }

        public a e(int i2) {
            this.d |= 128;
            this.l = i2;
            return this;
        }

        private void f() {
            if ((this.d & 32) != 32) {
                this.j = new ArrayList(this.j);
                this.d |= 32;
            }
        }

        private void g() {
            if ((this.d & 2048) != 2048) {
                this.p = new ArrayList(this.p);
                this.d |= 2048;
            }
        }

        public a clone() {
            a e2 = e();
            e2.a(d());
            return e2;
        }

        public a a(Olb olb) {
            if (olb == Olb.l()) {
                return this;
            }
            if (olb.z()) {
                a(olb.m());
            }
            if (olb.C()) {
                d(olb.p());
            }
            if (olb.B()) {
                c(olb.o());
            }
            if (olb.F()) {
                b(olb.s());
            }
            if (olb.G()) {
                f(olb.t());
            }
            if (!olb.l.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = olb.l;
                    this.d &= -33;
                } else {
                    f();
                    this.j.addAll(olb.l);
                }
            }
            if (olb.D()) {
                a(olb.q());
            }
            if (olb.E()) {
                e(olb.r());
            }
            if (olb.I()) {
                a(olb.v());
            }
            if (olb.A()) {
                b(olb.n());
            }
            if (olb.H()) {
                g(olb.u());
            }
            if (!olb.r.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = olb.r;
                    this.d &= -2049;
                } else {
                    g();
                    this.p.addAll(olb.r);
                }
            }
            a(olb);
            a(b().b(olb.e));
            return this;
        }

        public a b(int i2) {
            this.d |= 512;
            this.n = i2;
            return this;
        }

        public a d(int i2) {
            this.d |= 2;
            this.f = i2;
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            Olb olb;
            Olb olb2 = null;
            try {
                Olb olb3 = (Olb) Olb.d.a(gnb, inb);
                if (olb3 != null) {
                    a(olb3);
                }
                return this;
            } catch (Onb e2) {
                olb = (Olb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                olb2 = olb;
            }
            if (olb2 != null) {
                a(olb2);
            }
            throw th;
        }

        public a a(int i2) {
            this.d |= 1;
            this.e = i2;
            return this;
        }

        public a a(_lb _lb) {
            if ((this.d & 64) != 64 || this.k == _lb.q()) {
                this.k = _lb;
            } else {
                c c = _lb.c(this.k);
                c.c(_lb);
                this.k = c.d();
            }
            this.d |= 64;
            return this;
        }

        public a a(C7003nmb nmb) {
            if ((this.d & 256) != 256 || this.m == C7003nmb.l()) {
                this.m = nmb;
            } else {
                defpackage.C7003nmb.a b = C7003nmb.b(this.m);
                b.a(nmb);
                this.m = b.d();
            }
            this.d |= 256;
            return this;
        }
    }

    static {
        c.K();
    }

    public static a J() {
        return a.e();
    }

    private void K() {
        this.g = 518;
        this.h = 2054;
        this.i = 0;
        this.j = _lb.q();
        this.k = 0;
        this.l = Collections.emptyList();
        this.m = _lb.q();
        this.n = 0;
        this.o = C7003nmb.l();
        this.p = 0;
        this.q = 0;
        this.r = Collections.emptyList();
    }

    public static Olb l() {
        return c;
    }

    public boolean A() {
        return (this.f & 256) == 256;
    }

    public boolean B() {
        return (this.f & 4) == 4;
    }

    public boolean C() {
        return (this.f & 2) == 2;
    }

    public boolean D() {
        return (this.f & 32) == 32;
    }

    public boolean E() {
        return (this.f & 64) == 64;
    }

    public boolean F() {
        return (this.f & 8) == 8;
    }

    public boolean G() {
        return (this.f & 16) == 16;
    }

    public boolean H() {
        return (this.f & 512) == 512;
    }

    public boolean I() {
        return (this.f & 128) == 128;
    }

    public final boolean i() {
        byte b = this.s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!B()) {
            this.s = 0;
            return false;
        } else if (!F() || s().i()) {
            for (int i2 = 0; i2 < w(); i2++) {
                if (!a(i2).i()) {
                    this.s = 0;
                    return false;
                }
            }
            if (D() && !q().i()) {
                this.s = 0;
                return false;
            } else if (I() && !v().i()) {
                this.s = 0;
                return false;
            } else if (!h()) {
                this.s = 0;
                return false;
            } else {
                this.s = 1;
                return true;
            }
        } else {
            this.s = 0;
            return false;
        }
    }

    public int m() {
        return this.g;
    }

    public int n() {
        return this.p;
    }

    public int o() {
        return this.i;
    }

    public int p() {
        return this.h;
    }

    public _lb q() {
        return this.m;
    }

    public int r() {
        return this.n;
    }

    public _lb s() {
        return this.j;
    }

    public int t() {
        return this.k;
    }

    public int u() {
        return this.q;
    }

    public C7003nmb v() {
        return this.o;
    }

    public int w() {
        return this.l.size();
    }

    public List<C6527gmb> x() {
        return this.l;
    }

    public List<Integer> y() {
        return this.r;
    }

    public boolean z() {
        return (this.f & 1) == 1;
    }

    public Ynb<Olb> e() {
        return d;
    }

    private Olb(b<Olb, ?> bVar) {
        super(bVar);
        this.s = -1;
        this.t = -1;
        this.e = bVar.b();
    }

    public int c() {
        int i2 = this.t;
        if (i2 != -1) {
            return i2;
        }
        int b = (this.f & 2) == 2 ? Hnb.b(1, this.h) + 0 : 0;
        if ((this.f & 4) == 4) {
            b += Hnb.b(2, this.i);
        }
        if ((this.f & 8) == 8) {
            b += Hnb.a(3, (Wnb) this.j);
        }
        int i3 = b;
        for (int i4 = 0; i4 < this.l.size(); i4++) {
            i3 += Hnb.a(4, (Wnb) this.l.get(i4));
        }
        if ((this.f & 32) == 32) {
            i3 += Hnb.a(5, (Wnb) this.m);
        }
        if ((this.f & 128) == 128) {
            i3 += Hnb.a(6, (Wnb) this.o);
        }
        if ((this.f & 256) == 256) {
            i3 += Hnb.b(7, this.p);
        }
        if ((this.f & 512) == 512) {
            i3 += Hnb.b(8, this.q);
        }
        if ((this.f & 16) == 16) {
            i3 += Hnb.b(9, this.k);
        }
        if ((this.f & 64) == 64) {
            i3 += Hnb.b(10, this.n);
        }
        if ((this.f & 1) == 1) {
            i3 += Hnb.b(11, this.g);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.r.size(); i6++) {
            i5 += Hnb.c(((Integer) this.r.get(i6)).intValue());
        }
        int size = i3 + i5 + (y().size() * 2) + j() + this.e.size();
        this.t = size;
        return size;
    }

    public a d() {
        return J();
    }

    public static a d(Olb olb) {
        a J = J();
        J.a(olb);
        return J;
    }

    public a b() {
        return d(this);
    }

    private Olb(boolean z) {
        this.s = -1;
        this.t = -1;
        this.e = Fnb.a;
    }

    public Olb a() {
        return c;
    }

    public C6527gmb a(int i2) {
        return (C6527gmb) this.l.get(i2);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        a k2 = k();
        if ((this.f & 2) == 2) {
            hnb.d(1, this.h);
        }
        if ((this.f & 4) == 4) {
            hnb.d(2, this.i);
        }
        if ((this.f & 8) == 8) {
            hnb.c(3, (Wnb) this.j);
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            hnb.c(4, (Wnb) this.l.get(i2));
        }
        if ((this.f & 32) == 32) {
            hnb.c(5, (Wnb) this.m);
        }
        if ((this.f & 128) == 128) {
            hnb.c(6, (Wnb) this.o);
        }
        if ((this.f & 256) == 256) {
            hnb.d(7, this.p);
        }
        if ((this.f & 512) == 512) {
            hnb.d(8, this.q);
        }
        if ((this.f & 16) == 16) {
            hnb.d(9, this.k);
        }
        if ((this.f & 64) == 64) {
            hnb.d(10, this.n);
        }
        if ((this.f & 1) == 1) {
            hnb.d(11, this.g);
        }
        for (int i3 = 0; i3 < this.r.size(); i3++) {
            hnb.d(31, ((Integer) this.r.get(i3)).intValue());
        }
        k2.a(19000, hnb);
        hnb.c(this.e);
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [_lb$c] */
    /* JADX WARNING: type inference failed for: r8v2, types: [_lb$c] */
    /* JADX WARNING: type inference failed for: r8v5, types: [_lb$c] */
    /* JADX WARNING: type inference failed for: r8v6, types: [_lb$c] */
    /* JADX WARNING: type inference failed for: r8v7, types: [nmb$a] */
    /* JADX WARNING: type inference failed for: r8v8, types: [nmb$a] */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], _lb$c, nmb$a]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], _lb$c, nmb$a]
  mth insns count: 198
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    private Olb(Gnb gnb, Inb inb) throws Onb {
        this.s = -1;
        this.t = -1;
        K();
        b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = gnb.x();
                ? r8 = 0;
                switch (x) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.f |= 2;
                        this.h = gnb.j();
                        break;
                    case 16:
                        this.f |= 4;
                        this.i = gnb.j();
                        break;
                    case 26:
                        if ((this.f & 8) == 8) {
                            r8 = this.j.b();
                        }
                        this.j = (_lb) gnb.a(_lb.d, inb);
                        if (r8 != 0) {
                            r8.c(this.j);
                            this.j = r8.d();
                        }
                        this.f |= 8;
                        break;
                    case 34:
                        if (!(z2 & true)) {
                            this.l = new ArrayList();
                            z2 |= true;
                        }
                        this.l.add(gnb.a(C6527gmb.d, inb));
                        break;
                    case 42:
                        if ((this.f & 32) == 32) {
                            r8 = this.m.b();
                        }
                        this.m = (_lb) gnb.a(_lb.d, inb);
                        if (r8 != 0) {
                            r8.c(this.m);
                            this.m = r8.d();
                        }
                        this.f |= 32;
                        break;
                    case 50:
                        if ((this.f & 128) == 128) {
                            r8 = this.o.b();
                        }
                        this.o = (C7003nmb) gnb.a(C7003nmb.d, inb);
                        if (r8 != 0) {
                            r8.a(this.o);
                            this.o = r8.d();
                        }
                        this.f |= 128;
                        break;
                    case 56:
                        this.f |= 256;
                        this.p = gnb.j();
                        break;
                    case 64:
                        this.f |= 512;
                        this.q = gnb.j();
                        break;
                    case 72:
                        this.f |= 16;
                        this.k = gnb.j();
                        break;
                    case 80:
                        this.f |= 64;
                        this.n = gnb.j();
                        break;
                    case 88:
                        this.f |= 1;
                        this.g = gnb.j();
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.r = new ArrayList();
                            z2 |= true;
                        }
                        this.r.add(Integer.valueOf(gnb.j()));
                        break;
                    case 250:
                        int d2 = gnb.d(gnb.o());
                        if (!(z2 & true) && gnb.a() > 0) {
                            this.r = new ArrayList();
                            z2 |= true;
                        }
                        while (gnb.a() > 0) {
                            this.r.add(Integer.valueOf(gnb.j()));
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
                    this.l = Collections.unmodifiableList(this.l);
                }
                if (z2 & true) {
                    this.r = Collections.unmodifiableList(this.r);
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
            this.l = Collections.unmodifiableList(this.l);
        }
        if (z2 & true) {
            this.r = Collections.unmodifiableList(this.r);
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
