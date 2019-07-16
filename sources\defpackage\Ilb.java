package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Ilb reason: default package */
/* compiled from: ProtoBuf */
public final class Ilb extends c<Ilb> implements Mlb {
    private static final Ilb c = new Ilb(true);
    public static Ynb<Ilb> d = new Hlb();
    /* access modifiers changed from: private */
    public final Fnb e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public List<Blb> g;
    /* access modifiers changed from: private */
    public List<Olb> h;
    /* access modifiers changed from: private */
    public List<C5727cmb> i;
    /* access modifiers changed from: private */
    public C6799kmb j;
    /* access modifiers changed from: private */
    public C7555vmb k;
    private byte l;
    private int m;

    /* renamed from: Ilb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends b<Ilb, a> implements Mlb {
        private int d;
        private List<Blb> e = Collections.emptyList();
        private List<Olb> f = Collections.emptyList();
        private List<C5727cmb> g = Collections.emptyList();
        private C6799kmb h = C6799kmb.h();
        private C7555vmb i = C7555vmb.h();

        private a() {
            j();
        }

        /* access modifiers changed from: private */
        public static a e() {
            return new a();
        }

        private void f() {
            if ((this.d & 1) != 1) {
                this.e = new ArrayList(this.e);
                this.d |= 1;
            }
        }

        private void g() {
            if ((this.d & 2) != 2) {
                this.f = new ArrayList(this.f);
                this.d |= 2;
            }
        }

        private void h() {
            if ((this.d & 4) != 4) {
                this.g = new ArrayList(this.g);
                this.d |= 4;
            }
        }

        private void j() {
        }

        public Ilb d() {
            Ilb ilb = new Ilb((b) this);
            int i2 = this.d;
            int i3 = 1;
            if ((i2 & 1) == 1) {
                this.e = Collections.unmodifiableList(this.e);
                this.d &= -2;
            }
            ilb.g = this.e;
            if ((this.d & 2) == 2) {
                this.f = Collections.unmodifiableList(this.f);
                this.d &= -3;
            }
            ilb.h = this.f;
            if ((this.d & 4) == 4) {
                this.g = Collections.unmodifiableList(this.g);
                this.d &= -5;
            }
            ilb.i = this.g;
            if ((i2 & 8) != 8) {
                i3 = 0;
            }
            ilb.j = this.h;
            if ((i2 & 16) == 16) {
                i3 |= 2;
            }
            ilb.k = this.i;
            ilb.f = i3;
            return ilb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((Ilb) mnb);
            return this;
        }

        public Ilb build() {
            Ilb d2 = d();
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

        public a a(Ilb ilb) {
            if (ilb == Ilb.l()) {
                return this;
            }
            if (!ilb.g.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = ilb.g;
                    this.d &= -2;
                } else {
                    f();
                    this.e.addAll(ilb.g);
                }
            }
            if (!ilb.h.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = ilb.h;
                    this.d &= -3;
                } else {
                    g();
                    this.f.addAll(ilb.h);
                }
            }
            if (!ilb.i.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = ilb.i;
                    this.d &= -5;
                } else {
                    h();
                    this.g.addAll(ilb.i);
                }
            }
            if (ilb.u()) {
                a(ilb.s());
            }
            if (ilb.v()) {
                a(ilb.t());
            }
            a(ilb);
            a(b().b(ilb.e));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            Ilb ilb;
            Ilb ilb2 = null;
            try {
                Ilb ilb3 = (Ilb) Ilb.d.a(gnb, inb);
                if (ilb3 != null) {
                    a(ilb3);
                }
                return this;
            } catch (Onb e2) {
                ilb = (Ilb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                ilb2 = ilb;
            }
            if (ilb2 != null) {
                a(ilb2);
            }
            throw th;
        }

        public a a(C6799kmb kmb) {
            if ((this.d & 8) != 8 || this.h == C6799kmb.h()) {
                this.h = kmb;
            } else {
                defpackage.C6799kmb.a c = C6799kmb.c(this.h);
                c.a(kmb);
                this.h = c.d();
            }
            this.d |= 8;
            return this;
        }

        public a a(C7555vmb vmb) {
            if ((this.d & 16) != 16 || this.i == C7555vmb.h()) {
                this.i = vmb;
            } else {
                defpackage.C7555vmb.a c = C7555vmb.c(this.i);
                c.a(vmb);
                this.i = c.d();
            }
            this.d |= 16;
            return this;
        }
    }

    static {
        c.x();
    }

    public static Ilb l() {
        return c;
    }

    public static a w() {
        return a.e();
    }

    private void x() {
        this.g = Collections.emptyList();
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
        this.j = C6799kmb.h();
        this.k = C7555vmb.h();
    }

    public Ynb<Ilb> e() {
        return d;
    }

    public final boolean i() {
        byte b = this.l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i2 = 0; i2 < m(); i2++) {
            if (!a(i2).i()) {
                this.l = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < o(); i3++) {
            if (!b(i3).i()) {
                this.l = 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < q(); i4++) {
            if (!c(i4).i()) {
                this.l = 0;
                return false;
            }
        }
        if (u() && !s().i()) {
            this.l = 0;
            return false;
        } else if (!h()) {
            this.l = 0;
            return false;
        } else {
            this.l = 1;
            return true;
        }
    }

    public int m() {
        return this.g.size();
    }

    public List<Blb> n() {
        return this.g;
    }

    public int o() {
        return this.h.size();
    }

    public List<Olb> p() {
        return this.h;
    }

    public int q() {
        return this.i.size();
    }

    public List<C5727cmb> r() {
        return this.i;
    }

    public C6799kmb s() {
        return this.j;
    }

    public C7555vmb t() {
        return this.k;
    }

    public boolean u() {
        return (this.f & 1) == 1;
    }

    public boolean v() {
        return (this.f & 2) == 2;
    }

    public static a e(Ilb ilb) {
        a w = w();
        w.a(ilb);
        return w;
    }

    private Ilb(b<Ilb, ?> bVar) {
        super(bVar);
        this.l = -1;
        this.m = -1;
        this.e = bVar.b();
    }

    public C5727cmb c(int i2) {
        return (C5727cmb) this.i.get(i2);
    }

    public a d() {
        return w();
    }

    public Olb b(int i2) {
        return (Olb) this.h.get(i2);
    }

    public int c() {
        int i2 = this.m;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.g.size(); i4++) {
            i3 += Hnb.a(3, (Wnb) this.g.get(i4));
        }
        for (int i5 = 0; i5 < this.h.size(); i5++) {
            i3 += Hnb.a(4, (Wnb) this.h.get(i5));
        }
        for (int i6 = 0; i6 < this.i.size(); i6++) {
            i3 += Hnb.a(5, (Wnb) this.i.get(i6));
        }
        if ((this.f & 1) == 1) {
            i3 += Hnb.a(30, (Wnb) this.j);
        }
        if ((this.f & 2) == 2) {
            i3 += Hnb.a(32, (Wnb) this.k);
        }
        int j2 = i3 + j() + this.e.size();
        this.m = j2;
        return j2;
    }

    public a b() {
        return e(this);
    }

    private Ilb(boolean z) {
        this.l = -1;
        this.m = -1;
        this.e = Fnb.a;
    }

    public Ilb a() {
        return c;
    }

    public Blb a(int i2) {
        return (Blb) this.g.get(i2);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        a k2 = k();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            hnb.c(3, (Wnb) this.g.get(i2));
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            hnb.c(4, (Wnb) this.h.get(i3));
        }
        for (int i4 = 0; i4 < this.i.size(); i4++) {
            hnb.c(5, (Wnb) this.i.get(i4));
        }
        if ((this.f & 1) == 1) {
            hnb.c(30, (Wnb) this.j);
        }
        if ((this.f & 2) == 2) {
            hnb.c(32, (Wnb) this.k);
        }
        k2.a(200, hnb);
        hnb.c(this.e);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [kmb$a] */
    /* JADX WARNING: type inference failed for: r9v2, types: [kmb$a] */
    /* JADX WARNING: type inference failed for: r9v3, types: [vmb$a] */
    /* JADX WARNING: type inference failed for: r9v4, types: [vmb$a] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], vmb$a, kmb$a]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], kmb$a, vmb$a]
  mth insns count: 144
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
    private Ilb(Gnb gnb, Inb inb) throws Onb {
        this.l = -1;
        this.m = -1;
        x();
        b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = gnb.x();
                if (x != 0) {
                    if (x == 26) {
                        if (!z2 || !true) {
                            this.g = new ArrayList();
                            z2 |= true;
                        }
                        this.g.add(gnb.a(Blb.d, inb));
                    } else if (x == 34) {
                        if (!(z2 & true)) {
                            this.h = new ArrayList();
                            z2 |= true;
                        }
                        this.h.add(gnb.a(Olb.d, inb));
                    } else if (x != 42) {
                        ? r9 = 0;
                        if (x == 242) {
                            if ((this.f & 1) == 1) {
                                r9 = this.j.b();
                            }
                            this.j = (C6799kmb) gnb.a(C6799kmb.c, inb);
                            if (r9 != 0) {
                                r9.a(this.j);
                                this.j = r9.d();
                            }
                            this.f |= 1;
                        } else if (x == 258) {
                            if ((this.f & 2) == 2) {
                                r9 = this.k.b();
                            }
                            this.k = (C7555vmb) gnb.a(C7555vmb.c, inb);
                            if (r9 != 0) {
                                r9.a(this.k);
                                this.k = r9.d();
                            }
                            this.f |= 2;
                        } else if (!a(gnb, a2, inb, x)) {
                        }
                    } else {
                        if (!(z2 & true)) {
                            this.i = new ArrayList();
                            z2 |= true;
                        }
                        this.i.add(gnb.a(C5727cmb.d, inb));
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
                    this.g = Collections.unmodifiableList(this.g);
                }
                if (z2 & true) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if (z2 & true) {
                    this.i = Collections.unmodifiableList(this.i);
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
        if (z2 & true) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if (z2 & true) {
            this.i = Collections.unmodifiableList(this.i);
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

    public static Ilb a(InputStream inputStream, Inb inb) throws IOException {
        return (Ilb) d.a(inputStream, inb);
    }
}
