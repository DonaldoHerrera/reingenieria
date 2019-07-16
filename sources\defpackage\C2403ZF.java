package defpackage;

import java.util.Map;

/* renamed from: ZF reason: default package and case insensitive filesystem */
/* compiled from: ITFWriter */
public final class C2403ZF extends C2441aG {
    private static final int[] a = {1, 1, 1, 1};
    private static final int[] b = {3, 1, 1};

    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) throws C3046iF {
        if (_e == C2421_E.ITF) {
            return super.a(str, _e, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode ITF, but got ");
        sb.append(_e);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean[] a(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int a2 = C2441aG.a(zArr, 0, a, true);
            for (int i = 0; i < length; i += 2) {
                int digit = Character.digit(str.charAt(i), 10);
                int digit2 = Character.digit(str.charAt(i + 1), 10);
                int[] iArr = new int[18];
                for (int i2 = 0; i2 < 5; i2++) {
                    int i3 = i2 * 2;
                    int[][] iArr2 = C2384YF.d;
                    iArr[i3] = iArr2[digit][i2];
                    iArr[i3 + 1] = iArr2[digit2][i2];
                }
                a2 += C2441aG.a(zArr, a2, iArr, true);
            }
            C2441aG.a(zArr, a2, b, true);
            return zArr;
        } else {
            StringBuilder sb = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
