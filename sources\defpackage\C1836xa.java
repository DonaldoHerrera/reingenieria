package defpackage;

import java.util.ArrayList;

/* renamed from: xa reason: default package and case insensitive filesystem */
/* compiled from: Guideline */
public class C1836xa extends C1716ta {
    private boolean Aa;
    private int Ba;
    private C0189Aa Ca;
    private int Da;
    protected float va = -1.0f;
    protected int wa = -1;
    protected int xa = -1;
    private C1656ra ya = this.w;
    private int za;

    public C1836xa() {
        this.za = 0;
        this.Aa = false;
        this.Ba = 0;
        this.Ca = new C0189Aa();
        this.Da = 8;
        this.E.clear();
        this.E.add(this.ya);
        int length = this.D.length;
        for (int i = 0; i < length; i++) {
            this.D[i] = this.ya;
        }
    }

    public int J() {
        return this.za;
    }

    public C1656ra a(c cVar) {
        switch (C1806wa.a[cVar.ordinal()]) {
            case 1:
            case 2:
                if (this.za == 1) {
                    return this.ya;
                }
                break;
            case 3:
            case 4:
                if (this.za == 0) {
                    return this.ya;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(cVar.name());
    }

    public boolean a() {
        return true;
    }

    public ArrayList<C1656ra> b() {
        return this.E;
    }

    public void c(C1350ha haVar) {
        if (k() != null) {
            int b = haVar.b((Object) this.ya);
            if (this.za == 1) {
                r(b);
                s(0);
                g(k().i());
                o(0);
            } else {
                r(0);
                s(b);
                o(k().s());
                g(0);
            }
        }
    }

    public void e(float f) {
        if (f > -1.0f) {
            this.va = f;
            this.wa = -1;
            this.xa = -1;
        }
    }

    public void t(int i) {
        if (i > -1) {
            this.va = -1.0f;
            this.wa = i;
            this.xa = -1;
        }
    }

    public void u(int i) {
        if (i > -1) {
            this.va = -1.0f;
            this.wa = -1;
            this.xa = i;
        }
    }

    public void v(int i) {
        if (this.za != i) {
            this.za = i;
            this.E.clear();
            if (this.za == 1) {
                this.ya = this.v;
            } else {
                this.ya = this.w;
            }
            this.E.add(this.ya);
            int length = this.D.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.D[i2] = this.ya;
            }
        }
    }

    public void a(int i) {
        C1716ta k = k();
        if (k != null) {
            if (J() == 1) {
                this.w.d().a(1, k.w.d(), 0);
                this.y.d().a(1, k.w.d(), 0);
                if (this.wa != -1) {
                    this.v.d().a(1, k.v.d(), this.wa);
                    this.x.d().a(1, k.v.d(), this.wa);
                } else if (this.xa != -1) {
                    this.v.d().a(1, k.x.d(), -this.xa);
                    this.x.d().a(1, k.x.d(), -this.xa);
                } else if (this.va != -1.0f && k.j() == a.FIXED) {
                    int i2 = (int) (((float) k.H) * this.va);
                    this.v.d().a(1, k.v.d(), i2);
                    this.x.d().a(1, k.v.d(), i2);
                }
            } else {
                this.v.d().a(1, k.v.d(), 0);
                this.x.d().a(1, k.v.d(), 0);
                if (this.wa != -1) {
                    this.w.d().a(1, k.w.d(), this.wa);
                    this.y.d().a(1, k.w.d(), this.wa);
                } else if (this.xa != -1) {
                    this.w.d().a(1, k.y.d(), -this.xa);
                    this.y.d().a(1, k.y.d(), -this.xa);
                } else if (this.va != -1.0f && k.q() == a.FIXED) {
                    int i3 = (int) (((float) k.I) * this.va);
                    this.w.d().a(1, k.w.d(), i3);
                    this.y.d().a(1, k.w.d(), i3);
                }
            }
        }
    }

    public void a(C1350ha haVar) {
        C1746ua uaVar = (C1746ua) k();
        if (uaVar != null) {
            C1656ra a = uaVar.a(c.LEFT);
            C1656ra a2 = uaVar.a(c.RIGHT);
            C1716ta taVar = this.G;
            boolean z = taVar != null && taVar.F[0] == a.WRAP_CONTENT;
            if (this.za == 0) {
                a = uaVar.a(c.TOP);
                a2 = uaVar.a(c.BOTTOM);
                C1716ta taVar2 = this.G;
                z = taVar2 != null && taVar2.F[1] == a.WRAP_CONTENT;
            }
            if (this.wa != -1) {
                C1473la a3 = haVar.a((Object) this.ya);
                haVar.a(a3, haVar.a((Object) a), this.wa, 6);
                if (z) {
                    haVar.b(haVar.a((Object) a2), a3, 0, 5);
                }
            } else if (this.xa != -1) {
                C1473la a4 = haVar.a((Object) this.ya);
                C1473la a5 = haVar.a((Object) a2);
                haVar.a(a4, a5, -this.xa, 6);
                if (z) {
                    haVar.b(a4, haVar.a((Object) a), 0, 5);
                    haVar.b(a5, a4, 0, 5);
                }
            } else if (this.va != -1.0f) {
                haVar.a(C1350ha.a(haVar, haVar.a((Object) this.ya), haVar.a((Object) a), haVar.a((Object) a2), this.va, this.Aa));
            }
        }
    }
}
