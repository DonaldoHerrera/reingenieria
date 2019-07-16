package defpackage;

/* renamed from: ra reason: default package and case insensitive filesystem */
/* compiled from: ConstraintAnchor */
public class C1656ra {
    private C0192Ba a = new C0192Ba(this);
    final C1716ta b;
    final c c;
    C1656ra d;
    public int e = 0;
    int f = -1;
    private b g = b.NONE;
    private a h = a.RELAXED;
    private int i = 0;
    C1473la j;

    /* renamed from: ra$a */
    /* compiled from: ConstraintAnchor */
    public enum a {
        RELAXED,
        STRICT
    }

    /* renamed from: ra$b */
    /* compiled from: ConstraintAnchor */
    public enum b {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: ra$c */
    /* compiled from: ConstraintAnchor */
    public enum c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C1656ra(C1716ta taVar, c cVar) {
        this.b = taVar;
        this.c = cVar;
    }

    public void a(C1288fa faVar) {
        C1473la laVar = this.j;
        if (laVar == null) {
            this.j = new C1473la(defpackage.C1473la.a.UNRESTRICTED, null);
        } else {
            laVar.b();
        }
    }

    public int b() {
        if (this.b.r() == 8) {
            return 0;
        }
        if (this.f > -1) {
            C1656ra raVar = this.d;
            if (raVar != null && raVar.b.r() == 8) {
                return this.f;
            }
        }
        return this.e;
    }

    public C1716ta c() {
        return this.b;
    }

    public C0192Ba d() {
        return this.a;
    }

    public C1473la e() {
        return this.j;
    }

    public b f() {
        return this.g;
    }

    public C1656ra g() {
        return this.d;
    }

    public c h() {
        return this.c;
    }

    public boolean i() {
        return this.d != null;
    }

    public void j() {
        this.d = null;
        this.e = 0;
        this.f = -1;
        this.g = b.STRONG;
        this.i = 0;
        this.h = a.RELAXED;
        this.a.d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append(":");
        sb.append(this.c.toString());
        return sb.toString();
    }

    public int a() {
        return this.i;
    }

    public boolean a(C1656ra raVar, int i2, b bVar, int i3) {
        return a(raVar, i2, -1, bVar, i3, false);
    }

    public boolean a(C1656ra raVar, int i2, int i3, b bVar, int i4, boolean z) {
        if (raVar == null) {
            this.d = null;
            this.e = 0;
            this.f = -1;
            this.g = b.NONE;
            this.i = 2;
            return true;
        } else if (!z && !a(raVar)) {
            return false;
        } else {
            this.d = raVar;
            if (i2 > 0) {
                this.e = i2;
            } else {
                this.e = 0;
            }
            this.f = i3;
            this.g = bVar;
            this.i = i4;
            return true;
        }
    }

    public boolean a(C1656ra raVar) {
        boolean z = false;
        if (raVar == null) {
            return false;
        }
        c h2 = raVar.h();
        c cVar = this.c;
        if (h2 != cVar) {
            switch (C1627qa.a[cVar.ordinal()]) {
                case 1:
                    if (!(h2 == c.BASELINE || h2 == c.CENTER_X || h2 == c.CENTER_Y)) {
                        z = true;
                    }
                    return z;
                case 2:
                case 3:
                    boolean z2 = h2 == c.LEFT || h2 == c.RIGHT;
                    if (raVar.c() instanceof C1836xa) {
                        z2 = z2 || h2 == c.CENTER_X;
                    }
                    return z2;
                case 4:
                case 5:
                    boolean z3 = h2 == c.TOP || h2 == c.BOTTOM;
                    if (raVar.c() instanceof C1836xa) {
                        z3 = z3 || h2 == c.CENTER_Y;
                    }
                    return z3;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.c.name());
            }
        } else if (cVar != c.BASELINE || (raVar.c().x() && c().x())) {
            return true;
        } else {
            return false;
        }
    }
}
