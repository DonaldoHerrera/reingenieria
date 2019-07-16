package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jlb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C6730jlb extends c<C6730jlb> implements C6798klb {
    private static final C6730jlb c = new C6730jlb(true);
    public static Ynb<C6730jlb> d = new C6662ilb();
    /* access modifiers changed from: private */
    public final Fnb e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public List<C7003nmb> h;
    /* access modifiers changed from: private */
    public List<Integer> i;
    private byte j;
    private int k;

    /* renamed from: jlb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends b<C6730jlb, a> implements C6798klb {
        private int d;
        private int e = 6;
        private List<C7003nmb> f = Collections.emptyList();
        private List<Integer> g = Collections.emptyList();

        private a() {
            h();
        }

        /* access modifiers changed from: private */
        public static a e() {
            return new a();
        }

        private void f() {
            if ((this.d & 2) != 2) {
                this.f = new ArrayList(this.f);
                this.d |= 2;
            }
        }

        private void g() {
            if ((this.d & 4) != 4) {
                this.g = new ArrayList(this.g);
                this.d |= 4;
            }
        }

        private void h() {
        }

        public C6730jlb d() {
            C6730jlb jlb = new C6730jlb((b) this);
            int i = 1;
            if ((this.d & 1) != 1) {
                i = 0;
            }
            jlb.g = this.e;
            if ((this.d & 2) == 2) {
                this.f = Collections.unmodifiableList(this.f);
                this.d &= -3;
            }
            jlb.h = this.f;
            if ((this.d & 4) == 4) {
                this.g = Collections.unmodifiableList(this.g);
                this.d &= -5;
            }
            jlb.i = this.g;
            jlb.f = i;
            return jlb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C6730jlb) mnb);
            return this;
        }

        public C6730jlb build() {
            C6730jlb d2 = d();
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

        public a a(C6730jlb jlb) {
            if (jlb == C6730jlb.l()) {
                return this;
            }
            if (jlb.q()) {
                a(jlb.m());
            }
            if (!jlb.h.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = jlb.h;
                    this.d &= -3;
                } else {
                    f();
                    this.f.addAll(jlb.h);
                }
            }
            if (!jlb.i.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = jlb.i;
                    this.d &= -5;
                } else {
                    g();
                    this.g.addAll(jlb.i);
                }
            }
            a(jlb);
            a(b().b(jlb.e));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            C6730jlb jlb;
            C6730jlb jlb2 = null;
            try {
                C6730jlb jlb3 = (C6730jlb) C6730jlb.d.a(gnb, inb);
                if (jlb3 != null) {
                    a(jlb3);
                }
                return this;
            } catch (Onb e2) {
                jlb = (C6730jlb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                jlb2 = jlb;
            }
            if (jlb2 != null) {
                a(jlb2);
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
        c.s();
    }

    public static C6730jlb l() {
        return c;
    }

    public static a r() {
        return a.e();
    }

    private void s() {
        this.g = 6;
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
    }

    public Ynb<C6730jlb> e() {
        return d;
    }

    public final boolean i() {
        byte b = this.j;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i2 = 0; i2 < n(); i2++) {
            if (!a(i2).i()) {
                this.j = 0;
                return false;
            }
        }
        if (!h()) {
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public int m() {
        return this.g;
    }

    public int n() {
        return this.h.size();
    }

    public List<C7003nmb> o() {
        return this.h;
    }

    public List<Integer> p() {
        return this.i;
    }

    public boolean q() {
        return (this.f & 1) == 1;
    }

    public int c() {
        int i2 = this.k;
        if (i2 != -1) {
            return i2;
        }
        int b = (this.f & 1) == 1 ? Hnb.b(1, this.g) + 0 : 0;
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            b += Hnb.a(2, (Wnb) this.h.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.i.size(); i5++) {
            i4 += Hnb.c(((Integer) this.i.get(i5)).intValue());
        }
        int size = b + i4 + (p().size() * 2) + j() + this.e.size();
        this.k = size;
        return size;
    }

    public a d() {
        return r();
    }

    private C6730jlb(b<C6730jlb, ?> bVar) {
        super(bVar);
        this.j = -1;
        this.k = -1;
        this.e = bVar.b();
    }

    public static a d(C6730jlb jlb) {
        a r = r();
        r.a(jlb);
        return r;
    }

    public C6730jlb a() {
        return c;
    }

    public a b() {
        return d(this);
    }

    public C7003nmb a(int i2) {
        return (C7003nmb) this.h.get(i2);
    }

    private C6730jlb(boolean z) {
        this.j = -1;
        this.k = -1;
        this.e = Fnb.a;
    }

    public void a(Hnb hnb) throws IOException {
        c();
        a k2 = k();
        if ((this.f & 1) == 1) {
            hnb.d(1, this.g);
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            hnb.c(2, (Wnb) this.h.get(i2));
        }
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            hnb.d(31, ((Integer) this.i.get(i3)).intValue());
        }
        k2.a(19000, hnb);
        hnb.c(this.e);
    }

    private C6730jlb(Gnb gnb, Inb inb) throws Onb {
        this.j = -1;
        this.k = -1;
        s();
        b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = gnb.x();
                if (x != 0) {
                    if (x == 8) {
                        this.f |= 1;
                        this.g = gnb.j();
                    } else if (x == 18) {
                        if (!(z2 & true)) {
                            this.h = new ArrayList();
                            z2 |= true;
                        }
                        this.h.add(gnb.a(C7003nmb.d, inb));
                    } else if (x == 248) {
                        if (!(z2 & true)) {
                            this.i = new ArrayList();
                            z2 |= true;
                        }
                        this.i.add(Integer.valueOf(gnb.j()));
                    } else if (x == 250) {
                        int d2 = gnb.d(gnb.o());
                        if (!(z2 & true) && gnb.a() > 0) {
                            this.i = new ArrayList();
                            z2 |= true;
                        }
                        while (gnb.a() > 0) {
                            this.i.add(Integer.valueOf(gnb.j()));
                        }
                        gnb.c(d2);
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
}
