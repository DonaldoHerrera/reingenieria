package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Qmb reason: default package */
/* compiled from: JvmModuleProtoBuf */
public final class Qmb extends Mnb implements Rmb {
    private static final Qmb b = new Qmb(true);
    public static Ynb<Qmb> c = new Pmb();
    /* access modifiers changed from: private */
    public final Fnb d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public List<Tmb> f;
    /* access modifiers changed from: private */
    public List<Tmb> g;
    /* access modifiers changed from: private */
    public Tnb h;
    /* access modifiers changed from: private */
    public Wlb i;
    /* access modifiers changed from: private */
    public Rlb j;
    /* access modifiers changed from: private */
    public List<C5590alb> k;
    private byte l;
    private int m;

    /* renamed from: Qmb$a */
    /* compiled from: JvmModuleProtoBuf */
    public static final class a extends defpackage.Mnb.a<Qmb, a> implements Rmb {
        private int b;
        private List<Tmb> c = Collections.emptyList();
        private List<Tmb> d = Collections.emptyList();
        private Tnb e = Snb.a;
        private Wlb f = Wlb.h();
        private Rlb g = Rlb.h();
        private List<C5590alb> h = Collections.emptyList();

        private a() {
            k();
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
            if ((this.b & 4) != 4) {
                this.e = new Snb(this.e);
                this.b |= 4;
            }
        }

        private void h() {
            if ((this.b & 2) != 2) {
                this.d = new ArrayList(this.d);
                this.b |= 2;
            }
        }

        private void j() {
            if ((this.b & 1) != 1) {
                this.c = new ArrayList(this.c);
                this.b |= 1;
            }
        }

        private void k() {
        }

        public Qmb d() {
            Qmb qmb = new Qmb((defpackage.Mnb.a) this);
            int i = this.b;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.c = Collections.unmodifiableList(this.c);
                this.b &= -2;
            }
            qmb.f = this.c;
            if ((this.b & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.b &= -3;
            }
            qmb.g = this.d;
            if ((this.b & 4) == 4) {
                this.e = this.e.Q();
                this.b &= -5;
            }
            qmb.h = this.e;
            if ((i & 8) != 8) {
                i2 = 0;
            }
            qmb.i = this.f;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            qmb.j = this.g;
            if ((this.b & 32) == 32) {
                this.h = Collections.unmodifiableList(this.h);
                this.b &= -33;
            }
            qmb.k = this.h;
            qmb.e = i2;
            return qmb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((Qmb) mnb);
            return this;
        }

        public Qmb build() {
            Qmb d2 = d();
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

        public a a(Qmb qmb) {
            if (qmb == Qmb.k()) {
                return this;
            }
            if (!qmb.f.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = qmb.f;
                    this.b &= -2;
                } else {
                    j();
                    this.c.addAll(qmb.f);
                }
            }
            if (!qmb.g.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = qmb.g;
                    this.b &= -3;
                } else {
                    h();
                    this.d.addAll(qmb.g);
                }
            }
            if (!qmb.h.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = qmb.h;
                    this.b &= -5;
                } else {
                    g();
                    this.e.addAll(qmb.h);
                }
            }
            if (qmb.t()) {
                a(qmb.r());
            }
            if (qmb.s()) {
                a(qmb.q());
            }
            if (!qmb.k.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = qmb.k;
                    this.b &= -33;
                } else {
                    f();
                    this.h.addAll(qmb.k);
                }
            }
            a(b().b(qmb.d));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            Qmb qmb;
            Qmb qmb2 = null;
            try {
                Qmb qmb3 = (Qmb) Qmb.c.a(gnb, inb);
                if (qmb3 != null) {
                    a(qmb3);
                }
                return this;
            } catch (Onb e2) {
                qmb = (Qmb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                qmb2 = qmb;
            }
            if (qmb2 != null) {
                a(qmb2);
            }
            throw th;
        }

        public a a(Wlb wlb) {
            if ((this.b & 8) != 8 || this.f == Wlb.h()) {
                this.f = wlb;
            } else {
                defpackage.Wlb.a c2 = Wlb.c(this.f);
                c2.a(wlb);
                this.f = c2.d();
            }
            this.b |= 8;
            return this;
        }

        public a a(Rlb rlb) {
            if ((this.b & 16) != 16 || this.g == Rlb.h()) {
                this.g = rlb;
            } else {
                defpackage.Rlb.a c2 = Rlb.c(this.g);
                c2.a(rlb);
                this.g = c2.d();
            }
            this.b |= 16;
            return this;
        }
    }

    static {
        b.v();
    }

    public static a f(Qmb qmb) {
        a u = u();
        u.a(qmb);
        return u;
    }

    public static Qmb k() {
        return b;
    }

    public static a u() {
        return a.e();
    }

    private void v() {
        this.f = Collections.emptyList();
        this.g = Collections.emptyList();
        this.h = Snb.a;
        this.i = Wlb.h();
        this.j = Rlb.h();
        this.k = Collections.emptyList();
    }

    public int h() {
        return this.k.size();
    }

    public final boolean i() {
        byte b2 = this.l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < o(); i2++) {
            if (!c(i2).i()) {
                this.l = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m(); i3++) {
            if (!b(i3).i()) {
                this.l = 0;
                return false;
            }
        }
        if (!s() || q().i()) {
            for (int i4 = 0; i4 < h(); i4++) {
                if (!a(i4).i()) {
                    this.l = 0;
                    return false;
                }
            }
            this.l = 1;
            return true;
        }
        this.l = 0;
        return false;
    }

    public List<C5590alb> j() {
        return this.k;
    }

    public Znb l() {
        return this.h;
    }

    public int m() {
        return this.g.size();
    }

    public List<Tmb> n() {
        return this.g;
    }

    public int o() {
        return this.f.size();
    }

    public List<Tmb> p() {
        return this.f;
    }

    public Rlb q() {
        return this.j;
    }

    public Wlb r() {
        return this.i;
    }

    public boolean s() {
        return (this.e & 2) == 2;
    }

    public boolean t() {
        return (this.e & 1) == 1;
    }

    public Ynb<Qmb> e() {
        return c;
    }

    private Qmb(defpackage.Mnb.a aVar) {
        super(aVar);
        this.l = -1;
        this.m = -1;
        this.d = aVar.b();
    }

    public Tmb c(int i2) {
        return (Tmb) this.f.get(i2);
    }

    public a d() {
        return u();
    }

    public Tmb b(int i2) {
        return (Tmb) this.g.get(i2);
    }

    public int c() {
        int i2 = this.m;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f.size(); i4++) {
            i3 += Hnb.a(1, (Wnb) this.f.get(i4));
        }
        for (int i5 = 0; i5 < this.g.size(); i5++) {
            i3 += Hnb.a(2, (Wnb) this.g.get(i5));
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.h.size(); i7++) {
            i6 += Hnb.a(this.h.k(i7));
        }
        int size = i3 + i6 + (l().size() * 1);
        if ((this.e & 1) == 1) {
            size += Hnb.a(4, (Wnb) this.i);
        }
        if ((this.e & 2) == 2) {
            size += Hnb.a(5, (Wnb) this.j);
        }
        for (int i8 = 0; i8 < this.k.size(); i8++) {
            size += Hnb.a(6, (Wnb) this.k.get(i8));
        }
        int size2 = size + this.d.size();
        this.m = size2;
        return size2;
    }

    public a b() {
        return f(this);
    }

    private Qmb(boolean z) {
        this.l = -1;
        this.m = -1;
        this.d = Fnb.a;
    }

    public C5590alb a(int i2) {
        return (C5590alb) this.k.get(i2);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            hnb.c(1, (Wnb) this.f.get(i2));
        }
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            hnb.c(2, (Wnb) this.g.get(i3));
        }
        for (int i4 = 0; i4 < this.h.size(); i4++) {
            hnb.b(3, this.h.k(i4));
        }
        if ((this.e & 1) == 1) {
            hnb.c(4, (Wnb) this.i);
        }
        if ((this.e & 2) == 2) {
            hnb.c(5, (Wnb) this.j);
        }
        for (int i5 = 0; i5 < this.k.size(); i5++) {
            hnb.c(6, (Wnb) this.k.get(i5));
        }
        hnb.c(this.d);
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [Wlb$a] */
    /* JADX WARNING: type inference failed for: r10v2, types: [Wlb$a] */
    /* JADX WARNING: type inference failed for: r10v3, types: [Rlb$a] */
    /* JADX WARNING: type inference failed for: r10v4, types: [Rlb$a] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r10v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], Rlb$a, Wlb$a]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], Wlb$a, Rlb$a]
  mth insns count: 164
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
    /* JADX WARNING: Unknown variable types count: 3 */
    private Qmb(Gnb gnb, Inb inb) throws Onb {
        this.l = -1;
        this.m = -1;
        v();
        b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = gnb.x();
                if (x != 0) {
                    if (x == 10) {
                        if (!z2 || !true) {
                            this.f = new ArrayList();
                            z2 |= true;
                        }
                        this.f.add(gnb.a(Tmb.c, inb));
                    } else if (x == 18) {
                        if (!(z2 & true)) {
                            this.g = new ArrayList();
                            z2 |= true;
                        }
                        this.g.add(gnb.a(Tmb.c, inb));
                    } else if (x != 26) {
                        ? r10 = 0;
                        if (x == 34) {
                            if ((this.e & 1) == 1) {
                                r10 = this.i.b();
                            }
                            this.i = (Wlb) gnb.a(Wlb.c, inb);
                            if (r10 != 0) {
                                r10.a(this.i);
                                this.i = r10.d();
                            }
                            this.e |= 1;
                        } else if (x == 42) {
                            if ((this.e & 2) == 2) {
                                r10 = this.j.b();
                            }
                            this.j = (Rlb) gnb.a(Rlb.c, inb);
                            if (r10 != 0) {
                                r10.a(this.j);
                                this.j = r10.d();
                            }
                            this.e |= 2;
                        } else if (x == 50) {
                            if (!(z2 & true)) {
                                this.k = new ArrayList();
                                z2 |= true;
                            }
                            this.k.add(gnb.a(C5590alb.c, inb));
                        } else if (!a(gnb, a2, inb, x)) {
                        }
                    } else {
                        Fnb d2 = gnb.d();
                        if (!(z2 & true)) {
                            this.h = new Snb();
                            z2 |= true;
                        }
                        this.h.a(d2);
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
                    this.f = Collections.unmodifiableList(this.f);
                }
                if (z2 & true) {
                    this.g = Collections.unmodifiableList(this.g);
                }
                if (z2 & true) {
                    this.h = this.h.Q();
                }
                if (z2 & true) {
                    this.k = Collections.unmodifiableList(this.k);
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
        if (z2 && true) {
            this.f = Collections.unmodifiableList(this.f);
        }
        if (z2 & true) {
            this.g = Collections.unmodifiableList(this.g);
        }
        if (z2 & true) {
            this.h = this.h.Q();
        }
        if (z2 & true) {
            this.k = Collections.unmodifiableList(this.k);
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

    public static Qmb a(InputStream inputStream) throws IOException {
        return (Qmb) c.a(inputStream);
    }
}
