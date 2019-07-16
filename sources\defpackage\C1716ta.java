package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;

/* renamed from: ta reason: default package and case insensitive filesystem */
/* compiled from: ConstraintWidget */
public class C1716ta {
    public static float a = 0.5f;
    C1656ra A = new C1656ra(this, c.CENTER_X);
    C1656ra B = new C1656ra(this, c.CENTER_Y);
    C1656ra C = new C1656ra(this, c.CENTER);
    protected C1656ra[] D = {this.v, this.x, this.w, this.y, this.z, this.C};
    protected ArrayList<C1656ra> E = new ArrayList<>();
    protected a[] F;
    C1716ta G;
    int H;
    int I;
    protected float J;
    protected int K;
    protected int L;
    protected int M;
    int N;
    int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    protected int T;
    protected int U;
    int V;
    protected int W;
    protected int X;
    private int Y;
    private int Z;
    float aa;
    public int b = -1;
    float ba;
    public int c = -1;
    private Object ca;
    C0195Ca d;
    private int da;
    C0195Ca e;
    private int ea;
    int f = 0;
    private String fa;
    int g = 0;
    private String ga;
    int[] h = new int[2];
    boolean ha;
    int i = 0;
    boolean ia;
    int j = 0;
    boolean ja;
    float k = 1.0f;
    boolean ka;
    int l = 0;
    boolean la;
    int m = 0;
    int ma;
    float n = 1.0f;
    int na;
    boolean o;
    boolean oa;
    boolean p;
    boolean pa;
    int q = -1;
    float[] qa;
    float r = 1.0f;
    protected C1716ta[] ra;
    C1776va s = null;
    protected C1716ta[] sa;
    private int[] t = {BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER};
    C1716ta ta;
    private float u = 0.0f;
    C1716ta ua;
    C1656ra v = new C1656ra(this, c.LEFT);
    C1656ra w = new C1656ra(this, c.TOP);
    C1656ra x = new C1656ra(this, c.RIGHT);
    C1656ra y = new C1656ra(this, c.BOTTOM);
    C1656ra z = new C1656ra(this, c.BASELINE);

    /* renamed from: ta$a */
    /* compiled from: ConstraintWidget */
    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C1716ta() {
        a aVar = a.FIXED;
        this.F = new a[]{aVar, aVar};
        this.G = null;
        this.H = 0;
        this.I = 0;
        this.J = 0.0f;
        this.K = -1;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        float f2 = a;
        this.aa = f2;
        this.ba = f2;
        this.da = 0;
        this.ea = 0;
        this.fa = null;
        this.ga = null;
        this.ja = false;
        this.ka = false;
        this.la = false;
        this.ma = 0;
        this.na = 0;
        this.qa = new float[]{-1.0f, -1.0f};
        this.ra = new C1716ta[]{null, null};
        this.sa = new C1716ta[]{null, null};
        this.ta = null;
        this.ua = null;
        J();
    }

    private void J() {
        this.E.add(this.v);
        this.E.add(this.w);
        this.E.add(this.x);
        this.E.add(this.y);
        this.E.add(this.A);
        this.E.add(this.B);
        this.E.add(this.C);
        this.E.add(this.z);
    }

    public boolean A() {
        C1656ra raVar = this.w;
        C1656ra raVar2 = raVar.d;
        if (raVar2 == null || raVar2.d != raVar) {
            C1656ra raVar3 = this.y;
            C1656ra raVar4 = raVar3.d;
            if (raVar4 == null || raVar4.d != raVar3) {
                return false;
            }
        }
        return true;
    }

    public boolean B() {
        return this.g == 0 && this.J == 0.0f && this.l == 0 && this.m == 0 && this.F[1] == a.MATCH_CONSTRAINT;
    }

    public boolean C() {
        return this.f == 0 && this.J == 0.0f && this.i == 0 && this.j == 0 && this.F[0] == a.MATCH_CONSTRAINT;
    }

    public void D() {
        this.v.j();
        this.w.j();
        this.x.j();
        this.y.j();
        this.z.j();
        this.A.j();
        this.B.j();
        this.C.j();
        this.G = null;
        this.u = 0.0f;
        this.H = 0;
        this.I = 0;
        this.J = 0.0f;
        this.K = -1;
        this.L = 0;
        this.M = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        float f2 = a;
        this.aa = f2;
        this.ba = f2;
        a[] aVarArr = this.F;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.ca = null;
        this.da = 0;
        this.ea = 0;
        this.ga = null;
        this.ha = false;
        this.ia = false;
        this.ma = 0;
        this.na = 0;
        this.oa = false;
        this.pa = false;
        float[] fArr = this.qa;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.b = -1;
        this.c = -1;
        int[] iArr = this.t;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f = 0;
        this.g = 0;
        this.k = 1.0f;
        this.n = 1.0f;
        this.j = BaseClientBuilder.API_PRIORITY_OTHER;
        this.m = BaseClientBuilder.API_PRIORITY_OTHER;
        this.i = 0;
        this.l = 0;
        this.q = -1;
        this.r = 1.0f;
        C0195Ca ca2 = this.d;
        if (ca2 != null) {
            ca2.d();
        }
        C0195Ca ca3 = this.e;
        if (ca3 != null) {
            ca3.d();
        }
        this.s = null;
        this.ja = false;
        this.ka = false;
        this.la = false;
    }

    public void E() {
        C1716ta k2 = k();
        if (k2 == null || !(k2 instanceof C1746ua) || !((C1746ua) k()).N()) {
            int size = this.E.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C1656ra) this.E.get(i2)).j();
            }
        }
    }

    public void F() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.D[i2].d().d();
        }
    }

    public void G() {
    }

    public void H() {
        int i2 = this.L;
        int i3 = this.M;
        int i4 = this.H + i2;
        int i5 = this.I + i3;
        this.P = i2;
        this.Q = i3;
        this.R = i4 - i2;
        this.S = i5 - i3;
    }

    public void I() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.D[i2].d().g();
        }
    }

    public void a(int i2) {
        C1896za.a(i2, this);
    }

    public void b(boolean z2) {
        this.o = z2;
    }

    public int c() {
        return this.V;
    }

    public int d(int i2) {
        if (i2 == 0) {
            return s();
        }
        if (i2 == 1) {
            return i();
        }
        return 0;
    }

    public Object e() {
        return this.ca;
    }

    public String f() {
        return this.fa;
    }

    public int g() {
        return this.P + this.T;
    }

    public int h() {
        return this.Q + this.U;
    }

    public void i(int i2) {
        this.t[1] = i2;
    }

    public void j(int i2) {
        this.t[0] = i2;
    }

    public C1716ta k() {
        return this.G;
    }

    public C0195Ca l() {
        if (this.e == null) {
            this.e = new C0195Ca();
        }
        return this.e;
    }

    public C0195Ca m() {
        if (this.d == null) {
            this.d = new C0195Ca();
        }
        return this.d;
    }

    public void n(int i2) {
        this.ea = i2;
    }

    /* access modifiers changed from: protected */
    public int o() {
        return this.L + this.T;
    }

    /* access modifiers changed from: protected */
    public int p() {
        return this.M + this.U;
    }

    public void q(int i2) {
        this.Y = i2;
    }

    public int r() {
        return this.ea;
    }

    public int s() {
        if (this.ea == 8) {
            return 0;
        }
        return this.H;
    }

    public int t() {
        return this.Z;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = " ";
        String str3 = "";
        if (this.ga != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("type: ");
            sb2.append(this.ga);
            sb2.append(str2);
            str = sb2.toString();
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.fa != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("id: ");
            sb3.append(this.fa);
            sb3.append(str2);
            str3 = sb3.toString();
        }
        sb.append(str3);
        sb.append("(");
        sb.append(this.L);
        sb.append(", ");
        sb.append(this.M);
        sb.append(") - (");
        sb.append(this.H);
        String str4 = " x ";
        sb.append(str4);
        sb.append(this.I);
        sb.append(") wrap: (");
        sb.append(this.Y);
        sb.append(str4);
        sb.append(this.Z);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.Y;
    }

    public int v() {
        return this.L;
    }

    public int w() {
        return this.M;
    }

    public boolean x() {
        return this.V > 0;
    }

    public boolean y() {
        if (this.v.d().b == 1 && this.x.d().b == 1 && this.w.d().b == 1 && this.y.d().b == 1) {
            return true;
        }
        return false;
    }

    public boolean z() {
        C1656ra raVar = this.v;
        C1656ra raVar2 = raVar.d;
        if (raVar2 == null || raVar2.d != raVar) {
            C1656ra raVar3 = this.x;
            C1656ra raVar4 = raVar3.d;
            if (raVar4 == null || raVar4.d != raVar3) {
                return false;
            }
        }
        return true;
    }

    private boolean t(int i2) {
        int i3 = i2 * 2;
        C1656ra[] raVarArr = this.D;
        if (!(raVarArr[i3].d == null || raVarArr[i3].d.d == raVarArr[i3])) {
            int i4 = i3 + 1;
            if (raVarArr[i4].d != null && raVarArr[i4].d.d == raVarArr[i4]) {
                return true;
            }
        }
        return false;
    }

    public void a(C1288fa faVar) {
        this.v.a(faVar);
        this.w.a(faVar);
        this.x.a(faVar);
        this.y.a(faVar);
        this.z.a(faVar);
        this.C.a(faVar);
        this.A.a(faVar);
        this.B.a(faVar);
    }

    public void b(C1350ha haVar) {
        haVar.a((Object) this.v);
        haVar.a((Object) this.w);
        haVar.a((Object) this.x);
        haVar.a((Object) this.y);
        if (this.V > 0) {
            haVar.a((Object) this.z);
        }
    }

    public void c(int i2, int i3) {
        this.L = i2;
        this.M = i3;
    }

    public void e(int i2, int i3) {
        this.M = i2;
        this.I = i3 - i2;
        int i4 = this.I;
        int i5 = this.X;
        if (i4 < i5) {
            this.I = i5;
        }
    }

    public void f(int i2) {
        this.V = i2;
    }

    public void g(int i2) {
        this.I = i2;
        int i3 = this.I;
        int i4 = this.X;
        if (i3 < i4) {
            this.I = i4;
        }
    }

    public void h(int i2) {
        this.ma = i2;
    }

    public int i() {
        if (this.ea == 8) {
            return 0;
        }
        return this.I;
    }

    public a j() {
        return this.F[0];
    }

    public void k(int i2) {
        if (i2 < 0) {
            this.X = 0;
        } else {
            this.X = i2;
        }
    }

    public int n() {
        return v() + this.H;
    }

    public void o(int i2) {
        this.H = i2;
        int i3 = this.H;
        int i4 = this.W;
        if (i3 < i4) {
            this.H = i4;
        }
    }

    public void p(int i2) {
        this.Z = i2;
    }

    public a q() {
        return this.F[1];
    }

    public void r(int i2) {
        this.L = i2;
    }

    public int d() {
        return w() + this.I;
    }

    public void s(int i2) {
        this.M = i2;
    }

    public void c(float f2) {
        this.ba = f2;
    }

    /* access modifiers changed from: 0000 */
    public void d(int i2, int i3) {
        if (i3 == 0) {
            this.N = i2;
        } else if (i3 == 1) {
            this.O = i2;
        }
    }

    public void l(int i2) {
        if (i2 < 0) {
            this.W = 0;
        } else {
            this.W = i2;
        }
    }

    public void m(int i2) {
        this.na = i2;
    }

    public a c(int i2) {
        if (i2 == 0) {
            return j();
        }
        if (i2 == 1) {
            return q();
        }
        return null;
    }

    public void d(float f2) {
        this.qa[1] = f2;
    }

    /* access modifiers changed from: 0000 */
    public int e(int i2) {
        if (i2 == 0) {
            return this.N;
        }
        if (i2 == 1) {
            return this.O;
        }
        return 0;
    }

    public void c(C1350ha haVar) {
        int b2 = haVar.b((Object) this.v);
        int b3 = haVar.b((Object) this.w);
        int b4 = haVar.b((Object) this.x);
        int b5 = haVar.b((Object) this.y);
        int i2 = b5 - b3;
        if (b4 - b2 < 0 || i2 < 0 || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE || b5 == Integer.MIN_VALUE || b5 == Integer.MAX_VALUE) {
            b5 = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
        }
        a(b2, b3, b4, b5);
    }

    public float b(int i2) {
        if (i2 == 0) {
            return this.aa;
        }
        if (i2 == 1) {
            return this.ba;
        }
        return -1.0f;
    }

    public void a(C1716ta taVar) {
        this.G = taVar;
    }

    public ArrayList<C1656ra> b() {
        return this.E;
    }

    public void a(boolean z2) {
        this.p = z2;
    }

    public void b(int i2, int i3) {
        this.T = i2;
        this.U = i3;
    }

    public void a(C1716ta taVar, float f2, int i2) {
        c cVar = c.CENTER;
        a(cVar, taVar, cVar, i2, 0);
        this.u = f2;
    }

    public void b(int i2, int i3, int i4, float f2) {
        this.g = i2;
        this.l = i3;
        this.m = i4;
        this.n = f2;
        if (f2 < 1.0f && this.g == 0) {
            this.g = 2;
        }
    }

    public void a(String str) {
        this.fa = str;
    }

    public void a(int i2, int i3, int i4, float f2) {
        this.f = i2;
        this.i = i3;
        this.j = i4;
        this.k = f2;
        if (f2 < 1.0f && this.f == 0) {
            this.f = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    public void b(String str) {
        float f2;
        if (str == null || str.length() == 0) {
            this.J = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i3 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(i3);
            if (substring2.length() > 0) {
                f2 = Float.parseFloat(substring2);
                if (f2 > 0.0f) {
                    this.J = f2;
                    this.K = i2;
                }
            }
        } else {
            String substring3 = str.substring(i3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                try {
                    float parseFloat = Float.parseFloat(substring3);
                    float parseFloat2 = Float.parseFloat(substring4);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        f2 = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        if (f2 > 0.0f) {
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        f2 = 0.0f;
        if (f2 > 0.0f) {
        }
    }

    public void a(float f2) {
        this.aa = f2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r5 < r3) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r4 < r2) goto L_0x0020;
     */
    public void a(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.L = i2;
        this.M = i3;
        if (this.ea == 8) {
            this.H = 0;
            this.I = 0;
            return;
        }
        if (this.F[0] == a.FIXED) {
            i6 = this.H;
        }
        i6 = i8;
        if (this.F[1] == a.FIXED) {
            i7 = this.I;
        }
        i7 = i9;
        this.H = i6;
        this.I = i7;
        int i10 = this.I;
        int i11 = this.X;
        if (i10 < i11) {
            this.I = i11;
        }
        int i12 = this.H;
        int i13 = this.W;
        if (i12 < i13) {
            this.H = i13;
        }
        this.ka = true;
    }

    public void a(int i2, int i3, int i4) {
        if (i4 == 0) {
            a(i2, i3);
        } else if (i4 == 1) {
            e(i2, i3);
        }
        this.ka = true;
    }

    public void a(int i2, int i3) {
        this.L = i2;
        this.H = i3 - i2;
        int i4 = this.H;
        int i5 = this.W;
        if (i4 < i5) {
            this.H = i5;
        }
    }

    public void b(float f2) {
        this.qa[0] = f2;
    }

    public void b(a aVar) {
        this.F[1] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            g(this.Z);
        }
    }

    public void a(Object obj) {
        this.ca = obj;
    }

    public boolean a() {
        return this.ea != 8;
    }

    public void a(c cVar, C1716ta taVar, c cVar2, int i2, int i3) {
        a(cVar).a(taVar.a(cVar2), i2, i3, b.STRONG, 0, true);
    }

    public C1656ra a(c cVar) {
        switch (C1686sa.a[cVar.ordinal()]) {
            case 1:
                return this.v;
            case 2:
                return this.w;
            case 3:
                return this.x;
            case 4:
                return this.y;
            case 5:
                return this.z;
            case 6:
                return this.C;
            case 7:
                return this.A;
            case 8:
                return this.B;
            case 9:
                return null;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public void a(a aVar) {
        this.F[0] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            o(this.Y);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b0, code lost:
        if (r1 == -1) goto L_0x01b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0254 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0337  */
    public void a(C1350ha haVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int i3;
        boolean z6;
        int i4;
        int i5;
        C1473la laVar;
        boolean z7;
        C1473la laVar2;
        C1473la laVar3;
        boolean z8;
        C1473la laVar4;
        C1473la laVar5;
        boolean z9;
        boolean z10;
        C1350ha haVar2;
        C1473la laVar6;
        C1716ta taVar;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z11;
        boolean z12;
        C1350ha haVar3 = haVar;
        C1473la a2 = haVar3.a((Object) this.v);
        C1473la a3 = haVar3.a((Object) this.x);
        C1473la a4 = haVar3.a((Object) this.w);
        C1473la a5 = haVar3.a((Object) this.y);
        C1473la a6 = haVar3.a((Object) this.z);
        C1716ta taVar2 = this.G;
        if (taVar2 != null) {
            z5 = taVar2 != null && taVar2.F[0] == a.WRAP_CONTENT;
            C1716ta taVar3 = this.G;
            boolean z13 = taVar3 != null && taVar3.F[1] == a.WRAP_CONTENT;
            if (t(0)) {
                ((C1746ua) this.G).a(this, 0);
                z11 = true;
            } else {
                z11 = z();
            }
            if (t(1)) {
                ((C1746ua) this.G).a(this, 1);
                z12 = true;
            } else {
                z12 = A();
            }
            if (z5 && this.ea != 8 && this.v.d == null && this.x.d == null) {
                haVar3.b(haVar3.a((Object) this.G.x), a3, 0, 1);
            }
            if (z13 && this.ea != 8 && this.w.d == null && this.y.d == null && this.z == null) {
                haVar3.b(haVar3.a((Object) this.G.y), a5, 0, 1);
            }
            z4 = z13;
            z3 = z11;
            z2 = z12;
        } else {
            z5 = false;
            z4 = false;
            z3 = false;
            z2 = false;
        }
        int i10 = this.H;
        int i11 = this.W;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.I;
        int i13 = this.X;
        if (i12 < i13) {
            i12 = i13;
        }
        boolean z14 = this.F[0] != a.MATCH_CONSTRAINT;
        boolean z15 = this.F[1] != a.MATCH_CONSTRAINT;
        this.q = this.K;
        float f2 = this.J;
        this.r = f2;
        int i14 = this.f;
        int i15 = this.g;
        if (f2 <= 0.0f || this.ea == 8) {
            laVar = a6;
            i6 = i14;
            i7 = i10;
            i8 = i12;
            i4 = i15;
        } else {
            laVar = a6;
            if (this.F[0] == a.MATCH_CONSTRAINT && i14 == 0) {
                i14 = 3;
            }
            if (this.F[1] == a.MATCH_CONSTRAINT && i15 == 0) {
                i15 = 3;
            }
            a[] aVarArr = this.F;
            a aVar = aVarArr[0];
            a aVar2 = a.MATCH_CONSTRAINT;
            if (aVar == aVar2 && aVarArr[1] == aVar2) {
                i9 = 3;
                if (i14 == 3 && i15 == 3) {
                    a(z5, z4, z14, z15);
                    i5 = i14;
                    i3 = i10;
                    i2 = i12;
                    i4 = i15;
                    z6 = true;
                    int[] iArr = this.h;
                    iArr[0] = i5;
                    iArr[1] = i4;
                    if (z6) {
                        int i16 = this.q;
                        if (i16 != 0) {
                        }
                        z7 = true;
                        boolean z16 = this.F[0] != a.WRAP_CONTENT && (this instanceof C1746ua);
                        boolean z17 = !this.C.i();
                        if (this.b == 2) {
                            C1716ta taVar4 = this.G;
                            C1473la a7 = taVar4 != null ? haVar3.a((Object) taVar4.x) : null;
                            C1716ta taVar5 = this.G;
                            z8 = z4;
                            laVar3 = laVar;
                            laVar5 = a5;
                            laVar2 = a4;
                            boolean z18 = z16;
                            laVar4 = a3;
                            a(haVar, z5, taVar5 != null ? haVar3.a((Object) taVar5.v) : null, a7, this.F[0], z18, this.v, this.x, this.L, i3, this.W, this.t[0], this.aa, z7, z3, i5, this.i, this.j, this.k, z17);
                        } else {
                            laVar2 = a4;
                            laVar4 = a3;
                            z8 = z4;
                            laVar3 = laVar;
                            laVar5 = a5;
                        }
                        if (this.c == 2) {
                            boolean z19 = this.F[1] == a.WRAP_CONTENT && (this instanceof C1746ua);
                            if (z6) {
                                int i17 = this.q;
                                if (i17 == 1 || i17 == -1) {
                                    z9 = true;
                                    if (this.V > 0) {
                                        haVar2 = haVar;
                                    } else if (this.z.d().b == 1) {
                                        haVar2 = haVar;
                                        this.z.d().a(haVar2);
                                    } else {
                                        haVar2 = haVar;
                                        C1473la laVar7 = laVar3;
                                        laVar6 = laVar2;
                                        haVar2.a(laVar7, laVar6, c(), 6);
                                        C1656ra raVar = this.z.d;
                                        if (raVar != null) {
                                            haVar2.a(laVar7, haVar2.a((Object) raVar), 0, 6);
                                            z10 = false;
                                            C1716ta taVar6 = this.G;
                                            C1473la a8 = taVar6 == null ? haVar2.a((Object) taVar6.y) : null;
                                            C1716ta taVar7 = this.G;
                                            C1473la laVar8 = laVar6;
                                            a(haVar, z8, taVar7 == null ? haVar2.a((Object) taVar7.w) : null, a8, this.F[1], z19, this.w, this.y, this.M, i2, this.X, this.t[1], this.ba, z9, z2, i4, this.l, this.m, this.n, z10);
                                            if (!z6) {
                                                taVar = this;
                                                if (taVar.q == 1) {
                                                    haVar.a(laVar5, laVar8, laVar4, a2, taVar.r, 6);
                                                } else {
                                                    haVar.a(laVar4, a2, laVar5, laVar8, taVar.r, 6);
                                                }
                                            } else {
                                                taVar = this;
                                            }
                                            if (taVar.C.i()) {
                                                haVar.a(taVar, taVar.C.g().c(), (float) Math.toRadians((double) (taVar.u + 90.0f)), taVar.C.b());
                                            }
                                            return;
                                        }
                                        z10 = z17;
                                        C1716ta taVar62 = this.G;
                                        if (taVar62 == null) {
                                        }
                                        C1716ta taVar72 = this.G;
                                        C1473la laVar82 = laVar6;
                                        a(haVar, z8, taVar72 == null ? haVar2.a((Object) taVar72.w) : null, a8, this.F[1], z19, this.w, this.y, this.M, i2, this.X, this.t[1], this.ba, z9, z2, i4, this.l, this.m, this.n, z10);
                                        if (!z6) {
                                        }
                                        if (taVar.C.i()) {
                                        }
                                        return;
                                    }
                                    laVar6 = laVar2;
                                    z10 = z17;
                                    C1716ta taVar622 = this.G;
                                    if (taVar622 == null) {
                                    }
                                    C1716ta taVar722 = this.G;
                                    C1473la laVar822 = laVar6;
                                    a(haVar, z8, taVar722 == null ? haVar2.a((Object) taVar722.w) : null, a8, this.F[1], z19, this.w, this.y, this.M, i2, this.X, this.t[1], this.ba, z9, z2, i4, this.l, this.m, this.n, z10);
                                    if (!z6) {
                                    }
                                    if (taVar.C.i()) {
                                    }
                                    return;
                                }
                            }
                            z9 = false;
                            if (this.V > 0) {
                            }
                            laVar6 = laVar2;
                            z10 = z17;
                            C1716ta taVar6222 = this.G;
                            if (taVar6222 == null) {
                            }
                            C1716ta taVar7222 = this.G;
                            C1473la laVar8222 = laVar6;
                            a(haVar, z8, taVar7222 == null ? haVar2.a((Object) taVar7222.w) : null, a8, this.F[1], z19, this.w, this.y, this.M, i2, this.X, this.t[1], this.ba, z9, z2, i4, this.l, this.m, this.n, z10);
                            if (!z6) {
                            }
                            if (taVar.C.i()) {
                            }
                            return;
                        }
                        return;
                    }
                    z7 = false;
                    if (this.F[0] != a.WRAP_CONTENT) {
                    }
                    boolean z172 = !this.C.i();
                    if (this.b == 2) {
                    }
                    if (this.c == 2) {
                    }
                }
            } else {
                i9 = 3;
            }
            a[] aVarArr2 = this.F;
            a aVar3 = aVarArr2[0];
            a aVar4 = a.MATCH_CONSTRAINT;
            if (aVar3 == aVar4 && i14 == i9) {
                this.q = 0;
                int i18 = (int) (this.r * ((float) this.I));
                if (aVarArr2[1] != aVar4) {
                    i7 = i18;
                    i8 = i12;
                    i4 = i15;
                    i6 = 4;
                } else {
                    i3 = i18;
                    i5 = i14;
                    i2 = i12;
                    i4 = i15;
                    z6 = true;
                    int[] iArr2 = this.h;
                    iArr2[0] = i5;
                    iArr2[1] = i4;
                    if (z6) {
                    }
                    z7 = false;
                    if (this.F[0] != a.WRAP_CONTENT) {
                    }
                    boolean z1722 = !this.C.i();
                    if (this.b == 2) {
                    }
                    if (this.c == 2) {
                    }
                }
            } else {
                if (this.F[1] == a.MATCH_CONSTRAINT && i15 == 3) {
                    this.q = 1;
                    if (this.K == -1) {
                        this.r = 1.0f / this.r;
                    }
                    int i19 = (int) (this.r * ((float) this.H));
                    if (this.F[0] != a.MATCH_CONSTRAINT) {
                        i8 = i19;
                        i6 = i14;
                        i7 = i10;
                        i4 = 4;
                    } else {
                        i2 = i19;
                        i5 = i14;
                        i3 = i10;
                        i4 = i15;
                        z6 = true;
                        int[] iArr22 = this.h;
                        iArr22[0] = i5;
                        iArr22[1] = i4;
                        if (z6) {
                        }
                        z7 = false;
                        if (this.F[0] != a.WRAP_CONTENT) {
                        }
                        boolean z17222 = !this.C.i();
                        if (this.b == 2) {
                        }
                        if (this.c == 2) {
                        }
                    }
                }
                i5 = i14;
                i3 = i10;
                i2 = i12;
                i4 = i15;
                z6 = true;
                int[] iArr222 = this.h;
                iArr222[0] = i5;
                iArr222[1] = i4;
                if (z6) {
                }
                z7 = false;
                if (this.F[0] != a.WRAP_CONTENT) {
                }
                boolean z172222 = !this.C.i();
                if (this.b == 2) {
                }
                if (this.c == 2) {
                }
            }
        }
        z6 = false;
        int[] iArr2222 = this.h;
        iArr2222[0] = i5;
        iArr2222[1] = i4;
        if (z6) {
        }
        z7 = false;
        if (this.F[0] != a.WRAP_CONTENT) {
        }
        boolean z1722222 = !this.C.i();
        if (this.b == 2) {
        }
        if (this.c == 2) {
        }
    }

    public void a(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.q == -1) {
            if (z4 && !z5) {
                this.q = 0;
            } else if (!z4 && z5) {
                this.q = 1;
                if (this.K == -1) {
                    this.r = 1.0f / this.r;
                }
            }
        }
        if (this.q == 0 && (!this.w.i() || !this.y.i())) {
            this.q = 1;
        } else if (this.q == 1 && (!this.v.i() || !this.x.i())) {
            this.q = 0;
        }
        if (this.q == -1 && (!this.w.i() || !this.y.i() || !this.v.i() || !this.x.i())) {
            if (this.w.i() && this.y.i()) {
                this.q = 0;
            } else if (this.v.i() && this.x.i()) {
                this.r = 1.0f / this.r;
                this.q = 1;
            }
        }
        if (this.q == -1) {
            if (z2 && !z3) {
                this.q = 0;
            } else if (!z2 && z3) {
                this.r = 1.0f / this.r;
                this.q = 1;
            }
        }
        if (this.q == -1) {
            if (this.i > 0 && this.l == 0) {
                this.q = 0;
            } else if (this.i == 0 && this.l > 0) {
                this.r = 1.0f / this.r;
                this.q = 1;
            }
        }
        if (this.q == -1 && z2 && z3) {
            this.r = 1.0f / this.r;
            this.q = 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01db  */
    private void a(C1350ha haVar, boolean z2, C1473la laVar, C1473la laVar2, a aVar, boolean z3, C1656ra raVar, C1656ra raVar2, int i2, int i3, int i4, int i5, float f2, boolean z4, boolean z5, int i6, int i7, int i8, float f3, boolean z6) {
        boolean z7;
        int i9;
        int i10;
        int i11;
        C1473la laVar3;
        C1473la laVar4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C1473la laVar5;
        boolean z8;
        int i18;
        C1473la laVar6;
        boolean z9;
        boolean z10;
        C1473la laVar7;
        C1473la laVar8;
        int i19;
        int i20;
        boolean z11;
        C1473la laVar9;
        boolean z12;
        int i21;
        boolean z13;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z14;
        boolean z15;
        C1473la laVar10;
        C1473la laVar11;
        int i27;
        C1350ha haVar2 = haVar;
        C1473la laVar12 = laVar;
        C1473la laVar13 = laVar2;
        C1656ra raVar3 = raVar2;
        int i28 = i4;
        int i29 = i5;
        C1473la a2 = haVar2.a((Object) raVar);
        C1473la a3 = haVar2.a((Object) raVar3);
        C1473la a4 = haVar2.a((Object) raVar.g());
        C1473la a5 = haVar2.a((Object) raVar2.g());
        if (haVar2.i && raVar.d().b == 1 && raVar2.d().b == 1) {
            if (C1350ha.e() != null) {
                C1381ia e2 = C1350ha.e();
                e2.r++;
            }
            raVar.d().a(haVar2);
            raVar2.d().a(haVar2);
            if (!z5 && z2) {
                haVar2.b(laVar13, a3, 0, 6);
            }
            return;
        }
        if (C1350ha.e() != null) {
            C1381ia e3 = C1350ha.e();
            e3.z++;
        }
        boolean i30 = raVar.i();
        boolean i31 = raVar2.i();
        boolean i32 = this.C.i();
        int i33 = i30 ? 1 : 0;
        if (i31) {
            i33++;
        }
        if (i32) {
            i33++;
        }
        int i34 = i33;
        int i35 = z4 ? 3 : i6;
        int i36 = C1686sa.b[aVar.ordinal()];
        boolean z16 = (i36 == 1 || i36 == 2 || i36 == 3 || i36 != 4 || i35 == 4) ? false : true;
        if (this.ea == 8) {
            i9 = 0;
            z7 = false;
        } else {
            z7 = z16;
            i9 = i3;
        }
        if (z6) {
            if (!i30 && !i31 && !i32) {
                haVar2.a(a2, i2);
            } else if (i30 && !i31) {
                i10 = 6;
                haVar2.a(a2, a4, raVar.b(), 6);
                if (z7) {
                    if (z3) {
                        haVar2.a(a3, a2, 0, 3);
                        if (i28 > 0) {
                            i27 = 6;
                            haVar2.b(a3, a2, i28, 6);
                        } else {
                            i27 = 6;
                        }
                        if (i29 < Integer.MAX_VALUE) {
                            haVar2.c(a3, a2, i29, i27);
                        }
                    } else {
                        haVar2.a(a3, a2, i9, i10);
                    }
                    i12 = i8;
                    i11 = i35;
                    i15 = i34;
                    laVar3 = a5;
                    laVar4 = a4;
                    i14 = 0;
                    i13 = i7;
                } else {
                    int i37 = i7;
                    if (i37 == -2) {
                        i12 = i8;
                        i23 = i9;
                    } else {
                        i23 = i37;
                        i12 = i8;
                    }
                    if (i12 == -2) {
                        i12 = i9;
                    }
                    if (i23 > 0) {
                        i24 = 6;
                        haVar2.b(a3, a2, i23, 6);
                        i9 = Math.max(i9, i23);
                    } else {
                        i24 = 6;
                    }
                    if (i12 > 0) {
                        haVar2.c(a3, a2, i12, i24);
                        i9 = Math.min(i9, i12);
                    }
                    if (i35 != 1) {
                        z15 = z7;
                        if (i35 == 2) {
                            if (raVar.h() == c.TOP || raVar.h() == c.BOTTOM) {
                                laVar10 = haVar2.a((Object) this.G.a(c.TOP));
                                laVar11 = haVar2.a((Object) this.G.a(c.BOTTOM));
                            } else {
                                laVar10 = haVar2.a((Object) this.G.a(c.LEFT));
                                laVar11 = haVar2.a((Object) this.G.a(c.RIGHT));
                            }
                            C1473la laVar14 = laVar10;
                            C1473la laVar15 = laVar11;
                            C1257ea b2 = haVar.b();
                            C1257ea eaVar = b2;
                            i11 = i35;
                            laVar4 = a4;
                            i26 = i9;
                            i15 = i34;
                            i14 = 0;
                            C1473la laVar16 = laVar15;
                            i25 = i23;
                            laVar3 = a5;
                            b2.a(a3, a2, laVar16, laVar14, f3);
                            haVar2.a(b2);
                            z14 = false;
                            if (z14) {
                            }
                            i13 = i25;
                            z7 = z14;
                        }
                    } else if (z2) {
                        haVar2.a(a3, a2, i9, 6);
                        i11 = i35;
                        i15 = i34;
                        laVar3 = a5;
                        laVar4 = a4;
                        z15 = z7;
                        i14 = 0;
                        i26 = i9;
                        i25 = i23;
                        z14 = z15;
                        if (z14) {
                            if (i15 != 2 && !z4) {
                                int max = Math.max(i25, i26);
                                if (i12 > 0) {
                                    max = Math.min(i12, max);
                                }
                                haVar2.a(a3, a2, max, 6);
                                i13 = i25;
                                z7 = false;
                            }
                        }
                        i13 = i25;
                        z7 = z14;
                    } else if (z5) {
                        z15 = z7;
                        haVar2.a(a3, a2, i9, 4);
                    } else {
                        z15 = z7;
                        haVar2.a(a3, a2, i9, 1);
                    }
                    i11 = i35;
                    i15 = i34;
                    i25 = i23;
                    laVar3 = a5;
                    laVar4 = a4;
                    i14 = 0;
                    i26 = i9;
                    z14 = z15;
                    if (z14) {
                    }
                    i13 = i25;
                    z7 = z14;
                }
                if (z6 || z5) {
                    int i38 = i15;
                    C1473la laVar17 = a3;
                    C1473la laVar18 = laVar12;
                    C1473la laVar19 = laVar13;
                    if (i38 < 2 && z2) {
                        haVar2.b(a2, laVar18, 0, 6);
                        haVar2.b(laVar19, laVar17, 0, 6);
                    }
                }
                if (i30 || i31 || i32) {
                    if (!i30 || i31) {
                        if (i30 || !i31) {
                            C1473la laVar20 = laVar3;
                            if (i30 && i31) {
                                if (z7) {
                                    if (z2) {
                                        if (i4 == 0) {
                                            haVar2.b(a3, a2, 0, 6);
                                        }
                                    }
                                    if (i11 == 0) {
                                        if (i12 > 0 || i13 > 0) {
                                            i22 = 4;
                                            z13 = true;
                                        } else {
                                            i22 = 6;
                                            z13 = false;
                                        }
                                        laVar6 = laVar4;
                                        haVar2.a(a2, laVar6, raVar.b(), i22);
                                        haVar2.a(a3, laVar20, -raVar2.b(), i22);
                                        z9 = i12 > 0 || i13 > 0;
                                        z8 = z13;
                                        i18 = 5;
                                    } else {
                                        int i39 = i11;
                                        laVar6 = laVar4;
                                        if (i39 == 1) {
                                            z9 = true;
                                            i18 = 6;
                                            z8 = true;
                                        } else if (i39 == 3) {
                                            if (!z4) {
                                                if (this.q != -1 && i12 <= 0) {
                                                    i21 = 6;
                                                    haVar2.a(a2, laVar6, raVar.b(), i21);
                                                    haVar2.a(a3, laVar20, -raVar2.b(), i21);
                                                    z9 = true;
                                                    i18 = 5;
                                                    z8 = true;
                                                    if (!z9) {
                                                        z10 = true;
                                                        laVar7 = laVar20;
                                                        laVar9 = laVar6;
                                                        laVar8 = a3;
                                                        haVar.a(a2, laVar6, raVar.b(), f2, laVar20, a3, raVar2.b(), i18);
                                                        boolean z17 = raVar.d.b instanceof C1535na;
                                                        boolean z18 = raVar2.d.b instanceof C1535na;
                                                        if (z17 && !z18) {
                                                            z10 = z2;
                                                            z11 = true;
                                                            i20 = 5;
                                                            i19 = 6;
                                                            if (z8) {
                                                            }
                                                            haVar2.b(a2, laVar9, raVar.b(), i20);
                                                            haVar2.c(laVar8, laVar7, -raVar2.b(), i19);
                                                            if (!z2) {
                                                            }
                                                        } else if (!z17 && z18) {
                                                            z11 = z2;
                                                            i20 = 6;
                                                            i19 = 5;
                                                            if (z8) {
                                                                i20 = 6;
                                                                i19 = 6;
                                                            }
                                                            if ((!z7 && z10) || z8) {
                                                                haVar2.b(a2, laVar9, raVar.b(), i20);
                                                            }
                                                            if ((!z7 && z11) || z8) {
                                                                haVar2.c(laVar8, laVar7, -raVar2.b(), i19);
                                                            }
                                                            if (!z2) {
                                                                laVar5 = laVar8;
                                                                i17 = 6;
                                                                i16 = 0;
                                                                haVar2.b(a2, laVar, 0, 6);
                                                                if (z2) {
                                                                    haVar2.b(laVar2, laVar5, i16, i17);
                                                                }
                                                                return;
                                                            }
                                                            laVar5 = laVar8;
                                                            i17 = 6;
                                                            i16 = 0;
                                                            if (z2) {
                                                            }
                                                            return;
                                                        }
                                                    } else {
                                                        C1656ra raVar4 = raVar;
                                                        C1656ra raVar5 = raVar2;
                                                        laVar9 = laVar6;
                                                        laVar7 = laVar20;
                                                        laVar8 = a3;
                                                    }
                                                    z11 = z2;
                                                    z10 = z11;
                                                    i20 = 5;
                                                    i19 = 5;
                                                    if (z8) {
                                                    }
                                                    haVar2.b(a2, laVar9, raVar.b(), i20);
                                                    haVar2.c(laVar8, laVar7, -raVar2.b(), i19);
                                                    if (!z2) {
                                                    }
                                                }
                                            }
                                            i21 = 4;
                                            haVar2.a(a2, laVar6, raVar.b(), i21);
                                            haVar2.a(a3, laVar20, -raVar2.b(), i21);
                                            z9 = true;
                                            i18 = 5;
                                            z8 = true;
                                            if (!z9) {
                                            }
                                            z11 = z2;
                                            z10 = z11;
                                            i20 = 5;
                                            i19 = 5;
                                            if (z8) {
                                            }
                                            haVar2.b(a2, laVar9, raVar.b(), i20);
                                            haVar2.c(laVar8, laVar7, -raVar2.b(), i19);
                                            if (!z2) {
                                            }
                                        } else {
                                            z12 = false;
                                        }
                                    }
                                    if (!z9) {
                                    }
                                    z11 = z2;
                                    z10 = z11;
                                    i20 = 5;
                                    i19 = 5;
                                    if (z8) {
                                    }
                                    haVar2.b(a2, laVar9, raVar.b(), i20);
                                    haVar2.c(laVar8, laVar7, -raVar2.b(), i19);
                                    if (!z2) {
                                    }
                                } else {
                                    laVar6 = laVar4;
                                    z12 = true;
                                }
                                i18 = 5;
                                z8 = false;
                                if (!z9) {
                                }
                                z11 = z2;
                                z10 = z11;
                                i20 = 5;
                                i19 = 5;
                                if (z8) {
                                }
                                haVar2.b(a2, laVar9, raVar.b(), i20);
                                haVar2.c(laVar8, laVar7, -raVar2.b(), i19);
                                if (!z2) {
                                }
                            }
                        } else {
                            haVar2.a(a3, laVar3, -raVar2.b(), 6);
                            if (z2) {
                                haVar2.b(a2, laVar12, i14, 5);
                            }
                        }
                    } else if (z2) {
                        haVar2.b(laVar13, a3, i14, 5);
                    }
                } else if (z2) {
                    haVar2.b(laVar13, a3, i14, 5);
                }
                laVar5 = a3;
                i17 = 6;
                i16 = 0;
                if (z2) {
                }
                return;
            }
        }
        i10 = 6;
        if (z7) {
        }
        if (z6) {
        }
        int i382 = i15;
        C1473la laVar172 = a3;
        C1473la laVar182 = laVar12;
        C1473la laVar192 = laVar13;
        haVar2.b(a2, laVar182, 0, 6);
        haVar2.b(laVar192, laVar172, 0, 6);
    }
}
