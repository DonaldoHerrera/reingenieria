package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Xmb reason: default package */
/* compiled from: JvmProtoBuf */
public final class Xmb {
    public static final defpackage.Mnb.f<C6730jlb, c> a = Mnb.a(C6730jlb.l(), c.h(), (Wnb) c.h(), null, 100, defpackage.C7144pob.a.MESSAGE, c.class);
    public static final defpackage.Mnb.f<Blb, c> b = Mnb.a(Blb.m(), c.h(), (Wnb) c.h(), null, 100, defpackage.C7144pob.a.MESSAGE, c.class);
    public static final defpackage.Mnb.f<Blb, Integer> c;
    public static final defpackage.Mnb.f<Olb, e> d = Mnb.a(Olb.l(), e.h(), (Wnb) e.h(), null, 100, defpackage.C7144pob.a.MESSAGE, e.class);
    public static final defpackage.Mnb.f<Olb, Integer> e;
    public static final defpackage.Mnb.f<_lb, List<C5590alb>> f = Mnb.a(_lb.q(), (Wnb) C5590alb.k(), null, 100, defpackage.C7144pob.a.MESSAGE, false, C5590alb.class);
    public static final defpackage.Mnb.f<_lb, Boolean> g = Mnb.a(_lb.q(), Boolean.valueOf(false), (Wnb) null, null, 101, defpackage.C7144pob.a.BOOL, Boolean.class);
    public static final defpackage.Mnb.f<C6527gmb, List<C5590alb>> h = Mnb.a(C6527gmb.l(), (Wnb) C5590alb.k(), null, 100, defpackage.C7144pob.a.MESSAGE, false, C5590alb.class);
    public static final defpackage.Mnb.f<C6458flb, Integer> i;
    public static final defpackage.Mnb.f<C6458flb, List<Olb>> j = Mnb.a(C6458flb.o(), (Wnb) Olb.l(), null, 102, defpackage.C7144pob.a.MESSAGE, false, Olb.class);
    public static final defpackage.Mnb.f<C6458flb, Integer> k;
    public static final defpackage.Mnb.f<Ilb, Integer> l;
    public static final defpackage.Mnb.f<Ilb, List<Olb>> m = Mnb.a(Ilb.l(), (Wnb) Olb.l(), null, 102, defpackage.C7144pob.a.MESSAGE, false, Olb.class);

    /* renamed from: Xmb$a */
    /* compiled from: JvmProtoBuf */
    public static final class a extends Mnb implements b {
        private static final a b = new a(true);
        public static Ynb<a> c = new Wmb();
        /* access modifiers changed from: private */
        public final Fnb d;
        /* access modifiers changed from: private */
        public int e;
        /* access modifiers changed from: private */
        public int f;
        /* access modifiers changed from: private */
        public int g;
        private byte h;
        private int i;

        /* renamed from: Xmb$a$a reason: collision with other inner class name */
        /* compiled from: JvmProtoBuf */
        public static final class C0156a extends defpackage.Mnb.a<a, C0156a> implements b {
            private int b;
            private int c;
            private int d;

            private C0156a() {
                f();
            }

            /* access modifiers changed from: private */
            public static C0156a e() {
                return new C0156a();
            }

            private void f() {
            }

            public C0156a b(int i) {
                this.b |= 1;
                this.c = i;
                return this;
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

            public C0156a clone() {
                C0156a e = e();
                e.a(d());
                return e;
            }

            public C0156a a(a aVar) {
                if (aVar == a.h()) {
                    return this;
                }
                if (aVar.m()) {
                    b(aVar.k());
                }
                if (aVar.l()) {
                    a(aVar.j());
                }
                a(b().b(aVar.d));
                return this;
            }

            public C0156a a(Gnb gnb, Inb inb) throws IOException {
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

            public C0156a a(int i) {
                this.b |= 2;
                this.d = i;
                return this;
            }
        }

        static {
            b.o();
        }

        public static a h() {
            return b;
        }

        public static C0156a n() {
            return C0156a.e();
        }

        private void o() {
            this.f = 0;
            this.g = 0;
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
            this.h = 1;
            return true;
        }

        public int j() {
            return this.g;
        }

        public int k() {
            return this.f;
        }

        public boolean l() {
            return (this.e & 2) == 2;
        }

        public boolean m() {
            return (this.e & 1) == 1;
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
                i3 += Hnb.b(2, this.g);
            }
            int size = i3 + this.d.size();
            this.i = size;
            return size;
        }

        public C0156a d() {
            return n();
        }

        private a(defpackage.Mnb.a aVar) {
            super(aVar);
            this.h = -1;
            this.i = -1;
            this.d = aVar.b();
        }

        public static C0156a b(a aVar) {
            C0156a n = n();
            n.a(aVar);
            return n;
        }

        public void a(Hnb hnb) throws IOException {
            c();
            if ((this.e & 1) == 1) {
                hnb.d(1, this.f);
            }
            if ((this.e & 2) == 2) {
                hnb.d(2, this.g);
            }
            hnb.c(this.d);
        }

        public C0156a b() {
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
                        } else if (x == 16) {
                            this.e |= 2;
                            this.g = gnb.j();
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

    /* renamed from: Xmb$b */
    public interface b extends Xnb {
    }

    /* renamed from: Xmb$c */
    /* compiled from: JvmProtoBuf */
    public static final class c extends Mnb implements d {
        private static final c b = new c(true);
        public static Ynb<c> c = new Ymb();
        /* access modifiers changed from: private */
        public final Fnb d;
        /* access modifiers changed from: private */
        public int e;
        /* access modifiers changed from: private */
        public int f;
        /* access modifiers changed from: private */
        public int g;
        private byte h;
        private int i;

        /* renamed from: Xmb$c$a */
        /* compiled from: JvmProtoBuf */
        public static final class a extends defpackage.Mnb.a<c, a> implements d {
            private int b;
            private int c;
            private int d;

            private a() {
                f();
            }

            /* access modifiers changed from: private */
            public static a e() {
                return new a();
            }

            private void f() {
            }

            public a b(int i) {
                this.b |= 1;
                this.c = i;
                return this;
            }

            public c d() {
                c cVar = new c((defpackage.Mnb.a) this);
                int i = this.b;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                cVar.f = this.c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cVar.g = this.d;
                cVar.e = i2;
                return cVar;
            }

            public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
                a((c) mnb);
                return this;
            }

            public c build() {
                c d2 = d();
                if (d2.i()) {
                    return d2;
                }
                throw defpackage.Bnb.a.a(d2);
            }

            public a clone() {
                a e = e();
                e.a(d());
                return e;
            }

            public a a(c cVar) {
                if (cVar == c.h()) {
                    return this;
                }
                if (cVar.m()) {
                    b(cVar.k());
                }
                if (cVar.l()) {
                    a(cVar.j());
                }
                a(b().b(cVar.d));
                return this;
            }

            public a a(Gnb gnb, Inb inb) throws IOException {
                c cVar;
                c cVar2 = null;
                try {
                    c cVar3 = (c) c.c.a(gnb, inb);
                    if (cVar3 != null) {
                        a(cVar3);
                    }
                    return this;
                } catch (Onb e) {
                    cVar = (c) e.a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cVar2 = cVar;
                }
                if (cVar2 != null) {
                    a(cVar2);
                }
                throw th;
            }

            public a a(int i) {
                this.b |= 2;
                this.d = i;
                return this;
            }
        }

        static {
            b.o();
        }

        public static c h() {
            return b;
        }

        public static a n() {
            return a.e();
        }

        private void o() {
            this.f = 0;
            this.g = 0;
        }

        public Ynb<c> e() {
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
            this.h = 1;
            return true;
        }

        public int j() {
            return this.g;
        }

        public int k() {
            return this.f;
        }

        public boolean l() {
            return (this.e & 2) == 2;
        }

        public boolean m() {
            return (this.e & 1) == 1;
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
                i3 += Hnb.b(2, this.g);
            }
            int size = i3 + this.d.size();
            this.i = size;
            return size;
        }

        public a d() {
            return n();
        }

        private c(defpackage.Mnb.a aVar) {
            super(aVar);
            this.h = -1;
            this.i = -1;
            this.d = aVar.b();
        }

        public static a b(c cVar) {
            a n = n();
            n.a(cVar);
            return n;
        }

        public void a(Hnb hnb) throws IOException {
            c();
            if ((this.e & 1) == 1) {
                hnb.d(1, this.f);
            }
            if ((this.e & 2) == 2) {
                hnb.d(2, this.g);
            }
            hnb.c(this.d);
        }

        public a b() {
            return b(this);
        }

        private c(boolean z) {
            this.h = -1;
            this.i = -1;
            this.d = Fnb.a;
        }

        private c(Gnb gnb, Inb inb) throws Onb {
            this.h = -1;
            this.i = -1;
            o();
            defpackage.Fnb.b j = Fnb.j();
            Hnb a2 = Hnb.a((OutputStream) j, 1);
            boolean z = false;
            while (!z) {
                try {
                    int x = gnb.x();
                    if (x != 0) {
                        if (x == 8) {
                            this.e |= 1;
                            this.f = gnb.j();
                        } else if (x == 16) {
                            this.e |= 2;
                            this.g = gnb.j();
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

    /* renamed from: Xmb$d */
    public interface d extends Xnb {
    }

    /* renamed from: Xmb$e */
    /* compiled from: JvmProtoBuf */
    public static final class e extends Mnb implements f {
        private static final e b = new e(true);
        public static Ynb<e> c = new Zmb();
        /* access modifiers changed from: private */
        public final Fnb d;
        /* access modifiers changed from: private */
        public int e;
        /* access modifiers changed from: private */
        public a f;
        /* access modifiers changed from: private */
        public c g;
        /* access modifiers changed from: private */
        public c h;
        /* access modifiers changed from: private */
        public c i;
        private byte j;
        private int k;

        /* renamed from: Xmb$e$a */
        /* compiled from: JvmProtoBuf */
        public static final class a extends defpackage.Mnb.a<e, a> implements f {
            private int b;
            private a c = a.h();
            private c d = c.h();
            private c e = c.h();
            private c f = c.h();

            private a() {
                f();
            }

            /* access modifiers changed from: private */
            public static a e() {
                return new a();
            }

            private void f() {
            }

            public a b(c cVar) {
                if ((this.b & 8) != 8 || this.f == c.h()) {
                    this.f = cVar;
                } else {
                    a b2 = c.b(this.f);
                    b2.a(cVar);
                    this.f = b2.d();
                }
                this.b |= 8;
                return this;
            }

            public e d() {
                e eVar = new e((defpackage.Mnb.a) this);
                int i = this.b;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                eVar.f = this.c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                eVar.g = this.d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                eVar.h = this.e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                eVar.i = this.f;
                eVar.e = i2;
                return eVar;
            }

            public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
                a((e) mnb);
                return this;
            }

            public e build() {
                e d2 = d();
                if (d2.i()) {
                    return d2;
                }
                throw defpackage.Bnb.a.a(d2);
            }

            public a c(c cVar) {
                if ((this.b & 2) != 2 || this.d == c.h()) {
                    this.d = cVar;
                } else {
                    a b2 = c.b(this.d);
                    b2.a(cVar);
                    this.d = b2.d();
                }
                this.b |= 2;
                return this;
            }

            public a clone() {
                a e2 = e();
                e2.a(d());
                return e2;
            }

            public a a(e eVar) {
                if (eVar == e.h()) {
                    return this;
                }
                if (eVar.n()) {
                    a(eVar.j());
                }
                if (eVar.q()) {
                    c(eVar.m());
                }
                if (eVar.o()) {
                    a(eVar.k());
                }
                if (eVar.p()) {
                    b(eVar.l());
                }
                a(b().b(eVar.d));
                return this;
            }

            public a a(Gnb gnb, Inb inb) throws IOException {
                e eVar;
                e eVar2 = null;
                try {
                    e eVar3 = (e) e.c.a(gnb, inb);
                    if (eVar3 != null) {
                        a(eVar3);
                    }
                    return this;
                } catch (Onb e2) {
                    eVar = (e) e2.a();
                    throw e2;
                } catch (Throwable th) {
                    th = th;
                    eVar2 = eVar;
                }
                if (eVar2 != null) {
                    a(eVar2);
                }
                throw th;
            }

            public a a(a aVar) {
                if ((this.b & 1) != 1 || this.c == a.h()) {
                    this.c = aVar;
                } else {
                    C0156a b2 = a.b(this.c);
                    b2.a(aVar);
                    this.c = b2.d();
                }
                this.b |= 1;
                return this;
            }

            public a a(c cVar) {
                if ((this.b & 4) != 4 || this.e == c.h()) {
                    this.e = cVar;
                } else {
                    a b2 = c.b(this.e);
                    b2.a(cVar);
                    this.e = b2.d();
                }
                this.b |= 4;
                return this;
            }
        }

        static {
            b.s();
        }

        public static e h() {
            return b;
        }

        public static a r() {
            return a.e();
        }

        private void s() {
            this.f = a.h();
            this.g = c.h();
            this.h = c.h();
            this.i = c.h();
        }

        public Ynb<e> e() {
            return c;
        }

        public final boolean i() {
            byte b2 = this.j;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.j = 1;
            return true;
        }

        public a j() {
            return this.f;
        }

        public c k() {
            return this.h;
        }

        public c l() {
            return this.i;
        }

        public c m() {
            return this.g;
        }

        public boolean n() {
            return (this.e & 1) == 1;
        }

        public boolean o() {
            return (this.e & 4) == 4;
        }

        public boolean p() {
            return (this.e & 8) == 8;
        }

        public boolean q() {
            return (this.e & 2) == 2;
        }

        public int c() {
            int i2 = this.k;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.e & 1) == 1) {
                i3 = 0 + Hnb.a(1, (Wnb) this.f);
            }
            if ((this.e & 2) == 2) {
                i3 += Hnb.a(2, (Wnb) this.g);
            }
            if ((this.e & 4) == 4) {
                i3 += Hnb.a(3, (Wnb) this.h);
            }
            if ((this.e & 8) == 8) {
                i3 += Hnb.a(4, (Wnb) this.i);
            }
            int size = i3 + this.d.size();
            this.k = size;
            return size;
        }

        public a d() {
            return r();
        }

        private e(defpackage.Mnb.a aVar) {
            super(aVar);
            this.j = -1;
            this.k = -1;
            this.d = aVar.b();
        }

        public static a b(e eVar) {
            a r = r();
            r.a(eVar);
            return r;
        }

        public a b() {
            return b(this);
        }

        public void a(Hnb hnb) throws IOException {
            c();
            if ((this.e & 1) == 1) {
                hnb.c(1, (Wnb) this.f);
            }
            if ((this.e & 2) == 2) {
                hnb.c(2, (Wnb) this.g);
            }
            if ((this.e & 4) == 4) {
                hnb.c(3, (Wnb) this.h);
            }
            if ((this.e & 8) == 8) {
                hnb.c(4, (Wnb) this.i);
            }
            hnb.c(this.d);
        }

        private e(boolean z) {
            this.j = -1;
            this.k = -1;
            this.d = Fnb.a;
        }

        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v1, types: [Xmb$a$a] */
        /* JADX WARNING: type inference failed for: r6v2, types: [Xmb$a$a] */
        /* JADX WARNING: type inference failed for: r6v3, types: [Xmb$c$a] */
        /* JADX WARNING: type inference failed for: r6v4, types: [Xmb$c$a] */
        /* JADX WARNING: type inference failed for: r6v5, types: [Xmb$c$a] */
        /* JADX WARNING: type inference failed for: r6v6, types: [Xmb$c$a] */
        /* JADX WARNING: type inference failed for: r6v7, types: [Xmb$c$a] */
        /* JADX WARNING: type inference failed for: r6v8, types: [Xmb$c$a] */
        /* JADX WARNING: type inference failed for: r6v9 */
        /* JADX WARNING: type inference failed for: r6v10 */
        /* JADX WARNING: type inference failed for: r6v11 */
        /* JADX WARNING: type inference failed for: r6v12 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], Xmb$c$a, Xmb$a$a]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], Xmb$a$a, Xmb$c$a]
  mth insns count: 120
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
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
        private e(Gnb gnb, Inb inb) throws Onb {
            this.j = -1;
            this.k = -1;
            s();
            defpackage.Fnb.b j2 = Fnb.j();
            Hnb a2 = Hnb.a((OutputStream) j2, 1);
            boolean z = false;
            while (!z) {
                try {
                    int x = gnb.x();
                    if (x != 0) {
                        ? r6 = 0;
                        if (x == 10) {
                            if ((this.e & 1) == 1) {
                                r6 = this.f.b();
                            }
                            this.f = (a) gnb.a(a.c, inb);
                            if (r6 != 0) {
                                r6.a(this.f);
                                this.f = r6.d();
                            }
                            this.e |= 1;
                        } else if (x == 18) {
                            if ((this.e & 2) == 2) {
                                r6 = this.g.b();
                            }
                            this.g = (c) gnb.a(c.c, inb);
                            if (r6 != 0) {
                                r6.a(this.g);
                                this.g = r6.d();
                            }
                            this.e |= 2;
                        } else if (x == 26) {
                            if ((this.e & 4) == 4) {
                                r6 = this.h.b();
                            }
                            this.h = (c) gnb.a(c.c, inb);
                            if (r6 != 0) {
                                r6.a(this.h);
                                this.h = r6.d();
                            }
                            this.e |= 4;
                        } else if (x == 34) {
                            if ((this.e & 8) == 8) {
                                r6 = this.i.b();
                            }
                            this.i = (c) gnb.a(c.c, inb);
                            if (r6 != 0) {
                                r6.a(this.i);
                                this.i = r6.d();
                            }
                            this.e |= 8;
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
                    try {
                        a2.a();
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
                a2.a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = j2.a();
                throw th3;
            }
            this.d = j2.a();
            g();
        }
    }

    /* renamed from: Xmb$f */
    public interface f extends Xnb {
    }

    /* renamed from: Xmb$g */
    /* compiled from: JvmProtoBuf */
    public static final class g extends Mnb implements h {
        private static final g b = new g(true);
        public static Ynb<g> c = new _mb();
        /* access modifiers changed from: private */
        public final Fnb d;
        /* access modifiers changed from: private */
        public List<b> e;
        /* access modifiers changed from: private */
        public List<Integer> f;
        private int g;
        private byte h;
        private int i;

        /* renamed from: Xmb$g$a */
        /* compiled from: JvmProtoBuf */
        public static final class a extends defpackage.Mnb.a<g, a> implements h {
            private int b;
            private List<b> c = Collections.emptyList();
            private List<Integer> d = Collections.emptyList();

            private a() {
                h();
            }

            /* access modifiers changed from: private */
            public static a e() {
                return new a();
            }

            private void f() {
                if ((this.b & 2) != 2) {
                    this.d = new ArrayList(this.d);
                    this.b |= 2;
                }
            }

            private void g() {
                if ((this.b & 1) != 1) {
                    this.c = new ArrayList(this.c);
                    this.b |= 1;
                }
            }

            private void h() {
            }

            public g d() {
                g gVar = new g((defpackage.Mnb.a) this);
                if ((this.b & 1) == 1) {
                    this.c = Collections.unmodifiableList(this.c);
                    this.b &= -2;
                }
                gVar.e = this.c;
                if ((this.b & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                    this.b &= -3;
                }
                gVar.f = this.d;
                return gVar;
            }

            public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
                a((g) mnb);
                return this;
            }

            public g build() {
                g d2 = d();
                if (d2.i()) {
                    return d2;
                }
                throw defpackage.Bnb.a.a(d2);
            }

            public a clone() {
                a e = e();
                e.a(d());
                return e;
            }

            public a a(g gVar) {
                if (gVar == g.h()) {
                    return this;
                }
                if (!gVar.e.isEmpty()) {
                    if (this.c.isEmpty()) {
                        this.c = gVar.e;
                        this.b &= -2;
                    } else {
                        g();
                        this.c.addAll(gVar.e);
                    }
                }
                if (!gVar.f.isEmpty()) {
                    if (this.d.isEmpty()) {
                        this.d = gVar.f;
                        this.b &= -3;
                    } else {
                        f();
                        this.d.addAll(gVar.f);
                    }
                }
                a(b().b(gVar.d));
                return this;
            }

            public a a(Gnb gnb, Inb inb) throws IOException {
                g gVar;
                g gVar2 = null;
                try {
                    g gVar3 = (g) g.c.a(gnb, inb);
                    if (gVar3 != null) {
                        a(gVar3);
                    }
                    return this;
                } catch (Onb e) {
                    gVar = (g) e.a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    gVar2 = gVar;
                }
                if (gVar2 != null) {
                    a(gVar2);
                }
                throw th;
            }
        }

        /* renamed from: Xmb$g$b */
        /* compiled from: JvmProtoBuf */
        public static final class b extends Mnb implements c {
            private static final b b = new b(true);
            public static Ynb<b> c = new C5592anb();
            /* access modifiers changed from: private */
            public final Fnb d;
            /* access modifiers changed from: private */
            public int e;
            /* access modifiers changed from: private */
            public int f;
            /* access modifiers changed from: private */
            public int g;
            /* access modifiers changed from: private */
            public Object h;
            /* access modifiers changed from: private */
            public C0157b i;
            /* access modifiers changed from: private */
            public List<Integer> j;
            private int k;
            /* access modifiers changed from: private */
            public List<Integer> l;
            private int m;
            private byte n;
            private int o;

            /* renamed from: Xmb$g$b$a */
            /* compiled from: JvmProtoBuf */
            public static final class a extends defpackage.Mnb.a<b, a> implements c {
                private int b;
                private int c = 1;
                private int d;
                private Object e = "";
                private C0157b f = C0157b.NONE;
                private List<Integer> g = Collections.emptyList();
                private List<Integer> h = Collections.emptyList();

                private a() {
                    h();
                }

                /* access modifiers changed from: private */
                public static a e() {
                    return new a();
                }

                private void f() {
                    if ((this.b & 32) != 32) {
                        this.h = new ArrayList(this.h);
                        this.b |= 32;
                    }
                }

                private void g() {
                    if ((this.b & 16) != 16) {
                        this.g = new ArrayList(this.g);
                        this.b |= 16;
                    }
                }

                private void h() {
                }

                public a b(int i) {
                    this.b |= 1;
                    this.c = i;
                    return this;
                }

                public b d() {
                    b bVar = new b((defpackage.Mnb.a) this);
                    int i = this.b;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    bVar.f = this.c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    bVar.g = this.d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    bVar.h = this.e;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    bVar.i = this.f;
                    if ((this.b & 16) == 16) {
                        this.g = Collections.unmodifiableList(this.g);
                        this.b &= -17;
                    }
                    bVar.j = this.g;
                    if ((this.b & 32) == 32) {
                        this.h = Collections.unmodifiableList(this.h);
                        this.b &= -33;
                    }
                    bVar.l = this.h;
                    bVar.e = i2;
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

                public a clone() {
                    a e2 = e();
                    e2.a(d());
                    return e2;
                }

                public a a(b bVar) {
                    if (bVar == b.h()) {
                        return this;
                    }
                    if (bVar.u()) {
                        b(bVar.l());
                    }
                    if (bVar.t()) {
                        a(bVar.k());
                    }
                    if (bVar.v()) {
                        this.b |= 4;
                        this.e = bVar.h;
                    }
                    if (bVar.s()) {
                        a(bVar.j());
                    }
                    if (!bVar.j.isEmpty()) {
                        if (this.g.isEmpty()) {
                            this.g = bVar.j;
                            this.b &= -17;
                        } else {
                            g();
                            this.g.addAll(bVar.j);
                        }
                    }
                    if (!bVar.l.isEmpty()) {
                        if (this.h.isEmpty()) {
                            this.h = bVar.l;
                            this.b &= -33;
                        } else {
                            f();
                            this.h.addAll(bVar.l);
                        }
                    }
                    a(b().b(bVar.d));
                    return this;
                }

                public a a(Gnb gnb, Inb inb) throws IOException {
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

                public a a(int i) {
                    this.b |= 2;
                    this.d = i;
                    return this;
                }

                public a a(C0157b bVar) {
                    if (bVar != null) {
                        this.b |= 8;
                        this.f = bVar;
                        return this;
                    }
                    throw new NullPointerException();
                }
            }

            /* renamed from: Xmb$g$b$b reason: collision with other inner class name */
            /* compiled from: JvmProtoBuf */
            public enum C0157b implements defpackage.Nnb.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                
                private static defpackage.Nnb.b<C0157b> d;
                private final int f;

                static {
                    d = new C5660bnb();
                }

                private C0157b(int i, int i2) {
                    this.f = i2;
                }

                public static C0157b a(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                public final int i() {
                    return this.f;
                }
            }

            static {
                b.x();
            }

            public static b h() {
                return b;
            }

            public static a w() {
                return a.e();
            }

            private void x() {
                this.f = 1;
                this.g = 0;
                this.h = "";
                this.i = C0157b.NONE;
                this.j = Collections.emptyList();
                this.l = Collections.emptyList();
            }

            public Ynb<b> e() {
                return c;
            }

            public final boolean i() {
                byte b2 = this.n;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.n = 1;
                return true;
            }

            public C0157b j() {
                return this.i;
            }

            public int k() {
                return this.g;
            }

            public int l() {
                return this.f;
            }

            public int m() {
                return this.l.size();
            }

            public List<Integer> n() {
                return this.l;
            }

            public String o() {
                Object obj = this.h;
                if (obj instanceof String) {
                    return (String) obj;
                }
                Fnb fnb = (Fnb) obj;
                String m2 = fnb.m();
                if (fnb.h()) {
                    this.h = m2;
                }
                return m2;
            }

            public Fnb p() {
                Object obj = this.h;
                if (!(obj instanceof String)) {
                    return (Fnb) obj;
                }
                Fnb a2 = Fnb.a((String) obj);
                this.h = a2;
                return a2;
            }

            public int q() {
                return this.j.size();
            }

            public List<Integer> r() {
                return this.j;
            }

            public boolean s() {
                return (this.e & 8) == 8;
            }

            public boolean t() {
                return (this.e & 2) == 2;
            }

            public boolean u() {
                return (this.e & 1) == 1;
            }

            public boolean v() {
                return (this.e & 4) == 4;
            }

            public static a e(b bVar) {
                a w = w();
                w.a(bVar);
                return w;
            }

            private b(defpackage.Mnb.a aVar) {
                super(aVar);
                this.k = -1;
                this.m = -1;
                this.n = -1;
                this.o = -1;
                this.d = aVar.b();
            }

            public int c() {
                int i2 = this.o;
                if (i2 != -1) {
                    return i2;
                }
                int b2 = (this.e & 1) == 1 ? Hnb.b(1, this.f) + 0 : 0;
                if ((this.e & 2) == 2) {
                    b2 += Hnb.b(2, this.g);
                }
                if ((this.e & 8) == 8) {
                    b2 += Hnb.a(3, this.i.i());
                }
                int i3 = 0;
                for (int i4 = 0; i4 < this.j.size(); i4++) {
                    i3 += Hnb.c(((Integer) this.j.get(i4)).intValue());
                }
                int i5 = b2 + i3;
                if (!r().isEmpty()) {
                    i5 = i5 + 1 + Hnb.c(i3);
                }
                this.k = i3;
                int i6 = 0;
                for (int i7 = 0; i7 < this.l.size(); i7++) {
                    i6 += Hnb.c(((Integer) this.l.get(i7)).intValue());
                }
                int i8 = i5 + i6;
                if (!n().isEmpty()) {
                    i8 = i8 + 1 + Hnb.c(i6);
                }
                this.m = i6;
                if ((this.e & 4) == 4) {
                    i8 += Hnb.a(6, p());
                }
                int size = i8 + this.d.size();
                this.o = size;
                return size;
            }

            public a d() {
                return w();
            }

            public a b() {
                return e(this);
            }

            public void a(Hnb hnb) throws IOException {
                c();
                if ((this.e & 1) == 1) {
                    hnb.d(1, this.f);
                }
                if ((this.e & 2) == 2) {
                    hnb.d(2, this.g);
                }
                if ((this.e & 8) == 8) {
                    hnb.c(3, this.i.i());
                }
                if (r().size() > 0) {
                    hnb.p(34);
                    hnb.p(this.k);
                }
                for (int i2 = 0; i2 < this.j.size(); i2++) {
                    hnb.m(((Integer) this.j.get(i2)).intValue());
                }
                if (n().size() > 0) {
                    hnb.p(42);
                    hnb.p(this.m);
                }
                for (int i3 = 0; i3 < this.l.size(); i3++) {
                    hnb.m(((Integer) this.l.get(i3)).intValue());
                }
                if ((this.e & 4) == 4) {
                    hnb.b(6, p());
                }
                hnb.c(this.d);
            }

            private b(boolean z) {
                this.k = -1;
                this.m = -1;
                this.n = -1;
                this.o = -1;
                this.d = Fnb.a;
            }

            private b(Gnb gnb, Inb inb) throws Onb {
                this.k = -1;
                this.m = -1;
                this.n = -1;
                this.o = -1;
                x();
                defpackage.Fnb.b j2 = Fnb.j();
                Hnb a2 = Hnb.a((OutputStream) j2, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int x = gnb.x();
                        if (x != 0) {
                            if (x == 8) {
                                this.e |= 1;
                                this.f = gnb.j();
                            } else if (x == 16) {
                                this.e |= 2;
                                this.g = gnb.j();
                            } else if (x == 24) {
                                int f2 = gnb.f();
                                C0157b a3 = C0157b.a(f2);
                                if (a3 == null) {
                                    a2.p(x);
                                    a2.p(f2);
                                } else {
                                    this.e |= 8;
                                    this.i = a3;
                                }
                            } else if (x == 32) {
                                if (!(z2 & true)) {
                                    this.j = new ArrayList();
                                    z2 |= true;
                                }
                                this.j.add(Integer.valueOf(gnb.j()));
                            } else if (x == 34) {
                                int d2 = gnb.d(gnb.o());
                                if (!(z2 & true) && gnb.a() > 0) {
                                    this.j = new ArrayList();
                                    z2 |= true;
                                }
                                while (gnb.a() > 0) {
                                    this.j.add(Integer.valueOf(gnb.j()));
                                }
                                gnb.c(d2);
                            } else if (x == 40) {
                                if (!(z2 & true)) {
                                    this.l = new ArrayList();
                                    z2 |= true;
                                }
                                this.l.add(Integer.valueOf(gnb.j()));
                            } else if (x == 42) {
                                int d3 = gnb.d(gnb.o());
                                if (!(z2 & true) && gnb.a() > 0) {
                                    this.l = new ArrayList();
                                    z2 |= true;
                                }
                                while (gnb.a() > 0) {
                                    this.l.add(Integer.valueOf(gnb.j()));
                                }
                                gnb.c(d3);
                            } else if (x == 50) {
                                Fnb d4 = gnb.d();
                                this.e |= 4;
                                this.h = d4;
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
                            this.j = Collections.unmodifiableList(this.j);
                        }
                        if (z2 & true) {
                            this.l = Collections.unmodifiableList(this.l);
                        }
                        try {
                            a2.a();
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
                    this.j = Collections.unmodifiableList(this.j);
                }
                if (z2 & true) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                try {
                    a2.a();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.d = j2.a();
                    throw th3;
                }
                this.d = j2.a();
                g();
            }
        }

        /* renamed from: Xmb$g$c */
        public interface c extends Xnb {
        }

        static {
            b.m();
        }

        public static g h() {
            return b;
        }

        public static a l() {
            return a.e();
        }

        private void m() {
            this.e = Collections.emptyList();
            this.f = Collections.emptyList();
        }

        public Ynb<g> e() {
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
            this.h = 1;
            return true;
        }

        public List<Integer> j() {
            return this.f;
        }

        public List<b> k() {
            return this.e;
        }

        public int c() {
            int i2 = this.i;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                i3 += Hnb.a(1, (Wnb) this.e.get(i4));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f.size(); i6++) {
                i5 += Hnb.c(((Integer) this.f.get(i6)).intValue());
            }
            int i7 = i3 + i5;
            if (!j().isEmpty()) {
                i7 = i7 + 1 + Hnb.c(i5);
            }
            this.g = i5;
            int size = i7 + this.d.size();
            this.i = size;
            return size;
        }

        public a d() {
            return l();
        }

        private g(defpackage.Mnb.a aVar) {
            super(aVar);
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.d = aVar.b();
        }

        public static a d(g gVar) {
            a l = l();
            l.a(gVar);
            return l;
        }

        public void a(Hnb hnb) throws IOException {
            c();
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                hnb.c(1, (Wnb) this.e.get(i2));
            }
            if (j().size() > 0) {
                hnb.p(42);
                hnb.p(this.g);
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                hnb.m(((Integer) this.f.get(i3)).intValue());
            }
            hnb.c(this.d);
        }

        public a b() {
            return d(this);
        }

        private g(boolean z) {
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.d = Fnb.a;
        }

        public static g a(InputStream inputStream, Inb inb) throws IOException {
            return (g) c.b(inputStream, inb);
        }

        private g(Gnb gnb, Inb inb) throws Onb {
            this.g = -1;
            this.h = -1;
            this.i = -1;
            m();
            defpackage.Fnb.b j = Fnb.j();
            Hnb a2 = Hnb.a((OutputStream) j, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int x = gnb.x();
                    if (x != 0) {
                        if (x == 10) {
                            if (!z2 || !true) {
                                this.e = new ArrayList();
                                z2 |= true;
                            }
                            this.e.add(gnb.a(b.c, inb));
                        } else if (x == 40) {
                            if (!(z2 & true)) {
                                this.f = new ArrayList();
                                z2 |= true;
                            }
                            this.f.add(Integer.valueOf(gnb.j()));
                        } else if (x == 42) {
                            int d2 = gnb.d(gnb.o());
                            if (!(z2 & true) && gnb.a() > 0) {
                                this.f = new ArrayList();
                                z2 |= true;
                            }
                            while (gnb.a() > 0) {
                                this.f.add(Integer.valueOf(gnb.j()));
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
                    if (z2 && true) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    if (z2 & true) {
                        this.f = Collections.unmodifiableList(this.f);
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
            if (z2 && true) {
                this.e = Collections.unmodifiableList(this.e);
            }
            if (z2 & true) {
                this.f = Collections.unmodifiableList(this.f);
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

    /* renamed from: Xmb$h */
    public interface h extends Xnb {
    }

    static {
        Blb m2 = Blb.m();
        Integer valueOf = Integer.valueOf(0);
        c = Mnb.a(m2, valueOf, (Wnb) null, null, 101, defpackage.C7144pob.a.INT32, Integer.class);
        e = Mnb.a(Olb.l(), valueOf, (Wnb) null, null, 101, defpackage.C7144pob.a.INT32, Integer.class);
        i = Mnb.a(C6458flb.o(), valueOf, (Wnb) null, null, 101, defpackage.C7144pob.a.INT32, Integer.class);
        Integer num = valueOf;
        k = Mnb.a(C6458flb.o(), num, (Wnb) null, null, 103, defpackage.C7144pob.a.INT32, Integer.class);
        l = Mnb.a(Ilb.l(), num, (Wnb) null, null, 101, defpackage.C7144pob.a.INT32, Integer.class);
    }

    public static void a(Inb inb) {
        inb.a(a);
        inb.a(b);
        inb.a(c);
        inb.a(d);
        inb.a(e);
        inb.a(f);
        inb.a(g);
        inb.a(h);
        inb.a(i);
        inb.a(j);
        inb.a(k);
        inb.a(l);
        inb.a(m);
    }
}
