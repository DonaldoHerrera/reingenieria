package defpackage;

import java.util.ArrayList;

/* renamed from: pa reason: default package and case insensitive filesystem */
/* compiled from: ChainHead */
public class C1597pa {
    protected C1716ta a;
    protected C1716ta b;
    protected C1716ta c;
    protected C1716ta d;
    protected C1716ta e;
    protected C1716ta f;
    protected C1716ta g;
    protected ArrayList<C1716ta> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    private int l;
    private boolean m = false;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    private boolean q;

    public C1597pa(C1716ta taVar, int i2, boolean z) {
        this.a = taVar;
        this.l = i2;
        this.m = z;
    }

    private static boolean a(C1716ta taVar, int i2) {
        if (taVar.r() != 8 && taVar.F[i2] == a.MATCH_CONSTRAINT) {
            int[] iArr = taVar.h;
            if (iArr[i2] == 0 || iArr[i2] == 3) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        int i2 = this.l * 2;
        boolean z = false;
        C1716ta taVar = this.a;
        C1716ta taVar2 = taVar;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            C1716ta[] taVarArr = taVar.sa;
            int i3 = this.l;
            C1716ta taVar3 = null;
            taVarArr[i3] = null;
            taVar.ra[i3] = null;
            if (taVar.r() != 8) {
                if (this.b == null) {
                    this.b = taVar;
                }
                this.d = taVar;
                a[] aVarArr = taVar.F;
                int i4 = this.l;
                if (aVarArr[i4] == a.MATCH_CONSTRAINT) {
                    int[] iArr = taVar.h;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.j++;
                        float[] fArr = taVar.qa;
                        int i5 = this.l;
                        float f2 = fArr[i5];
                        if (f2 > 0.0f) {
                            this.k += fArr[i5];
                        }
                        if (a(taVar, this.l)) {
                            if (f2 < 0.0f) {
                                this.n = true;
                            } else {
                                this.o = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(taVar);
                        }
                        if (this.f == null) {
                            this.f = taVar;
                        }
                        C1716ta taVar4 = this.g;
                        if (taVar4 != null) {
                            taVar4.ra[this.l] = taVar;
                        }
                        this.g = taVar;
                    }
                }
            }
            if (taVar2 != taVar) {
                taVar2.sa[this.l] = taVar;
            }
            C1656ra raVar = taVar.D[i2 + 1].d;
            if (raVar != null) {
                C1716ta taVar5 = raVar.b;
                C1656ra[] raVarArr = taVar5.D;
                if (raVarArr[i2].d != null && raVarArr[i2].d.b == taVar) {
                    taVar3 = taVar5;
                }
            }
            if (taVar3 == null) {
                taVar3 = taVar;
                z2 = true;
            }
            taVar2 = taVar;
            taVar = taVar3;
        }
        this.c = taVar;
        if (this.l != 0 || !this.m) {
            this.e = this.a;
        } else {
            this.e = this.c;
        }
        if (this.o && this.n) {
            z = true;
        }
        this.p = z;
    }

    public void a() {
        if (!this.q) {
            b();
        }
        this.q = true;
    }
}
