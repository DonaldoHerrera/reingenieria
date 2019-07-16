package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Rlb reason: default package */
/* compiled from: ProtoBuf */
public final class Rlb extends Mnb implements Ulb {
    private static final Rlb b = new Rlb(true);
    public static Ynb<Rlb> c = new Qlb();
    /* access modifiers changed from: private */
    public final Fnb d;
    /* access modifiers changed from: private */
    public List<b> e;
    private byte f;
    private int g;

    /* renamed from: Rlb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends defpackage.Mnb.a<Rlb, a> implements Ulb {
        private int b;
        private List<b> c = Collections.emptyList();

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

        public Rlb d() {
            Rlb rlb = new Rlb((defpackage.Mnb.a) this);
            if ((this.b & 1) == 1) {
                this.c = Collections.unmodifiableList(this.c);
                this.b &= -2;
            }
            rlb.e = this.c;
            return rlb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((Rlb) mnb);
            return this;
        }

        public Rlb build() {
            Rlb d = d();
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

        public a a(Rlb rlb) {
            if (rlb == Rlb.h()) {
                return this;
            }
            if (!rlb.e.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = rlb.e;
                    this.b &= -2;
                } else {
                    f();
                    this.c.addAll(rlb.e);
                }
            }
            a(b().b(rlb.d));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            Rlb rlb;
            Rlb rlb2 = null;
            try {
                Rlb rlb3 = (Rlb) Rlb.c.a(gnb, inb);
                if (rlb3 != null) {
                    a(rlb3);
                }
                return this;
            } catch (Onb e) {
                rlb = (Rlb) e.a();
                throw e;
            } catch (Throwable th) {
                th = th;
                rlb2 = rlb;
            }
            if (rlb2 != null) {
                a(rlb2);
            }
            throw th;
        }
    }

    /* renamed from: Rlb$b */
    /* compiled from: ProtoBuf */
    public static final class b extends Mnb implements c {
        private static final b b = new b(true);
        public static Ynb<b> c = new Slb();
        /* access modifiers changed from: private */
        public final Fnb d;
        /* access modifiers changed from: private */
        public int e;
        /* access modifiers changed from: private */
        public int f;
        /* access modifiers changed from: private */
        public int g;
        /* access modifiers changed from: private */
        public C0151b h;
        private byte i;
        private int j;

        /* renamed from: Rlb$b$a */
        /* compiled from: ProtoBuf */
        public static final class a extends defpackage.Mnb.a<b, a> implements c {
            private int b;
            private int c = -1;
            private int d;
            private C0151b e = C0151b.PACKAGE;

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
                this.b |= 2;
                this.d = i;
                return this;
            }

            public b d() {
                b bVar = new b((defpackage.Mnb.a) this);
                int i = this.b;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                bVar.f = this.c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.g = this.d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                bVar.h = this.e;
                bVar.e = i2;
                return bVar;
            }

            public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
                a((b) mnb);
                return this;
            }

            public b build() {
                b d2 = d();
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

            public a a(b bVar) {
                if (bVar == b.h()) {
                    return this;
                }
                if (bVar.n()) {
                    a(bVar.k());
                }
                if (bVar.o()) {
                    b(bVar.l());
                }
                if (bVar.m()) {
                    a(bVar.j());
                }
                a(b().b(bVar.d));
                return this;
            }

            public a a(Gnb gnb, Inb inb) throws IOException {
                b bVar;
                b bVar2 = null;
                try {
                    b bVar3 = (b) b.c.a(gnb, inb);
                    if (bVar3 != null) {
                        a(bVar3);
                    }
                    return this;
                } catch (Onb e2) {
                    bVar = (b) e2.a();
                    throw e2;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    a(bVar2);
                }
                throw th;
            }

            public a a(int i) {
                this.b |= 1;
                this.c = i;
                return this;
            }

            public a a(C0151b bVar) {
                if (bVar != null) {
                    this.b |= 4;
                    this.e = bVar;
                    return this;
                }
                throw new NullPointerException();
            }
        }

        /* renamed from: Rlb$b$b reason: collision with other inner class name */
        /* compiled from: ProtoBuf */
        public enum C0151b implements defpackage.Nnb.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            
            private static defpackage.Nnb.b<C0151b> d;
            private final int f;

            static {
                d = new Tlb();
            }

            private C0151b(int i, int i2) {
                this.f = i2;
            }

            public static C0151b a(int i) {
                if (i == 0) {
                    return CLASS;
                }
                if (i == 1) {
                    return PACKAGE;
                }
                if (i != 2) {
                    return null;
                }
                return LOCAL;
            }

            public final int i() {
                return this.f;
            }
        }

        static {
            b.q();
        }

        public static b h() {
            return b;
        }

        public static a p() {
            return a.e();
        }

        private void q() {
            this.f = -1;
            this.g = 0;
            this.h = C0151b.PACKAGE;
        }

        public Ynb<b> e() {
            return c;
        }

        public final boolean i() {
            byte b2 = this.i;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!o()) {
                this.i = 0;
                return false;
            }
            this.i = 1;
            return true;
        }

        public C0151b j() {
            return this.h;
        }

        public int k() {
            return this.f;
        }

        public int l() {
            return this.g;
        }

        public boolean m() {
            return (this.e & 4) == 4;
        }

        public boolean n() {
            return (this.e & 1) == 1;
        }

        public boolean o() {
            return (this.e & 2) == 2;
        }

        public int c() {
            int i2 = this.j;
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
            int size = i3 + this.d.size();
            this.j = size;
            return size;
        }

        public a d() {
            return p();
        }

        private b(defpackage.Mnb.a aVar) {
            super(aVar);
            this.i = -1;
            this.j = -1;
            this.d = aVar.b();
        }

        public static a b(b bVar) {
            a p = p();
            p.a(bVar);
            return p;
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
            hnb.c(this.d);
        }

        public a b() {
            return b(this);
        }

        private b(boolean z) {
            this.i = -1;
            this.j = -1;
            this.d = Fnb.a;
        }

        private b(Gnb gnb, Inb inb) throws Onb {
            this.i = -1;
            this.j = -1;
            q();
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
                            C0151b a3 = C0151b.a(f2);
                            if (a3 == null) {
                                a2.p(x);
                                a2.p(f2);
                            } else {
                                this.e |= 4;
                                this.h = a3;
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

    /* renamed from: Rlb$c */
    public interface c extends Xnb {
    }

    static {
        b.l();
    }

    public static Rlb h() {
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

    public Ynb<Rlb> e() {
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

    private Rlb(defpackage.Mnb.a aVar) {
        super(aVar);
        this.f = -1;
        this.g = -1;
        this.d = aVar.b();
    }

    public b a(int i) {
        return (b) this.e.get(i);
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

    public static a c(Rlb rlb) {
        a k = k();
        k.a(rlb);
        return k;
    }

    private Rlb(boolean z) {
        this.f = -1;
        this.g = -1;
        this.d = Fnb.a;
    }

    private Rlb(Gnb gnb, Inb inb) throws Onb {
        this.f = -1;
        this.g = -1;
        l();
        defpackage.Fnb.b j = Fnb.j();
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
                        this.e.add(gnb.a(b.c, inb));
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
