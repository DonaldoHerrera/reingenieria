package defpackage;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: gG reason: default package and case insensitive filesystem */
/* compiled from: PDF417Writer */
public final class C3009gG implements C3027hF {
    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) throws C3046iF {
        int i3;
        int i4;
        if (_e == C2421_E.PDF_417) {
            C3104lG lGVar = new C3104lG();
            int i5 = 30;
            int i6 = 2;
            if (map != null) {
                if (map.containsKey(C2459bF.PDF417_COMPACT)) {
                    lGVar.a(Boolean.valueOf(map.get(C2459bF.PDF417_COMPACT).toString()).booleanValue());
                }
                if (map.containsKey(C2459bF.PDF417_COMPACTION)) {
                    lGVar.a(C3066jG.valueOf(map.get(C2459bF.PDF417_COMPACTION).toString()));
                }
                if (map.containsKey(C2459bF.PDF417_DIMENSIONS)) {
                    C3085kG kGVar = (C3085kG) map.get(C2459bF.PDF417_DIMENSIONS);
                    lGVar.a(kGVar.a(), kGVar.c(), kGVar.b(), kGVar.d());
                }
                if (map.containsKey(C2459bF.MARGIN)) {
                    i5 = Integer.parseInt(map.get(C2459bF.MARGIN).toString());
                }
                if (map.containsKey(C2459bF.ERROR_CORRECTION)) {
                    i6 = Integer.parseInt(map.get(C2459bF.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(C2459bF.CHARACTER_SET)) {
                    lGVar.a(Charset.forName(map.get(C2459bF.CHARACTER_SET).toString()));
                }
                i3 = i5;
                i4 = i6;
            } else {
                i4 = 2;
                i3 = 30;
            }
            return a(lGVar, str, i4, i, i2, i3);
        }
        StringBuilder sb = new StringBuilder("Can only encode PDF_417, but got ");
        sb.append(_e);
        throw new IllegalArgumentException(sb.toString());
    }

    private static C3268tF a(C3104lG lGVar, String str, int i, int i2, int i3, int i4) throws C3046iF {
        boolean z;
        lGVar.a(str, i);
        byte[][] a = lGVar.a().a(1, 4);
        if ((i3 > i2) ^ (a[0].length < a.length)) {
            a = a(a);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / a[0].length;
        int length2 = i3 / a.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return a(a, i4);
        }
        byte[][] a2 = lGVar.a().a(length, length << 2);
        if (z) {
            a2 = a(a2);
        }
        return a(a2, i4);
    }

    private static C3268tF a(byte[][] bArr, int i) {
        int i2 = i * 2;
        C3268tF tFVar = new C3268tF(bArr[0].length + i2, bArr.length + i2);
        tFVar.i();
        int j = (tFVar.j() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr[i3][i4] == 1) {
                    tFVar.b(i4 + i, j);
                }
            }
            i3++;
            j--;
        }
        return tFVar;
    }

    private static byte[][] a(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, new int[]{bArr[0].length, bArr.length});
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }
}
