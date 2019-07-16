package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: eWa reason: default package and case insensitive filesystem */
/* compiled from: _ArraysJvm.kt */
class C6374eWa extends C5710cWa {
    public static <T> List<T> a(T[] tArr) {
        C7471uYa.b(tArr, "$this$asList");
        List<T> a = C6646iWa.a(tArr);
        C7471uYa.a((Object) a, "ArraysUtilJVM.asList(this)");
        return a;
    }

    public static final <T> void b(T[] tArr) {
        C7471uYa.b(tArr, "$this$sort");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static List<Integer> a(int[] iArr) {
        C7471uYa.b(iArr, "$this$asList");
        return new C6306dWa(iArr);
    }

    public static <T> T[] a(T[] tArr, int i, int i2) {
        C7471uYa.b(tArr, "$this$copyOfRangeImpl");
        C5642bWa.a(i2, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
        C7471uYa.a((Object) copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final <T> void a(T[] tArr, Comparator<? super T> comparator) {
        C7471uYa.b(tArr, "$this$sortWith");
        C7471uYa.b(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
