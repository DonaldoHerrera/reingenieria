package defpackage;

import java.util.Map;

/* renamed from: SF reason: default package and case insensitive filesystem */
/* compiled from: Code39Writer */
public final class C2274SF extends C2441aG {
    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) throws C3046iF {
        if (_e == C2421_E.CODE_39) {
            return super.a(str, _e, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode CODE_39, but got ");
        sb.append(_e);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean[] a(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int i = length + 25;
            int i2 = 0;
            while (true) {
                String str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%";
                if (i2 < length) {
                    int indexOf = str2.indexOf(str.charAt(i2));
                    if (indexOf >= 0) {
                        a(C2255RF.a[indexOf], iArr);
                        int i3 = i;
                        for (int i4 = 0; i4 < 9; i4++) {
                            i3 += iArr[i4];
                        }
                        i2++;
                        i = i3;
                    } else {
                        StringBuilder sb = new StringBuilder("Bad contents: ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    boolean[] zArr = new boolean[i];
                    a(C2255RF.b, iArr);
                    int a = C2441aG.a(zArr, 0, iArr, true);
                    int[] iArr2 = {1};
                    int a2 = a + C2441aG.a(zArr, a, iArr2, false);
                    for (int i5 = 0; i5 < length; i5++) {
                        a(C2255RF.a[str2.indexOf(str.charAt(i5))], iArr);
                        int a3 = a2 + C2441aG.a(zArr, a2, iArr, true);
                        a2 = a3 + C2441aG.a(zArr, a3, iArr2, false);
                    }
                    a(C2255RF.b, iArr);
                    C2441aG.a(zArr, a2, iArr, true);
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
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }
}
