package defpackage;

import java.util.Map;

/* renamed from: oG reason: default package and case insensitive filesystem */
/* compiled from: QRCodeWriter */
public final class C3171oG implements C3027hF {
    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) throws C3046iF {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (_e != C2421_E.QR_CODE) {
            StringBuilder sb = new StringBuilder("Can only encode QR_CODE, but got ");
            sb.append(_e);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb2 = new StringBuilder("Requested dimensions are too small: ");
            sb2.append(i);
            sb2.append('x');
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            C3190pG pGVar = C3190pG.L;
            int i3 = 4;
            if (map != null) {
                if (map.containsKey(C2459bF.ERROR_CORRECTION)) {
                    pGVar = C3190pG.valueOf(map.get(C2459bF.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(C2459bF.MARGIN)) {
                    i3 = Integer.parseInt(map.get(C2459bF.MARGIN).toString());
                }
            }
            return a(C3309vG.a(str, pGVar, map), i, i2, i3);
        }
    }

    private static C3268tF a(C3369yG yGVar, int i, int i2, int i3) {
        C3269tG a = yGVar.a();
        if (a != null) {
            int c = a.c();
            int b = a.b();
            int i4 = i3 << 1;
            int i5 = c + i4;
            int i6 = i4 + b;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (c * min)) / 2;
            int i8 = (max2 - (b * min)) / 2;
            C3268tF tFVar = new C3268tF(max, max2);
            int i9 = 0;
            while (i9 < b) {
                int i10 = i7;
                int i11 = 0;
                while (i11 < c) {
                    if (a.a(i11, i9) == 1) {
                        tFVar.a(i10, i8, min, min);
                    }
                    i11++;
                    i10 += min;
                }
                i9++;
                i8 += min;
            }
            return tFVar;
        }
        throw new IllegalStateException();
    }
}
