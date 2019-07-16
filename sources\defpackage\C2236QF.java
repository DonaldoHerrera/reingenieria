package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: QF reason: default package and case insensitive filesystem */
/* compiled from: Code128Writer */
public final class C2236QF extends C2441aG {

    /* renamed from: QF$a */
    /* compiled from: Code128Writer */
    private enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) throws C3046iF {
        if (_e == C2421_E.CODE_128) {
            return super.a(str, _e, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode CODE_128, but got ");
        sb.append(_e);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean[] a(String str) {
        int i;
        int length = str.length();
        if (length <= 0 || length > 80) {
            StringBuilder sb = new StringBuilder("Contents length should be between 1 and 80 characters, but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < ' ' || charAt > '~') {
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder("Bad character in input: ");
                        sb2.append(charAt);
                        throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i4 < length) {
            int a2 = a(str, i4, i6);
            int i8 = 100;
            if (a2 == i6) {
                switch (str.charAt(i4)) {
                    case 241:
                        i8 = 102;
                        break;
                    case 242:
                        i8 = 97;
                        break;
                    case 243:
                        i8 = 96;
                        break;
                    case 244:
                        break;
                    default:
                        if (i6 != 100) {
                            i8 = Integer.parseInt(str.substring(i4, i4 + 2));
                            i4++;
                            break;
                        } else {
                            i8 = str.charAt(i4) - ' ';
                            break;
                        }
                }
                i4++;
            } else {
                i = i6 == 0 ? a2 == 100 ? 104 : 105 : a2;
                i6 = a2;
            }
            arrayList.add(C2217PF.a[i]);
            i5 += i * i7;
            if (i4 != 0) {
                i7++;
            }
        }
        arrayList.add(C2217PF.a[i5 % 103]);
        arrayList.add(C2217PF.a[106]);
        int i9 = 0;
        for (int[] iArr : arrayList) {
            int i10 = i9;
            for (int i11 : (int[]) r12.next()) {
                i10 += i11;
            }
            i9 = i10;
        }
        boolean[] zArr = new boolean[i9];
        for (int[] a3 : arrayList) {
            i2 += C2441aG.a(zArr, i2, a3, true);
        }
        return zArr;
    }

    private static a a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return a.ONE_DIGIT;
        }
        return a.TWO_DIGITS;
    }

    private static int a(CharSequence charSequence, int i, int i2) {
        a a2;
        a a3 = a(charSequence, i);
        if (!(a3 == a.UNCODABLE || a3 == a.ONE_DIGIT)) {
            if (i2 == 99) {
                return i2;
            }
            if (i2 != 100) {
                if (a3 == a.FNC_1) {
                    a3 = a(charSequence, i + 1);
                }
                if (a3 == a.TWO_DIGITS) {
                    return 99;
                }
            } else if (a3 == a.FNC_1) {
                return i2;
            } else {
                a a4 = a(charSequence, i + 2);
                if (a4 == a.UNCODABLE || a4 == a.ONE_DIGIT) {
                    return i2;
                }
                if (a4 == a.FNC_1) {
                    return a(charSequence, i + 3) == a.TWO_DIGITS ? 99 : 100;
                }
                int i3 = i + 4;
                while (true) {
                    a2 = a(charSequence, i3);
                    if (a2 != a.TWO_DIGITS) {
                        break;
                    }
                    i3 += 2;
                }
                return a2 == a.ONE_DIGIT ? 100 : 99;
            }
        }
        return 100;
    }
}
