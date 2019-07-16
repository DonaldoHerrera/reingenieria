package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: plb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C7140plb extends Mnb implements C7347slb {
    private static final C7140plb b = new C7140plb(true);
    public static Ynb<C7140plb> c = new C7071olb();
    /* access modifiers changed from: private */
    public final Fnb d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public b f;
    /* access modifiers changed from: private */
    public List<C7692xlb> g;
    /* access modifiers changed from: private */
    public C7692xlb h;
    /* access modifiers changed from: private */
    public c i;
    private byte j;
    private int k;

    /* renamed from: plb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends defpackage.Mnb.a<C7140plb, a> implements C7347slb {
        private int b;
        private b c = b.RETURNS_CONSTANT;
        private List<C7692xlb> d = Collections.emptyList();
        private C7692xlb e = C7692xlb.k();
        private c f = c.AT_MOST_ONCE;

        private a() {
            g();
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
        }

        public C7140plb d() {
            C7140plb plb = new C7140plb((defpackage.Mnb.a) this);
            int i = this.b;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            plb.f = this.c;
            if ((this.b & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.b &= -3;
            }
            plb.g = this.d;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            plb.h = this.e;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            plb.i = this.f;
            plb.e = i2;
            return plb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C7140plb) mnb);
            return this;
        }

        public C7140plb build() {
            C7140plb d2 = d();
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

        public a a(C7140plb plb) {
            if (plb == C7140plb.j()) {
                return this;
            }
            if (plb.o()) {
                a(plb.l());
            }
            if (!plb.g.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = plb.g;
                    this.b &= -3;
                } else {
                    f();
                    this.d.addAll(plb.g);
                }
            }
            if (plb.n()) {
                a(plb.h());
            }
            if (plb.p()) {
                a(plb.m());
            }
            a(b().b(plb.d));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            C7140plb plb;
            C7140plb plb2 = null;
            try {
                C7140plb plb3 = (C7140plb) C7140plb.c.a(gnb, inb);
                if (plb3 != null) {
                    a(plb3);
                }
                return this;
            } catch (Onb e2) {
                plb = (C7140plb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                plb2 = plb;
            }
            if (plb2 != null) {
                a(plb2);
            }
            throw th;
        }

        public a a(b bVar) {
            if (bVar != null) {
                this.b |= 1;
                this.c = bVar;
                return this;
            }
            throw new NullPointerException();
        }

        public a a(C7692xlb xlb) {
            if ((this.b & 4) != 4 || this.e == C7692xlb.k()) {
                this.e = xlb;
            } else {
                defpackage.C7692xlb.a d2 = C7692xlb.d(this.e);
                d2.a(xlb);
                this.e = d2.d();
            }
            this.b |= 4;
            return this;
        }

        public a a(c cVar) {
            if (cVar != null) {
                this.b |= 8;
                this.f = cVar;
                return this;
            }
            throw new NullPointerException();
        }
    }

    /* renamed from: plb$b */
    /* compiled from: ProtoBuf */
    public enum b implements defpackage.Nnb.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        
        private static defpackage.Nnb.b<b> d;
        private final int f;

        static {
            d = new C7209qlb();
        }

        private b(int i, int i2) {
            this.f = i2;
        }

        public static b a(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        public final int i() {
            return this.f;
        }
    }

    /* renamed from: plb$c */
    /* compiled from: ProtoBuf */
    public enum c implements defpackage.Nnb.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        
        private static defpackage.Nnb.b<c> d;
        private final int f;

        static {
            d = new C7278rlb();
        }

        private c(int i, int i2) {
            this.f = i2;
        }

        public static c a(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        public final int i() {
            return this.f;
        }
    }

    static {
        b.r();
    }

    public static C7140plb j() {
        return b;
    }

    public static a q() {
        return a.e();
    }

    private void r() {
        this.f = b.RETURNS_CONSTANT;
        this.g = Collections.emptyList();
        this.h = C7692xlb.k();
        this.i = c.AT_MOST_ONCE;
    }

    public int c() {
        int i2 = this.k;
        if (i2 != -1) {
            return i2;
        }
        int a2 = (this.e & 1) == 1 ? Hnb.a(1, this.f.i()) + 0 : 0;
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            a2 += Hnb.a(2, (Wnb) this.g.get(i3));
        }
        if ((this.e & 2) == 2) {
            a2 += Hnb.a(3, (Wnb) this.h);
        }
        if ((this.e & 4) == 4) {
            a2 += Hnb.a(4, this.i.i());
        }
        int size = a2 + this.d.size();
        this.k = size;
        return size;
    }

    public Ynb<C7140plb> e() {
        return c;
    }

    public C7692xlb h() {
        return this.h;
    }

    public final boolean i() {
        byte b2 = this.j;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < k(); i2++) {
            if (!a(i2).i()) {
                this.j = 0;
                return false;
            }
        }
        if (!n() || h().i()) {
            this.j = 1;
            return true;
        }
        this.j = 0;
        return false;
    }

    public int k() {
        return this.g.size();
    }

    public b l() {
        return this.f;
    }

    public c m() {
        return this.i;
    }

    public boolean n() {
        return (this.e & 2) == 2;
    }

    public boolean o() {
        return (this.e & 1) == 1;
    }

    public boolean p() {
        return (this.e & 4) == 4;
    }

    public a d() {
        return q();
    }

    private C7140plb(defpackage.Mnb.a aVar) {
        super(aVar);
        this.j = -1;
        this.k = -1;
        this.d = aVar.b();
    }

    public a b() {
        return c(this);
    }

    private C7140plb(boolean z) {
        this.j = -1;
        this.k = -1;
        this.d = Fnb.a;
    }

    public C7692xlb a(int i2) {
        return (C7692xlb) this.g.get(i2);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        if ((this.e & 1) == 1) {
            hnb.c(1, this.f.i());
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            hnb.c(2, (Wnb) this.g.get(i2));
        }
        if ((this.e & 2) == 2) {
            hnb.c(3, (Wnb) this.h);
        }
        if ((this.e & 4) == 4) {
            hnb.c(4, this.i.i());
        }
        hnb.c(this.d);
    }

    private C7140plb(Gnb gnb, Inb inb) throws Onb {
        this.j = -1;
        this.k = -1;
        r();
        defpackage.Fnb.b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = gnb.x();
                if (x != 0) {
                    if (x == 8) {
                        int f2 = gnb.f();
                        b a3 = b.a(f2);
                        if (a3 == null) {
                            a2.p(x);
                            a2.p(f2);
                        } else {
                            this.e |= 1;
                            this.f = a3;
                        }
                    } else if (x == 18) {
                        if (!(z2 & true)) {
                            this.g = new ArrayList();
                            z2 |= true;
                        }
                        this.g.add(gnb.a(C7692xlb.c, inb));
                    } else if (x == 26) {
                        defpackage.C7692xlb.a aVar = null;
                        if ((this.e & 2) == 2) {
                            aVar = this.h.b();
                        }
                        this.h = (C7692xlb) gnb.a(C7692xlb.c, inb);
                        if (aVar != null) {
                            aVar.a(this.h);
                            this.h = aVar.d();
                        }
                        this.e |= 2;
                    } else if (x == 32) {
                        int f3 = gnb.f();
                        c a4 = c.a(f3);
                        if (a4 == null) {
                            a2.p(x);
                            a2.p(f3);
                        } else {
                            this.e |= 4;
                            this.i = a4;
                        }
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
                    this.d = j2.a();
                    throw th2;
                }
                this.d = j2.a();
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
            this.d = j2.a();
            throw th3;
        }
        this.d = j2.a();
        g();
    }

    public static a c(C7140plb plb) {
        a q = q();
        q.a(plb);
        return q;
    }
}
