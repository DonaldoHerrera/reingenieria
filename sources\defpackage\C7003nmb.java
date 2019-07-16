package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: nmb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C7003nmb extends c<C7003nmb> implements C7072omb {
    private static final C7003nmb c = new C7003nmb(true);
    public static Ynb<C7003nmb> d = new C6935mmb();
    /* access modifiers changed from: private */
    public final Fnb e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public int h;
    /* access modifiers changed from: private */
    public _lb i;
    /* access modifiers changed from: private */
    public int j;
    /* access modifiers changed from: private */
    public _lb k;
    /* access modifiers changed from: private */
    public int l;
    private byte m;
    private int n;

    /* renamed from: nmb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends b<C7003nmb, a> implements C7072omb {
        private int d;
        private int e;
        private int f;
        private _lb g = _lb.q();
        private int h;
        private _lb i = _lb.q();
        private int j;

        private a() {
            f();
        }

        /* access modifiers changed from: private */
        public static a e() {
            return new a();
        }

        private void f() {
        }

        public a b(int i2) {
            this.d |= 2;
            this.f = i2;
            return this;
        }

        public C7003nmb d() {
            C7003nmb nmb = new C7003nmb((b) this);
            int i2 = this.d;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            nmb.g = this.e;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            nmb.h = this.f;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            nmb.i = this.g;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            nmb.j = this.h;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            nmb.k = this.i;
            if ((i2 & 32) == 32) {
                i3 |= 32;
            }
            nmb.l = this.j;
            nmb.f = i3;
            return nmb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C7003nmb) mnb);
            return this;
        }

        public C7003nmb build() {
            C7003nmb d2 = d();
            if (d2.i()) {
                return d2;
            }
            throw defpackage.Bnb.a.a(d2);
        }

        public a c(int i2) {
            this.d |= 8;
            this.h = i2;
            return this;
        }

        public a b(_lb _lb) {
            if ((this.d & 16) != 16 || this.i == _lb.q()) {
                this.i = _lb;
            } else {
                c c = _lb.c(this.i);
                c.c(_lb);
                this.i = c.d();
            }
            this.d |= 16;
            return this;
        }

        public a clone() {
            a e2 = e();
            e2.a(d());
            return e2;
        }

        public a a(C7003nmb nmb) {
            if (nmb == C7003nmb.l()) {
                return this;
            }
            if (nmb.s()) {
                a(nmb.m());
            }
            if (nmb.t()) {
                b(nmb.n());
            }
            if (nmb.u()) {
                a(nmb.o());
            }
            if (nmb.v()) {
                c(nmb.p());
            }
            if (nmb.w()) {
                b(nmb.q());
            }
            if (nmb.x()) {
                d(nmb.r());
            }
            a(nmb);
            a(b().b(nmb.e));
            return this;
        }

        public a d(int i2) {
            this.d |= 32;
            this.j = i2;
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            C7003nmb nmb;
            C7003nmb nmb2 = null;
            try {
                C7003nmb nmb3 = (C7003nmb) C7003nmb.d.a(gnb, inb);
                if (nmb3 != null) {
                    a(nmb3);
                }
                return this;
            } catch (Onb e2) {
                nmb = (C7003nmb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                nmb2 = nmb;
            }
            if (nmb2 != null) {
                a(nmb2);
            }
            throw th;
        }

        public a a(int i2) {
            this.d |= 1;
            this.e = i2;
            return this;
        }

        public a a(_lb _lb) {
            if ((this.d & 4) != 4 || this.g == _lb.q()) {
                this.g = _lb;
            } else {
                c c = _lb.c(this.g);
                c.c(_lb);
                this.g = c.d();
            }
            this.d |= 4;
            return this;
        }
    }

    static {
        c.z();
    }

    public static C7003nmb l() {
        return c;
    }

    public static a y() {
        return a.e();
    }

    private void z() {
        this.g = 0;
        this.h = 0;
        this.i = _lb.q();
        this.j = 0;
        this.k = _lb.q();
        this.l = 0;
    }

    public final boolean i() {
        byte b = this.m;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!t()) {
            this.m = 0;
            return false;
        } else if (u() && !o().i()) {
            this.m = 0;
            return false;
        } else if (w() && !q().i()) {
            this.m = 0;
            return false;
        } else if (!h()) {
            this.m = 0;
            return false;
        } else {
            this.m = 1;
            return true;
        }
    }

    public int m() {
        return this.g;
    }

    public int n() {
        return this.h;
    }

    public _lb o() {
        return this.i;
    }

    public int p() {
        return this.j;
    }

    public _lb q() {
        return this.k;
    }

    public int r() {
        return this.l;
    }

    public boolean s() {
        return (this.f & 1) == 1;
    }

    public boolean t() {
        return (this.f & 2) == 2;
    }

    public boolean u() {
        return (this.f & 4) == 4;
    }

    public boolean v() {
        return (this.f & 8) == 8;
    }

    public boolean w() {
        return (this.f & 16) == 16;
    }

    public boolean x() {
        return (this.f & 32) == 32;
    }

    public int c() {
        int i2 = this.n;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.f & 1) == 1) {
            i3 = 0 + Hnb.b(1, this.g);
        }
        if ((this.f & 2) == 2) {
            i3 += Hnb.b(2, this.h);
        }
        if ((this.f & 4) == 4) {
            i3 += Hnb.a(3, (Wnb) this.i);
        }
        if ((this.f & 16) == 16) {
            i3 += Hnb.a(4, (Wnb) this.k);
        }
        if ((this.f & 8) == 8) {
            i3 += Hnb.b(5, this.j);
        }
        if ((this.f & 32) == 32) {
            i3 += Hnb.b(6, this.l);
        }
        int j2 = i3 + j() + this.e.size();
        this.n = j2;
        return j2;
    }

    public Ynb<C7003nmb> e() {
        return d;
    }

    private C7003nmb(b<C7003nmb, ?> bVar) {
        super(bVar);
        this.m = -1;
        this.n = -1;
        this.e = bVar.b();
    }

    public a d() {
        return y();
    }

    public static a b(C7003nmb nmb) {
        a y = y();
        y.a(nmb);
        return y;
    }

    public C7003nmb a() {
        return c;
    }

    public a b() {
        return b(this);
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
        if ((this.f & 4) == 4) {
            hnb.c(3, (Wnb) this.i);
        }
        if ((this.f & 16) == 16) {
            hnb.c(4, (Wnb) this.k);
        }
        if ((this.f & 8) == 8) {
            hnb.d(5, this.j);
        }
        if ((this.f & 32) == 32) {
            hnb.d(6, this.l);
        }
        k2.a(200, hnb);
        hnb.c(this.e);
    }

    private C7003nmb(boolean z) {
        this.m = -1;
        this.n = -1;
        this.e = Fnb.a;
    }

    private C7003nmb(Gnb gnb, Inb inb) throws Onb {
        this.m = -1;
        this.n = -1;
        z();
        b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
        boolean z = false;
        while (!z) {
            try {
                int x = gnb.x();
                if (x != 0) {
                    if (x == 8) {
                        this.f |= 1;
                        this.g = gnb.j();
                    } else if (x != 16) {
                        c cVar = null;
                        if (x == 26) {
                            if ((this.f & 4) == 4) {
                                cVar = this.i.b();
                            }
                            this.i = (_lb) gnb.a(_lb.d, inb);
                            if (cVar != null) {
                                cVar.c(this.i);
                                this.i = cVar.d();
                            }
                            this.f |= 4;
                        } else if (x == 34) {
                            if ((this.f & 16) == 16) {
                                cVar = this.k.b();
                            }
                            this.k = (_lb) gnb.a(_lb.d, inb);
                            if (cVar != null) {
                                cVar.c(this.k);
                                this.k = cVar.d();
                            }
                            this.f |= 16;
                        } else if (x == 40) {
                            this.f |= 8;
                            this.j = gnb.j();
                        } else if (x == 48) {
                            this.f |= 32;
                            this.l = gnb.j();
                        } else if (!a(gnb, a2, inb, x)) {
                        }
                    } else {
                        this.f |= 2;
                        this.h = gnb.j();
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
                    this.e = j2.a();
                    throw th2;
                }
                this.e = j2.a();
                g();
                throw th;
            }
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
