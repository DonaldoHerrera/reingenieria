package com.google.android.gms.internal.firebase-perf;

public final class Db {
    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static int b(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(a(i, i2, "index"));
    }

    public static int a(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        String str2 = "index";
        if (i < 0) {
            str = ed.a("%s (%s) must not be negative", str2, Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            str = ed.a("%s (%s) must be less than size (%s)", str2, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    private static String a(int i, int i2, String str) {
        if (i < 0) {
            return ed.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return ed.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void a(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = a(i2, i3, "end index");
            } else {
                str = ed.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }
}
