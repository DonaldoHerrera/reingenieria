package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mlb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C6934mlb extends Mnb implements C7002nlb {
    private static final C6934mlb b = new C6934mlb(true);
    public static Ynb<C6934mlb> c = new C6866llb();
    /* access modifiers changed from: private */
    public final Fnb d;
    /* access modifiers changed from: private */
    public List<C7140plb> e;
    private byte f;
    private int g;

    /* renamed from: mlb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends defpackage.Mnb.a<C6934mlb, a> implements C7002nlb {
        private int b;
        private List<C7140plb> c = Collections.emptyList();

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

        public C6934mlb d() {
            C6934mlb mlb = new C6934mlb((defpackage.Mnb.a) this);
            if ((this.b & 1) == 1) {
                this.c = Collections.unmodifiableList(this.c);
                this.b &= -2;
            }
            mlb.e = this.c;
            return mlb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C6934mlb) mnb);
            return this;
        }

        public C6934mlb build() {
            C6934mlb d = d();
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

        public a a(C6934mlb mlb) {
            if (mlb == C6934mlb.h()) {
                return this;
            }
            if (!mlb.e.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = mlb.e;
                    this.b &= -2;
                } else {
                    f();
                    this.c.addAll(mlb.e);
                }
            }
            a(b().b(mlb.d));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            C6934mlb mlb;
            C6934mlb mlb2 = null;
            try {
                C6934mlb mlb3 = (C6934mlb) C6934mlb.c.a(gnb, inb);
                if (mlb3 != null) {
                    a(mlb3);
                }
                return this;
            } catch (Onb e) {
                mlb = (C6934mlb) e.a();
                throw e;
            } catch (Throwable th) {
                th = th;
                mlb2 = mlb;
            }
            if (mlb2 != null) {
                a(mlb2);
            }
            throw th;
        }
    }

    static {
        b.l();
    }

    public static C6934mlb h() {
        return b;
    }

    public static a k() {
        return a.e();
    }

    private void l() {
        this.e = Collections.emptyList();
    }

    public int c() {
        int i = this.g;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            i2 += Hnb.a(1, (Wnb) this.e.get(i3));
        }
        int size = i2 + this.d.size();
        this.g = size;
        return size;
    }

    public Ynb<C6934mlb> e() {
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
        for (int i = 0; i < j(); i++) {
            if (!a(i).i()) {
                this.f = 0;
                return false;
            }
        }
        this.f = 1;
        return true;
    }

    public int j() {
        return this.e.size();
    }

    public a d() {
        return k();
    }

    private C6934mlb(defpackage.Mnb.a aVar) {
        super(aVar);
        this.f = -1;
        this.g = -1;
        this.d = aVar.b();
    }

    public C7140plb a(int i) {
        return (C7140plb) this.e.get(i);
    }

    public a b() {
        return c(this);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        for (int i = 0; i < this.e.size(); i++) {
            hnb.c(1, (Wnb) this.e.get(i));
        }
        hnb.c(this.d);
    }

    public static a c(C6934mlb mlb) {
        a k = k();
        k.a(mlb);
        return k;
    }

    private C6934mlb(boolean z) {
        this.f = -1;
        this.g = -1;
        this.d = Fnb.a;
    }

    private C6934mlb(Gnb gnb, Inb inb) throws Onb {
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
                        if (!z2 || !true) {
                            this.e = new ArrayList();
                            z2 |= true;
                        }
                        this.e.add(gnb.a(C7140plb.c, inb));
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
