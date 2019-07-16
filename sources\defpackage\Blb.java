package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Blb reason: default package */
/* compiled from: ProtoBuf */
public final class Blb extends c<Blb> implements Clb {
    private static final Blb c = new Blb(true);
    public static Ynb<Blb> d = new Alb();
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
    public List<C7003nmb> o;
    /* access modifiers changed from: private */
    public C6799kmb p;
    /* access modifiers changed from: private */
    public List<Integer> q;
    /* access modifiers changed from: private */
    public C6934mlb r;
    private byte s;
    private int t;

    /* renamed from: Blb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends b<Blb, a> implements Clb {
        private int d;
        private int e = 6;
        private int f = 6;
        private int g;
        private _lb h = _lb.q();
        private int i;
        private List<C6527gmb> j = Collections.emptyList();
        private _lb k = _lb.q();
        private int l;
        private List<C7003nmb> m = Collections.emptyList();
        private C6799kmb n = C6799kmb.h();
        private List<Integer> o = Collections.emptyList();
        private C6934mlb p = C6934mlb.h();

        private a() {
            j();
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
            if ((this.d & 256) != 256) {
                this.m = new ArrayList(this.m);
                this.d |= 256;
            }
        }

        private void h() {
            if ((this.d & 1024) != 1024) {
                this.o = new ArrayList(this.o);
                this.d |= 1024;
            }
        }

        private void j() {
        }

        public a b(int i2) {
            this.d |= 4;
            this.g = i2;
            return this;
        }

        public Blb d() {
            Blb blb = new Blb((b) this);
            int i2 = this.d;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            blb.g = this.e;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            blb.h = this.f;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            blb.i = this.g;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            blb.j = this.h;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            blb.k = this.i;
            if ((this.d & 32) == 32) {
                this.j = Collections.unmodifiableList(this.j);
                this.d &= -33;
            }
            blb.l = this.j;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            blb.m = this.k;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            blb.n = this.l;
            if ((this.d & 256) == 256) {
                this.m = Collections.unmodifiableList(this.m);
                this.d &= -257;
            }
            blb.o = this.m;
            if ((i2 & 512) == 512) {
                i3 |= 128;
            }
            blb.p = this.n;
            if ((this.d & 1024) == 1024) {
                this.o = Collections.unmodifiableList(this.o);
                this.d &= -1025;
            }
            blb.q = this.o;
            if ((i2 & 2048) == 2048) {
                i3 |= 256;
            }
            blb.r = this.p;
            blb.f = i3;
            return blb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((Blb) mnb);
            return this;
        }

        public Blb build() {
            Blb d2 = d();
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

        public a e(int i2) {
            this.d |= 16;
            this.i = i2;
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

        public a a(Blb blb) {
            if (blb == Blb.m()) {
                return this;
            }
            if (blb.B()) {
                a(blb.n());
            }
            if (blb.D()) {
                c(blb.p());
            }
            if (blb.C()) {
                b(blb.o());
            }
            if (blb.G()) {
                b(blb.s());
            }
            if (blb.H()) {
                e(blb.t());
            }
            if (!blb.l.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = blb.l;
                    this.d &= -33;
                } else {
                    f();
                    this.j.addAll(blb.l);
                }
            }
            if (blb.E()) {
                a(blb.q());
            }
            if (blb.F()) {
                d(blb.r());
            }
            if (!blb.o.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = blb.o;
                    this.d &= -257;
                } else {
                    g();
                    this.m.addAll(blb.o);
                }
            }
            if (blb.I()) {
                a(blb.w());
            }
            if (!blb.q.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = blb.q;
                    this.d &= -1025;
                } else {
                    h();
                    this.o.addAll(blb.q);
                }
            }
            if (blb.A()) {
                a(blb.l());
            }
            a(blb);
            a(b().b(blb.e));
            return this;
        }

        public a d(int i2) {
            this.d |= 128;
            this.l = i2;
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            Blb blb;
            Blb blb2 = null;
            try {
                Blb blb3 = (Blb) Blb.d.a(gnb, inb);
                if (blb3 != null) {
                    a(blb3);
                }
                return this;
            } catch (Onb e2) {
                blb = (Blb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                blb2 = blb;
            }
            if (blb2 != null) {
                a(blb2);
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

        public a a(C6799kmb kmb) {
            if ((this.d & 512) != 512 || this.n == C6799kmb.h()) {
                this.n = kmb;
            } else {
                defpackage.C6799kmb.a c = C6799kmb.c(this.n);
                c.a(kmb);
                this.n = c.d();
            }
            this.d |= 512;
            return this;
        }

        public a a(C6934mlb mlb) {
            if ((this.d & 2048) != 2048 || this.p == C6934mlb.h()) {
                this.p = mlb;
            } else {
                defpackage.C6934mlb.a c = C6934mlb.c(this.p);
                c.a(mlb);
                this.p = c.d();
            }
            this.d |= 2048;
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
        this.g = 6;
        this.h = 6;
        this.i = 0;
        this.j = _lb.q();
        this.k = 0;
        this.l = Collections.emptyList();
        this.m = _lb.q();
        this.n = 0;
        this.o = Collections.emptyList();
        this.p = C6799kmb.h();
        this.q = Collections.emptyList();
        this.r = C6934mlb.h();
    }

    public static Blb m() {
        return c;
    }

    public boolean A() {
        return (this.f & 256) == 256;
    }

    public boolean B() {
        return (this.f & 1) == 1;
    }

    public boolean C() {
        return (this.f & 4) == 4;
    }

    public boolean D() {
        return (this.f & 2) == 2;
    }

    public boolean E() {
        return (this.f & 32) == 32;
    }

    public boolean F() {
        return (this.f & 64) == 64;
    }

    public boolean G() {
        return (this.f & 8) == 8;
    }

    public boolean H() {
        return (this.f & 16) == 16;
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
        if (!C()) {
            this.s = 0;
            return false;
        } else if (!G() || s().i()) {
            for (int i2 = 0; i2 < u(); i2++) {
                if (!a(i2).i()) {
                    this.s = 0;
                    return false;
                }
            }
            if (!E() || q().i()) {
                for (int i3 = 0; i3 < x(); i3++) {
                    if (!b(i3).i()) {
                        this.s = 0;
                        return false;
                    }
                }
                if (I() && !w().i()) {
                    this.s = 0;
                    return false;
                } else if (A() && !l().i()) {
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
        } else {
            this.s = 0;
            return false;
        }
    }

    public C6934mlb l() {
        return this.r;
    }

    public int n() {
        return this.g;
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
        return this.l.size();
    }

    public List<C6527gmb> v() {
        return this.l;
    }

    public C6799kmb w() {
        return this.p;
    }

    public int x() {
        return this.o.size();
    }

    public List<C7003nmb> y() {
        return this.o;
    }

    public List<Integer> z() {
        return this.q;
    }

    public Ynb<Blb> e() {
        return d;
    }

    private Blb(b<Blb, ?> bVar) {
        super(bVar);
        this.s = -1;
        this.t = -1;
        this.e = bVar.b();
    }

    public static a e(Blb blb) {
        a J = J();
        J.a(blb);
        return J;
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
        for (int i5 = 0; i5 < this.o.size(); i5++) {
            i3 += Hnb.a(6, (Wnb) this.o.get(i5));
        }
        if ((this.f & 16) == 16) {
            i3 += Hnb.b(7, this.k);
        }
        if ((this.f & 64) == 64) {
            i3 += Hnb.b(8, this.n);
        }
        if ((this.f & 1) == 1) {
            i3 += Hnb.b(9, this.g);
        }
        if ((this.f & 128) == 128) {
            i3 += Hnb.a(30, (Wnb) this.p);
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.q.size(); i7++) {
            i6 += Hnb.c(((Integer) this.q.get(i7)).intValue());
        }
        int size = i3 + i6 + (z().size() * 2);
        if ((this.f & 256) == 256) {
            size += Hnb.a(32, (Wnb) this.r);
        }
        int j2 = size + j() + this.e.size();
        this.t = j2;
        return j2;
    }

    public a d() {
        return J();
    }

    public C7003nmb b(int i2) {
        return (C7003nmb) this.o.get(i2);
    }

    private Blb(boolean z) {
        this.s = -1;
        this.t = -1;
        this.e = Fnb.a;
    }

    public a b() {
        return e(this);
    }

    public Blb a() {
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
        for (int i3 = 0; i3 < this.o.size(); i3++) {
            hnb.c(6, (Wnb) this.o.get(i3));
        }
        if ((this.f & 16) == 16) {
            hnb.d(7, this.k);
        }
        if ((this.f & 64) == 64) {
            hnb.d(8, this.n);
        }
        if ((this.f & 1) == 1) {
            hnb.d(9, this.g);
        }
        if ((this.f & 128) == 128) {
            hnb.c(30, (Wnb) this.p);
        }
        for (int i4 = 0; i4 < this.q.size(); i4++) {
            hnb.d(31, ((Integer) this.q.get(i4)).intValue());
        }
        if ((this.f & 256) == 256) {
            hnb.c(32, (Wnb) this.r);
        }
        k2.a(19000, hnb);
        hnb.c(this.e);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [_lb$c] */
    /* JADX WARNING: type inference failed for: r9v2, types: [_lb$c] */
    /* JADX WARNING: type inference failed for: r9v5, types: [_lb$c] */
    /* JADX WARNING: type inference failed for: r9v6, types: [_lb$c] */
    /* JADX WARNING: type inference failed for: r9v9, types: [kmb$a] */
    /* JADX WARNING: type inference failed for: r9v10, types: [kmb$a] */
    /* JADX WARNING: type inference failed for: r9v18, types: [mlb$a] */
    /* JADX WARNING: type inference failed for: r9v19, types: [mlb$a] */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r9v21 */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: type inference failed for: r9v23 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], _lb$c, kmb$a, mlb$a]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], _lb$c, kmb$a, mlb$a]
  mth insns count: 225
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
    /* JADX WARNING: Unknown variable types count: 5 */
    private Blb(Gnb gnb, Inb inb) throws Onb {
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
                ? r9 = 0;
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
                            r9 = this.j.b();
                        }
                        this.j = (_lb) gnb.a(_lb.d, inb);
                        if (r9 != 0) {
                            r9.c(this.j);
                            this.j = r9.d();
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
                            r9 = this.m.b();
                        }
                        this.m = (_lb) gnb.a(_lb.d, inb);
                        if (r9 != 0) {
                            r9.c(this.m);
                            this.m = r9.d();
                        }
                        this.f |= 32;
                        break;
                    case 50:
                        if (!(z2 & true)) {
                            this.o = new ArrayList();
                            z2 |= true;
                        }
                        this.o.add(gnb.a(C7003nmb.d, inb));
                        break;
                    case 56:
                        this.f |= 16;
                        this.k = gnb.j();
                        break;
                    case 64:
                        this.f |= 64;
                        this.n = gnb.j();
                        break;
                    case 72:
                        this.f |= 1;
                        this.g = gnb.j();
                        break;
                    case 242:
                        if ((this.f & 128) == 128) {
                            r9 = this.p.b();
                        }
                        this.p = (C6799kmb) gnb.a(C6799kmb.c, inb);
                        if (r9 != 0) {
                            r9.a(this.p);
                            this.p = r9.d();
                        }
                        this.f |= 128;
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.q = new ArrayList();
                            z2 |= true;
                        }
                        this.q.add(Integer.valueOf(gnb.j()));
                        break;
                    case 250:
                        int d2 = gnb.d(gnb.o());
                        if (!(z2 & true) && gnb.a() > 0) {
                            this.q = new ArrayList();
                            z2 |= true;
                        }
                        while (gnb.a() > 0) {
                            this.q.add(Integer.valueOf(gnb.j()));
                        }
                        gnb.c(d2);
                        break;
                    case 258:
                        if ((this.f & 256) == 256) {
                            r9 = this.r.b();
                        }
                        this.r = (C6934mlb) gnb.a(C6934mlb.c, inb);
                        if (r9 != 0) {
                            r9.a(this.r);
                            this.r = r9.d();
                        }
                        this.f |= 256;
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
                    this.o = Collections.unmodifiableList(this.o);
                }
                if (z2 & true) {
                    this.q = Collections.unmodifiableList(this.q);
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
            this.o = Collections.unmodifiableList(this.o);
        }
        if (z2 & true) {
            this.q = Collections.unmodifiableList(this.q);
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

    public static Blb a(InputStream inputStream, Inb inb) throws IOException {
        return (Blb) d.a(inputStream, inb);
    }
}
