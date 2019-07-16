package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Tmb reason: default package */
/* compiled from: JvmModuleProtoBuf */
public final class Tmb extends Mnb implements Umb {
    private static final Tmb b = new Tmb(true);
    public static Ynb<Tmb> c = new Smb();
    /* access modifiers changed from: private */
    public final Fnb d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public Object f;
    /* access modifiers changed from: private */
    public Tnb g;
    /* access modifiers changed from: private */
    public List<Integer> h;
    private int i;
    /* access modifiers changed from: private */
    public Tnb j;
    /* access modifiers changed from: private */
    public Tnb k;
    /* access modifiers changed from: private */
    public List<Integer> l;
    private int m;
    /* access modifiers changed from: private */
    public List<Integer> n;
    private int o;
    private byte p;
    private int q;

    /* renamed from: Tmb$a */
    /* compiled from: JvmModuleProtoBuf */
    public static final class a extends defpackage.Mnb.a<Tmb, a> implements Umb {
        private int b;
        private Object c = "";
        private Tnb d = Snb.a;
        private List<Integer> e = Collections.emptyList();
        private Tnb f;
        private Tnb g;
        private List<Integer> h;
        private List<Integer> i;

        private a() {
            Tnb tnb = Snb.a;
            this.f = tnb;
            this.g = tnb;
            this.h = Collections.emptyList();
            this.i = Collections.emptyList();
            m();
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
            if ((this.b & 16) != 16) {
                this.g = new Snb(this.g);
                this.b |= 16;
            }
        }

        private void j() {
            if ((this.b & 4) != 4) {
                this.e = new ArrayList(this.e);
                this.b |= 4;
            }
        }

        private void k() {
            if ((this.b & 8) != 8) {
                this.f = new Snb(this.f);
                this.b |= 8;
            }
        }

        private void l() {
            if ((this.b & 2) != 2) {
                this.d = new Snb(this.d);
                this.b |= 2;
            }
        }

        private void m() {
        }

        public Tmb d() {
            Tmb tmb = new Tmb((defpackage.Mnb.a) this);
            int i2 = 1;
            if ((this.b & 1) != 1) {
                i2 = 0;
            }
            tmb.f = this.c;
            if ((this.b & 2) == 2) {
                this.d = this.d.Q();
                this.b &= -3;
            }
            tmb.g = this.d;
            if ((this.b & 4) == 4) {
                this.e = Collections.unmodifiableList(this.e);
                this.b &= -5;
            }
            tmb.h = this.e;
            if ((this.b & 8) == 8) {
                this.f = this.f.Q();
                this.b &= -9;
            }
            tmb.j = this.f;
            if ((this.b & 16) == 16) {
                this.g = this.g.Q();
                this.b &= -17;
            }
            tmb.k = this.g;
            if ((this.b & 32) == 32) {
                this.h = Collections.unmodifiableList(this.h);
                this.b &= -33;
            }
            tmb.l = this.h;
            if ((this.b & 64) == 64) {
                this.i = Collections.unmodifiableList(this.i);
                this.b &= -65;
            }
            tmb.n = this.i;
            tmb.e = i2;
            return tmb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((Tmb) mnb);
            return this;
        }

        public Tmb build() {
            Tmb d2 = d();
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

        public a a(Tmb tmb) {
            if (tmb == Tmb.l()) {
                return this;
            }
            if (tmb.r()) {
                this.b |= 1;
                this.c = tmb.f;
            }
            if (!tmb.g.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = tmb.g;
                    this.b &= -3;
                } else {
                    l();
                    this.d.addAll(tmb.g);
                }
            }
            if (!tmb.h.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = tmb.h;
                    this.b &= -5;
                } else {
                    j();
                    this.e.addAll(tmb.h);
                }
            }
            if (!tmb.j.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = tmb.j;
                    this.b &= -9;
                } else {
                    k();
                    this.f.addAll(tmb.j);
                }
            }
            if (!tmb.k.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = tmb.k;
                    this.b &= -17;
                } else {
                    h();
                    this.g.addAll(tmb.k);
                }
            }
            if (!tmb.l.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = tmb.l;
                    this.b &= -33;
                } else {
                    f();
                    this.h.addAll(tmb.l);
                }
            }
            if (!tmb.n.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = tmb.n;
                    this.b &= -65;
                } else {
                    g();
                    this.i.addAll(tmb.n);
                }
            }
            a(b().b(tmb.d));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            Tmb tmb;
            Tmb tmb2 = null;
            try {
                Tmb tmb3 = (Tmb) Tmb.c.a(gnb, inb);
                if (tmb3 != null) {
                    a(tmb3);
                }
                return this;
            } catch (Onb e2) {
                tmb = (Tmb) e2.a();
                throw e2;
            } catch (Throwable th) {
                th = th;
                tmb2 = tmb;
            }
            if (tmb2 != null) {
                a(tmb2);
            }
            throw th;
        }
    }

    static {
        b.t();
    }

    public static Tmb l() {
        return b;
    }

    public static a s() {
        return a.e();
    }

    private void t() {
        this.f = "";
        this.g = Snb.a;
        this.h = Collections.emptyList();
        Tnb tnb = Snb.a;
        this.j = tnb;
        this.k = tnb;
        this.l = Collections.emptyList();
        this.n = Collections.emptyList();
    }

    public final boolean i() {
        byte b2 = this.p;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!r()) {
            this.p = 0;
            return false;
        }
        this.p = 1;
        return true;
    }

    public List<Integer> j() {
        return this.n;
    }

    public Znb k() {
        return this.k;
    }

    public List<Integer> m() {
        return this.h;
    }

    public Znb n() {
        return this.j;
    }

    public String o() {
        Object obj = this.f;
        if (obj instanceof String) {
            return (String) obj;
        }
        Fnb fnb = (Fnb) obj;
        String m2 = fnb.m();
        if (fnb.h()) {
            this.f = m2;
        }
        return m2;
    }

    public Fnb p() {
        Object obj = this.f;
        if (!(obj instanceof String)) {
            return (Fnb) obj;
        }
        Fnb a2 = Fnb.a((String) obj);
        this.f = a2;
        return a2;
    }

    public Znb q() {
        return this.g;
    }

    public boolean r() {
        return (this.e & 1) == 1;
    }

    public Ynb<Tmb> e() {
        return c;
    }

    public List<Integer> h() {
        return this.l;
    }

    private Tmb(defpackage.Mnb.a aVar) {
        super(aVar);
        this.i = -1;
        this.m = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.d = aVar.b();
    }

    public a d() {
        return s();
    }

    public int c() {
        int i2 = this.q;
        if (i2 != -1) {
            return i2;
        }
        int a2 = (this.e & 1) == 1 ? Hnb.a(1, p()) + 0 : 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.g.size(); i4++) {
            i3 += Hnb.a(this.g.k(i4));
        }
        int size = a2 + i3 + (q().size() * 1);
        int i5 = 0;
        for (int i6 = 0; i6 < this.h.size(); i6++) {
            i5 += Hnb.c(((Integer) this.h.get(i6)).intValue());
        }
        int i7 = size + i5;
        if (!m().isEmpty()) {
            i7 = i7 + 1 + Hnb.c(i5);
        }
        this.i = i5;
        int i8 = 0;
        for (int i9 = 0; i9 < this.j.size(); i9++) {
            i8 += Hnb.a(this.j.k(i9));
        }
        int size2 = i7 + i8 + (n().size() * 1);
        int i10 = 0;
        for (int i11 = 0; i11 < this.k.size(); i11++) {
            i10 += Hnb.a(this.k.k(i11));
        }
        int size3 = size2 + i10 + (k().size() * 1);
        int i12 = 0;
        for (int i13 = 0; i13 < this.n.size(); i13++) {
            i12 += Hnb.c(((Integer) this.n.get(i13)).intValue());
        }
        int i14 = size3 + i12;
        if (!j().isEmpty()) {
            i14 = i14 + 1 + Hnb.c(i12);
        }
        this.o = i12;
        int i15 = 0;
        for (int i16 = 0; i16 < this.l.size(); i16++) {
            i15 += Hnb.c(((Integer) this.l.get(i16)).intValue());
        }
        int i17 = i14 + i15;
        if (!h().isEmpty()) {
            i17 = i17 + 1 + Hnb.c(i15);
        }
        this.m = i15;
        int size4 = i17 + this.d.size();
        this.q = size4;
        return size4;
    }

    public static a i(Tmb tmb) {
        a s = s();
        s.a(tmb);
        return s;
    }

    public a b() {
        return i(this);
    }

    public void a(Hnb hnb) throws IOException {
        c();
        if ((this.e & 1) == 1) {
            hnb.b(1, p());
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            hnb.b(2, this.g.k(i2));
        }
        if (m().size() > 0) {
            hnb.p(26);
            hnb.p(this.i);
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            hnb.m(((Integer) this.h.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.j.size(); i4++) {
            hnb.b(4, this.j.k(i4));
        }
        for (int i5 = 0; i5 < this.k.size(); i5++) {
            hnb.b(5, this.k.k(i5));
        }
        if (j().size() > 0) {
            hnb.p(50);
            hnb.p(this.o);
        }
        for (int i6 = 0; i6 < this.n.size(); i6++) {
            hnb.m(((Integer) this.n.get(i6)).intValue());
        }
        if (h().size() > 0) {
            hnb.p(58);
            hnb.p(this.m);
        }
        for (int i7 = 0; i7 < this.l.size(); i7++) {
            hnb.m(((Integer) this.l.get(i7)).intValue());
        }
        hnb.c(this.d);
    }

    private Tmb(boolean z) {
        this.i = -1;
        this.m = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.d = Fnb.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017b, code lost:
        r14 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0181, code lost:
        r5 = true;
     */
    private Tmb(Gnb gnb, Inb inb) throws Onb {
        Gnb gnb2 = gnb;
        this.i = -1;
        this.m = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        t();
        b j2 = Fnb.j();
        Hnb a2 = Hnb.a((OutputStream) j2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = gnb.x();
                switch (x) {
                    case 0:
                        Inb inb2 = inb;
                        break;
                    case 10:
                        Fnb d2 = gnb.d();
                        this.e |= 1;
                        this.f = d2;
                        break;
                    case 18:
                        Fnb d3 = gnb.d();
                        if (!(z2 & true)) {
                            this.g = new Snb();
                            z2 |= true;
                        }
                        this.g.a(d3);
                        break;
                    case 24:
                        if (!(z2 & true)) {
                            this.h = new ArrayList();
                            z2 |= true;
                        }
                        this.h.add(Integer.valueOf(gnb.j()));
                        break;
                    case 26:
                        int d4 = gnb2.d(gnb.o());
                        if (!(z2 & true) && gnb.a() > 0) {
                            this.h = new ArrayList();
                            z2 |= true;
                        }
                        while (gnb.a() > 0) {
                            this.h.add(Integer.valueOf(gnb.j()));
                        }
                        gnb2.c(d4);
                        break;
                    case 34:
                        Fnb d5 = gnb.d();
                        if (!(z2 & true)) {
                            this.j = new Snb();
                            z2 |= true;
                        }
                        this.j.a(d5);
                        break;
                    case 42:
                        Fnb d6 = gnb.d();
                        if (!(z2 & true)) {
                            this.k = new Snb();
                            z2 |= true;
                        }
                        this.k.a(d6);
                        break;
                    case 48:
                        if (!(z2 & true)) {
                            this.n = new ArrayList();
                            z2 |= true;
                        }
                        this.n.add(Integer.valueOf(gnb.j()));
                        break;
                    case 50:
                        int d7 = gnb2.d(gnb.o());
                        if (!(z2 & true) && gnb.a() > 0) {
                            this.n = new ArrayList();
                            z2 |= true;
                        }
                        while (gnb.a() > 0) {
                            this.n.add(Integer.valueOf(gnb.j()));
                        }
                        gnb2.c(d7);
                        break;
                    case 56:
                        if (!(z2 & true)) {
                            this.l = new ArrayList();
                            z2 |= true;
                        }
                        this.l.add(Integer.valueOf(gnb.j()));
                        break;
                    case 58:
                        int d8 = gnb2.d(gnb.o());
                        if (!(z2 & true) && gnb.a() > 0) {
                            this.l = new ArrayList();
                            z2 |= true;
                        }
                        while (gnb.a() > 0) {
                            this.l.add(Integer.valueOf(gnb.j()));
                        }
                        gnb2.c(d8);
                        break;
                    default:
                        if (a(gnb2, a2, inb, x)) {
                            break;
                        }
                        break;
                }
            } catch (Onb e2) {
                e2.a(this);
                throw e2;
            } catch (IOException e3) {
                Onb onb = new Onb(e3.getMessage());
                onb.a(this);
                throw onb;
            } catch (Throwable th) {
                if (z2 & true) {
                    this.g = this.g.Q();
                }
                if (z2 & true) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if (z2 & true) {
                    this.j = this.j.Q();
                }
                if (z2 & true) {
                    this.k = this.k.Q();
                }
                if (z2 & true) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if (z2 & true) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    this.d = j2.a();
                    throw th3;
                }
                this.d = j2.a();
                g();
                throw th;
            }
        }
        if (z2 & true) {
            this.g = this.g.Q();
        }
        if (z2 & true) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if (z2 & true) {
            this.j = this.j.Q();
        }
        if (z2 & true) {
            this.k = this.k.Q();
        }
        if (z2 & true) {
            this.n = Collections.unmodifiableList(this.n);
        }
        if (z2 & true) {
            this.l = Collections.unmodifiableList(this.l);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            Throwable th5 = th4;
            this.d = j2.a();
            throw th5;
        }
        this.d = j2.a();
        g();
    }
}
