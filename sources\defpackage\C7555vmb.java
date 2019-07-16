package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: vmb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public final class C7555vmb extends Mnb implements C7624wmb {
    private static final C7555vmb b = new C7555vmb(true);
    public static Ynb<C7555vmb> c = new C7486umb();
    /* access modifiers changed from: private */
    public final Fnb d;
    /* access modifiers changed from: private */
    public List<C7210qmb> e;
    private byte f;
    private int g;

    /* renamed from: vmb$a */
    /* compiled from: ProtoBuf */
    public static final class a extends defpackage.Mnb.a<C7555vmb, a> implements C7624wmb {
        private int b;
        private List<C7210qmb> c = Collections.emptyList();

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

        public C7555vmb d() {
            C7555vmb vmb = new C7555vmb((defpackage.Mnb.a) this);
            if ((this.b & 1) == 1) {
                this.c = Collections.unmodifiableList(this.c);
                this.b &= -2;
            }
            vmb.e = this.c;
            return vmb;
        }

        public /* bridge */ /* synthetic */ defpackage.Mnb.a a(Mnb mnb) {
            a((C7555vmb) mnb);
            return this;
        }

        public C7555vmb build() {
            C7555vmb d = d();
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

        public a a(C7555vmb vmb) {
            if (vmb == C7555vmb.h()) {
                return this;
            }
            if (!vmb.e.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = vmb.e;
                    this.b &= -2;
                } else {
                    f();
                    this.c.addAll(vmb.e);
                }
            }
            a(b().b(vmb.d));
            return this;
        }

        public a a(Gnb gnb, Inb inb) throws IOException {
            C7555vmb vmb;
            C7555vmb vmb2 = null;
            try {
                C7555vmb vmb3 = (C7555vmb) C7555vmb.c.a(gnb, inb);
                if (vmb3 != null) {
                    a(vmb3);
                }
                return this;
            } catch (Onb e) {
                vmb = (C7555vmb) e.a();
                throw e;
            } catch (Throwable th) {
                th = th;
                vmb2 = vmb;
            }
            if (vmb2 != null) {
                a(vmb2);
            }
            throw th;
        }
    }

    static {
        b.m();
    }

    public static C7555vmb h() {
        return b;
    }

    public static a l() {
        return a.e();
    }

    private void m() {
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

    public Ynb<C7555vmb> e() {
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

    public int j() {
        return this.e.size();
    }

    public List<C7210qmb> k() {
        return this.e;
    }

    public a d() {
        return l();
    }

    private C7555vmb(defpackage.Mnb.a aVar) {
        super(aVar);
        this.f = -1;
        this.g = -1;
        this.d = aVar.b();
    }

    public void a(Hnb hnb) throws IOException {
        c();
        for (int i = 0; i < this.e.size(); i++) {
            hnb.c(1, (Wnb) this.e.get(i));
        }
        hnb.c(this.d);
    }

    public a b() {
        return c(this);
    }

    public static a c(C7555vmb vmb) {
        a l = l();
        l.a(vmb);
        return l;
    }

    private C7555vmb(boolean z) {
        this.f = -1;
        this.g = -1;
        this.d = Fnb.a;
    }

    private C7555vmb(Gnb gnb, Inb inb) throws Onb {
        this.f = -1;
        this.g = -1;
        m();
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
                        this.e.add(gnb.a(C7210qmb.c, inb));
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
