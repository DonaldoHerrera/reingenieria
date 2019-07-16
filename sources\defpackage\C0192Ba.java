package defpackage;

/* renamed from: Ba reason: default package and case insensitive filesystem */
/* compiled from: ResolutionAnchor */
public class C0192Ba extends C0198Da {
    C1656ra c;
    float d;
    C0192Ba e;
    float f;
    C0192Ba g;
    float h;
    int i = 0;
    private C0192Ba j;
    private float k;
    private C0195Ca l = null;
    private int m = 1;
    private C0195Ca n = null;
    private int o = 1;

    public C0192Ba(C1656ra raVar) {
        this.c = raVar;
    }

    /* access modifiers changed from: 0000 */
    public String a(int i2) {
        return i2 == 1 ? "DIRECT" : i2 == 2 ? "CENTER" : i2 == 3 ? "MATCH" : i2 == 4 ? "CHAIN" : i2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void a(C0192Ba ba, float f2) {
        if (this.b == 0 || !(this.g == ba || this.h == f2)) {
            this.g = ba;
            this.h = f2;
            if (this.b == 1) {
                b();
            }
            a();
        }
    }

    public void b(int i2) {
        this.i = i2;
    }

    public void d() {
        super.d();
        this.e = null;
        this.f = 0.0f;
        this.l = null;
        this.m = 1;
        this.n = null;
        this.o = 1;
        this.g = null;
        this.h = 0.0f;
        this.d = 0.0f;
        this.j = null;
        this.k = 0.0f;
        this.i = 0;
    }

    public void e() {
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z = true;
        if (this.b != 1 && this.i != 4) {
            C0195Ca ca = this.l;
            if (ca != null) {
                if (ca.b == 1) {
                    this.f = ((float) this.m) * ca.c;
                } else {
                    return;
                }
            }
            C0195Ca ca2 = this.n;
            if (ca2 != null) {
                if (ca2.b == 1) {
                    this.k = ((float) this.o) * ca2.c;
                } else {
                    return;
                }
            }
            if (this.i == 1) {
                C0192Ba ba = this.e;
                if (ba == null || ba.b == 1) {
                    C0192Ba ba2 = this.e;
                    if (ba2 == null) {
                        this.g = this;
                        this.h = this.f;
                    } else {
                        this.g = ba2.g;
                        this.h = ba2.h + this.f;
                    }
                    a();
                }
            }
            if (this.i == 2) {
                C0192Ba ba3 = this.e;
                if (ba3 != null && ba3.b == 1) {
                    C0192Ba ba4 = this.j;
                    if (ba4 != null) {
                        C0192Ba ba5 = ba4.e;
                        if (ba5 != null && ba5.b == 1) {
                            if (C1350ha.e() != null) {
                                C1381ia e2 = C1350ha.e();
                                e2.v++;
                            }
                            this.g = this.e.g;
                            C0192Ba ba6 = this.j;
                            ba6.g = ba6.e.g;
                            c cVar = this.c.c;
                            int i2 = 0;
                            if (!(cVar == c.RIGHT || cVar == c.BOTTOM)) {
                                z = false;
                            }
                            if (z) {
                                f3 = this.e.h;
                                f2 = this.j.e.h;
                            } else {
                                f3 = this.j.e.h;
                                f2 = this.e.h;
                            }
                            float f6 = f3 - f2;
                            C1656ra raVar = this.c;
                            c cVar2 = raVar.c;
                            if (cVar2 == c.LEFT || cVar2 == c.RIGHT) {
                                f5 = f6 - ((float) this.c.b.s());
                                f4 = this.c.b.aa;
                            } else {
                                f5 = f6 - ((float) raVar.b.i());
                                f4 = this.c.b.ba;
                            }
                            int b = this.c.b();
                            int b2 = this.j.c.b();
                            if (this.c.g() == this.j.c.g()) {
                                f4 = 0.5f;
                                b2 = 0;
                            } else {
                                i2 = b;
                            }
                            float f7 = (float) i2;
                            float f8 = (float) b2;
                            float f9 = (f5 - f7) - f8;
                            if (z) {
                                C0192Ba ba7 = this.j;
                                ba7.h = ba7.e.h + f8 + (f9 * f4);
                                this.h = (this.e.h - f7) - (f9 * (1.0f - f4));
                            } else {
                                this.h = this.e.h + f7 + (f9 * f4);
                                C0192Ba ba8 = this.j;
                                ba8.h = (ba8.e.h - f8) - (f9 * (1.0f - f4));
                            }
                            a();
                            this.j.a();
                        }
                    }
                }
            }
            if (this.i == 3) {
                C0192Ba ba9 = this.e;
                if (ba9 != null && ba9.b == 1) {
                    C0192Ba ba10 = this.j;
                    if (ba10 != null) {
                        C0192Ba ba11 = ba10.e;
                        if (ba11 != null && ba11.b == 1) {
                            if (C1350ha.e() != null) {
                                C1381ia e3 = C1350ha.e();
                                e3.w++;
                            }
                            C0192Ba ba12 = this.e;
                            this.g = ba12.g;
                            C0192Ba ba13 = this.j;
                            C0192Ba ba14 = ba13.e;
                            ba13.g = ba14.g;
                            this.h = ba12.h + this.f;
                            ba13.h = ba14.h + ba13.f;
                            a();
                            this.j.a();
                        }
                    }
                }
            }
            if (this.i == 5) {
                this.c.b.G();
            }
        }
    }

    public float f() {
        return this.h;
    }

    public void g() {
        C1656ra g2 = this.c.g();
        if (g2 != null) {
            if (g2.g() == this.c) {
                this.i = 4;
                g2.d().i = 4;
            }
            int b = this.c.b();
            c cVar = this.c.c;
            if (cVar == c.RIGHT || cVar == c.BOTTOM) {
                b = -b;
            }
            a(g2.d(), b);
        }
    }

    public String toString() {
        if (this.b == 1) {
            String str = ", RESOLVED: ";
            String str2 = "[";
            if (this.g == this) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.c);
                sb.append(str);
                sb.append(this.h);
                sb.append("]  type: ");
                sb.append(a(this.i));
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(this.c);
            sb2.append(str);
            sb2.append(this.g);
            sb2.append(":");
            sb2.append(this.h);
            sb2.append("] type: ");
            sb2.append(a(this.i));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("{ ");
        sb3.append(this.c);
        sb3.append(" UNRESOLVED} type: ");
        sb3.append(a(this.i));
        return sb3.toString();
    }

    public void b(C0192Ba ba, float f2) {
        this.j = ba;
        this.k = f2;
    }

    public void b(C0192Ba ba, int i2, C0195Ca ca) {
        this.j = ba;
        this.n = ca;
        this.o = i2;
    }

    public void a(int i2, C0192Ba ba, int i3) {
        this.i = i2;
        this.e = ba;
        this.f = (float) i3;
        this.e.a(this);
    }

    public void a(C0192Ba ba, int i2) {
        this.e = ba;
        this.f = (float) i2;
        this.e.a(this);
    }

    public void a(C0192Ba ba, int i2, C0195Ca ca) {
        this.e = ba;
        this.e.a(this);
        this.l = ca;
        this.m = i2;
        this.l.a(this);
    }

    /* access modifiers changed from: 0000 */
    public void a(C1350ha haVar) {
        C1473la e2 = this.c.e();
        C0192Ba ba = this.g;
        if (ba == null) {
            haVar.a(e2, (int) (this.h + 0.5f));
        } else {
            haVar.a(e2, haVar.a((Object) ba.c), (int) (this.h + 0.5f), 6);
        }
    }
}
