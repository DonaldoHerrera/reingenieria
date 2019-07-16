package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: ha reason: default package and case insensitive filesystem */
/* compiled from: LinearSystem */
public class C1350ha {
    private static int a = 1000;
    public static C1381ia b;
    int c = 0;
    private HashMap<String, C1473la> d = null;
    private a e;
    private int f = 32;
    private int g;
    C1257ea[] h;
    public boolean i;
    private boolean[] j;
    int k;
    int l;
    private int m;
    final C1288fa n;
    private C1473la[] o;
    private int p;
    private C1257ea[] q;
    private final a r;

    /* renamed from: ha$a */
    /* compiled from: LinearSystem */
    interface a {
        C1473la a(C1350ha haVar, boolean[] zArr);

        void a(a aVar);

        void a(C1473la laVar);

        void clear();

        C1473la getKey();
    }

    public C1350ha() {
        int i2 = this.f;
        this.g = i2;
        this.h = null;
        this.i = false;
        this.j = new boolean[i2];
        this.k = 1;
        this.l = 0;
        this.m = i2;
        this.o = new C1473la[a];
        this.p = 0;
        this.q = new C1257ea[i2];
        this.h = new C1257ea[i2];
        j();
        this.n = new C1288fa();
        this.e = new C1319ga(this.n);
        this.r = new C1257ea(this.n);
    }

    private final void d(C1257ea eaVar) {
        if (this.l > 0) {
            eaVar.d.a(eaVar, this.h);
            if (eaVar.d.a == 0) {
                eaVar.e = true;
            }
        }
    }

    public static C1381ia e() {
        return b;
    }

    private void h() {
        for (int i2 = 0; i2 < this.l; i2++) {
            C1257ea eaVar = this.h[i2];
            eaVar.a.f = eaVar.b;
        }
    }

    private void i() {
        this.f *= 2;
        this.h = (C1257ea[]) Arrays.copyOf(this.h, this.f);
        C1288fa faVar = this.n;
        faVar.c = (C1473la[]) Arrays.copyOf(faVar.c, this.f);
        int i2 = this.f;
        this.j = new boolean[i2];
        this.g = i2;
        this.m = i2;
        C1381ia iaVar = b;
        if (iaVar != null) {
            iaVar.d++;
            iaVar.o = Math.max(iaVar.o, (long) i2);
            C1381ia iaVar2 = b;
            iaVar2.A = iaVar2.o;
        }
    }

    private void j() {
        int i2 = 0;
        while (true) {
            C1257ea[] eaVarArr = this.h;
            if (i2 < eaVarArr.length) {
                C1257ea eaVar = eaVarArr[i2];
                if (eaVar != null) {
                    this.n.a.a(eaVar);
                }
                this.h[i2] = null;
                i2++;
            } else {
                return;
            }
        }
    }

    public C1473la a(Object obj) {
        C1473la laVar = null;
        if (obj == null) {
            return null;
        }
        if (this.k + 1 >= this.g) {
            i();
        }
        if (obj instanceof C1656ra) {
            C1656ra raVar = (C1656ra) obj;
            laVar = raVar.e();
            if (laVar == null) {
                raVar.a(this.n);
                laVar = raVar.e();
            }
            int i2 = laVar.c;
            if (i2 == -1 || i2 > this.c || this.n.c[i2] == null) {
                if (laVar.c != -1) {
                    laVar.b();
                }
                this.c++;
                this.k++;
                int i3 = this.c;
                laVar.c = i3;
                laVar.h = defpackage.C1473la.a.UNRESTRICTED;
                this.n.c[i3] = laVar;
            }
        }
        return laVar;
    }

    public C1257ea b() {
        C1257ea eaVar = (C1257ea) this.n.a.a();
        if (eaVar == null) {
            eaVar = new C1257ea(this.n);
        } else {
            eaVar.d();
        }
        C1473la.a();
        return eaVar;
    }

    public C1473la c() {
        C1381ia iaVar = b;
        if (iaVar != null) {
            iaVar.m++;
        }
        if (this.k + 1 >= this.g) {
            i();
        }
        C1473la a2 = a(defpackage.C1473la.a.SLACK, (String) null);
        this.c++;
        this.k++;
        int i2 = this.c;
        a2.c = i2;
        this.n.c[i2] = a2;
        return a2;
    }

    public void f() throws Exception {
        C1381ia iaVar = b;
        if (iaVar != null) {
            iaVar.e++;
        }
        if (this.i) {
            C1381ia iaVar2 = b;
            if (iaVar2 != null) {
                iaVar2.q++;
            }
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.l) {
                    z = true;
                    break;
                } else if (!this.h[i2].e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                a(this.e);
                return;
            }
            C1381ia iaVar3 = b;
            if (iaVar3 != null) {
                iaVar3.p++;
            }
            h();
            return;
        }
        a(this.e);
    }

    public void g() {
        C1288fa faVar;
        int i2 = 0;
        while (true) {
            faVar = this.n;
            C1473la[] laVarArr = faVar.c;
            if (i2 >= laVarArr.length) {
                break;
            }
            C1473la laVar = laVarArr[i2];
            if (laVar != null) {
                laVar.b();
            }
            i2++;
        }
        faVar.b.a(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.c, null);
        HashMap<String, C1473la> hashMap = this.d;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.c = 0;
        this.e.clear();
        this.k = 1;
        for (int i3 = 0; i3 < this.l; i3++) {
            this.h[i3].c = false;
        }
        j();
        this.l = 0;
    }

    private void b(C1257ea eaVar) {
        eaVar.a(this, 0);
    }

    public C1288fa d() {
        return this.n;
    }

    public int b(Object obj) {
        C1473la e2 = ((C1656ra) obj).e();
        if (e2 != null) {
            return (int) (e2.f + 0.5f);
        }
        return 0;
    }

    private int b(a aVar) throws Exception {
        float f2;
        boolean z;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.l) {
                z = false;
                break;
            }
            C1257ea[] eaVarArr = this.h;
            if (eaVarArr[i2].a.h != defpackage.C1473la.a.UNRESTRICTED && eaVarArr[i2].b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            C1381ia iaVar = b;
            if (iaVar != null) {
                iaVar.k++;
            }
            i3++;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            float f3 = Float.MAX_VALUE;
            int i7 = 0;
            while (i4 < this.l) {
                C1257ea eaVar = this.h[i4];
                if (eaVar.a.h != defpackage.C1473la.a.UNRESTRICTED && !eaVar.e && eaVar.b < f2) {
                    int i8 = 1;
                    while (i8 < this.k) {
                        C1473la laVar = this.n.c[i8];
                        float b2 = eaVar.d.b(laVar);
                        if (b2 > f2) {
                            int i9 = i7;
                            float f4 = f3;
                            int i10 = i6;
                            int i11 = i5;
                            for (int i12 = 0; i12 < 7; i12++) {
                                float f5 = laVar.g[i12] / b2;
                                if ((f5 < f4 && i12 == i9) || i12 > i9) {
                                    i10 = i8;
                                    i11 = i4;
                                    f4 = f5;
                                    i9 = i12;
                                }
                            }
                            i5 = i11;
                            i6 = i10;
                            f3 = f4;
                            i7 = i9;
                        }
                        i8++;
                        f2 = 0.0f;
                    }
                }
                i4++;
                f2 = 0.0f;
            }
            if (i5 != -1) {
                C1257ea eaVar2 = this.h[i5];
                eaVar2.a.d = -1;
                C1381ia iaVar2 = b;
                if (iaVar2 != null) {
                    iaVar2.j++;
                }
                eaVar2.d(this.n.c[i6]);
                C1473la laVar2 = eaVar2.a;
                laVar2.d = i5;
                laVar2.c(eaVar2);
            } else {
                z2 = true;
            }
            if (i3 > this.k / 2) {
                z2 = true;
            }
            f2 = 0.0f;
        }
        return i3;
    }

    private final void c(C1257ea eaVar) {
        C1257ea[] eaVarArr = this.h;
        int i2 = this.l;
        if (eaVarArr[i2] != null) {
            this.n.a.a(eaVarArr[i2]);
        }
        C1257ea[] eaVarArr2 = this.h;
        int i3 = this.l;
        eaVarArr2[i3] = eaVar;
        C1473la laVar = eaVar.a;
        laVar.d = i3;
        this.l = i3 + 1;
        laVar.c(eaVar);
    }

    public C1473la a() {
        C1381ia iaVar = b;
        if (iaVar != null) {
            iaVar.n++;
        }
        if (this.k + 1 >= this.g) {
            i();
        }
        C1473la a2 = a(defpackage.C1473la.a.SLACK, (String) null);
        this.c++;
        this.k++;
        int i2 = this.c;
        a2.c = i2;
        this.n.c[i2] = a2;
        return a2;
    }

    public void c(C1473la laVar, C1473la laVar2, int i2, int i3) {
        C1257ea b2 = b();
        C1473la c2 = c();
        c2.e = 0;
        b2.b(laVar, laVar2, c2, i2);
        if (i3 != 6) {
            a(b2, (int) (b2.d.b(c2) * -1.0f), i3);
        }
        a(b2);
    }

    /* access modifiers changed from: 0000 */
    public void a(C1257ea eaVar, int i2, int i3) {
        eaVar.a(a(i3, (String) null), i2);
    }

    public C1473la a(int i2, String str) {
        C1381ia iaVar = b;
        if (iaVar != null) {
            iaVar.l++;
        }
        if (this.k + 1 >= this.g) {
            i();
        }
        C1473la a2 = a(defpackage.C1473la.a.ERROR, str);
        this.c++;
        this.k++;
        int i3 = this.c;
        a2.c = i3;
        a2.e = i2;
        this.n.c[i3] = a2;
        this.e.a(a2);
        return a2;
    }

    public void b(C1473la laVar, C1473la laVar2, int i2, int i3) {
        C1257ea b2 = b();
        C1473la c2 = c();
        c2.e = 0;
        b2.a(laVar, laVar2, c2, i2);
        if (i3 != 6) {
            a(b2, (int) (b2.d.b(c2) * -1.0f), i3);
        }
        a(b2);
    }

    private C1473la a(defpackage.C1473la.a aVar, String str) {
        C1473la laVar = (C1473la) this.n.b.a();
        if (laVar == null) {
            laVar = new C1473la(aVar, str);
            laVar.a(aVar, str);
        } else {
            laVar.b();
            laVar.a(aVar, str);
        }
        int i2 = this.p;
        int i3 = a;
        if (i2 >= i3) {
            a = i3 * 2;
            this.o = (C1473la[]) Arrays.copyOf(this.o, a);
        }
        C1473la[] laVarArr = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        laVarArr[i4] = laVar;
        return laVar;
    }

    public void b(C1473la laVar, C1473la laVar2, boolean z) {
        C1257ea b2 = b();
        C1473la c2 = c();
        c2.e = 0;
        b2.b(laVar, laVar2, c2, 0);
        if (z) {
            a(b2, (int) (b2.d.b(c2) * -1.0f), 1);
        }
        a(b2);
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) throws Exception {
        C1381ia iaVar = b;
        if (iaVar != null) {
            iaVar.s++;
            iaVar.t = Math.max(iaVar.t, (long) this.k);
            C1381ia iaVar2 = b;
            iaVar2.u = Math.max(iaVar2.u, (long) this.l);
        }
        d((C1257ea) aVar);
        b(aVar);
        a(aVar, false);
        h();
    }

    public void a(C1257ea eaVar) {
        if (eaVar != null) {
            C1381ia iaVar = b;
            if (iaVar != null) {
                iaVar.f++;
                if (eaVar.e) {
                    iaVar.g++;
                }
            }
            if (this.l + 1 >= this.m || this.k + 1 >= this.g) {
                i();
            }
            boolean z = false;
            if (!eaVar.e) {
                d(eaVar);
                if (!eaVar.c()) {
                    eaVar.a();
                    if (eaVar.a(this)) {
                        C1473la a2 = a();
                        eaVar.a = a2;
                        c(eaVar);
                        this.r.a((a) eaVar);
                        a(this.r, true);
                        if (a2.d == -1) {
                            if (eaVar.a == a2) {
                                C1473la c2 = eaVar.c(a2);
                                if (c2 != null) {
                                    C1381ia iaVar2 = b;
                                    if (iaVar2 != null) {
                                        iaVar2.j++;
                                    }
                                    eaVar.d(c2);
                                }
                            }
                            if (!eaVar.e) {
                                eaVar.a.c(eaVar);
                            }
                            this.l--;
                        }
                        z = true;
                    }
                    if (!eaVar.b()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z) {
                c(eaVar);
            }
        }
    }

    private final int a(a aVar, boolean z) {
        C1381ia iaVar = b;
        if (iaVar != null) {
            iaVar.h++;
        }
        for (int i2 = 0; i2 < this.k; i2++) {
            this.j[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            C1381ia iaVar2 = b;
            if (iaVar2 != null) {
                iaVar2.i++;
            }
            i3++;
            if (i3 >= this.k * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.j[aVar.getKey().c] = true;
            }
            C1473la a2 = aVar.a(this, this.j);
            if (a2 != null) {
                boolean[] zArr = this.j;
                int i4 = a2.c;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (a2 != null) {
                int i5 = -1;
                float f2 = Float.MAX_VALUE;
                for (int i6 = 0; i6 < this.l; i6++) {
                    C1257ea eaVar = this.h[i6];
                    if (eaVar.a.h != defpackage.C1473la.a.UNRESTRICTED && !eaVar.e && eaVar.b(a2)) {
                        float b2 = eaVar.d.b(a2);
                        if (b2 < 0.0f) {
                            float f3 = (-eaVar.b) / b2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    C1257ea eaVar2 = this.h[i5];
                    eaVar2.a.d = -1;
                    C1381ia iaVar3 = b;
                    if (iaVar3 != null) {
                        iaVar3.j++;
                    }
                    eaVar2.d(a2);
                    C1473la laVar = eaVar2.a;
                    laVar.d = i5;
                    laVar.c(eaVar2);
                }
            }
            z2 = true;
        }
        return i3;
    }

    public void a(C1473la laVar, C1473la laVar2, boolean z) {
        C1257ea b2 = b();
        C1473la c2 = c();
        c2.e = 0;
        b2.a(laVar, laVar2, c2, 0);
        if (z) {
            a(b2, (int) (b2.d.b(c2) * -1.0f), 1);
        }
        a(b2);
    }

    public void a(C1473la laVar, C1473la laVar2, int i2, float f2, C1473la laVar3, C1473la laVar4, int i3, int i4) {
        int i5 = i4;
        C1257ea b2 = b();
        b2.a(laVar, laVar2, i2, f2, laVar3, laVar4, i3);
        if (i5 != 6) {
            b2.a(this, i5);
        }
        a(b2);
    }

    public void a(C1473la laVar, C1473la laVar2, C1473la laVar3, C1473la laVar4, float f2, int i2) {
        C1257ea b2 = b();
        b2.a(laVar, laVar2, laVar3, laVar4, f2);
        if (i2 != 6) {
            b2.a(this, i2);
        }
        a(b2);
    }

    public C1257ea a(C1473la laVar, C1473la laVar2, int i2, int i3) {
        C1257ea b2 = b();
        b2.a(laVar, laVar2, i2);
        if (i3 != 6) {
            b2.a(this, i3);
        }
        a(b2);
        return b2;
    }

    public void a(C1473la laVar, int i2) {
        int i3 = laVar.d;
        if (i3 != -1) {
            C1257ea eaVar = this.h[i3];
            if (eaVar.e) {
                eaVar.b = (float) i2;
            } else if (eaVar.d.a == 0) {
                eaVar.e = true;
                eaVar.b = (float) i2;
            } else {
                C1257ea b2 = b();
                b2.c(laVar, i2);
                a(b2);
            }
        } else {
            C1257ea b3 = b();
            b3.b(laVar, i2);
            a(b3);
        }
    }

    public static C1257ea a(C1350ha haVar, C1473la laVar, C1473la laVar2, C1473la laVar3, float f2, boolean z) {
        C1257ea b2 = haVar.b();
        if (z) {
            haVar.b(b2);
        }
        b2.a(laVar, laVar2, laVar3, f2);
        return b2;
    }

    public void a(C1716ta taVar, C1716ta taVar2, float f2, int i2) {
        C1716ta taVar3 = taVar;
        C1716ta taVar4 = taVar2;
        C1473la a2 = a((Object) taVar3.a(c.LEFT));
        C1473la a3 = a((Object) taVar3.a(c.TOP));
        C1473la a4 = a((Object) taVar3.a(c.RIGHT));
        C1473la a5 = a((Object) taVar3.a(c.BOTTOM));
        C1473la a6 = a((Object) taVar4.a(c.LEFT));
        C1473la a7 = a((Object) taVar4.a(c.TOP));
        C1473la a8 = a((Object) taVar4.a(c.RIGHT));
        C1473la a9 = a((Object) taVar4.a(c.BOTTOM));
        C1257ea b2 = b();
        double d2 = (double) f2;
        C1473la laVar = a4;
        double d3 = (double) i2;
        C1473la laVar2 = a8;
        b2.b(a3, a5, a7, a9, (float) (Math.sin(d2) * d3));
        a(b2);
        C1257ea b3 = b();
        b3.b(a2, laVar, a6, laVar2, (float) (Math.cos(d2) * d3));
        a(b3);
    }
}
