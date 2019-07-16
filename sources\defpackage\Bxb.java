package defpackage;

/* renamed from: Bxb reason: default package */
/* compiled from: StringNumberConversions.kt */
class Bxb extends Axb {
    public static Byte a(String str, int i) {
        C7471uYa.b(str, "$this$toByteOrNull");
        Integer b = b(str, i);
        if (b != null) {
            int intValue = b.intValue();
            if (intValue >= -128 && intValue <= 127) {
                return Byte.valueOf((byte) intValue);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037 A[LOOP:0: B:18:0x0037->B:28:0x004f, LOOP_START, PHI: r2 r3 
  PHI: (r2v2 int) = (r2v0 int), (r2v4 int) binds: [B:17:0x0035, B:28:0x004f] A[DONT_GENERATE, DONT_INLINE]
  PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:17:0x0035, B:28:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059  */
    public static Integer b(String str, int i) {
        boolean z;
        int i2;
        int i3;
        C7471uYa.b(str, "$this$toIntOrNull");
        C6275cxb.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (charAt >= '0') {
            i2 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                i2 = 1;
                z = true;
                int i6 = i5 / i;
                i3 = length - 1;
                if (i2 <= i3) {
                    while (true) {
                        int a = C6275cxb.a(str.charAt(i2), i);
                        if (a >= 0 && i4 >= i6) {
                            int i7 = i4 * i;
                            if (i7 >= i5 + a) {
                                i4 = i7 - a;
                                if (i2 == i3) {
                                    break;
                                }
                                i2++;
                            } else {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                }
                return !z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
            } else if (charAt != '+') {
                return null;
            } else {
                i2 = 1;
            }
        }
        z = false;
        int i62 = i5 / i;
        i3 = length - 1;
        if (i2 <= i3) {
        }
        return !z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Integer c(String str) {
        C7471uYa.b(str, "$this$toIntOrNull");
        return b(str, 10);
    }

    public static Short d(String str, int i) {
        C7471uYa.b(str, "$this$toShortOrNull");
        Integer b = b(str, i);
        if (b != null) {
            int intValue = b.intValue();
            if (intValue >= -32768 && intValue <= 32767) {
                return Short.valueOf((short) intValue);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f A[LOOP:0: B:17:0x003f->B:29:0x0062, LOOP_START, PHI: r3 r4 r14 
  PHI: (r3v1 java.lang.Long) = (r3v0 java.lang.Long), (r3v3 java.lang.Long) binds: [B:16:0x003d, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]
  PHI: (r4v2 int) = (r4v1 int), (r4v4 int) binds: [B:16:0x003d, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]
  PHI: (r14v2 long) = (r14v0 long), (r14v4 long) binds: [B:16:0x003d, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    public static Long c(String str, int i) {
        boolean z;
        int i2;
        String str2 = str;
        int i3 = i;
        C7471uYa.b(str2, "$this$toLongOrNull");
        C6275cxb.a(i);
        int length = str.length();
        Long l = null;
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str2.charAt(0);
        long j = -9223372036854775807L;
        if (charAt < '0') {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i4 = 1;
                z = true;
                long j2 = (long) i3;
                long j3 = j / j2;
                long j4 = 0;
                i2 = length - 1;
                if (i4 <= i2) {
                    while (true) {
                        int a = C6275cxb.a(str2.charAt(i4), i3);
                        if (a >= 0 && j4 >= j3) {
                            long j5 = j4 * j2;
                            int i5 = i4;
                            long j6 = (long) a;
                            if (j5 >= j + j6) {
                                j4 = j5 - j6;
                                int i6 = i5;
                                if (i6 == i2) {
                                    break;
                                }
                                i4 = i6 + 1;
                                l = null;
                            } else {
                                return null;
                            }
                        } else {
                            return l;
                        }
                    }
                }
                return !z ? Long.valueOf(j4) : Long.valueOf(-j4);
            } else if (charAt != '+') {
                return null;
            } else {
                i4 = 1;
            }
        }
        z = false;
        long j22 = (long) i3;
        long j32 = j / j22;
        long j42 = 0;
        i2 = length - 1;
        if (i4 <= i2) {
        }
        return !z ? Long.valueOf(j42) : Long.valueOf(-j42);
    }
}
