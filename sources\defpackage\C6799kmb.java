package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: kmb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C6799kmb extends Mnb implements C6867lmb {
    private static final C6799kmb b = new C6799kmb(true);
    public static Ynb<C6799kmb> c = new C6731jmb();
    /* access modifiers changed from: private */
    public final Fnb d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public List<_lb> f;
    /* access modifiers changed from: private */
    public int g;
    private byte h;
    private int i;

    /* renamed from: kmb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends defpackage.Mnb.a<C6799kmb, a> implements C6867lmb {
        private int b;
        private List<_lb> c = Collections.emptyList();
        private int d = -1;

        private a() {
            g();
        }

        /* access modifiers changed from: private */
        public static a e() {
            return new a();
        }

        private void f() {
            if ((this.b & 1) != 1) {
                this.c = new ArrayList(this.c);
                this.b |= 1;
            }
        }

        private void g() {
        }

        public C6799kmb d() {
            C6799kmb kmb = new C6799kmb((defpackage.Mnb.a) this);
            int i = this.b;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.c = Collections.unmodifiableList(this.c);
                this.b &= -2;
            }
            kmb.f = this.c;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            kmb.g = this.d;
            kmb.e = i2;
            return kmb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C6799kmb) mnb);
            return this;
        }

        public C6799kmb build() {
            C6799kmb d2 = d();
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

        public a a(C6799kmb kmb) {
            if (kmb == C6799kmb.h()) {
                return this;
            }
            if (!kmb.f.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = kmb.f;
                    this.b &= -2;
                } else {
                    f();
                    this.c.addAll(kmb.f);
                }
            }
            if (kmb.m()) {
                a(kmb.j());
            }
            a(b().b(kmb.d));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            C6799kmb kmb;
            C6799kmb kmb2 = null;
            try {
                C6799kmb kmb3 = (C6799kmb) C6799kmb.c.a(gnb, inb);
                if (kmb3 != null) {
                    a(kmb3);
                }
                return this;
            } catch (Onb e) {
                kmb = (C6799kmb) e.a();
                throw e;
            } catch (Throwable th) {
                th = th;
                kmb2 = kmb;
            }
            if (kmb2 != null) {
                a(kmb2);
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

    public static C6799kmb h() {
        return b;
    }

    public static a n() {
        return a.e();
    }

    private void o() {
        this.f = Collections.emptyList();
        this.g = -1;
    }

    public int c() {
        int i2 = this.i;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f.size(); i4++) {
            i3 += Hnb.a(1, (Wnb) this.f.get(i4));
        }
        if ((this.e & 1) == 1) {
            i3 += Hnb.b(2, this.g);
        }
        int size = i3 + this.d.size();
        this.i = size;
        return size;
    }

    public Ynb<C6799kmb> e() {
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
        for (int i2 = 0; i2 < k(); i2++) {
            if (!a(i2).i()) {
                this.h = 0;
                return false;
            }
        }
        this.h = 1;
        return true;
    }

    public int j() {
        return this.g;
    }

    public int k() {
        return this.f.size();
    }

    public List<_lb> l() {
        return this.f;
    }

    public boolean m() {
        return (this.e & 1) == 1;
    }

    public a d() {
        return n();
    }

    private C6799kmb(defpackage.Mnb.a aVar) {
        super(aVar);
        this.h = -1;
        this.i = -1;
        this.d = aVar.b();
    }

    public _lb a(int i2) {
        return (_lb) this.f.get(i2);
    }

    public a b() {
        return c(this);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            hnb.c(1, (Wnb) this.f.get(i2));
        }
        if ((this.e & 1) == 1) {
            hnb.d(2, this.g);
        }
        hnb.c(this.d);
    }

    private C6799kmb(boolean z) {
        this.h = -1;
        this.i = -1;
        this.d = Fnb.a;
    }

    public static a c(C6799kmb kmb) {
        a n = n();
        n.a(kmb);
        return n;
    }

    private C6799kmb(Gnb gnb, Inb inb) throws Onb {
        this.h = -1;
        this.i = -1;
        o();
        b j = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j, 1);
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
                        this.f.add(gnb.a(_lb.d, inb));
                    } else if (x == 16) {
                        this.e |= 1;
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
                if (z2 && true) {
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
