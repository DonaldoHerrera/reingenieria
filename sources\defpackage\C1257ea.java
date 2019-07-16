package defpackage;

import com.soundcloud.flippernative.BuildConfig;

/* renamed from: ea reason: default package and case insensitive filesystem */
/* compiled from: ArrayRow */
public class C1257ea implements a {
    C1473la a = null;
    float b = 0.0f;
    boolean c = false;
    public final C1227da d;
    boolean e = false;

    public C1257ea(C1288fa faVar) {
        this.d = new C1227da(this, faVar);
    }

    public C1257ea a(C1473la laVar, C1473la laVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.a(laVar, -1.0f);
            this.d.a(laVar2, 1.0f);
        } else {
            this.d.a(laVar, 1.0f);
            this.d.a(laVar2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        C1473la laVar = this.a;
        return laVar != null && (laVar.h == a.UNRESTRICTED || this.b >= 0.0f);
    }

    public C1257ea c(C1473la laVar, int i) {
        if (i < 0) {
            this.b = (float) (i * -1);
            this.d.a(laVar, 1.0f);
        } else {
            this.b = (float) i;
            this.d.a(laVar, -1.0f);
        }
        return this;
    }

    public void clear() {
        this.d.a();
        this.a = null;
        this.b = 0.0f;
    }

    public void d() {
        this.a = null;
        this.d.a();
        this.b = 0.0f;
        this.e = false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
    public String e() {
        String str;
        boolean z;
        String str2;
        String sb;
        String str3 = "";
        if (this.a == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(BuildConfig.VERSION_NAME);
            str = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(this.a);
            str = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(" = ");
        String sb5 = sb4.toString();
        if (this.b != 0.0f) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(sb5);
            sb6.append(this.b);
            sb5 = sb6.toString();
            z = true;
        } else {
            z = false;
        }
        int i = this.d.a;
        for (int i2 = 0; i2 < i; i2++) {
            C1473la a2 = this.d.a(i2);
            if (a2 != null) {
                float b2 = this.d.b(i2);
                int i3 = (b2 > 0.0f ? 1 : (b2 == 0.0f ? 0 : -1));
                if (i3 != 0) {
                    String laVar = a2.toString();
                    if (!z) {
                        if (b2 < 0.0f) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(str2);
                            sb7.append("- ");
                            str2 = sb7.toString();
                        }
                        if (b2 == 1.0f) {
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append(str2);
                            sb8.append(laVar);
                            sb = sb8.toString();
                        } else {
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(str2);
                            sb9.append(b2);
                            sb9.append(" ");
                            sb9.append(laVar);
                            sb = sb9.toString();
                        }
                        z = true;
                    } else if (i3 > 0) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(str2);
                        sb10.append(" + ");
                        str2 = sb10.toString();
                        if (b2 == 1.0f) {
                        }
                        z = true;
                    } else {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append(str2);
                        sb11.append(" - ");
                        str2 = sb11.toString();
                    }
                    b2 *= -1.0f;
                    if (b2 == 1.0f) {
                    }
                    z = true;
                }
            }
        }
        if (z) {
            return str2;
        }
        StringBuilder sb12 = new StringBuilder();
        sb12.append(str2);
        sb12.append("0.0");
        return sb12.toString();
    }

    public C1473la getKey() {
        return this.a;
    }

    public String toString() {
        return e();
    }

    /* access modifiers changed from: 0000 */
    public boolean b(C1473la laVar) {
        return this.d.a(laVar);
    }

    /* access modifiers changed from: 0000 */
    public C1257ea b(C1473la laVar, int i) {
        this.a = laVar;
        float f = (float) i;
        laVar.f = f;
        this.b = f;
        this.e = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public C1473la c(C1473la laVar) {
        return this.d.a((boolean[]) null, laVar);
    }

    /* access modifiers changed from: 0000 */
    public void d(C1473la laVar) {
        C1473la laVar2 = this.a;
        if (laVar2 != null) {
            this.d.a(laVar2, -1.0f);
            this.a = null;
        }
        float a2 = this.d.a(laVar, true) * -1.0f;
        this.a = laVar;
        if (a2 != 1.0f) {
            this.b /= a2;
            this.d.a(a2);
        }
    }

    /* access modifiers changed from: 0000 */
    public C1257ea a(C1473la laVar, int i) {
        this.d.a(laVar, (float) i);
        return this;
    }

    public boolean c() {
        return this.a == null && this.b == 0.0f && this.d.a == 0;
    }

    public C1257ea a(C1473la laVar, C1473la laVar2, C1473la laVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.a(laVar, -1.0f);
            this.d.a(laVar2, 1.0f);
            this.d.a(laVar3, 1.0f);
        } else {
            this.d.a(laVar, 1.0f);
            this.d.a(laVar2, -1.0f);
            this.d.a(laVar3, -1.0f);
        }
        return this;
    }

    public C1257ea b(C1473la laVar, C1473la laVar2, C1473la laVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.a(laVar, -1.0f);
            this.d.a(laVar2, 1.0f);
            this.d.a(laVar3, -1.0f);
        } else {
            this.d.a(laVar, 1.0f);
            this.d.a(laVar2, -1.0f);
            this.d.a(laVar3, 1.0f);
        }
        return this;
    }

    public C1257ea a(float f, float f2, float f3, C1473la laVar, C1473la laVar2, C1473la laVar3, C1473la laVar4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.d.a(laVar, 1.0f);
            this.d.a(laVar2, -1.0f);
            this.d.a(laVar4, 1.0f);
            this.d.a(laVar3, -1.0f);
        } else if (f == 0.0f) {
            this.d.a(laVar, 1.0f);
            this.d.a(laVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.d.a(laVar3, 1.0f);
            this.d.a(laVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.d.a(laVar, 1.0f);
            this.d.a(laVar2, -1.0f);
            this.d.a(laVar4, f4);
            this.d.a(laVar3, -f4);
        }
        return this;
    }

    public C1257ea b(C1473la laVar, C1473la laVar2, C1473la laVar3, C1473la laVar4, float f) {
        this.d.a(laVar3, 0.5f);
        this.d.a(laVar4, 0.5f);
        this.d.a(laVar, -0.5f);
        this.d.a(laVar2, -0.5f);
        this.b = -f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public C1257ea a(C1473la laVar, C1473la laVar2, int i, float f, C1473la laVar3, C1473la laVar4, int i2) {
        if (laVar2 == laVar3) {
            this.d.a(laVar, 1.0f);
            this.d.a(laVar4, 1.0f);
            this.d.a(laVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.d.a(laVar, 1.0f);
            this.d.a(laVar2, -1.0f);
            this.d.a(laVar3, -1.0f);
            this.d.a(laVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.d.a(laVar, -1.0f);
            this.d.a(laVar2, 1.0f);
            this.b = (float) i;
        } else if (f >= 1.0f) {
            this.d.a(laVar3, -1.0f);
            this.d.a(laVar4, 1.0f);
            this.b = (float) i2;
        } else {
            float f2 = 1.0f - f;
            this.d.a(laVar, f2 * 1.0f);
            this.d.a(laVar2, f2 * -1.0f);
            this.d.a(laVar3, -1.0f * f);
            this.d.a(laVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    public C1257ea a(C1350ha haVar, int i) {
        this.d.a(haVar.a(i, "ep"), 1.0f);
        this.d.a(haVar.a(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public C1257ea a(C1473la laVar, C1473la laVar2, C1473la laVar3, float f) {
        this.d.a(laVar, -1.0f);
        this.d.a(laVar2, 1.0f - f);
        this.d.a(laVar3, f);
        return this;
    }

    public C1257ea a(C1473la laVar, C1473la laVar2, C1473la laVar3, C1473la laVar4, float f) {
        this.d.a(laVar, -1.0f);
        this.d.a(laVar2, 1.0f);
        this.d.a(laVar3, f);
        this.d.a(laVar4, -f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = f * -1.0f;
            this.d.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(C1350ha haVar) {
        boolean z;
        C1473la a2 = this.d.a(haVar);
        if (a2 == null) {
            z = true;
        } else {
            d(a2);
            z = false;
        }
        if (this.d.a == 0) {
            this.e = true;
        }
        return z;
    }

    public C1473la a(C1350ha haVar, boolean[] zArr) {
        return this.d.a(zArr, (C1473la) null);
    }

    public void a(a aVar) {
        if (aVar instanceof C1257ea) {
            C1257ea eaVar = (C1257ea) aVar;
            this.a = null;
            this.d.a();
            int i = 0;
            while (true) {
                C1227da daVar = eaVar.d;
                if (i < daVar.a) {
                    this.d.a(daVar.a(i), eaVar.d.b(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void a(C1473la laVar) {
        int i = laVar.e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.d.a(laVar, f);
    }
}
