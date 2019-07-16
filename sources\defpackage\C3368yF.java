package defpackage;

import java.util.Map;

/* renamed from: yF reason: default package and case insensitive filesystem */
/* compiled from: DataMatrixWriter */
public final class C3368yF implements C3027hF {
    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) {
        C2440aF aFVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (_e != C2421_E.DATA_MATRIX) {
            StringBuilder sb = new StringBuilder("Can only encode DATA_MATRIX, but got ");
            sb.append(_e);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb2 = new StringBuilder("Requested dimensions are too small: ");
            sb2.append(i);
            sb2.append('x');
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            C2122KF kf = C2122KF.FORCE_NONE;
            C2440aF aFVar2 = null;
            if (map != null) {
                C2122KF kf2 = (C2122KF) map.get(C2459bF.DATA_MATRIX_SHAPE);
                if (kf2 != null) {
                    kf = kf2;
                }
                aFVar = (C2440aF) map.get(C2459bF.MIN_SIZE);
                if (aFVar == null) {
                    aFVar = null;
                }
                C2440aF aFVar3 = (C2440aF) map.get(C2459bF.MAX_SIZE);
                if (aFVar3 != null) {
                    aFVar2 = aFVar3;
                }
            } else {
                aFVar = null;
            }
            String a = C2084IF.a(str, kf, aFVar, aFVar2);
            C2103JF a2 = C2103JF.a(a.length(), kf, aFVar, aFVar2, true);
            C1985DF df = new C1985DF(C2065HF.a(a, a2), a2.e(), a2.d());
            df.a();
            return a(df, a2);
        }
    }

    private static C3268tF a(C1985DF df, C2103JF jf) {
        int e = jf.e();
        int d = jf.d();
        C3269tG tGVar = new C3269tG(jf.g(), jf.f());
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            if (i2 % jf.g == 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < jf.g(); i4++) {
                    tGVar.a(i3, i, i4 % 2 == 0);
                    i3++;
                }
                i++;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < e; i6++) {
                if (i6 % jf.f == 0) {
                    tGVar.a(i5, i, true);
                    i5++;
                }
                tGVar.a(i5, i, df.a(i6, i2));
                i5++;
                int i7 = jf.f;
                if (i6 % i7 == i7 - 1) {
                    tGVar.a(i5, i, i2 % 2 == 0);
                    i5++;
                }
            }
            i++;
            int i8 = jf.g;
            if (i2 % i8 == i8 - 1) {
                int i9 = 0;
                for (int i10 = 0; i10 < jf.g(); i10++) {
                    tGVar.a(i9, i, true);
                    i9++;
                }
                i++;
            }
        }
        return a(tGVar);
    }

    private static C3268tF a(C3269tG tGVar) {
        int c = tGVar.c();
        int b = tGVar.b();
        C3268tF tFVar = new C3268tF(c, b);
        tFVar.i();
        for (int i = 0; i < c; i++) {
            for (int i2 = 0; i2 < b; i2++) {
                if (tGVar.a(i, i2) == 1) {
                    tFVar.b(i, i2);
                }
            }
        }
        return tFVar;
    }
}
