package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: lWa reason: default package and case insensitive filesystem */
/* compiled from: CollectionsJVM.kt */
class C6850lWa {
    public static <T> List<T> a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C7471uYa.a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public static final <T> Object[] a(T[] tArr, boolean z) {
        C7471uYa.b(tArr, "$this$copyToArrayOfAny");
        if (z && C7471uYa.a((Object) tArr.getClass(), (Object) Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C7471uYa.a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
