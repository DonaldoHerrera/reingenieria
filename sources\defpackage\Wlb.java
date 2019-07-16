package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: Wlb reason: default package */
/* compiled from: ProtoBuf */
public final class Wlb extends Mnb implements Xlb {
    private static final Wlb b = new Wlb(true);
    public static Ynb<Wlb> c = new Vlb();
    /* access modifiers changed from: private */
    public final Fnb d;
    /* access modifiers changed from: private */
    public Tnb e;
    private byte f;
    private int g;

    /* renamed from: Wlb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends defpackage.Mnb.a<Wlb, a> implements Xlb {
        private int b;
        private Tnb c = Snb.a;

        private a() {
            g();
        }

        /* access modifiers changed from: private */
        public static a e() {
            return new a();
        }

        private void f() {
            if ((this.b & 1) != 1) {
                this.c = new Snb(this.c);
                this.b |= 1;
            }
        }

        private void g() {
        }

        public Wlb d() {
            Wlb wlb = new Wlb((defpackage.Mnb.a) this);
            if ((this.b & 1) == 1) {
                this.c = this.c.Q();
                this.b &= -2;
            }
            wlb.e = this.c;
            return wlb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((Wlb) mnb);
            return this;
        }

        public Wlb build() {
            Wlb d = d();
            if (d.i()) {
                return d;
            }
            throw defpackage.Bnb.a.a(d);
        }

        public a clone() {
            a e = e();
            e.a(d());
            return e;
        }

        public a a(Wlb wlb) {
            if (wlb == Wlb.h()) {
                return this;
            }
            if (!wlb.e.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = wlb.e;
                    this.b &= -2;
                } else {
                    f();
                    this.c.addAll(wlb.e);
                }
            }
            a(b().b(wlb.d));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            Wlb wlb;
            Wlb wlb2 = null;
            try {
                Wlb wlb3 = (Wlb) Wlb.c.a(gnb, inb);
                if (wlb3 != null) {
                    a(wlb3);
                }
                return this;
            } catch (Onb e) {
                wlb = (Wlb) e.a();
                throw e;
            } catch (Throwable th) {
                th = th;
                wlb2 = wlb;
            }
            if (wlb2 != null) {
                a(wlb2);
            }
            throw th;
        }
    }

    static {
        b.l();
    }

    public static Wlb h() {
        return b;
    }

    public static a k() {
        return a.e();
    }

    private void l() {
        this.e = Snb.a;
    }

    public int c() {
        int i = this.g;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            i2 += Hnb.a(this.e.k(i3));
        }
        int size = 0 + i2 + (j().size() * 1) + this.d.size();
        this.g = size;
        return size;
    }

    public Ynb<Wlb> e() {
        return c;
    }

    public final boolean i() {
        byte b2 = this.f;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f = 1;
        return true;
    }

    public Znb j() {
        return this.e;
    }

    public a d() {
        return k();
    }

    private Wlb(defpackage.Mnb.a aVar) {
        super(aVar);
        this.f = -1;
        this.g = -1;
        this.d = aVar.b();
    }

    public String a(int i) {
        return (String) this.e.get(i);
    }

    public a b() {
        return c(this);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        for (int i = 0; i < this.e.size(); i++) {
            hnb.b(1, this.e.k(i));
        }
        hnb.c(this.d);
    }

    private Wlb(boolean z) {
        this.f = -1;
        this.g = -1;
        this.d = Fnb.a;
    }

    public static a c(Wlb wlb) {
        a k = k();
        k.a(wlb);
        return k;
    }

    private Wlb(Gnb gnb, Inb inb) throws Onb {
        this.f = -1;
        this.g = -1;
        l();
        b j = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = gnb.x();
                if (x != 0) {
                    if (x == 10) {
                        Fnb d2 = gnb.d();
                        if (!z2 || !true) {
                            this.e = new Snb();
                            z2 |= true;
                        }
                        this.e.a(d2);
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
                    this.e = this.e.Q();
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
            this.e = this.e.Q();
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
