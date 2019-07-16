package defpackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: SWa reason: default package */
/* compiled from: Sets.kt */
class SWa extends RWa {
    public static <T> Set<T> a() {
        return BWa.a;
    }

    public static <T> LinkedHashSet<T> b(T... tArr) {
        C7471uYa.b(tArr, "elements");
        LinkedHashSet<T> linkedHashSet = new LinkedHashSet<>(LWa.a(tArr.length));
        C6578hWa.b(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> c(T... tArr) {
        C7471uYa.b(tArr, "elements");
        return tArr.length > 0 ? C6578hWa.l(tArr) : a();
    }

    public static <T> HashSet<T> a(T... tArr) {
        C7471uYa.b(tArr, "elements");
        HashSet<T> hashSet = new HashSet<>(LWa.a(tArr.length));
        C6578hWa.b(tArr, hashSet);
        return hashSet;
    }

    public static final <T> Set<T> a(Set<? extends T> set) {
        C7471uYa.b(set, "$this$optimizeReadOnlySet");
        int size = set.size();
        if (size == 0) {
            return a();
        }
        if (size != 1) {
            return set;
        }
        return RWa.a(set.iterator().next());
    }
}
