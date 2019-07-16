package com.google.android.gms.internal.clearcut;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

final class Gb extends Db {
    Gb() {
    }

    private static int a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return Cb.b(i);
        }
        if (i2 == 1) {
            return Cb.b(i, Ab.a(bArr, j));
        }
        if (i2 == 2) {
            return Cb.b(i, (int) Ab.a(bArr, j), (int) Ab.a(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b9, code lost:
        return -1;
     */
    public final int a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        long j;
        long j2;
        byte[] bArr2 = bArr;
        int i5 = i2;
        int i6 = i3;
        if ((i5 | i6 | (bArr2.length - i6)) >= 0) {
            long j3 = (long) i5;
            int i7 = (int) (((long) i6) - j3);
            if (i7 >= 16) {
                long j4 = j3;
                i4 = 0;
                while (true) {
                    if (i4 >= i7) {
                        i4 = i7;
                        break;
                    }
                    long j5 = j4 + 1;
                    if (Ab.a(bArr2, j4) < 0) {
                        break;
                    }
                    i4++;
                    j4 = j5;
                }
            } else {
                i4 = 0;
            }
            int i8 = i7 - i4;
            long j6 = j3 + ((long) i4);
            while (true) {
                byte b = 0;
                while (true) {
                    if (i8 <= 0) {
                        j = j6;
                        break;
                    }
                    j = j6 + 1;
                    b = Ab.a(bArr2, j6);
                    if (b < 0) {
                        break;
                    }
                    i8--;
                    j6 = j;
                }
                if (i8 == 0) {
                    return 0;
                }
                int i9 = i8 - 1;
                if (b >= -32) {
                    if (b >= -16) {
                        if (i9 >= 3) {
                            i8 = i9 - 3;
                            long j7 = j + 1;
                            byte a = Ab.a(bArr2, j);
                            if (a > -65 || (((b << Ascii.FS) + (a + 112)) >> 30) != 0) {
                                break;
                            }
                            long j8 = j7 + 1;
                            if (Ab.a(bArr2, j7) > -65) {
                                break;
                            }
                            j2 = j8 + 1;
                            if (Ab.a(bArr2, j8) > -65) {
                                break;
                            }
                        } else {
                            return a(bArr2, (int) b, j, i9);
                        }
                    } else if (i9 >= 2) {
                        i8 = i9 - 2;
                        long j9 = j + 1;
                        byte a2 = Ab.a(bArr2, j);
                        if (a2 > -65 || ((b == -32 && a2 < -96) || (b == -19 && a2 >= -96))) {
                            break;
                        }
                        long j10 = j9 + 1;
                        if (Ab.a(bArr2, j9) > -65) {
                            break;
                        }
                        j6 = j10;
                    } else {
                        return a(bArr2, (int) b, j, i9);
                    }
                } else if (i9 != 0) {
                    i8 = i9 - 1;
                    if (b < -62) {
                        break;
                    }
                    j2 = j + 1;
                    if (Ab.a(bArr2, j) > -65) {
                        break;
                    }
                } else {
                    return b;
                }
                j6 = j2;
            }
            return -1;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    /* access modifiers changed from: 0000 */
    public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        CharSequence charSequence2 = charSequence;
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        long j4 = (long) i3;
        long j5 = ((long) i4) + j4;
        int length = charSequence.length();
        String str = " at index ";
        String str2 = "Failed writing ";
        if (length > i4 || bArr2.length - i4 < i3) {
            char charAt = charSequence2.charAt(length - 1);
            int i5 = i3 + i4;
            StringBuilder sb = new StringBuilder(37);
            sb.append(str2);
            sb.append(charAt);
            sb.append(str);
            sb.append(i5);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i6 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i6 >= length) {
                break;
            }
            char charAt2 = charSequence2.charAt(i6);
            if (charAt2 >= 128) {
                break;
            }
            long j6 = 1 + j4;
            Ab.a(bArr2, j4, (byte) charAt2);
            i6++;
            j4 = j6;
        }
        if (i6 == length) {
            return (int) j4;
        }
        while (i6 < length) {
            char charAt3 = charSequence2.charAt(i6);
            if (charAt3 < c && j4 < j5) {
                long j7 = j4 + j;
                Ab.a(bArr2, j4, (byte) charAt3);
                j3 = j;
                j2 = j7;
            } else if (charAt3 < 2048 && j4 <= j5 - 2) {
                long j8 = j4 + j;
                Ab.a(bArr2, j4, (byte) ((charAt3 >>> 6) | 960));
                long j9 = j8 + j;
                Ab.a(bArr2, j8, (byte) ((charAt3 & '?') | 128));
                j2 = j9;
                j3 = j;
                i6++;
                c = 128;
                long j10 = j3;
                j4 = j2;
                j = j10;
            } else if ((charAt3 < 55296 || 57343 < charAt3) && j4 <= j5 - 3) {
                long j11 = j4 + j;
                Ab.a(bArr2, j4, (byte) ((charAt3 >>> 12) | 480));
                long j12 = j11 + j;
                Ab.a(bArr2, j11, (byte) (((charAt3 >>> 6) & 63) | 128));
                long j13 = j12 + 1;
                Ab.a(bArr2, j12, (byte) ((charAt3 & '?') | 128));
                j2 = j13;
                j3 = 1;
            } else if (j4 <= j5 - 4) {
                int i7 = i6 + 1;
                if (i7 != length) {
                    char charAt4 = charSequence2.charAt(i7);
                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                        long j14 = j4 + 1;
                        Ab.a(bArr2, j4, (byte) ((codePoint >>> 18) | 240));
                        long j15 = j14 + 1;
                        Ab.a(bArr2, j14, (byte) (((codePoint >>> 12) & 63) | 128));
                        long j16 = j15 + 1;
                        Ab.a(bArr2, j15, (byte) (((codePoint >>> 6) & 63) | 128));
                        j3 = 1;
                        j2 = j16 + 1;
                        Ab.a(bArr2, j16, (byte) ((codePoint & 63) | 128));
                        i6 = i7;
                        i6++;
                        c = 128;
                        long j102 = j3;
                        j4 = j2;
                        j = j102;
                    } else {
                        i6 = i7;
                    }
                }
                throw new Fb(i6 - 1, length);
            } else {
                if (55296 <= charAt3 && charAt3 <= 57343) {
                    int i8 = i6 + 1;
                    if (i8 == length || !Character.isSurrogatePair(charAt3, charSequence2.charAt(i8))) {
                        throw new Fb(i6, length);
                    }
                }
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append(str2);
                sb2.append(charAt3);
                sb2.append(str);
                sb2.append(j4);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            i6++;
            c = 128;
            long j1022 = j3;
            j4 = j2;
            j = j1022;
        }
        return (int) j4;
    }

    /* access modifiers changed from: 0000 */
    public final void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j;
        char c;
        int i;
        long j2;
        CharSequence charSequence2 = charSequence;
        ByteBuffer byteBuffer2 = byteBuffer;
        long a = Ab.a(byteBuffer);
        long position = ((long) byteBuffer.position()) + a;
        long limit = ((long) byteBuffer.limit()) + a;
        int length = charSequence.length();
        String str = " at index ";
        String str2 = "Failed writing ";
        if (((long) length) <= limit - position) {
            int i2 = 0;
            while (true) {
                c = 128;
                if (i2 >= length) {
                    break;
                }
                char charAt = charSequence2.charAt(i2);
                if (charAt >= 128) {
                    break;
                }
                long j3 = j + 1;
                Ab.a(j, (byte) charAt);
                i2++;
                position = j3;
            }
            if (i2 == length) {
                i = (int) (j - a);
            } else {
                while (i2 < length) {
                    char charAt2 = charSequence2.charAt(i2);
                    if (charAt2 < c && j < limit) {
                        long j4 = j + 1;
                        Ab.a(j, (byte) charAt2);
                        j = j4;
                        j2 = a;
                    } else if (charAt2 >= 2048 || j > limit - 2) {
                        j2 = a;
                        if ((charAt2 < 55296 || 57343 < charAt2) && j <= limit - 3) {
                            long j5 = j + 1;
                            Ab.a(j, (byte) ((charAt2 >>> 12) | 480));
                            long j6 = j5 + 1;
                            Ab.a(j5, (byte) (((charAt2 >>> 6) & 63) | 128));
                            long j7 = j6 + 1;
                            Ab.a(j6, (byte) ((charAt2 & '?') | 128));
                            j = j7;
                        } else if (j <= limit - 4) {
                            int i3 = i2 + 1;
                            if (i3 != length) {
                                char charAt3 = charSequence2.charAt(i3);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j8 = j + 1;
                                    Ab.a(j, (byte) ((codePoint >>> 18) | 240));
                                    long j9 = j8 + 1;
                                    Ab.a(j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j10 = j9 + 1;
                                    Ab.a(j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                    long j11 = j10 + 1;
                                    Ab.a(j10, (byte) ((codePoint & 63) | 128));
                                    i2 = i3;
                                    j = j11;
                                }
                            } else {
                                i3 = i2;
                            }
                            throw new Fb(i3 - 1, length);
                        } else {
                            if (55296 <= charAt2 && charAt2 <= 57343) {
                                int i4 = i2 + 1;
                                if (i4 == length || !Character.isSurrogatePair(charAt2, charSequence2.charAt(i4))) {
                                    throw new Fb(i2, length);
                                }
                            }
                            StringBuilder sb = new StringBuilder(46);
                            sb.append(str2);
                            sb.append(charAt2);
                            sb.append(str);
                            sb.append(j);
                            throw new ArrayIndexOutOfBoundsException(sb.toString());
                        }
                    } else {
                        j2 = a;
                        long j12 = j + 1;
                        Ab.a(j, (byte) ((charAt2 >>> 6) | 960));
                        long j13 = j12 + 1;
                        Ab.a(j12, (byte) ((charAt2 & '?') | 128));
                        j = j13;
                    }
                    i2++;
                    ByteBuffer byteBuffer3 = byteBuffer;
                    a = j2;
                    c = 128;
                }
                i = (int) (j - a);
                byteBuffer2 = byteBuffer;
            }
            byteBuffer2.position(i);
            return;
        }
        char charAt4 = charSequence2.charAt(length - 1);
        int limit2 = byteBuffer.limit();
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append(str2);
        sb2.append(charAt4);
        sb2.append(str);
        sb2.append(limit2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
}
