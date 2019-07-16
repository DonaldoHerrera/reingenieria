package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: xlb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C7692xlb extends Mnb implements C7830zlb {
    private static final C7692xlb b = new C7692xlb(true);
    public static Ynb<C7692xlb> c = new C7623wlb();
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
    public _lb i;
    /* access modifiers changed from: private */
    public int j;
    /* access modifiers changed from: private */
    public List<C7692xlb> k;
    /* access modifiers changed from: private */
    public List<C7692xlb> l;
    private byte m;
    private int n;

    /* renamed from: xlb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends defpackage.Mnb.a<C7692xlb, a> implements C7830zlb {
        private int b;
        private int c;
        private int d;
        private b e = b.TRUE;
        private _lb f = _lb.q();
        private int g;
        private List<C7692xlb> h = Collections.emptyList();
        private List<C7692xlb> i = Collections.emptyList();

        private a() {
            h();
        }

        /* access modifiers changed from: private */
        public static a e() {
            return new a();
        }

        private void f() {
            if ((this.b & 32) != 32) {
                this.h = new ArrayList(this.h);
                this.b |= 32;
            }
        }

        private void g() {
            if ((this.b & 64) != 64) {
                this.i = new ArrayList(this.i);
                this.b |= 64;
            }
        }

        private void h() {
        }

        public a b(int i2) {
            this.b |= 16;
            this.g = i2;
            return this;
        }

        public C7692xlb d() {
            C7692xlb xlb = new C7692xlb((defpackage.Mnb.a) this);
            int i2 = this.b;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            xlb.f = this.c;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            xlb.g = this.d;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            xlb.h = this.e;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            xlb.i = this.f;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            xlb.j = this.g;
            if ((this.b & 32) == 32) {
                this.h = Collections.unmodifiableList(this.h);
                this.b &= -33;
            }
            xlb.k = this.h;
            if ((this.b & 64) == 64) {
                this.i = Collections.unmodifiableList(this.i);
                this.b &= -65;
            }
            xlb.l = this.i;
            xlb.e = i3;
            return xlb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C7692xlb) mnb);
            return this;
        }

        public C7692xlb build() {
            C7692xlb d2 = d();
            if (d2.i()) {
                return d2;
            }
            throw defpackage.Bnb.a.a(d2);
        }

        public a c(int i2) {
            this.b |= 2;
            this.d = i2;
            return this;
        }

        public a clone() {
            a e2 = e();
            e2.a(d());
            return e2;
        }

        public a a(C7692xlb xlb) {
            if (xlb == C7692xlb.k()) {
                return this;
            }
            if (xlb.r()) {
                a(xlb.l());
            }
            if (xlb.u()) {
                c(xlb.p());
            }
            if (xlb.q()) {
                a(xlb.j());
            }
            if (xlb.s()) {
                a(xlb.m());
            }
            if (xlb.t()) {
                b(xlb.n());
            }
            if (!xlb.k.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = xlb.k;
                    this.b &= -33;
                } else {
                    f();
                    this.h.addAll(xlb.k);
                }
            }
            if (!xlb.l.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = xlb.l;
                    this.b &= -65;
                } else {
                    g();
                    this.i.addAll(xlb.l);
                }
            }
            a(b().b(xlb.d));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            C7692xlb xlb;
            C7692xlb xlb2 = null;
            try {
                C7692xlb xlb3 = (C7692xlb) C7692xlb.c.a(gnb, inb);
                if (xlb3 != null) {
                    a(xlb3);
                }
                return this;
            } catch (Onb e2) {
                xlb = (C7692xlb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                xlb2 = xlb;
            }
            if (xlb2 != null) {
                a(xlb2);
            }
            throw th;
        }

        public a a(int i2) {
            this.b |= 1;
            this.c = i2;
            return this;
        }

        public a a(b bVar) {
            if (bVar != null) {
                this.b |= 4;
                this.e = bVar;
                return this;
            }
            throw new NullPointerException();
        }

        public a a(_lb _lb) {
            if ((this.b & 8) != 8 || this.f == _lb.q()) {
                this.f = _lb;
            } else {
                c c2 = _lb.c(this.f);
                c2.c(_lb);
                this.f = c2.d();
            }
            this.b |= 8;
            return this;
        }
    }

    /* renamed from: xlb$b */
    /* compiled from: ProtoBuf */
    public enum b implements defpackage.Nnb.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        
        private static defpackage.Nnb.b<b> d;
        private final int f;

        static {
            d = new C7761ylb();
        }

        private b(int i, int i2) {
            this.f = i2;
        }

        public static b a(int i) {
            if (i == 0) {
                return TRUE;
            }
            if (i == 1) {
                return FALSE;
            }
            if (i != 2) {
                return null;
            }
            return NULL;
        }

        public final int i() {
            return this.f;
        }
    }

    static {
        b.w();
    }

    public static C7692xlb k() {
        return b;
    }

    public static a v() {
        return a.e();
    }

    private void w() {
        this.f = 0;
        this.g = 0;
        this.h = b.TRUE;
        this.i = _lb.q();
        this.j = 0;
        this.k = Collections.emptyList();
        this.l = Collections.emptyList();
    }

    public Ynb<C7692xlb> e() {
        return c;
    }

    public int h() {
        return this.k.size();
    }

    public final boolean i() {
        byte b2 = this.m;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!s() || m().i()) {
            for (int i2 = 0; i2 < h(); i2++) {
                if (!a(i2).i()) {
                    this.m = 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < o(); i3++) {
                if (!b(i3).i()) {
                    this.m = 0;
                    return false;
                }
            }
            this.m = 1;
            return true;
        }
        this.m = 0;
        return false;
    }

    public b j() {
        return this.h;
    }

    public int l() {
        return this.f;
    }

    public _lb m() {
        return this.i;
    }

    public int n() {
        return this.j;
    }

    public int o() {
        return this.l.size();
    }

    public int p() {
        return this.g;
    }

    public boolean q() {
        return (this.e & 4) == 4;
    }

    public boolean r() {
        return (this.e & 1) == 1;
    }

    public boolean s() {
        return (this.e & 8) == 8;
    }

    public boolean t() {
        return (this.e & 16) == 16;
    }

    public boolean u() {
        return (this.e & 2) == 2;
    }

    private C7692xlb(defpackage.Mnb.a aVar) {
        super(aVar);
        this.m = -1;
        this.n = -1;
        this.d = aVar.b();
    }

    public int c() {
        int i2 = this.n;
        if (i2 != -1) {
            return i2;
        }
        int b2 = (this.e & 1) == 1 ? Hnb.b(1, this.f) + 0 : 0;
        if ((this.e & 2) == 2) {
            b2 += Hnb.b(2, this.g);
        }
        if ((this.e & 4) == 4) {
            b2 += Hnb.a(3, this.h.i());
        }
        if ((this.e & 8) == 8) {
            b2 += Hnb.a(4, (Wnb) this.i);
        }
        if ((this.e & 16) == 16) {
            b2 += Hnb.b(5, this.j);
        }
        int i3 = b2;
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            i3 += Hnb.a(6, (Wnb) this.k.get(i4));
        }
        for (int i5 = 0; i5 < this.l.size(); i5++) {
            i3 += Hnb.a(7, (Wnb) this.l.get(i5));
        }
        int size = i3 + this.d.size();
        this.n = size;
        return size;
    }

    public a d() {
        return v();
    }

    public static a d(C7692xlb xlb) {
        a v = v();
        v.a(xlb);
        return v;
    }

    public C7692xlb b(int i2) {
        return (C7692xlb) this.l.get(i2);
    }

    public C7692xlb a(int i2) {
        return (C7692xlb) this.k.get(i2);
    }

    public a b() {
        return d(this);
    }

    private C7692xlb(boolean z) {
        this.m = -1;
        this.n = -1;
        this.d = Fnb.a;
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
            hnb.c(4, (Wnb) this.i);
        }
        if ((this.e & 16) == 16) {
            hnb.d(5, this.j);
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            hnb.c(6, (Wnb) this.k.get(i2));
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            hnb.c(7, (Wnb) this.l.get(i3));
        }
        hnb.c(this.d);
    }

    private C7692xlb(Gnb gnb, Inb inb) throws Onb {
        this.m = -1;
        this.n = -1;
        w();
        defpackage.Fnb.b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
        boolean z = false;
        boolean z2 = false;
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
                    } else if (x == 34) {
                        c cVar = null;
                        if ((this.e & 8) == 8) {
                            cVar = this.i.b();
                        }
                        this.i = (_lb) gnb.a(_lb.d, inb);
                        if (cVar != null) {
                            cVar.c(this.i);
                            this.i = cVar.d();
                        }
                        this.e |= 8;
                    } else if (x == 40) {
                        this.e |= 16;
                        this.j = gnb.j();
                    } else if (x == 50) {
                        if (!(z2 & true)) {
                            this.k = new ArrayList();
                            z2 |= true;
                        }
                        this.k.add(gnb.a(c, inb));
                    } else if (x == 58) {
                        if (!(z2 & true)) {
                            this.l = new ArrayList();
                            z2 |= true;
                        }
                        this.l.add(gnb.a(c, inb));
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
                    this.k = Collections.unmodifiableList(this.k);
                }
                if (z2 & true) {
                    this.l = Collections.unmodifiableList(this.l);
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
            this.k = Collections.unmodifiableList(this.k);
        }
        if (z2 & true) {
            this.l = Collections.unmodifiableList(this.l);
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
