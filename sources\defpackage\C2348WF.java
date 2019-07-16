package defpackage;

import java.util.Map;

/* renamed from: WF reason: default package and case insensitive filesystem */
/* compiled from: EAN13Writer */
public final class C2348WF extends C2952dG {
    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) throws C3046iF {
        if (_e == C2421_E.EAN_13) {
            return super.a(str, _e, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode EAN_13, but got ");
        sb.append(_e);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean[] a(String str) {
        if (str.length() == 13) {
            try {
                if (C2479cG.a(str)) {
                    int i = C2330VF.f[Integer.parseInt(str.substring(0, 1))];
                    boolean[] zArr = new boolean[95];
                    int a = C2441aG.a(zArr, 0, C2479cG.a, true) + 0;
                    int i2 = 1;
                    while (i2 <= 6) {
                        int i3 = i2 + 1;
                        int parseInt = Integer.parseInt(str.substring(i2, i3));
                        if (((i >> (6 - i2)) & 1) == 1) {
                            parseInt += 10;
                        }
                        a += C2441aG.a(zArr, a, C2479cG.e[parseInt], false);
                        i2 = i3;
                    }
                    int a2 = a + C2441aG.a(zArr, a, C2479cG.b, false);
                    int i4 = 7;
                    while (i4 <= 12) {
                        int i5 = i4 + 1;
                        a2 += C2441aG.a(zArr, a2, C2479cG.d[Integer.parseInt(str.substring(i4, i5))], true);
                        i4 = i5;
                    }
                    C2441aG.a(zArr, a2, C2479cG.a, true);
                    return zArr;
                }
                throw new IllegalArgumentException("Contents do not pass checksum");
            } catch (C2478cF unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            StringBuilder sb = new StringBuilder("Requested contents should be 13 digits long, but got ");
            sb.append(str.length());
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
