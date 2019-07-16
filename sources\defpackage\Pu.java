package defpackage;

/* renamed from: Pu reason: default package */
public final class Pu {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static int a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i <= i2) {
            return i;
        }
        if (i < 0) {
            str2 = Uu.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            str2 = Uu.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }
}
