package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;

/* renamed from: IF reason: default package and case insensitive filesystem */
/* compiled from: HighLevelEncoder */
public final class C2084IF {
    private static char a(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }

    static boolean b(char c) {
        return c >= '0' && c <= '9';
    }

    static boolean c(char c) {
        return c >= 128 && c <= 255;
    }

    private static boolean d(char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    private static boolean e(char c) {
        return c >= ' ' && c <= '^';
    }

    private static boolean f(char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }

    private static boolean g(char c) {
        return i(c) || c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    private static boolean h(char c) {
        return false;
    }

    private static boolean i(char c) {
        return c == 13 || c == '*' || c == '>';
    }

    public static String a(String str, C2122KF kf, C2440aF aFVar, C2440aF aFVar2) {
        int i = 0;
        C2025FF[] ffArr = {new C3388zF(), new C1945BF(), new C2141LF(), new C2160MF(), new C2005EF(), new C1925AF()};
        C2045GF gf = new C2045GF(str);
        gf.a(kf);
        gf.a(aFVar, aFVar2);
        String str2 = "\u001e\u0004";
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith(str2)) {
            gf.a(236);
            gf.a(2);
            gf.f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith(str2)) {
            gf.a(237);
            gf.a(2);
            gf.f += 7;
        }
        while (gf.h()) {
            ffArr[i].a(gf);
            if (gf.e() >= 0) {
                i = gf.e();
                gf.i();
            }
        }
        int a = gf.a();
        gf.k();
        int a2 = gf.g().a();
        if (!(a >= a2 || i == 0 || i == 5)) {
            gf.a(254);
        }
        StringBuilder b = gf.b();
        if (b.length() < a2) {
            b.append(129);
        }
        while (b.length() < a2) {
            b.append(a(129, b.length() + 1));
        }
        return gf.b().toString();
    }

    static int a(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        if (i3 >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i3 + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int a = a(fArr, iArr, (int) BaseClientBuilder.API_PRIORITY_OTHER, bArr);
                int a2 = a(bArr);
                if (iArr[0] == a) {
                    return 0;
                }
                if (a2 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (a2 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (a2 != 1 || bArr[2] <= 0) {
                    return (a2 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i5);
            i4++;
            if (b(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (c(charAt)) {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (d(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (c(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (f(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (c(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (g(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (c(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (e(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (c(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (h(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                a(fArr, iArr2, (int) BaseClientBuilder.API_PRIORITY_OTHER, bArr2);
                int a3 = a(bArr2);
                if (iArr2[0] < iArr2[c] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] >= iArr2[0] && bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] != 0) {
                    if (a3 == 1 && bArr2[4] > 0) {
                        return 4;
                    }
                    if (a3 == 1 && bArr2[2] > 0) {
                        return 2;
                    }
                    if (a3 == 1 && bArr2[3] > 0) {
                        return 3;
                    }
                    if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                        if (iArr2[1] < iArr2[3]) {
                            return 1;
                        }
                        if (iArr2[1] == iArr2[3]) {
                            int i6 = i3 + i4 + 1;
                            while (i6 < charSequence.length()) {
                                char charAt2 = charSequence2.charAt(i6);
                                if (!i(charAt2)) {
                                    if (!g(charAt2)) {
                                        break;
                                    }
                                    i6++;
                                } else {
                                    return 3;
                                }
                            }
                            return 1;
                        }
                    }
                }
            }
        }
        return 5;
    }

    private static int a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, 0);
        int i2 = i;
        for (int i3 = 0; i3 < 6; i3++) {
            iArr[i3] = (int) Math.ceil((double) fArr[i3]);
            int i4 = iArr[i3];
            if (i2 > i4) {
                Arrays.fill(bArr, 0);
                i2 = i4;
            }
            if (i2 == i4) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    private static int a(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    public static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (b(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    static void a(char c) {
        String hexString = Integer.toHexString(c);
        StringBuilder sb = new StringBuilder();
        sb.append("0000".substring(0, 4 - hexString.length()));
        sb.append(hexString);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("Illegal character: ");
        sb3.append(c);
        sb3.append(" (0x");
        sb3.append(sb2);
        sb3.append(')');
        throw new IllegalArgumentException(sb3.toString());
    }
}
