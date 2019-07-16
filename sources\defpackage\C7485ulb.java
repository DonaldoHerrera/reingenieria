package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ulb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C7485ulb extends c<C7485ulb> implements C7554vlb {
    private static final C7485ulb c = new C7485ulb(true);
    public static Ynb<C7485ulb> d = new C7416tlb();
    /* access modifiers changed from: private */
    public final Fnb e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public int g;
    private byte h;
    private int i;

    /* renamed from: ulb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends b<C7485ulb, a> implements C7554vlb {
        private int d;
        private int e;

        private a() {
            f();
        }

        /* access modifiers changed from: private */
        public static a e() {
            return new a();
        }

        private void f() {
        }

        public C7485ulb d() {
            C7485ulb ulb = new C7485ulb((b) this);
            int i = 1;
            if ((this.d & 1) != 1) {
                i = 0;
            }
            ulb.g = this.e;
            ulb.f = i;
            return ulb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C7485ulb) mnb);
            return this;
        }

        public C7485ulb build() {
            C7485ulb d2 = d();
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

        public a a(C7485ulb ulb) {
            if (ulb == C7485ulb.l()) {
                return this;
            }
            if (ulb.n()) {
                a(ulb.m());
            }
            a(ulb);
            a(b().b(ulb.e));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            C7485ulb ulb;
            C7485ulb ulb2 = null;
            try {
                C7485ulb ulb3 = (C7485ulb) C7485ulb.d.a(gnb, inb);
                if (ulb3 != null) {
                    a(ulb3);
                }
                return this;
            } catch (Onb e2) {
                ulb = (C7485ulb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                ulb2 = ulb;
            }
            if (ulb2 != null) {
                a(ulb2);
            }
            throw th;
        }

        public a a(int i) {
            this.d |= 1;
            this.e = i;
            return this;
        }
    }

    static {
        c.p();
    }

    public static C7485ulb l() {
        return c;
    }

    public static a o() {
        return a.e();
    }

    private void p() {
        this.g = 0;
    }

    public int c() {
        int i2 = this.i;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.f & 1) == 1) {
            i3 = 0 + Hnb.b(1, this.g);
        }
        int j = i3 + j() + this.e.size();
        this.i = j;
        return j;
    }

    public Ynb<C7485ulb> e() {
        return d;
    }

    public final boolean i() {
        byte b = this.h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!h()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public int m() {
        return this.g;
    }

    public boolean n() {
        return (this.f & 1) == 1;
    }

    public a d() {
        return o();
    }

    private C7485ulb(b<C7485ulb, ?> bVar) {
        super(bVar);
        this.h = -1;
        this.i = -1;
        this.e = bVar.b();
    }

    public static a b(C7485ulb ulb) {
        a o = o();
        o.a(ulb);
        return o;
    }

    public C7485ulb a() {
        return c;
    }

    public a b() {
        return b(this);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        a k = k();
        if ((this.f & 1) == 1) {
            hnb.d(1, this.g);
        }
        k.a(200, hnb);
        hnb.c(this.e);
    }

    private C7485ulb(boolean z) {
        this.h = -1;
        this.i = -1;
        this.e = Fnb.a;
    }

    private C7485ulb(Gnb gnb, Inb inb) throws Onb {
        this.h = -1;
        this.i = -1;
        p();
        b j = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j, 1);
        boolean z = false;
        while (!z) {
            try {
                int x = gnb.x();
                if (x != 0) {
                    if (x == 8) {
                        this.f |= 1;
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
                    this.e = j.a();
                    throw th2;
                }
                this.e = j.a();
                g();
                throw th;
            }
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.e = j.a();
            throw th3;
        }
        this.e = j.a();
        g();
    }
}
