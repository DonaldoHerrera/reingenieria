package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: Fj reason: default package */
/* compiled from: JobPreconditions */
public final class Fj {
    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static long b(long j, String str) {
        if (j > 0) {
            return j;
        }
        throw new IllegalArgumentException(str);
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T extends CharSequence> T a(T t) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException();
    }

    public static int a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static long a(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str);
    }

    public static long a(long j, long j2, long j3, String str) {
        if (j < j2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)}));
        } else if (j <= j3) {
            return j;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }
}
