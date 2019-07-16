package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

public final class lc extends Rb<lc> implements Cloneable {
    public boolean A;
    public long c = 0;
    public long d = 0;
    private long e = 0;
    private String f;
    public int g;
    private String h;
    private int i;
    private boolean j;
    private mc[] k;
    private byte[] l;
    private _b m;
    public byte[] n;
    private String o;
    private String p;
    private ic q;
    private String r;
    public long s;
    private jc t;
    public byte[] u;
    private String v;
    private int w;
    private int[] x;
    private long y;
    private ac z;

    public lc() {
        String str = "";
        this.f = str;
        this.g = 0;
        this.h = str;
        this.i = 0;
        this.j = false;
        this.k = mc.m();
        byte[] bArr = Zb.h;
        this.l = bArr;
        this.m = null;
        this.n = bArr;
        this.o = str;
        this.p = str;
        this.q = null;
        this.r = str;
        this.s = 180000;
        this.t = null;
        this.u = bArr;
        this.v = str;
        this.w = 0;
        this.x = Zb.a;
        this.y = 0;
        this.z = null;
        this.A = false;
        this.b = null;
        this.a = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final lc clone() {
        try {
            lc lcVar = (lc) super.clone();
            mc[] mcVarArr = this.k;
            if (mcVarArr != null && mcVarArr.length > 0) {
                lcVar.k = new mc[mcVarArr.length];
                int i2 = 0;
                while (true) {
                    mc[] mcVarArr2 = this.k;
                    if (i2 >= mcVarArr2.length) {
                        break;
                    }
                    if (mcVarArr2[i2] != null) {
                        lcVar.k[i2] = (mc) mcVarArr2[i2].clone();
                    }
                    i2++;
                }
            }
            _b _bVar = this.m;
            if (_bVar != null) {
                lcVar.m = _bVar;
            }
            ic icVar = this.q;
            if (icVar != null) {
                lcVar.q = (ic) icVar.clone();
            }
            jc jcVar = this.t;
            if (jcVar != null) {
                lcVar.t = (jc) jcVar.clone();
            }
            int[] iArr = this.x;
            if (iArr != null && iArr.length > 0) {
                lcVar.x = (int[]) iArr.clone();
            }
            ac acVar = this.z;
            if (acVar != null) {
                lcVar.z = acVar;
            }
            return lcVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void a(Pb pb) throws IOException {
        long j2 = this.c;
        if (j2 != 0) {
            pb.b(1, j2);
        }
        String str = this.f;
        String str2 = "";
        if (str != null && !str.equals(str2)) {
            pb.a(2, this.f);
        }
        mc[] mcVarArr = this.k;
        int i2 = 0;
        if (mcVarArr != null && mcVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                mc[] mcVarArr2 = this.k;
                if (i3 >= mcVarArr2.length) {
                    break;
                }
                mc mcVar = mcVarArr2[i3];
                if (mcVar != null) {
                    pb.a(3, (Wb) mcVar);
                }
                i3++;
            }
        }
        if (!Arrays.equals(this.l, Zb.h)) {
            pb.a(4, this.l);
        }
        if (!Arrays.equals(this.n, Zb.h)) {
            pb.a(6, this.n);
        }
        ic icVar = this.q;
        if (icVar != null) {
            pb.a(7, (Wb) icVar);
        }
        String str3 = this.o;
        if (str3 != null && !str3.equals(str2)) {
            pb.a(8, this.o);
        }
        _b _bVar = this.m;
        if (_bVar != null) {
            pb.a(9, (La) _bVar);
        }
        int i4 = this.g;
        if (i4 != 0) {
            pb.b(11, i4);
        }
        String str4 = this.p;
        if (str4 != null && !str4.equals(str2)) {
            pb.a(13, this.p);
        }
        String str5 = this.r;
        if (str5 != null && !str5.equals(str2)) {
            pb.a(14, this.r);
        }
        long j3 = this.s;
        if (j3 != 180000) {
            pb.a(15, 0);
            pb.b(Pb.a(j3));
        }
        jc jcVar = this.t;
        if (jcVar != null) {
            pb.a(16, (Wb) jcVar);
        }
        long j4 = this.d;
        if (j4 != 0) {
            pb.b(17, j4);
        }
        if (!Arrays.equals(this.u, Zb.h)) {
            pb.a(18, this.u);
        }
        int[] iArr = this.x;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.x;
                if (i2 >= iArr2.length) {
                    break;
                }
                pb.b(20, iArr2[i2]);
                i2++;
            }
        }
        ac acVar = this.z;
        if (acVar != null) {
            pb.a(23, (La) acVar);
        }
        String str6 = this.v;
        if (str6 != null && !str6.equals(str2)) {
            pb.a(24, this.v);
        }
        boolean z2 = this.A;
        if (z2) {
            pb.a(25, z2);
        }
        String str7 = this.h;
        if (str7 != null && !str7.equals(str2)) {
            pb.a(26, this.h);
        }
        super.a(pb);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj;
        if (this.c != lcVar.c || this.d != lcVar.d) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (lcVar.f != null) {
                return false;
            }
        } else if (!str.equals(lcVar.f)) {
            return false;
        }
        if (this.g != lcVar.g) {
            return false;
        }
        String str2 = this.h;
        if (str2 == null) {
            if (lcVar.h != null) {
                return false;
            }
        } else if (!str2.equals(lcVar.h)) {
            return false;
        }
        if (!Vb.a((Object[]) this.k, (Object[]) lcVar.k) || !Arrays.equals(this.l, lcVar.l)) {
            return false;
        }
        _b _bVar = this.m;
        if (_bVar == null) {
            if (lcVar.m != null) {
                return false;
            }
        } else if (!_bVar.equals(lcVar.m)) {
            return false;
        }
        if (!Arrays.equals(this.n, lcVar.n)) {
            return false;
        }
        String str3 = this.o;
        if (str3 == null) {
            if (lcVar.o != null) {
                return false;
            }
        } else if (!str3.equals(lcVar.o)) {
            return false;
        }
        String str4 = this.p;
        if (str4 == null) {
            if (lcVar.p != null) {
                return false;
            }
        } else if (!str4.equals(lcVar.p)) {
            return false;
        }
        ic icVar = this.q;
        if (icVar == null) {
            if (lcVar.q != null) {
                return false;
            }
        } else if (!icVar.equals(lcVar.q)) {
            return false;
        }
        String str5 = this.r;
        if (str5 == null) {
            if (lcVar.r != null) {
                return false;
            }
        } else if (!str5.equals(lcVar.r)) {
            return false;
        }
        if (this.s != lcVar.s) {
            return false;
        }
        jc jcVar = this.t;
        if (jcVar == null) {
            if (lcVar.t != null) {
                return false;
            }
        } else if (!jcVar.equals(lcVar.t)) {
            return false;
        }
        if (!Arrays.equals(this.u, lcVar.u)) {
            return false;
        }
        String str6 = this.v;
        if (str6 == null) {
            if (lcVar.v != null) {
                return false;
            }
        } else if (!str6.equals(lcVar.v)) {
            return false;
        }
        if (!Vb.a(this.x, lcVar.x)) {
            return false;
        }
        ac acVar = this.z;
        if (acVar == null) {
            if (lcVar.z != null) {
                return false;
            }
        } else if (!acVar.equals(lcVar.z)) {
            return false;
        }
        if (this.A != lcVar.A) {
            return false;
        }
        Tb tb = this.b;
        if (tb != null && !tb.i()) {
            return this.b.equals(lcVar.b);
        }
        Tb tb2 = lcVar.b;
        return tb2 == null || tb2.i();
    }

    public final int hashCode() {
        int hashCode = (lc.class.getName().hashCode() + 527) * 31;
        long j2 = this.c;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31 * 31;
        String str = this.f;
        int i4 = 0;
        int hashCode2 = (((i3 + (str == null ? 0 : str.hashCode())) * 31) + this.g) * 31;
        String str2 = this.h;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int i5 = 1237;
        int a = ((((((hashCode2 + hashCode3) * 31 * 31) + 1237) * 31) + Vb.a((Object[]) this.k)) * 31) + Arrays.hashCode(this.l);
        _b _bVar = this.m;
        int hashCode4 = ((((a * 31) + (_bVar == null ? 0 : _bVar.hashCode())) * 31) + Arrays.hashCode(this.n)) * 31;
        String str3 = this.o;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        int hashCode6 = hashCode5 + (str4 == null ? 0 : str4.hashCode());
        ic icVar = this.q;
        int hashCode7 = ((hashCode6 * 31) + (icVar == null ? 0 : icVar.hashCode())) * 31;
        String str5 = this.r;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        long j4 = this.s;
        int i6 = hashCode8 + ((int) (j4 ^ (j4 >>> 32)));
        jc jcVar = this.t;
        int hashCode9 = ((((i6 * 31) + (jcVar == null ? 0 : jcVar.hashCode())) * 31) + Arrays.hashCode(this.u)) * 31;
        String str6 = this.v;
        int hashCode10 = (((hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31 * 31) + Vb.a(this.x)) * 31;
        ac acVar = this.z;
        int hashCode11 = ((hashCode10 * 31) + (acVar == null ? 0 : acVar.hashCode())) * 31;
        if (this.A) {
            i5 = 1231;
        }
        int i7 = (hashCode11 + i5) * 31;
        Tb tb = this.b;
        if (tb != null && !tb.i()) {
            i4 = this.b.hashCode();
        }
        return i7 + i4;
    }

    /* access modifiers changed from: protected */
    public final int j() {
        int[] iArr;
        int j2 = super.j();
        long j3 = this.c;
        if (j3 != 0) {
            j2 += Pb.a(1, j3);
        }
        String str = this.f;
        String str2 = "";
        if (str != null && !str.equals(str2)) {
            j2 += Pb.b(2, this.f);
        }
        mc[] mcVarArr = this.k;
        int i2 = 0;
        if (mcVarArr != null && mcVarArr.length > 0) {
            int i3 = j2;
            int i4 = 0;
            while (true) {
                mc[] mcVarArr2 = this.k;
                if (i4 >= mcVarArr2.length) {
                    break;
                }
                mc mcVar = mcVarArr2[i4];
                if (mcVar != null) {
                    i3 += Pb.b(3, (Wb) mcVar);
                }
                i4++;
            }
            j2 = i3;
        }
        if (!Arrays.equals(this.l, Zb.h)) {
            j2 += Pb.b(4, this.l);
        }
        if (!Arrays.equals(this.n, Zb.h)) {
            j2 += Pb.b(6, this.n);
        }
        ic icVar = this.q;
        if (icVar != null) {
            j2 += Pb.b(7, (Wb) icVar);
        }
        String str3 = this.o;
        if (str3 != null && !str3.equals(str2)) {
            j2 += Pb.b(8, this.o);
        }
        _b _bVar = this.m;
        if (_bVar != null) {
            j2 += M.c(9, (La) _bVar);
        }
        int i5 = this.g;
        if (i5 != 0) {
            j2 += Pb.a(11) + Pb.b(i5);
        }
        String str4 = this.p;
        if (str4 != null && !str4.equals(str2)) {
            j2 += Pb.b(13, this.p);
        }
        String str5 = this.r;
        if (str5 != null && !str5.equals(str2)) {
            j2 += Pb.b(14, this.r);
        }
        long j4 = this.s;
        if (j4 != 180000) {
            j2 += Pb.a(15) + Pb.c(Pb.a(j4));
        }
        jc jcVar = this.t;
        if (jcVar != null) {
            j2 += Pb.b(16, (Wb) jcVar);
        }
        long j5 = this.d;
        if (j5 != 0) {
            j2 += Pb.a(17, j5);
        }
        if (!Arrays.equals(this.u, Zb.h)) {
            j2 += Pb.b(18, this.u);
        }
        int[] iArr2 = this.x;
        if (iArr2 != null && iArr2.length > 0) {
            int i6 = 0;
            while (true) {
                iArr = this.x;
                if (i2 >= iArr.length) {
                    break;
                }
                i6 += Pb.b(iArr[i2]);
                i2++;
            }
            j2 = j2 + i6 + (iArr.length * 2);
        }
        ac acVar = this.z;
        if (acVar != null) {
            j2 += M.c(23, (La) acVar);
        }
        String str6 = this.v;
        if (str6 != null && !str6.equals(str2)) {
            j2 += Pb.b(24, this.v);
        }
        if (this.A) {
            j2 += Pb.a(25) + 1;
        }
        String str7 = this.h;
        return (str7 == null || str7.equals(str2)) ? j2 : j2 + Pb.b(26, this.h);
    }

    public final /* synthetic */ Wb k() throws CloneNotSupportedException {
        return (lc) clone();
    }

    public final /* synthetic */ Rb l() throws CloneNotSupportedException {
        return (lc) clone();
    }
}
