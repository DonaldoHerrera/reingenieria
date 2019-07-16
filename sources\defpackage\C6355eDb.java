package defpackage;

/* renamed from: eDb reason: default package and case insensitive filesystem */
/* compiled from: Jdk8Methods */
public final class C6355eDb {
    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw new NullPointerException(sb.toString());
    }

    public static long b(long j, int i) {
        String str = " * ";
        String str2 = "Multiplication overflows a long: ";
        if (i != -1) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return j;
            }
            long j2 = (long) i;
            long j3 = j * j2;
            if (j3 / j2 == j) {
                return j3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(j);
            sb.append(str);
            sb.append(i);
            throw new ArithmeticException(sb.toString());
        } else if (j != Long.MIN_VALUE) {
            return -j;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(j);
            sb2.append(str);
            sb2.append(i);
            throw new ArithmeticException(sb2.toString());
        }
    }

    public static long c(long j, long j2) {
        return ((j % j2) + j2) % j2;
    }

    public static int d(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Addition overflows an int: ");
        sb.append(i);
        sb.append(" + ");
        sb.append(i2);
        throw new ArithmeticException(sb.toString());
    }

    public static int e(int i, int i2) {
        int i3 = i - i2;
        if ((i ^ i3) >= 0 || (i ^ i2) >= 0) {
            return i3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Subtraction overflows an int: ");
        sb.append(i);
        sb.append(" - ");
        sb.append(i2);
        throw new ArithmeticException(sb.toString());
    }

    public static long f(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Subtraction overflows a long: ");
        sb.append(j);
        sb.append(" - ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static boolean a(Object obj, Object obj2) {
        boolean z = false;
        if (obj == null) {
            if (obj2 == null) {
                z = true;
            }
            return z;
        } else if (obj2 == null) {
            return false;
        } else {
            return obj.equals(obj2);
        }
    }

    public static int c(int i, int i2) {
        return ((i % i2) + i2) % i2;
    }

    public static long d(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Addition overflows a long: ");
        sb.append(j);
        sb.append(" + ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static long e(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Multiplication overflows a long: ");
        sb.append(j);
        sb.append(" * ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static int a(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return (int) j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Calculation overflows an int: ");
        sb.append(j);
        throw new ArithmeticException(sb.toString());
    }

    public static int a(long j, int i) {
        long j2 = (long) i;
        return (int) (((j % j2) + j2) % j2);
    }

    public static long b(long j, long j2) {
        return j >= 0 ? j / j2 : ((j + 1) / j2) - 1;
    }

    public static int b(int i, int i2) {
        return i >= 0 ? i / i2 : ((i + 1) / i2) - 1;
    }
}
