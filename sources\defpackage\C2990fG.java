package defpackage;

import java.util.Map;

/* renamed from: fG reason: default package and case insensitive filesystem */
/* compiled from: UPCEWriter */
public final class C2990fG extends C2952dG {
    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) throws C3046iF {
        if (_e == C2421_E.UPC_E) {
            return super.a(str, _e, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode UPC_E, but got ");
        sb.append(_e);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean[] a(String str) {
        if (str.length() == 8) {
            int i = C2971eG.f[Integer.parseInt(str.substring(7, 8))];
            boolean[] zArr = new boolean[51];
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
            C2441aG.a(zArr, a, C2479cG.c, false);
            return zArr;
        }
        StringBuilder sb = new StringBuilder("Requested contents should be 8 digits long, but got ");
        sb.append(str.length());
        throw new IllegalArgumentException(sb.toString());
    }
}
