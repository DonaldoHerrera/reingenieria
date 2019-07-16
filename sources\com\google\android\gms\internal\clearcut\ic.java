package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public final class ic extends Rb<ic> implements Cloneable {
    private String[] c;
    private String[] d;
    private int[] e = Zb.a;
    private long[] f;
    private long[] g;

    public ic() {
        String[] strArr = Zb.f;
        this.c = strArr;
        this.d = strArr;
        long[] jArr = Zb.b;
        this.f = jArr;
        this.g = jArr;
        this.b = null;
        this.a = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final ic clone() {
        try {
            ic icVar = (ic) super.clone();
            String[] strArr = this.c;
            if (strArr != null && strArr.length > 0) {
                icVar.c = (String[]) strArr.clone();
            }
            String[] strArr2 = this.d;
            if (strArr2 != null && strArr2.length > 0) {
                icVar.d = (String[]) strArr2.clone();
            }
            int[] iArr = this.e;
            if (iArr != null && iArr.length > 0) {
                icVar.e = (int[]) iArr.clone();
            }
            long[] jArr = this.f;
            if (jArr != null && jArr.length > 0) {
                icVar.f = (long[]) jArr.clone();
            }
            long[] jArr2 = this.g;
            if (jArr2 != null && jArr2.length > 0) {
                icVar.g = (long[]) jArr2.clone();
            }
            return icVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void a(Pb pb) throws IOException {
        String[] strArr = this.c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    pb.a(1, str);
                }
                i2++;
            }
        }
        String[] strArr3 = this.d;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.d;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    pb.a(2, str2);
                }
                i3++;
            }
        }
        int[] iArr = this.e;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.e;
                if (i4 >= iArr2.length) {
                    break;
                }
                pb.b(3, iArr2[i4]);
                i4++;
            }
        }
        long[] jArr = this.f;
        if (jArr != null && jArr.length > 0) {
            int i5 = 0;
            while (true) {
                long[] jArr2 = this.f;
                if (i5 >= jArr2.length) {
                    break;
                }
                pb.b(4, jArr2[i5]);
                i5++;
            }
        }
        long[] jArr3 = this.g;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.g;
                if (i >= jArr4.length) {
                    break;
                }
                pb.b(5, jArr4[i]);
                i++;
            }
        }
        super.a(pb);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ic)) {
            return false;
        }
        ic icVar = (ic) obj;
        if (!Vb.a((Object[]) this.c, (Object[]) icVar.c) || !Vb.a((Object[]) this.d, (Object[]) icVar.d) || !Vb.a(this.e, icVar.e) || !Vb.a(this.f, icVar.f) || !Vb.a(this.g, icVar.g)) {
            return false;
        }
        Tb tb = this.b;
        if (tb != null && !tb.i()) {
            return this.b.equals(icVar.b);
        }
        Tb tb2 = icVar.b;
        return tb2 == null || tb2.i();
    }

    public final int hashCode() {
        int hashCode = (((((((((((ic.class.getName().hashCode() + 527) * 31) + Vb.a((Object[]) this.c)) * 31) + Vb.a((Object[]) this.d)) * 31) + Vb.a(this.e)) * 31) + Vb.a(this.f)) * 31) + Vb.a(this.g)) * 31;
        Tb tb = this.b;
        return hashCode + ((tb == null || tb.i()) ? 0 : this.b.hashCode());
    }

    /* access modifiers changed from: protected */
    public final int j() {
        long[] jArr;
        int[] iArr;
        int j = super.j();
        String[] strArr = this.c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    i3 += Pb.a(str);
                }
                i2++;
            }
            j = j + i3 + (i4 * 1);
        }
        String[] strArr3 = this.d;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr4 = this.d;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    i7++;
                    i6 += Pb.a(str2);
                }
                i5++;
            }
            j = j + i6 + (i7 * 1);
        }
        int[] iArr2 = this.e;
        if (iArr2 != null && iArr2.length > 0) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                iArr = this.e;
                if (i8 >= iArr.length) {
                    break;
                }
                i9 += Pb.b(iArr[i8]);
                i8++;
            }
            j = j + i9 + (iArr.length * 1);
        }
        long[] jArr2 = this.f;
        if (jArr2 != null && jArr2.length > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                jArr = this.f;
                if (i10 >= jArr.length) {
                    break;
                }
                i11 += Pb.c(jArr[i10]);
                i10++;
            }
            j = j + i11 + (jArr.length * 1);
        }
        long[] jArr3 = this.g;
        if (jArr3 == null || jArr3.length <= 0) {
            return j;
        }
        int i12 = 0;
        while (true) {
            long[] jArr4 = this.g;
            if (i >= jArr4.length) {
                return j + i12 + (jArr4.length * 1);
            }
            i12 += Pb.c(jArr4[i]);
            i++;
        }
    }

    public final /* synthetic */ Wb k() throws CloneNotSupportedException {
        return (ic) clone();
    }

    public final /* synthetic */ Rb l() throws CloneNotSupportedException {
        return (ic) clone();
    }
}
