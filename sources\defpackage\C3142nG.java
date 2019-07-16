package defpackage;

import com.google.common.base.Ascii;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

/* renamed from: nG reason: default package and case insensitive filesystem */
/* compiled from: PDF417HighLevelEncoder */
final class C3142nG {
    private static final byte[] a = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 38, Ascii.CR, 9, 44, 58, 35, Framer.STDIN_FRAME_PREFIX, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    private static final byte[] b = {59, 60, 62, 64, 91, 92, 93, Framer.STDIN_REQUEST_FRAME_PREFIX, 96, 126, Framer.ENTER_FRAME_PREFIX, Ascii.CR, 9, 44, 58, 10, Framer.STDIN_FRAME_PREFIX, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    private static final byte[] c = new byte[128];
    private static final byte[] d = new byte[128];
    private static final Charset e = Charset.forName("ISO-8859-1");

    static {
        Arrays.fill(c, -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = a;
            if (i2 >= bArr.length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 > 0) {
                c[b2] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(d, -1);
        while (true) {
            byte[] bArr2 = b;
            if (i < bArr2.length) {
                byte b3 = bArr2[i];
                if (b3 > 0) {
                    d[b3] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    static String a(String str, C3066jG jGVar, Charset charset) throws C3046iF {
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = e;
        } else if (!e.equals(charset)) {
            C3288uF a2 = C3288uF.a(charset.name());
            if (a2 != null) {
                a(a2.a(), sb);
            }
        }
        int length = str.length();
        if (jGVar == C3066jG.TEXT) {
            a((CharSequence) str, 0, length, sb, 0);
        } else if (jGVar == C3066jG.BYTE) {
            byte[] bytes = str.getBytes(charset);
            a(bytes, 0, bytes.length, 1, sb);
        } else if (jGVar == C3066jG.NUMERIC) {
            sb.append(902);
            a(str, 0, length, sb);
        } else {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int a3 = a((CharSequence) str, i);
                if (a3 >= 13) {
                    sb.append(902);
                    i3 = 2;
                    a(str, i, a3, sb);
                    i += a3;
                    i2 = 0;
                } else {
                    int b2 = b(str, i);
                    if (b2 >= 5 || a3 == length) {
                        if (i3 != 0) {
                            sb.append(900);
                            i2 = 0;
                            i3 = 0;
                        }
                        i2 = a((CharSequence) str, i, b2, sb, i2);
                        i += b2;
                    } else {
                        int a4 = a(str, i, charset);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        int i4 = a4 + i;
                        byte[] bytes2 = str.substring(i, i4).getBytes(charset);
                        if (bytes2.length == 1 && i3 == 0) {
                            a(bytes2, 0, 1, 0, sb);
                        } else {
                            a(bytes2, 0, bytes2.length, i3, sb);
                            i2 = 0;
                            i3 = 1;
                        }
                        i = i4;
                    }
                }
            }
        }
        return sb.toString();
    }

    private static boolean a(char c2) {
        return c2 == ' ' || (c2 >= 'a' && c2 <= 'z');
    }

    private static int b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && c(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
            if (i3 < 13) {
                if (i3 <= 0) {
                    if (!f(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            } else {
                return (i2 - i) - i3;
            }
        }
        return i2 - i;
    }

    private static boolean b(char c2) {
        return c2 == ' ' || (c2 >= 'A' && c2 <= 'Z');
    }

    private static boolean c(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean d(char c2) {
        return c[c2] != -1;
    }

    private static boolean e(char c2) {
        return d[c2] != -1;
    }

    private static boolean f(char c2) {
        return c2 == 9 || c2 == 10 || c2 == 13 || (c2 >= ' ' && c2 <= '~');
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6 A[EDGE_INSN: B:68:0x00f6->B:53:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0011 A[SYNTHETIC] */
    private static int a(CharSequence charSequence, int i, int i2, StringBuilder sb, int i3) {
        CharSequence charSequence2 = charSequence;
        int i4 = i2;
        StringBuilder sb2 = sb;
        StringBuilder sb3 = new StringBuilder(i4);
        int i5 = i3;
        int i6 = 0;
        while (true) {
            int i7 = i + i6;
            char charAt = charSequence2.charAt(i7);
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (e(charAt)) {
                            sb3.append((char) d[charAt]);
                        } else {
                            sb3.append(29);
                        }
                    } else if (d(charAt)) {
                        sb3.append((char) c[charAt]);
                    } else if (b(charAt)) {
                        sb3.append(28);
                    } else if (a(charAt)) {
                        sb3.append(27);
                    } else {
                        int i8 = i7 + 1;
                        if (i8 >= i4 || !e(charSequence2.charAt(i8))) {
                            sb3.append(29);
                            sb3.append((char) d[charAt]);
                        } else {
                            i5 = 3;
                            sb3.append(25);
                        }
                    }
                    i5 = 0;
                } else if (a(charAt)) {
                    if (charAt == ' ') {
                        sb3.append(26);
                    } else {
                        sb3.append((char) (charAt - 'a'));
                    }
                } else if (b(charAt)) {
                    sb3.append(27);
                    sb3.append((char) (charAt - 'A'));
                } else if (d(charAt)) {
                    sb3.append(28);
                    i5 = 2;
                } else {
                    sb3.append(29);
                    sb3.append((char) d[charAt]);
                }
                i6++;
                if (i6 < i4) {
                    break;
                }
            } else {
                if (b(charAt)) {
                    if (charAt == ' ') {
                        sb3.append(26);
                    } else {
                        sb3.append((char) (charAt - 'A'));
                    }
                } else if (a(charAt)) {
                    sb3.append(27);
                } else if (d(charAt)) {
                    sb3.append(28);
                    i5 = 2;
                } else {
                    sb3.append(29);
                    sb3.append((char) d[charAt]);
                }
                i6++;
                if (i6 < i4) {
                }
            }
            i5 = 1;
        }
        int length = sb3.length();
        char c2 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            if (i9 % 2 != 0) {
                c2 = (char) ((c2 * 30) + sb3.charAt(i9));
                sb2.append(c2);
            } else {
                c2 = sb3.charAt(i9);
            }
        }
        if (length % 2 != 0) {
            sb2.append((char) ((c2 * 30) + 29));
        }
        return i5;
    }

    private static void a(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append(913);
        } else if (i2 % 6 == 0) {
            sb.append(924);
        } else {
            sb.append(901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    private static void a(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    private static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (c(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    private static int a(String str, int i, Charset charset) throws C3046iF {
        CharsetEncoder newEncoder = charset.newEncoder();
        int length = str.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && c(charAt)) {
                i3++;
                int i4 = i2 + i3;
                if (i4 >= length) {
                    break;
                }
                charAt = str.charAt(i4);
            }
            if (i3 >= 13) {
                return i2 - i;
            }
            char charAt2 = str.charAt(i2);
            if (newEncoder.canEncode(charAt2)) {
                i2++;
            } else {
                StringBuilder sb = new StringBuilder("Non-encodable character detected: ");
                sb.append(charAt2);
                sb.append(" (Unicode: ");
                sb.append(charAt2);
                sb.append(')');
                throw new C3046iF(sb.toString());
            }
        }
        return i2 - i;
    }

    private static void a(int i, StringBuilder sb) throws C3046iF {
        if (i >= 0 && i < 900) {
            sb.append(927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append(926);
            sb.append((char) ((i / 900) - 1));
            sb.append((char) (i % 900));
        } else if (i < 811800) {
            sb.append(925);
            sb.append((char) (810900 - i));
        } else {
            StringBuilder sb2 = new StringBuilder("ECI number not in valid range from 0..811799, but was ");
            sb2.append(i);
            throw new C3046iF(sb2.toString());
        }
    }
}
