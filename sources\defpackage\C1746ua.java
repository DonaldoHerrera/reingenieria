package defpackage;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ua reason: default package and case insensitive filesystem */
/* compiled from: ConstraintWidgetContainer */
public class C1746ua extends C0204Fa {
    int Aa;
    int Ba;
    int Ca;
    int Da = 0;
    int Ea = 0;
    C1597pa[] Fa = new C1597pa[4];
    C1597pa[] Ga = new C1597pa[4];
    public List<C1776va> Ha = new ArrayList();
    public boolean Ia = false;
    public boolean Ja = false;
    public boolean Ka = false;
    public int La = 0;
    public int Ma = 0;
    private int Na = 7;
    public boolean Oa = false;
    private boolean Pa = false;
    private boolean Qa = false;
    int Ra = 0;
    private boolean wa = false;
    protected C1350ha xa = new C1350ha();
    private C0201Ea ya;
    int za;

    private void V() {
        this.Da = 0;
        this.Ea = 0;
    }

    private void e(C1716ta taVar) {
        int i = this.Ea + 1;
        C1597pa[] paVarArr = this.Fa;
        if (i >= paVarArr.length) {
            this.Fa = (C1597pa[]) Arrays.copyOf(paVarArr, paVarArr.length * 2);
        }
        this.Fa[this.Ea] = new C1597pa(taVar, 1, P());
        this.Ea++;
    }

    public void D() {
        this.xa.g();
        this.za = 0;
        this.Ba = 0;
        this.Aa = 0;
        this.Ca = 0;
        this.Ha.clear();
        this.Oa = false;
        super.D();
    }

    /* JADX WARNING: type inference failed for: r8v15, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v48 */
    /* JADX WARNING: type inference failed for: r8v49 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v15, types: [boolean]
  assigns: []
  uses: [?[int, short, byte, char], boolean]
  mth insns count: 342
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01da  */
    /* JADX WARNING: Unknown variable types count: 3 */
    public void K() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        char c;
        int i3;
        boolean z3;
        int max;
        int max2;
        ? r8;
        boolean z4;
        int i4 = this.L;
        int i5 = this.M;
        int max3 = Math.max(0, s());
        int max4 = Math.max(0, i());
        this.Pa = false;
        this.Qa = false;
        if (this.G != null) {
            if (this.ya == null) {
                this.ya = new C0201Ea(this);
            }
            this.ya.b(this);
            r(this.za);
            s(this.Aa);
            E();
            a(this.xa.d());
        } else {
            this.L = 0;
            this.M = 0;
        }
        int i6 = 32;
        if (this.Na != 0) {
            if (!t(8)) {
                S();
            }
            if (!t(32)) {
                R();
            }
            this.xa.i = true;
        } else {
            this.xa.i = false;
        }
        a[] aVarArr = this.F;
        a aVar = aVarArr[1];
        a aVar2 = aVarArr[0];
        V();
        if (this.Ha.size() == 0) {
            this.Ha.clear();
            this.Ha.add(0, new C1776va(this.va));
        }
        int size = this.Ha.size();
        ArrayList<C1716ta> arrayList = this.va;
        boolean z5 = j() == a.WRAP_CONTENT || q() == a.WRAP_CONTENT;
        boolean z6 = false;
        int i7 = 0;
        while (i7 < size && !this.Oa) {
            if (((C1776va) this.Ha.get(i7)).d) {
                i = size;
            } else {
                if (t(i6)) {
                    if (j() == a.FIXED && q() == a.FIXED) {
                        this.va = (ArrayList) ((C1776va) this.Ha.get(i7)).a();
                    } else {
                        this.va = (ArrayList) ((C1776va) this.Ha.get(i7)).a;
                    }
                }
                V();
                int size2 = this.va.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    C1716ta taVar = (C1716ta) this.va.get(i8);
                    if (taVar instanceof C0204Fa) {
                        ((C0204Fa) taVar).K();
                    }
                }
                boolean z7 = z6;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    boolean z9 = z8;
                    int i10 = i9 + 1;
                    try {
                        this.xa.g();
                        V();
                        b(this.xa);
                        int i11 = 0;
                        while (i11 < size2) {
                            z = z7;
                            try {
                                ((C1716ta) this.va.get(i11)).b(this.xa);
                                i11++;
                                z7 = z;
                            } catch (Exception e) {
                                e = e;
                                z4 = z9;
                                e.printStackTrace();
                                PrintStream printStream = System.out;
                                z2 = z4;
                                StringBuilder sb = new StringBuilder();
                                i2 = size;
                                sb.append("EXCEPTION : ");
                                sb.append(e);
                                printStream.println(sb.toString());
                                if (z2) {
                                }
                                c = 2;
                                if (z5) {
                                }
                                i3 = i10;
                                z7 = z;
                                z3 = false;
                                max = Math.max(this.W, s());
                                if (max > s()) {
                                }
                                max2 = Math.max(this.X, i());
                                if (max2 <= i()) {
                                }
                                if (!z7) {
                                }
                                z8 = z3;
                                i9 = i3;
                                size = i2;
                            }
                        }
                        z = z7;
                        z4 = d(this.xa);
                        if (z4) {
                            try {
                                this.xa.f();
                            } catch (Exception e2) {
                                e = e2;
                            }
                        }
                        z2 = z4;
                        i2 = size;
                    } catch (Exception e3) {
                        e = e3;
                        z = z7;
                        z4 = z9;
                        e.printStackTrace();
                        PrintStream printStream2 = System.out;
                        z2 = z4;
                        StringBuilder sb2 = new StringBuilder();
                        i2 = size;
                        sb2.append("EXCEPTION : ");
                        sb2.append(e);
                        printStream2.println(sb2.toString());
                        if (z2) {
                        }
                        c = 2;
                        if (z5) {
                        }
                        i3 = i10;
                        z7 = z;
                        z3 = false;
                        max = Math.max(this.W, s());
                        if (max > s()) {
                        }
                        max2 = Math.max(this.X, i());
                        if (max2 <= i()) {
                        }
                        if (!z7) {
                        }
                        z8 = z3;
                        i9 = i3;
                        size = i2;
                    }
                    if (z2) {
                        a(this.xa, C1896za.a);
                    } else {
                        c(this.xa);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                break;
                            }
                            C1716ta taVar2 = (C1716ta) this.va.get(i12);
                            if (taVar2.F[0] != a.MATCH_CONSTRAINT || taVar2.s() >= taVar2.u()) {
                                if (taVar2.F[1] == a.MATCH_CONSTRAINT && taVar2.i() < taVar2.t()) {
                                    c = 2;
                                    C1896za.a[2] = true;
                                    break;
                                }
                                i12++;
                            } else {
                                C1896za.a[2] = true;
                                break;
                            }
                        }
                        if (z5 || i10 >= 8 || !C1896za.a[c]) {
                            i3 = i10;
                            z7 = z;
                            z3 = false;
                        } else {
                            int i13 = 0;
                            int i14 = 0;
                            int i15 = 0;
                            while (i13 < size2) {
                                C1716ta taVar3 = (C1716ta) this.va.get(i13);
                                int i16 = i10;
                                i14 = Math.max(i14, taVar3.L + taVar3.s());
                                i15 = Math.max(i15, taVar3.M + taVar3.i());
                                i13++;
                                i10 = i16;
                            }
                            i3 = i10;
                            int max5 = Math.max(this.W, i14);
                            int max6 = Math.max(this.X, i15);
                            if (aVar2 != a.WRAP_CONTENT || s() >= max5) {
                                z3 = false;
                            } else {
                                o(max5);
                                this.F[0] = a.WRAP_CONTENT;
                                z3 = true;
                                z = true;
                            }
                            if (aVar != a.WRAP_CONTENT || i() >= max6) {
                                z7 = z;
                            } else {
                                g(max6);
                                this.F[1] = a.WRAP_CONTENT;
                                z3 = true;
                                z7 = true;
                            }
                        }
                        max = Math.max(this.W, s());
                        if (max > s()) {
                            o(max);
                            this.F[0] = a.FIXED;
                            z3 = true;
                            z7 = true;
                        }
                        max2 = Math.max(this.X, i());
                        if (max2 <= i()) {
                            g(max2);
                            this.F[1] = a.FIXED;
                            z3 = true;
                            z7 = true;
                            r8 = 1;
                        } else {
                            r8 = 1;
                        }
                        if (!z7) {
                            if (this.F[0] == a.WRAP_CONTENT && max3 > 0 && s() > max3) {
                                this.Pa = r8;
                                this.F[0] = a.FIXED;
                                o(max3);
                                z3 = true;
                                z7 = true;
                            }
                            if (this.F[r8] == a.WRAP_CONTENT && max4 > 0 && i() > max4) {
                                this.Qa = r8;
                                this.F[r8] = a.FIXED;
                                g(max4);
                                z8 = true;
                                z7 = true;
                                i9 = i3;
                                size = i2;
                            }
                        }
                        z8 = z3;
                        i9 = i3;
                        size = i2;
                    }
                    c = 2;
                    if (z5) {
                    }
                    i3 = i10;
                    z7 = z;
                    z3 = false;
                    max = Math.max(this.W, s());
                    if (max > s()) {
                    }
                    max2 = Math.max(this.X, i());
                    if (max2 <= i()) {
                    }
                    if (!z7) {
                    }
                    z8 = z3;
                    i9 = i3;
                    size = i2;
                }
                boolean z10 = z7;
                i = size;
                ((C1776va) this.Ha.get(i7)).b();
                z6 = z10;
            }
            i7++;
            size = i;
            i6 = 32;
        }
        this.va = arrayList;
        if (this.G != null) {
            int max7 = Math.max(this.W, s());
            int max8 = Math.max(this.X, i());
            this.ya.a(this);
            o(max7 + this.za + this.Ba);
            g(max8 + this.Aa + this.Ca);
        } else {
            this.L = i4;
            this.M = i5;
        }
        if (z6) {
            a[] aVarArr2 = this.F;
            aVarArr2[0] = aVar2;
            aVarArr2[1] = aVar;
        }
        a(this.xa.d());
        if (this == J()) {
            H();
        }
    }

    public int M() {
        return this.Na;
    }

    public boolean N() {
        return false;
    }

    public boolean O() {
        return this.Qa;
    }

    public boolean P() {
        return this.wa;
    }

    public boolean Q() {
        return this.Pa;
    }

    public void R() {
        if (!t(8)) {
            a(this.Na);
        }
        U();
    }

    public void S() {
        int size = this.va.size();
        F();
        for (int i = 0; i < size; i++) {
            ((C1716ta) this.va.get(i)).F();
        }
    }

    public void T() {
        S();
        a(this.Na);
    }

    public void U() {
        C0192Ba d = a(c.LEFT).d();
        C0192Ba d2 = a(c.TOP).d();
        d.a((C0192Ba) null, 0.0f);
        d2.a((C0192Ba) null, 0.0f);
    }

    public void a(C1350ha haVar, boolean[] zArr) {
        zArr[2] = false;
        c(haVar);
        int size = this.va.size();
        for (int i = 0; i < size; i++) {
            C1716ta taVar = (C1716ta) this.va.get(i);
            taVar.c(haVar);
            if (taVar.F[0] == a.MATCH_CONSTRAINT && taVar.s() < taVar.u()) {
                zArr[2] = true;
            }
            if (taVar.F[1] == a.MATCH_CONSTRAINT && taVar.i() < taVar.t()) {
                zArr[2] = true;
            }
        }
    }

    public void c(boolean z) {
        this.wa = z;
    }

    public boolean d(C1350ha haVar) {
        a(haVar);
        int size = this.va.size();
        for (int i = 0; i < size; i++) {
            C1716ta taVar = (C1716ta) this.va.get(i);
            if (taVar instanceof C1746ua) {
                a[] aVarArr = taVar.F;
                a aVar = aVarArr[0];
                a aVar2 = aVarArr[1];
                if (aVar == a.WRAP_CONTENT) {
                    taVar.a(a.FIXED);
                }
                if (aVar2 == a.WRAP_CONTENT) {
                    taVar.b(a.FIXED);
                }
                taVar.a(haVar);
                if (aVar == a.WRAP_CONTENT) {
                    taVar.a(aVar);
                }
                if (aVar2 == a.WRAP_CONTENT) {
                    taVar.b(aVar2);
                }
            } else {
                C1896za.a(this, haVar, taVar);
                taVar.a(haVar);
            }
        }
        if (this.Da > 0) {
            C1566oa.a(this, haVar, 0);
        }
        if (this.Ea > 0) {
            C1566oa.a(this, haVar, 1);
        }
        return true;
    }

    public void f(int i, int i2) {
        if (this.F[0] != a.WRAP_CONTENT) {
            C0195Ca ca = this.d;
            if (ca != null) {
                ca.a(i);
            }
        }
        if (this.F[1] != a.WRAP_CONTENT) {
            C0195Ca ca2 = this.e;
            if (ca2 != null) {
                ca2.a(i2);
            }
        }
    }

    public boolean t(int i) {
        return (this.Na & i) == i;
    }

    public void u(int i) {
        this.Na = i;
    }

    public void a(int i) {
        super.a(i);
        int size = this.va.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C1716ta) this.va.get(i2)).a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C1716ta taVar, int i) {
        if (i == 0) {
            d(taVar);
        } else if (i == 1) {
            e(taVar);
        }
    }

    private void d(C1716ta taVar) {
        int i = this.Da + 1;
        C1597pa[] paVarArr = this.Ga;
        if (i >= paVarArr.length) {
            this.Ga = (C1597pa[]) Arrays.copyOf(paVarArr, paVarArr.length * 2);
        }
        this.Ga[this.Da] = new C1597pa(taVar, 0, P());
        this.Da++;
    }
}
