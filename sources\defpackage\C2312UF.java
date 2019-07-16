package defpackage;

import java.util.Map;

/* renamed from: UF reason: default package and case insensitive filesystem */
/* compiled from: Code93Writer */
public class C2312UF extends C2441aG {
    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) throws C3046iF {
        if (_e == C2421_E.CODE_93) {
            return super.a(str, _e, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode CODE_93, but got ");
        sb.append(_e);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean[] a(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[(((str.length() + 2 + 2) * 9) + 1)];
            a(C2293TF.b[47], iArr);
            int i = 0;
            int a = a(zArr, 0, iArr, true);
            while (true) {
                String str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
                if (i < length) {
                    a(C2293TF.b[str2.indexOf(str.charAt(i))], iArr);
                    a += a(zArr, a, iArr, true);
                    i++;
                } else {
                    int a2 = a(str, 20);
                    a(C2293TF.b[a2], iArr);
                    int a3 = a + a(zArr, a, iArr, true);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2.charAt(a2));
                    a(C2293TF.b[a(sb.toString(), 15)], iArr);
                    int a4 = a3 + a(zArr, a3, iArr, true);
                    a(C2293TF.b[47], iArr);
                    zArr[a4 + a(zArr, a4, iArr, true)] = true;
                    return zArr;
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static void a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    protected static int a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = i;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i2 + 1;
            zArr[i2] = iArr[i3] != 0;
            i3++;
            i2 = i4;
        }
        return 9;
    }

    private static int a(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }
}
