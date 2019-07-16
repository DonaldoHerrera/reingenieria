package defpackage;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* renamed from: SD reason: default package and case insensitive filesystem */
/* compiled from: ObjectArrays */
public final class C2272SD {
    @CanIgnoreReturnValue
    static Object[] a(Object... objArr) {
        a(objArr, objArr.length);
        return objArr;
    }

    public static <T> T[] b(T[] tArr, int i) {
        return C2310UD.a(tArr, i);
    }

    @CanIgnoreReturnValue
    static Object[] a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }

    @CanIgnoreReturnValue
    static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
