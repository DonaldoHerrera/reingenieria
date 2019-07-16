package defpackage;

import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: jF reason: default package and case insensitive filesystem */
/* compiled from: AztecWriter */
public final class C3065jF implements C3027hF {
    private static final Charset a = Charset.forName("ISO-8859-1");

    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) {
        int i3;
        int i4;
        Charset charset;
        Charset charset2 = a;
        int i5 = 33;
        if (map != null) {
            if (map.containsKey(C2459bF.CHARACTER_SET)) {
                charset2 = Charset.forName(map.get(C2459bF.CHARACTER_SET).toString());
            }
            if (map.containsKey(C2459bF.ERROR_CORRECTION)) {
                i5 = Integer.parseInt(map.get(C2459bF.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(C2459bF.AZTEC_LAYERS)) {
                charset = charset2;
                i4 = i5;
                i3 = Integer.parseInt(map.get(C2459bF.AZTEC_LAYERS).toString());
                return a(str, _e, i, i2, charset, i4, i3);
            }
            charset = charset2;
            i4 = i5;
        } else {
            charset = charset2;
            i4 = 33;
        }
        i3 = 0;
        return a(str, _e, i, i2, charset, i4, i3);
    }

    private static C3268tF a(String str, C2421_E _e, int i, int i2, Charset charset, int i3, int i4) {
        if (_e == C2421_E.AZTEC) {
            return a(C3122mF.a(str.getBytes(charset), i3, i4), i, i2);
        }
        StringBuilder sb = new StringBuilder("Can only encode AZTEC, but got ");
        sb.append(_e);
        throw new IllegalArgumentException(sb.toString());
    }

    private static C3268tF a(C3084kF kFVar, int i, int i2) {
        C3268tF a2 = kFVar.a();
        if (a2 != null) {
            int k = a2.k();
            int j = a2.j();
            int max = Math.max(i, k);
            int max2 = Math.max(i2, j);
            int min = Math.min(max / k, max2 / j);
            int i3 = (max - (k * min)) / 2;
            int i4 = (max2 - (j * min)) / 2;
            C3268tF tFVar = new C3268tF(max, max2);
            int i5 = 0;
            while (i5 < j) {
                int i6 = i3;
                int i7 = 0;
                while (i7 < k) {
                    if (a2.a(i7, i5)) {
                        tFVar.a(i6, i4, min, min);
                    }
                    i7++;
                    i6 += min;
                }
                i5++;
                i4 += min;
            }
            return tFVar;
        }
        throw new IllegalStateException();
    }
}
