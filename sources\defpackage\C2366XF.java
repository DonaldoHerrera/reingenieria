package defpackage;

import java.util.Map;

/* renamed from: XF reason: default package and case insensitive filesystem */
/* compiled from: EAN8Writer */
public final class C2366XF extends C2952dG {
    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) throws C3046iF {
        if (_e == C2421_E.EAN_8) {
            return super.a(str, _e, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode EAN_8, but got ");
        sb.append(_e);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean[] a(String str) {
        if (str.length() == 8) {
            boolean[] zArr = new boolean[67];
            int a = C2441aG.a(zArr, 0, C2479cG.a, true) + 0;
            int i = 0;
            while (i <= 3) {
                int i2 = i + 1;
                a += C2441aG.a(zArr, a, C2479cG.d[Integer.parseInt(str.substring(i, i2))], false);
                i = i2;
            }
            int a2 = a + C2441aG.a(zArr, a, C2479cG.b, false);
            int i3 = 4;
            while (i3 <= 7) {
                int i4 = i3 + 1;
                a2 += C2441aG.a(zArr, a2, C2479cG.d[Integer.parseInt(str.substring(i3, i4))], true);
                i3 = i4;
            }
            C2441aG.a(zArr, a2, C2479cG.a, true);
            return zArr;
        }
        StringBuilder sb = new StringBuilder("Requested contents should be 8 digits long, but got ");
        sb.append(str.length());
        throw new IllegalArgumentException(sb.toString());
    }
}
