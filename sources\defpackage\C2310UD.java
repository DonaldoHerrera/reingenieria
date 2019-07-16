package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* renamed from: UD reason: default package and case insensitive filesystem */
/* compiled from: Platform */
final class C2310UD {
    static <K, V> Map<K, V> a(int i) {
        return C3139nD.b(i);
    }

    static <T> T[] a(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    static <T> T[] a(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }
}
