package defpackage;

import java.util.Arrays;

/* renamed from: da reason: default package and case insensitive filesystem */
/* compiled from: ArrayLinkedVariables */
public class C1227da {
    int a = 0;
    private final C1257ea b;
    private final C1288fa c;
    private int d = 8;
    private C1473la e = null;
    private int[] f;
    private int[] g;
    private float[] h;
    private int i;
    private int j;
    private boolean k;

    C1227da(C1257ea eaVar, C1288fa faVar) {
        int i2 = this.d;
        this.f = new int[i2];
        this.g = new int[i2];
        this.h = new float[i2];
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.b = eaVar;
        this.c = faVar;
    }

    public final void a(C1473la laVar, float f2) {
        if (f2 == 0.0f) {
            a(laVar, true);
            return;
        }
        int i2 = this.i;
        if (i2 == -1) {
            this.i = 0;
            float[] fArr = this.h;
            int i3 = this.i;
            fArr[i3] = f2;
            this.f[i3] = laVar.c;
            this.g[i3] = -1;
            laVar.k++;
            laVar.a(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
                int i4 = this.j;
                int[] iArr = this.f;
                if (i4 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                }
            }
            return;
        }
        int i5 = 0;
        int i6 = -1;
        while (i2 != -1 && i5 < this.a) {
            int[] iArr2 = this.f;
            int i7 = iArr2[i2];
            int i8 = laVar.c;
            if (i7 == i8) {
                this.h[i2] = f2;
                return;
            }
            if (iArr2[i2] < i8) {
                i6 = i2;
            }
            i2 = this.g[i2];
            i5++;
        }
        int i9 = this.j;
        int i10 = i9 + 1;
        if (this.k) {
            int[] iArr3 = this.f;
            if (iArr3[i9] != -1) {
                i9 = iArr3.length;
            }
        } else {
            i9 = i10;
        }
        int[] iArr4 = this.f;
        if (i9 >= iArr4.length && this.a < iArr4.length) {
            int i11 = 0;
            while (true) {
                int[] iArr5 = this.f;
                if (i11 >= iArr5.length) {
                    break;
                } else if (iArr5[i11] == -1) {
                    i9 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        int[] iArr6 = this.f;
        if (i9 >= iArr6.length) {
            i9 = iArr6.length;
            this.d *= 2;
            this.k = false;
            this.j = i9 - 1;
            this.h = Arrays.copyOf(this.h, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i9] = laVar.c;
        this.h[i9] = f2;
        if (i6 != -1) {
            int[] iArr7 = this.g;
            iArr7[i9] = iArr7[i6];
            iArr7[i6] = i9;
        } else {
            this.g[i9] = this.i;
            this.i = i9;
        }
        laVar.k++;
        laVar.a(this.b);
        this.a++;
        if (!this.k) {
            this.j++;
        }
        if (this.a >= this.f.length) {
            this.k = true;
        }
        int i12 = this.j;
        int[] iArr8 = this.f;
        if (i12 >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.h;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.g[i2];
            i3++;
        }
    }

    public String toString() {
        int i2 = this.i;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.h[i2]);
            sb3.append(" : ");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.c.c[this.f[i2]]);
            str = sb5.toString();
            i2 = this.g[i2];
            i3++;
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    public final float b(int i2) {
        int i3 = this.i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.h[i3];
            }
            i3 = this.g[i3];
            i4++;
        }
        return 0.0f;
    }

    public final float b(C1473la laVar) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.f[i2] == laVar.c) {
                return this.h[i2];
            }
            i2 = this.g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public final void a(C1473la laVar, float f2, boolean z) {
        if (f2 != 0.0f) {
            int i2 = this.i;
            if (i2 == -1) {
                this.i = 0;
                float[] fArr = this.h;
                int i3 = this.i;
                fArr[i3] = f2;
                this.f[i3] = laVar.c;
                this.g[i3] = -1;
                laVar.k++;
                laVar.a(this.b);
                this.a++;
                if (!this.k) {
                    this.j++;
                    int i4 = this.j;
                    int[] iArr = this.f;
                    if (i4 >= iArr.length) {
                        this.k = true;
                        this.j = iArr.length - 1;
                    }
                }
                return;
            }
            int i5 = 0;
            int i6 = -1;
            while (i2 != -1 && i5 < this.a) {
                int[] iArr2 = this.f;
                int i7 = iArr2[i2];
                int i8 = laVar.c;
                if (i7 == i8) {
                    float[] fArr2 = this.h;
                    fArr2[i2] = fArr2[i2] + f2;
                    if (fArr2[i2] == 0.0f) {
                        if (i2 == this.i) {
                            this.i = this.g[i2];
                        } else {
                            int[] iArr3 = this.g;
                            iArr3[i6] = iArr3[i2];
                        }
                        if (z) {
                            laVar.b(this.b);
                        }
                        if (this.k) {
                            this.j = i2;
                        }
                        laVar.k--;
                        this.a--;
                    }
                    return;
                }
                if (iArr2[i2] < i8) {
                    i6 = i2;
                }
                i2 = this.g[i2];
                i5++;
            }
            int i9 = this.j;
            int i10 = i9 + 1;
            if (this.k) {
                int[] iArr4 = this.f;
                if (iArr4[i9] != -1) {
                    i9 = iArr4.length;
                }
            } else {
                i9 = i10;
            }
            int[] iArr5 = this.f;
            if (i9 >= iArr5.length && this.a < iArr5.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr6 = this.f;
                    if (i11 >= iArr6.length) {
                        break;
                    } else if (iArr6[i11] == -1) {
                        i9 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            int[] iArr7 = this.f;
            if (i9 >= iArr7.length) {
                i9 = iArr7.length;
                this.d *= 2;
                this.k = false;
                this.j = i9 - 1;
                this.h = Arrays.copyOf(this.h, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[i9] = laVar.c;
            this.h[i9] = f2;
            if (i6 != -1) {
                int[] iArr8 = this.g;
                iArr8[i9] = iArr8[i6];
                iArr8[i6] = i9;
            } else {
                this.g[i9] = this.i;
                this.i = i9;
            }
            laVar.k++;
            laVar.a(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
            }
            int i12 = this.j;
            int[] iArr9 = this.f;
            if (i12 >= iArr9.length) {
                this.k = true;
                this.j = iArr9.length - 1;
            }
        }
    }

    public final float a(C1473la laVar, boolean z) {
        if (this.e == laVar) {
            this.e = null;
        }
        int i2 = this.i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.f[i2] == laVar.c) {
                if (i2 == this.i) {
                    this.i = this.g[i2];
                } else {
                    int[] iArr = this.g;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    laVar.b(this.b);
                }
                laVar.k--;
                this.a--;
                this.f[i2] = -1;
                if (this.k) {
                    this.j = i2;
                }
                return this.h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    public final void a() {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            C1473la laVar = this.c.c[this.f[i2]];
            if (laVar != null) {
                laVar.b(this.b);
            }
            i2 = this.g[i2];
            i3++;
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(C1473la laVar) {
        int i2 = this.i;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.f[i2] == laVar.c) {
                return true;
            }
            i2 = this.g[i2];
            i3++;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.h;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.g[i2];
            i3++;
        }
    }

    private boolean a(C1473la laVar, C1350ha haVar) {
        return laVar.k <= 1;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f A[SYNTHETIC] */
    public C1473la a(C1350ha haVar) {
        boolean a2;
        boolean a3;
        int i2 = this.i;
        C1473la laVar = null;
        int i3 = 0;
        C1473la laVar2 = null;
        float f2 = 0.0f;
        boolean z = false;
        float f3 = 0.0f;
        boolean z2 = false;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.h;
            float f4 = fArr[i2];
            C1473la laVar3 = this.c.c[this.f[i2]];
            if (f4 < 0.0f) {
                if (f4 > -0.001f) {
                    fArr[i2] = 0.0f;
                    laVar3.b(this.b);
                }
                if (f4 != 0.0f) {
                    if (laVar3.h == a.UNRESTRICTED) {
                        if (laVar2 == null) {
                            a3 = a(laVar3, haVar);
                        } else if (f2 > f4) {
                            a3 = a(laVar3, haVar);
                        } else if (!z && a(laVar3, haVar)) {
                            f2 = f4;
                            laVar2 = laVar3;
                            z = true;
                        }
                        z = a3;
                        f2 = f4;
                        laVar2 = laVar3;
                    } else if (laVar2 == null && f4 < 0.0f) {
                        if (laVar == null) {
                            a2 = a(laVar3, haVar);
                        } else if (f3 > f4) {
                            a2 = a(laVar3, haVar);
                        } else if (!z2 && a(laVar3, haVar)) {
                            f3 = f4;
                            laVar = laVar3;
                            z2 = true;
                        }
                        z2 = a2;
                        f3 = f4;
                        laVar = laVar3;
                    }
                }
                i2 = this.g[i2];
                i3++;
            } else {
                if (f4 < 0.001f) {
                    fArr[i2] = 0.0f;
                    laVar3.b(this.b);
                }
                if (f4 != 0.0f) {
                }
                i2 = this.g[i2];
                i3++;
            }
            f4 = 0.0f;
            if (f4 != 0.0f) {
            }
            i2 = this.g[i2];
            i3++;
        }
        return laVar2 != null ? laVar2 : laVar;
    }

    /* access modifiers changed from: 0000 */
    public final void a(C1257ea eaVar, C1257ea eaVar2, boolean z) {
        int i2 = this.i;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.a) {
                int i4 = this.f[i2];
                C1473la laVar = eaVar2.a;
                if (i4 == laVar.c) {
                    float f2 = this.h[i2];
                    a(laVar, z);
                    C1227da daVar = eaVar2.d;
                    int i5 = daVar.i;
                    int i6 = 0;
                    while (i5 != -1 && i6 < daVar.a) {
                        a(this.c.c[daVar.f[i5]], daVar.h[i5] * f2, z);
                        i5 = daVar.g[i5];
                        i6++;
                    }
                    eaVar.b += eaVar2.b * f2;
                    if (z) {
                        eaVar2.a.b(eaVar);
                    }
                    i2 = this.i;
                } else {
                    i2 = this.g[i2];
                    i3++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C1257ea eaVar, C1257ea[] eaVarArr) {
        int i2 = this.i;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.a) {
                C1473la laVar = this.c.c[this.f[i2]];
                if (laVar.d != -1) {
                    float f2 = this.h[i2];
                    a(laVar, true);
                    C1257ea eaVar2 = eaVarArr[laVar.d];
                    if (!eaVar2.e) {
                        C1227da daVar = eaVar2.d;
                        int i4 = daVar.i;
                        int i5 = 0;
                        while (i4 != -1 && i5 < daVar.a) {
                            a(this.c.c[daVar.f[i4]], daVar.h[i4] * f2, true);
                            i4 = daVar.g[i4];
                            i5++;
                        }
                    }
                    eaVar.b += eaVar2.b * f2;
                    eaVar2.a.b(eaVar);
                    i2 = this.i;
                } else {
                    i2 = this.g[i2];
                    i3++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    public C1473la a(boolean[] zArr, C1473la laVar) {
        int i2 = this.i;
        int i3 = 0;
        C1473la laVar2 = null;
        float f2 = 0.0f;
        while (i2 != -1 && i3 < this.a) {
            if (this.h[i2] < 0.0f) {
                C1473la laVar3 = this.c.c[this.f[i2]];
                if ((zArr == null || !zArr[laVar3.c]) && laVar3 != laVar) {
                    a aVar = laVar3.h;
                    if (aVar == a.SLACK || aVar == a.ERROR) {
                        float f3 = this.h[i2];
                        if (f3 < f2) {
                            laVar2 = laVar3;
                            f2 = f3;
                        }
                    }
                }
            }
            i2 = this.g[i2];
            i3++;
        }
        return laVar2;
    }

    /* access modifiers changed from: 0000 */
    public final C1473la a(int i2) {
        int i3 = this.i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.c.c[this.f[i3]];
            }
            i3 = this.g[i3];
            i4++;
        }
        return null;
    }
}
