package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Klb reason: default package */
/* compiled from: ProtoBuf */
public final class Klb extends c<Klb> implements Llb {
    private static final Klb c = new Klb(true);
    public static Ynb<Klb> d = new Jlb();
    /* access modifiers changed from: private */
    public final Fnb e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public Wlb g;
    /* access modifiers changed from: private */
    public Rlb h;
    /* access modifiers changed from: private */
    public Ilb i;
    /* access modifiers changed from: private */
    public List<C6458flb> j;
    private byte k;
    private int l;

    /* renamed from: Klb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends b<Klb, a> implements Llb {
        private int d;
        private Wlb e = Wlb.h();
        private Rlb f = Rlb.h();
        private Ilb g = Ilb.l();
        private List<C6458flb> h = Collections.emptyList();

        private a() {
            g();
        }

        /* access modifiers changed from: private */
        public static a e() {
            return new a();
        }

        private void f() {
            if ((this.d & 8) != 8) {
                this.h = new ArrayList(this.h);
                this.d |= 8;
            }
        }

        private void g() {
        }

        public Klb d() {
            Klb klb = new Klb((b) this);
            int i = this.d;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            klb.g = this.e;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            klb.h = this.f;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            klb.i = this.g;
            if ((this.d & 8) == 8) {
                this.h = Collections.unmodifiableList(this.h);
                this.d &= -9;
            }
            klb.j = this.h;
            klb.f = i2;
            return klb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((Klb) mnb);
            return this;
        }

        public Klb build() {
            Klb d2 = d();
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

        public a a(Klb klb) {
            if (klb == Klb.n()) {
                return this;
            }
            if (klb.t()) {
                a(klb.q());
            }
            if (klb.s()) {
                a(klb.p());
            }
            if (klb.r()) {
                a(klb.o());
            }
            if (!klb.j.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = klb.j;
                    this.d &= -9;
                } else {
                    f();
                    this.h.addAll(klb.j);
                }
            }
            a(klb);
            a(b().b(klb.e));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            Klb klb;
            Klb klb2 = null;
            try {
                Klb klb3 = (Klb) Klb.d.a(gnb, inb);
                if (klb3 != null) {
                    a(klb3);
                }
                return this;
            } catch (Onb e2) {
                klb = (Klb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                klb2 = klb;
            }
            if (klb2 != null) {
                a(klb2);
            }
            throw th;
        }

        public a a(Wlb wlb) {
            if ((this.d & 1) != 1 || this.e == Wlb.h()) {
                this.e = wlb;
            } else {
                defpackage.Wlb.a c = Wlb.c(this.e);
                c.a(wlb);
                this.e = c.d();
            }
            this.d |= 1;
            return this;
        }

        public a a(Rlb rlb) {
            if ((this.d & 2) != 2 || this.f == Rlb.h()) {
                this.f = rlb;
            } else {
                defpackage.Rlb.a c = Rlb.c(this.f);
                c.a(rlb);
                this.f = c.d();
            }
            this.d |= 2;
            return this;
        }

        public a a(Ilb ilb) {
            if ((this.d & 4) != 4 || this.g == Ilb.l()) {
                this.g = ilb;
            } else {
                defpackage.Ilb.a e2 = Ilb.e(this.g);
                e2.a(ilb);
                this.g = e2.d();
            }
            this.d |= 4;
            return this;
        }
    }

    static {
        c.v();
    }

    public static Klb n() {
        return c;
    }

    public static a u() {
        return a.e();
    }

    private void v() {
        this.g = Wlb.h();
        this.h = Rlb.h();
        this.i = Ilb.l();
        this.j = Collections.emptyList();
    }

    public int c() {
        int i2 = this.l;
        if (i2 != -1) {
            return i2;
        }
        int a2 = (this.f & 1) == 1 ? Hnb.a(1, (Wnb) this.g) + 0 : 0;
        if ((this.f & 2) == 2) {
            a2 += Hnb.a(2, (Wnb) this.h);
        }
        if ((this.f & 4) == 4) {
            a2 += Hnb.a(3, (Wnb) this.i);
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            a2 += Hnb.a(4, (Wnb) this.j.get(i3));
        }
        int j2 = a2 + j() + this.e.size();
        this.l = j2;
        return j2;
    }

    public Ynb<Klb> e() {
        return d;
    }

    public final boolean i() {
        byte b = this.k;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (s() && !p().i()) {
            this.k = 0;
            return false;
        } else if (!r() || o().i()) {
            for (int i2 = 0; i2 < l(); i2++) {
                if (!a(i2).i()) {
                    this.k = 0;
                    return false;
                }
            }
            if (!h()) {
                this.k = 0;
                return false;
            }
            this.k = 1;
            return true;
        } else {
            this.k = 0;
            return false;
        }
    }

    public int l() {
        return this.j.size();
    }

    public List<C6458flb> m() {
        return this.j;
    }

    public Ilb o() {
        return this.i;
    }

    public Rlb p() {
        return this.h;
    }

    public Wlb q() {
        return this.g;
    }

    public boolean r() {
        return (this.f & 4) == 4;
    }

    public boolean s() {
        return (this.f & 2) == 2;
    }

    public boolean t() {
        return (this.f & 1) == 1;
    }

    public a d() {
        return u();
    }

    private Klb(b<Klb, ?> bVar) {
        super(bVar);
        this.k = -1;
        this.l = -1;
        this.e = bVar.b();
    }

    public a b() {
        return c(this);
    }

    private Klb(boolean z) {
        this.k = -1;
        this.l = -1;
        this.e = Fnb.a;
    }

    public Klb a() {
        return c;
    }

    public C6458flb a(int i2) {
        return (C6458flb) this.j.get(i2);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        a k2 = k();
        if ((this.f & 1) == 1) {
            hnb.c(1, (Wnb) this.g);
        }
        if ((this.f & 2) == 2) {
            hnb.c(2, (Wnb) this.h);
        }
        if ((this.f & 4) == 4) {
            hnb.c(3, (Wnb) this.i);
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            hnb.c(4, (Wnb) this.j.get(i2));
        }
        k2.a(200, hnb);
        hnb.c(this.e);
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [Wlb$a] */
    /* JADX WARNING: type inference failed for: r8v2, types: [Wlb$a] */
    /* JADX WARNING: type inference failed for: r8v3, types: [Rlb$a] */
    /* JADX WARNING: type inference failed for: r8v4, types: [Rlb$a] */
    /* JADX WARNING: type inference failed for: r8v5, types: [Ilb$a] */
    /* JADX WARNING: type inference failed for: r8v6, types: [Ilb$a] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], Rlb$a, Wlb$a, Ilb$a]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], Wlb$a, Rlb$a, Ilb$a]
  mth insns count: 122
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
    private Klb(Gnb gnb, Inb inb) throws Onb {
        this.k = -1;
        this.l = -1;
        v();
        b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = gnb.x();
                if (x != 0) {
                    ? r8 = 0;
                    if (x == 10) {
                        if ((this.f & 1) == 1) {
                            r8 = this.g.b();
                        }
                        this.g = (Wlb) gnb.a(Wlb.c, inb);
                        if (r8 != 0) {
                            r8.a(this.g);
                            this.g = r8.d();
                        }
                        this.f |= 1;
                    } else if (x == 18) {
                        if ((this.f & 2) == 2) {
                            r8 = this.h.b();
                        }
                        this.h = (Rlb) gnb.a(Rlb.c, inb);
                        if (r8 != 0) {
                            r8.a(this.h);
                            this.h = r8.d();
                        }
                        this.f |= 2;
                    } else if (x == 26) {
                        if ((this.f & 4) == 4) {
                            r8 = this.i.b();
                        }
                        this.i = (Ilb) gnb.a(Ilb.d, inb);
                        if (r8 != 0) {
                            r8.a(this.i);
                            this.i = r8.d();
                        }
                        this.f |= 4;
                    } else if (x == 34) {
                        if (!(z2 & true)) {
                            this.j = new ArrayList();
                            z2 |= true;
                        }
                        this.j.add(gnb.a(C6458flb.d, inb));
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
            this.j = Collections.unmodifiableList(this.j);
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

    public static a c(Klb klb) {
        a u = u();
        u.a(klb);
        return u;
    }

    public static Klb a(InputStream inputStream, Inb inb) throws IOException {
        return (Klb) d.a(inputStream, inb);
    }
}
