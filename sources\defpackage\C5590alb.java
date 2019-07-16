package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: alb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C5590alb extends Mnb implements C6322dlb {
    private static final C5590alb b = new C5590alb(true);
    public static Ynb<C5590alb> c = new Zkb();
    /* access modifiers changed from: private */
    public final Fnb d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public List<a> g;
    private byte h;
    private int i;

    /* renamed from: alb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends Mnb implements b {
        private static final a b = new a(true);
        public static Ynb<a> c = new _kb();
        /* access modifiers changed from: private */
        public final Fnb d;
        /* access modifiers changed from: private */
        public int e;
        /* access modifiers changed from: private */
        public int f;
        /* access modifiers changed from: private */
        public b g;
        private byte h;
        private int i;

        /* renamed from: alb$a$a reason: collision with other inner class name */
        /* compiled from: ProtoBuf */
        public static final class C0163a extends defpackage.Mnb.a<a, C0163a> implements b {
            private int b;
            private int c;
            private b d = b.n();

            private C0163a() {
                f();
            }

            /* access modifiers changed from: private */
            public static C0163a e() {
                return new C0163a();
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

            public C0163a clone() {
                C0163a e = e();
                e.a(d());
                return e;
            }

            public C0163a a(a aVar) {
                if (aVar == a.h()) {
                    return this;
                }
                if (aVar.l()) {
                    a(aVar.j());
                }
                if (aVar.m()) {
                    a(aVar.k());
                }
                a(b().b(aVar.d));
                return this;
            }

            public C0163a a(Gnb gnb, Inb inb) throws IOException {
                a aVar;
                a aVar2 = null;
                try {
                    a aVar3 = (a) a.c.a(gnb, inb);
                    if (aVar3 != null) {
                        a(aVar3);
                    }
                    return this;
                } catch (Onb e) {
                    aVar = (a) e.a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    aVar2 = aVar;
                }
                if (aVar2 != null) {
                    a(aVar2);
                }
                throw th;
            }

            public C0163a a(int i) {
                this.b |= 1;
                this.c = i;
                return this;
            }

            public C0163a a(b bVar) {
                if ((this.b & 2) != 2 || this.d == b.n()) {
                    this.d = bVar;
                } else {
                    C0164a c2 = b.c(this.d);
                    c2.a(bVar);
                    this.d = c2.d();
                }
                this.b |= 2;
                return this;
            }
        }

        /* renamed from: alb$a$b */
        /* compiled from: ProtoBuf */
        public static final class b extends Mnb implements c {
            private static final b b = new b(true);
            public static Ynb<b> c = new C5658blb();
            /* access modifiers changed from: private */
            public final Fnb d;
            /* access modifiers changed from: private */
            public int e;
            /* access modifiers changed from: private */
            public C0165b f;
            /* access modifiers changed from: private */
            public long g;
            /* access modifiers changed from: private */
            public float h;
            /* access modifiers changed from: private */
            public double i;
            /* access modifiers changed from: private */
            public int j;
            /* access modifiers changed from: private */
            public int k;
            /* access modifiers changed from: private */
            public int l;
            /* access modifiers changed from: private */
            public C5590alb m;
            /* access modifiers changed from: private */
            public List<b> n;
            /* access modifiers changed from: private */
            public int o;
            /* access modifiers changed from: private */
            public int p;
            private byte q;
            private int r;

            /* renamed from: alb$a$b$a reason: collision with other inner class name */
            /* compiled from: ProtoBuf */
            public static final class C0164a extends defpackage.Mnb.a<b, C0164a> implements c {
                private int b;
                private C0165b c = C0165b.BYTE;
                private long d;
                private float e;
                private double f;
                private int g;
                private int h;
                private int i;
                private C5590alb j = C5590alb.k();
                private List<b> k = Collections.emptyList();
                private int l;
                private int m;

                private C0164a() {
                    g();
                }

                /* access modifiers changed from: private */
                public static C0164a e() {
                    return new C0164a();
                }

                private void f() {
                    if ((this.b & 256) != 256) {
                        this.k = new ArrayList(this.k);
                        this.b |= 256;
                    }
                }

                private void g() {
                }

                public C0164a b(int i2) {
                    this.b |= 32;
                    this.h = i2;
                    return this;
                }

                public b d() {
                    b bVar = new b((defpackage.Mnb.a) this);
                    int i2 = this.b;
                    int i3 = 1;
                    if ((i2 & 1) != 1) {
                        i3 = 0;
                    }
                    bVar.f = this.c;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    bVar.g = this.d;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    bVar.h = this.e;
                    if ((i2 & 8) == 8) {
                        i3 |= 8;
                    }
                    bVar.i = this.f;
                    if ((i2 & 16) == 16) {
                        i3 |= 16;
                    }
                    bVar.j = this.g;
                    if ((i2 & 32) == 32) {
                        i3 |= 32;
                    }
                    bVar.k = this.h;
                    if ((i2 & 64) == 64) {
                        i3 |= 64;
                    }
                    bVar.l = this.i;
                    if ((i2 & 128) == 128) {
                        i3 |= 128;
                    }
                    bVar.m = this.j;
                    if ((this.b & 256) == 256) {
                        this.k = Collections.unmodifiableList(this.k);
                        this.b &= -257;
                    }
                    bVar.n = this.k;
                    if ((i2 & 512) == 512) {
                        i3 |= 256;
                    }
                    bVar.o = this.l;
                    if ((i2 & 1024) == 1024) {
                        i3 |= 512;
                    }
                    bVar.p = this.m;
                    bVar.e = i3;
                    return bVar;
                }

                public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
                    a((b) mnb);
                    return this;
                }

                public b build() {
                    b d2 = d();
                    if (d2.i()) {
                        return d2;
                    }
                    throw defpackage.Bnb.a.a(d2);
                }

                public C0164a c(int i2) {
                    this.b |= 64;
                    this.i = i2;
                    return this;
                }

                public C0164a e(int i2) {
                    this.b |= 16;
                    this.g = i2;
                    return this;
                }

                public C0164a clone() {
                    C0164a e2 = e();
                    e2.a(d());
                    return e2;
                }

                public C0164a a(b bVar) {
                    if (bVar == b.n()) {
                        return this;
                    }
                    if (bVar.E()) {
                        a(bVar.u());
                    }
                    if (bVar.C()) {
                        a(bVar.s());
                    }
                    if (bVar.B()) {
                        a(bVar.r());
                    }
                    if (bVar.y()) {
                        a(bVar.o());
                    }
                    if (bVar.D()) {
                        e(bVar.t());
                    }
                    if (bVar.x()) {
                        b(bVar.m());
                    }
                    if (bVar.z()) {
                        c(bVar.p());
                    }
                    if (bVar.v()) {
                        a(bVar.h());
                    }
                    if (!bVar.n.isEmpty()) {
                        if (this.k.isEmpty()) {
                            this.k = bVar.n;
                            this.b &= -257;
                        } else {
                            f();
                            this.k.addAll(bVar.n);
                        }
                    }
                    if (bVar.w()) {
                        a(bVar.j());
                    }
                    if (bVar.A()) {
                        d(bVar.q());
                    }
                    a(b().b(bVar.d));
                    return this;
                }

                public C0164a d(int i2) {
                    this.b |= 1024;
                    this.m = i2;
                    return this;
                }

                public C0164a a(Gnb gnb, Inb inb) throws IOException {
                    b bVar;
                    b bVar2 = null;
                    try {
                        b bVar3 = (b) b.c.a(gnb, inb);
                        if (bVar3 != null) {
                            a(bVar3);
                        }
                        return this;
                    } catch (Onb e2) {
                        bVar = (b) e2.a();
                        throw e2;
                    } catch (Throwable th) {
                        th = th;
                        bVar2 = bVar;
                    }
                    if (bVar2 != null) {
                        a(bVar2);
                    }
                    throw th;
                }

                public C0164a a(C0165b bVar) {
                    if (bVar != null) {
                        this.b |= 1;
                        this.c = bVar;
                        return this;
                    }
                    throw new NullPointerException();
                }

                public C0164a a(long j2) {
                    this.b |= 2;
                    this.d = j2;
                    return this;
                }

                public C0164a a(float f2) {
                    this.b |= 4;
                    this.e = f2;
                    return this;
                }

                public C0164a a(double d2) {
                    this.b |= 8;
                    this.f = d2;
                    return this;
                }

                public C0164a a(C5590alb alb) {
                    if ((this.b & 128) != 128 || this.j == C5590alb.k()) {
                        this.j = alb;
                    } else {
                        c c2 = C5590alb.c(this.j);
                        c2.a(alb);
                        this.j = c2.d();
                    }
                    this.b |= 128;
                    return this;
                }

                public C0164a a(int i2) {
                    this.b |= 512;
                    this.l = i2;
                    return this;
                }
            }

            /* renamed from: alb$a$b$b reason: collision with other inner class name */
            /* compiled from: ProtoBuf */
            public enum C0165b implements defpackage.Nnb.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                
                private static defpackage.Nnb.b<C0165b> n;
                private final int p;

                static {
                    n = new C5726clb();
                }

                private C0165b(int i, int i2) {
                    this.p = i2;
                }

                public static C0165b a(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                public final int i() {
                    return this.p;
                }
            }

            static {
                b.G();
            }

            public static C0164a F() {
                return C0164a.e();
            }

            private void G() {
                this.f = C0165b.BYTE;
                this.g = 0;
                this.h = 0.0f;
                this.i = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                this.j = 0;
                this.k = 0;
                this.l = 0;
                this.m = C5590alb.k();
                this.n = Collections.emptyList();
                this.o = 0;
                this.p = 0;
            }

            public static b n() {
                return b;
            }

            public boolean A() {
                return (this.e & 512) == 512;
            }

            public boolean B() {
                return (this.e & 4) == 4;
            }

            public boolean C() {
                return (this.e & 2) == 2;
            }

            public boolean D() {
                return (this.e & 16) == 16;
            }

            public boolean E() {
                return (this.e & 1) == 1;
            }

            public C5590alb h() {
                return this.m;
            }

            public final boolean i() {
                byte b2 = this.q;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                if (!v() || h().i()) {
                    for (int i2 = 0; i2 < k(); i2++) {
                        if (!a(i2).i()) {
                            this.q = 0;
                            return false;
                        }
                    }
                    this.q = 1;
                    return true;
                }
                this.q = 0;
                return false;
            }

            public int j() {
                return this.o;
            }

            public int k() {
                return this.n.size();
            }

            public List<b> l() {
                return this.n;
            }

            public int m() {
                return this.k;
            }

            public double o() {
                return this.i;
            }

            public int p() {
                return this.l;
            }

            public int q() {
                return this.p;
            }

            public float r() {
                return this.h;
            }

            public long s() {
                return this.g;
            }

            public int t() {
                return this.j;
            }

            public C0165b u() {
                return this.f;
            }

            public boolean v() {
                return (this.e & 128) == 128;
            }

            public boolean w() {
                return (this.e & 256) == 256;
            }

            public boolean x() {
                return (this.e & 32) == 32;
            }

            public boolean y() {
                return (this.e & 8) == 8;
            }

            public boolean z() {
                return (this.e & 64) == 64;
            }

            public int c() {
                int i2 = this.r;
                if (i2 != -1) {
                    return i2;
                }
                int a = (this.e & 1) == 1 ? Hnb.a(1, this.f.i()) + 0 : 0;
                if ((this.e & 2) == 2) {
                    a += Hnb.a(2, this.g);
                }
                if ((this.e & 4) == 4) {
                    a += Hnb.a(3, this.h);
                }
                if ((this.e & 8) == 8) {
                    a += Hnb.a(4, this.i);
                }
                if ((this.e & 16) == 16) {
                    a += Hnb.b(5, this.j);
                }
                if ((this.e & 32) == 32) {
                    a += Hnb.b(6, this.k);
                }
                if ((this.e & 64) == 64) {
                    a += Hnb.b(7, this.l);
                }
                if ((this.e & 128) == 128) {
                    a += Hnb.a(8, (Wnb) this.m);
                }
                for (int i3 = 0; i3 < this.n.size(); i3++) {
                    a += Hnb.a(9, (Wnb) this.n.get(i3));
                }
                if ((this.e & 512) == 512) {
                    a += Hnb.b(10, this.p);
                }
                if ((this.e & 256) == 256) {
                    a += Hnb.b(11, this.o);
                }
                int size = a + this.d.size();
                this.r = size;
                return size;
            }

            public Ynb<b> e() {
                return c;
            }

            private b(defpackage.Mnb.a aVar) {
                super(aVar);
                this.q = -1;
                this.r = -1;
                this.d = aVar.b();
            }

            public C0164a d() {
                return F();
            }

            public C0164a b() {
                return c(this);
            }

            private b(boolean z) {
                this.q = -1;
                this.r = -1;
                this.d = Fnb.a;
            }

            public b a(int i2) {
                return (b) this.n.get(i2);
            }

            public void a(Hnb hnb) throws IOException {
                c();
                if ((this.e & 1) == 1) {
                    hnb.c(1, this.f.i());
                }
                if ((this.e & 2) == 2) {
                    hnb.b(2, this.g);
                }
                if ((this.e & 4) == 4) {
                    hnb.b(3, this.h);
                }
                if ((this.e & 8) == 8) {
                    hnb.b(4, this.i);
                }
                if ((this.e & 16) == 16) {
                    hnb.d(5, this.j);
                }
                if ((this.e & 32) == 32) {
                    hnb.d(6, this.k);
                }
                if ((this.e & 64) == 64) {
                    hnb.d(7, this.l);
                }
                if ((this.e & 128) == 128) {
                    hnb.c(8, (Wnb) this.m);
                }
                for (int i2 = 0; i2 < this.n.size(); i2++) {
                    hnb.c(9, (Wnb) this.n.get(i2));
                }
                if ((this.e & 512) == 512) {
                    hnb.d(10, this.p);
                }
                if ((this.e & 256) == 256) {
                    hnb.d(11, this.o);
                }
                hnb.c(this.d);
            }

            private b(Gnb gnb, Inb inb) throws Onb {
                this.q = -1;
                this.r = -1;
                G();
                defpackage.Fnb.b j2 = Fnb.j();
                Hnb a = Hnb.a((OutputStream) j2, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int x = gnb.x();
                        switch (x) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                int f2 = gnb.f();
                                C0165b a2 = C0165b.a(f2);
                                if (a2 != null) {
                                    this.e |= 1;
                                    this.f = a2;
                                    break;
                                } else {
                                    a.p(x);
                                    a.p(f2);
                                    break;
                                }
                            case 16:
                                this.e |= 2;
                                this.g = gnb.u();
                                break;
                            case 29:
                                this.e |= 4;
                                this.h = gnb.i();
                                break;
                            case 33:
                                this.e |= 8;
                                this.i = gnb.e();
                                break;
                            case 40:
                                this.e |= 16;
                                this.j = gnb.j();
                                break;
                            case 48:
                                this.e |= 32;
                                this.k = gnb.j();
                                break;
                            case 56:
                                this.e |= 64;
                                this.l = gnb.j();
                                break;
                            case 66:
                                c cVar = null;
                                if ((this.e & 128) == 128) {
                                    cVar = this.m.b();
                                }
                                this.m = (C5590alb) gnb.a(C5590alb.c, inb);
                                if (cVar != null) {
                                    cVar.a(this.m);
                                    this.m = cVar.d();
                                }
                                this.e |= 128;
                                break;
                            case 74:
                                if (!(z2 & true)) {
                                    this.n = new ArrayList();
                                    z2 |= true;
                                }
                                this.n.add(gnb.a(c, inb));
                                break;
                            case 80:
                                this.e |= 512;
                                this.p = gnb.j();
                                break;
                            case 88:
                                this.e |= 256;
                                this.o = gnb.j();
                                break;
                            default:
                                if (a(gnb, a, inb, x)) {
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
                            this.n = Collections.unmodifiableList(this.n);
                        }
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
                if (z2 & true) {
                    this.n = Collections.unmodifiableList(this.n);
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

            public static C0164a c(b bVar) {
                C0164a F = F();
                F.a(bVar);
                return F;
            }
        }

        /* renamed from: alb$a$c */
        public interface c extends Xnb {
        }

        static {
            b.o();
        }

        public static a h() {
            return b;
        }

        public static C0163a n() {
            return C0163a.e();
        }

        private void o() {
            this.f = 0;
            this.g = b.n();
        }

        public int c() {
            int i2 = this.i;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.e & 1) == 1) {
                i3 = 0 + Hnb.b(1, this.f);
            }
            if ((this.e & 2) == 2) {
                i3 += Hnb.a(2, (Wnb) this.g);
            }
            int size = i3 + this.d.size();
            this.i = size;
            return size;
        }

        public Ynb<a> e() {
            return c;
        }

        public final boolean i() {
            byte b2 = this.h;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!l()) {
                this.h = 0;
                return false;
            } else if (!m()) {
                this.h = 0;
                return false;
            } else if (!k().i()) {
                this.h = 0;
                return false;
            } else {
                this.h = 1;
                return true;
            }
        }

        public int j() {
            return this.f;
        }

        public b k() {
            return this.g;
        }

        public boolean l() {
            return (this.e & 1) == 1;
        }

        public boolean m() {
            return (this.e & 2) == 2;
        }

        public C0163a d() {
            return n();
        }

        private a(defpackage.Mnb.a aVar) {
            super(aVar);
            this.h = -1;
            this.i = -1;
            this.d = aVar.b();
        }

        public static C0163a b(a aVar) {
            C0163a n = n();
            n.a(aVar);
            return n;
        }

        public void a(Hnb hnb) throws IOException {
            c();
            if ((this.e & 1) == 1) {
                hnb.d(1, this.f);
            }
            if ((this.e & 2) == 2) {
                hnb.c(2, (Wnb) this.g);
            }
            hnb.c(this.d);
        }

        public C0163a b() {
            return b(this);
        }

        private a(boolean z) {
            this.h = -1;
            this.i = -1;
            this.d = Fnb.a;
        }

        private a(Gnb gnb, Inb inb) throws Onb {
            this.h = -1;
            this.i = -1;
            o();
            defpackage.Fnb.b j = Fnb.j();
            Hnb a = Hnb.a((OutputStream) j, 1);
            boolean z = false;
            while (!z) {
                try {
                    int x = gnb.x();
                    if (x != 0) {
                        if (x == 8) {
                            this.e |= 1;
                            this.f = gnb.j();
                        } else if (x == 18) {
                            C0164a aVar = null;
                            if ((this.e & 2) == 2) {
                                aVar = this.g.b();
                            }
                            this.g = (b) gnb.a(b.c, inb);
                            if (aVar != null) {
                                aVar.a(this.g);
                                this.g = aVar.d();
                            }
                            this.e |= 2;
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
                        this.d = j.a();
                        throw th2;
                    }
                    this.d = j.a();
                    g();
                    throw th;
                }
            }
            try {
                a.a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = j.a();
                throw th3;
            }
            this.d = j.a();
            g();
        }
    }

    /* renamed from: alb$b */
    public interface b extends Xnb {
    }

    /* renamed from: alb$c */
    /* compiled from: ProtoBuf */
    public static final class c extends defpackage.Mnb.a<C5590alb, c> implements C6322dlb {
        private int b;
        private int c;
        private List<a> d = Collections.emptyList();

        private c() {
            g();
        }

        /* access modifiers changed from: private */
        public static c e() {
            return new c();
        }

        private void f() {
            if ((this.b & 2) != 2) {
                this.d = new ArrayList(this.d);
                this.b |= 2;
            }
        }

        private void g() {
        }

        public C5590alb d() {
            C5590alb alb = new C5590alb((defpackage.Mnb.a) this);
            int i = 1;
            if ((this.b & 1) != 1) {
                i = 0;
            }
            alb.f = this.c;
            if ((this.b & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.b &= -3;
            }
            alb.g = this.d;
            alb.e = i;
            return alb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C5590alb) mnb);
            return this;
        }

        public C5590alb build() {
            C5590alb d2 = d();
            if (d2.i()) {
                return d2;
            }
            throw defpackage.Bnb.a.a(d2);
        }

        public c clone() {
            c e = e();
            e.a(d());
            return e;
        }

        public c a(C5590alb alb) {
            if (alb == C5590alb.k()) {
                return this;
            }
            if (alb.m()) {
                a(alb.l());
            }
            if (!alb.g.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = alb.g;
                    this.b &= -3;
                } else {
                    f();
                    this.d.addAll(alb.g);
                }
            }
            a(b().b(alb.d));
            return this;
        }

        public c a(Gnb gnb, Inb inb) throws IOException {
            C5590alb alb;
            C5590alb alb2 = null;
            try {
                C5590alb alb3 = (C5590alb) C5590alb.c.a(gnb, inb);
                if (alb3 != null) {
                    a(alb3);
                }
                return this;
            } catch (Onb e) {
                alb = (C5590alb) e.a();
                throw e;
            } catch (Throwable th) {
                th = th;
                alb2 = alb;
            }
            if (alb2 != null) {
                a(alb2);
            }
            throw th;
        }

        public c a(int i) {
            this.b |= 1;
            this.c = i;
            return this;
        }
    }

    static {
        b.o();
    }

    public static C5590alb k() {
        return b;
    }

    public static c n() {
        return c.e();
    }

    private void o() {
        this.f = 0;
        this.g = Collections.emptyList();
    }

    public int c() {
        int i2 = this.i;
        if (i2 != -1) {
            return i2;
        }
        int b2 = (this.e & 1) == 1 ? Hnb.b(1, this.f) + 0 : 0;
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            b2 += Hnb.a(2, (Wnb) this.g.get(i3));
        }
        int size = b2 + this.d.size();
        this.i = size;
        return size;
    }

    public Ynb<C5590alb> e() {
        return c;
    }

    public int h() {
        return this.g.size();
    }

    public final boolean i() {
        byte b2 = this.h;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!m()) {
            this.h = 0;
            return false;
        }
        for (int i2 = 0; i2 < h(); i2++) {
            if (!a(i2).i()) {
                this.h = 0;
                return false;
            }
        }
        this.h = 1;
        return true;
    }

    public List<a> j() {
        return this.g;
    }

    public int l() {
        return this.f;
    }

    public boolean m() {
        return (this.e & 1) == 1;
    }

    public c d() {
        return n();
    }

    private C5590alb(defpackage.Mnb.a aVar) {
        super(aVar);
        this.h = -1;
        this.i = -1;
        this.d = aVar.b();
    }

    public a a(int i2) {
        return (a) this.g.get(i2);
    }

    public c b() {
        return c(this);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        if ((this.e & 1) == 1) {
            hnb.d(1, this.f);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            hnb.c(2, (Wnb) this.g.get(i2));
        }
        hnb.c(this.d);
    }

    private C5590alb(boolean z) {
        this.h = -1;
        this.i = -1;
        this.d = Fnb.a;
    }

    public static c c(C5590alb alb) {
        c n = n();
        n.a(alb);
        return n;
    }

    private C5590alb(Gnb gnb, Inb inb) throws Onb {
        this.h = -1;
        this.i = -1;
        o();
        defpackage.Fnb.b j = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = gnb.x();
                if (x != 0) {
                    if (x == 8) {
                        this.e |= 1;
                        this.f = gnb.j();
                    } else if (x == 18) {
                        if (!(z2 & true)) {
                            this.g = new ArrayList();
                            z2 |= true;
                        }
                        this.g.add(gnb.a(a.c, inb));
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
                    this.g = Collections.unmodifiableList(this.g);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.d = j.a();
                    throw th2;
                }
                this.d = j.a();
                g();
                throw th;
            }
        }
        if (z2 & true) {
            this.g = Collections.unmodifiableList(this.g);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.d = j.a();
            throw th3;
        }
        this.d = j.a();
        g();
    }
}
