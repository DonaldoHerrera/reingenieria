package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.da reason: case insensitive filesystem */
public final class C0941da extends C1074yd<C0941da> {
    private static volatile C0941da[] c;
    public Integer d = null;
    public G[] e = new G[0];
    public D[] f = new D[0];
    private Boolean g = null;
    private Boolean h = null;

    public static C0941da[] d() {
        if (c == null) {
            synchronized (Cd.c) {
                if (c == null) {
                    c = new C0941da[0];
                }
            }
        }
        return c;
    }

    public final void a(C1062wd wdVar) throws IOException {
        Integer num = this.d;
        if (num != null) {
            wdVar.b(1, num.intValue());
        }
        G[] gArr = this.e;
        int i = 0;
        if (gArr != null && gArr.length > 0) {
            int i2 = 0;
            while (true) {
                G[] gArr2 = this.e;
                if (i2 >= gArr2.length) {
                    break;
                }
                G g2 = gArr2[i2];
                if (g2 != null) {
                    wdVar.a(2, (C1026qc) g2);
                }
                i2++;
            }
        }
        D[] dArr = this.f;
        if (dArr != null && dArr.length > 0) {
            while (true) {
                D[] dArr2 = this.f;
                if (i >= dArr2.length) {
                    break;
                }
                D d2 = dArr2[i];
                if (d2 != null) {
                    wdVar.a(3, (C1026qc) d2);
                }
                i++;
            }
        }
        Boolean bool = this.g;
        if (bool != null) {
            wdVar.a(4, bool.booleanValue());
        }
        Boolean bool2 = this.h;
        if (bool2 != null) {
            wdVar.a(5, bool2.booleanValue());
        }
        super.a(wdVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0941da)) {
            return false;
        }
        C0941da daVar = (C0941da) obj;
        Integer num = this.d;
        if (num == null) {
            if (daVar.d != null) {
                return false;
            }
        } else if (!num.equals(daVar.d)) {
            return false;
        }
        if (!Cd.a((Object[]) this.e, (Object[]) daVar.e) || !Cd.a((Object[]) this.f, (Object[]) daVar.f)) {
            return false;
        }
        Boolean bool = this.g;
        if (bool == null) {
            if (daVar.g != null) {
                return false;
            }
        } else if (!bool.equals(daVar.g)) {
            return false;
        }
        Boolean bool2 = this.h;
        if (bool2 == null) {
            if (daVar.h != null) {
                return false;
            }
        } else if (!bool2.equals(daVar.h)) {
            return false;
        }
        Ad ad = this.b;
        if (ad != null && !ad.i()) {
            return this.b.equals(daVar.b);
        }
        Ad ad2 = daVar.b;
        return ad2 == null || ad2.i();
    }

    public final int hashCode() {
        int hashCode = (C0941da.class.getName().hashCode() + 527) * 31;
        Integer num = this.d;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Cd.a(this.e)) * 31) + Cd.a(this.f)) * 31;
        Boolean bool = this.g;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Ad ad = this.b;
        if (ad != null && !ad.i()) {
            i = this.b.hashCode();
        }
        return hashCode4 + i;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a = super.a();
        Integer num = this.d;
        if (num != null) {
            a += C1062wd.c(1, num.intValue());
        }
        G[] gArr = this.e;
        int i = 0;
        if (gArr != null && gArr.length > 0) {
            int i2 = a;
            int i3 = 0;
            while (true) {
                G[] gArr2 = this.e;
                if (i3 >= gArr2.length) {
                    break;
                }
                G g2 = gArr2[i3];
                if (g2 != null) {
                    i2 += C1007nb.c(2, (C1026qc) g2);
                }
                i3++;
            }
            a = i2;
        }
        D[] dArr = this.f;
        if (dArr != null && dArr.length > 0) {
            while (true) {
                D[] dArr2 = this.f;
                if (i >= dArr2.length) {
                    break;
                }
                D d2 = dArr2[i];
                if (d2 != null) {
                    a += C1007nb.c(3, (C1026qc) d2);
                }
                i++;
            }
        }
        Boolean bool = this.g;
        if (bool != null) {
            bool.booleanValue();
            a += C1062wd.a(4) + 1;
        }
        Boolean bool2 = this.h;
        if (bool2 == null) {
            return a;
        }
        bool2.booleanValue();
        return a + C1062wd.a(5) + 1;
    }

    public final /* synthetic */ Ed a(C1044td tdVar) throws IOException {
        while (true) {
            int c2 = tdVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 8) {
                this.d = Integer.valueOf(tdVar.e());
            } else if (c2 == 18) {
                int a = Fd.a(tdVar, 18);
                G[] gArr = this.e;
                int length = gArr == null ? 0 : gArr.length;
                G[] gArr2 = new G[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.e, 0, gArr2, 0, length);
                }
                while (length < gArr2.length - 1) {
                    gArr2[length] = (G) tdVar.a(G.y());
                    tdVar.c();
                    length++;
                }
                gArr2[length] = (G) tdVar.a(G.y());
                this.e = gArr2;
            } else if (c2 == 26) {
                int a2 = Fd.a(tdVar, 26);
                D[] dArr = this.f;
                int length2 = dArr == null ? 0 : dArr.length;
                D[] dArr2 = new D[(a2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f, 0, dArr2, 0, length2);
                }
                while (length2 < dArr2.length - 1) {
                    dArr2[length2] = (D) tdVar.a(D.C());
                    tdVar.c();
                    length2++;
                }
                dArr2[length2] = (D) tdVar.a(D.C());
                this.f = dArr2;
            } else if (c2 == 32) {
                this.g = Boolean.valueOf(tdVar.d());
            } else if (c2 == 40) {
                this.h = Boolean.valueOf(tdVar.d());
            } else if (!super.a(tdVar, c2)) {
                return this;
            }
        }
    }
}
