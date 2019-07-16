package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: TWa reason: default package */
/* compiled from: _Sets.kt */
class TWa extends SWa {
    public static <T> Set<T> a(Set<? extends T> set, T t) {
        C7471uYa.b(set, "$this$minus");
        LinkedHashSet linkedHashSet = new LinkedHashSet(LWa.a(set.size()));
        boolean z = false;
        for (Object next : set) {
            boolean z2 = true;
            if (!z && C7471uYa.a(next, (Object) t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> b(Set<? extends T> set, T t) {
        C7471uYa.b(set, "$this$plus");
        LinkedHashSet linkedHashSet = new LinkedHashSet(LWa.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    public static <T> Set<T> a(Set<? extends T> set, Iterable<? extends T> iterable) {
        C7471uYa.b(set, "$this$minus");
        C7471uYa.b(iterable, "elements");
        Collection a = C6986nWa.a(iterable, (Iterable<? extends T>) set);
        if (a.isEmpty()) {
            return C7676xWa.t(set);
        }
        if (a instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object next : set) {
                if (!a.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(a);
        return linkedHashSet2;
    }

    public static <T> Set<T> b(Set<? extends T> set, Iterable<? extends T> iterable) {
        int i;
        C7471uYa.b(set, "$this$plus");
        C7471uYa.b(iterable, "elements");
        Integer a = C6986nWa.a(iterable);
        if (a != null) {
            i = set.size() + a.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(LWa.a(i));
        linkedHashSet.addAll(set);
        C7331sWa.a((Collection) linkedHashSet, (Iterable) iterable);
        return linkedHashSet;
    }
}
