package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: qmb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C7210qmb extends Mnb implements C7417tmb {
    private static final C7210qmb b = new C7210qmb(true);
    public static Ynb<C7210qmb> c = new C7141pmb();
    /* access modifiers changed from: private */
    public final Fnb d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public b h;
    /* access modifiers changed from: private */
    public int i;
    /* access modifiers changed from: private */
    public int j;
    /* access modifiers changed from: private */
    public c k;
    private byte l;
    private int m;

    /* renamed from: qmb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends defpackage.Mnb.a<C7210qmb, a> implements C7417tmb {
        private int b;
        private int c;
        private int d;
        private b e = b.ERROR;
        private int f;
        private int g;
        private c h = c.LANGUAGE_VERSION;

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
            this.b |= 16;
            this.g = i;
            return this;
        }

        public C7210qmb d() {
            C7210qmb qmb = new C7210qmb((defpackage.Mnb.a) this);
            int i = this.b;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            qmb.f = this.c;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            qmb.g = this.d;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            qmb.h = this.e;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            qmb.i = this.f;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            qmb.j = this.g;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            qmb.k = this.h;
            qmb.e = i2;
            return qmb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C7210qmb) mnb);
            return this;
        }

        public C7210qmb build() {
            C7210qmb d2 = d();
            if (d2.i()) {
                return d2;
            }
            throw defpackage.Bnb.a.a(d2);
        }

        public a c(int i) {
            this.b |= 1;
            this.c = i;
            return this;
        }

        public a clone() {
            a e2 = e();
            e2.a(d());
            return e2;
        }

        public a a(C7210qmb qmb) {
            if (qmb == C7210qmb.h()) {
                return this;
            }
            if (qmb.s()) {
                c(qmb.m());
            }
            if (qmb.t()) {
                d(qmb.n());
            }
            if (qmb.q()) {
                a(qmb.k());
            }
            if (qmb.p()) {
                a(qmb.j());
            }
            if (qmb.r()) {
                b(qmb.l());
            }
            if (qmb.u()) {
                a(qmb.o());
            }
            a(b().b(qmb.d));
            return this;
        }

        public a d(int i) {
            this.b |= 2;
            this.d = i;
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            C7210qmb qmb;
            C7210qmb qmb2 = null;
            try {
                C7210qmb qmb3 = (C7210qmb) C7210qmb.c.a(gnb, inb);
                if (qmb3 != null) {
                    a(qmb3);
                }
                return this;
            } catch (Onb e2) {
                qmb = (C7210qmb) e2.a();
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

        public a a(b bVar) {
            if (bVar != null) {
                this.b |= 4;
                this.e = bVar;
                return this;
            }
            throw new NullPointerException();
        }

        public a a(int i) {
            this.b |= 8;
            this.f = i;
            return this;
        }

        public a a(c cVar) {
            if (cVar != null) {
                this.b |= 32;
                this.h = cVar;
                return this;
            }
            throw new NullPointerException();
        }
    }

    /* renamed from: qmb$b */
    /* compiled from: ProtoBuf */
    public enum b implements defpackage.Nnb.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        
        private static defpackage.Nnb.b<b> d;
        private final int f;

        static {
            d = new C7279rmb();
        }

        private b(int i, int i2) {
            this.f = i2;
        }

        public static b a(int i) {
            if (i == 0) {
                return WARNING;
            }
            if (i == 1) {
                return ERROR;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }

        public final int i() {
            return this.f;
        }
    }

    /* renamed from: qmb$c */
    /* compiled from: ProtoBuf */
    public enum c implements defpackage.Nnb.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        
        private static defpackage.Nnb.b<c> d;
        private final int f;

        static {
            d = new C7348smb();
        }

        private c(int i, int i2) {
            this.f = i2;
        }

        public static c a(int i) {
            if (i == 0) {
                return LANGUAGE_VERSION;
            }
            if (i == 1) {
                return COMPILER_VERSION;
            }
            if (i != 2) {
                return null;
            }
            return API_VERSION;
        }

        public final int i() {
            return this.f;
        }
    }

    static {
        b.w();
    }

    public static C7210qmb h() {
        return b;
    }

    public static a v() {
        return a.e();
    }

    private void w() {
        this.f = 0;
        this.g = 0;
        this.h = b.ERROR;
        this.i = 0;
        this.j = 0;
        this.k = c.LANGUAGE_VERSION;
    }

    public final boolean i() {
        byte b2 = this.l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.l = 1;
        return true;
    }

    public int j() {
        return this.i;
    }

    public b k() {
        return this.h;
    }

    public int l() {
        return this.j;
    }

    public int m() {
        return this.f;
    }

    public int n() {
        return this.g;
    }

    public c o() {
        return this.k;
    }

    public boolean p() {
        return (this.e & 8) == 8;
    }

    public boolean q() {
        return (this.e & 4) == 4;
    }

    public boolean r() {
        return (this.e & 16) == 16;
    }

    public boolean s() {
        return (this.e & 1) == 1;
    }

    public boolean t() {
        return (this.e & 2) == 2;
    }

    public boolean u() {
        return (this.e & 32) == 32;
    }

    public int c() {
        int i2 = this.m;
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
        if ((this.e & 4) == 4) {
            i3 += Hnb.a(3, this.h.i());
        }
        if ((this.e & 8) == 8) {
            i3 += Hnb.b(4, this.i);
        }
        if ((this.e & 16) == 16) {
            i3 += Hnb.b(5, this.j);
        }
        if ((this.e & 32) == 32) {
            i3 += Hnb.a(6, this.k.i());
        }
        int size = i3 + this.d.size();
        this.m = size;
        return size;
    }

    public Ynb<C7210qmb> e() {
        return c;
    }

    private C7210qmb(defpackage.Mnb.a aVar) {
        super(aVar);
        this.l = -1;
        this.m = -1;
        this.d = aVar.b();
    }

    public static a b(C7210qmb qmb) {
        a v = v();
        v.a(qmb);
        return v;
    }

    public a d() {
        return v();
    }

    public a b() {
        return b(this);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        if ((this.e & 1) == 1) {
            hnb.d(1, this.f);
        }
        if ((this.e & 2) == 2) {
            hnb.d(2, this.g);
        }
        if ((this.e & 4) == 4) {
            hnb.c(3, this.h.i());
        }
        if ((this.e & 8) == 8) {
            hnb.d(4, this.i);
        }
        if ((this.e & 16) == 16) {
            hnb.d(5, this.j);
        }
        if ((this.e & 32) == 32) {
            hnb.c(6, this.k.i());
        }
        hnb.c(this.d);
    }

    private C7210qmb(boolean z) {
        this.l = -1;
        this.m = -1;
        this.d = Fnb.a;
    }

    private C7210qmb(Gnb gnb, Inb inb) throws Onb {
        this.l = -1;
        this.m = -1;
        w();
        defpackage.Fnb.b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
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
                    } else if (x == 24) {
                        int f2 = gnb.f();
                        b a3 = b.a(f2);
                        if (a3 == null) {
                            a2.p(x);
                            a2.p(f2);
                        } else {
                            this.e |= 4;
                            this.h = a3;
                        }
                    } else if (x == 32) {
                        this.e |= 8;
                        this.i = gnb.j();
                    } else if (x == 40) {
                        this.e |= 16;
                        this.j = gnb.j();
                    } else if (x == 48) {
                        int f3 = gnb.f();
                        c a4 = c.a(f3);
                        if (a4 == null) {
                            a2.p(x);
                            a2.p(f3);
                        } else {
                            this.e |= 32;
                            this.k = a4;
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
