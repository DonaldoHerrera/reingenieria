package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: ovb reason: default package and case insensitive filesystem */
/* compiled from: collections.kt */
public final class C7089ovb {
    public static final <K> Map<K, Integer> a(Iterable<? extends K> iterable) {
        C7471uYa.b(iterable, "$this$mapToIndex");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object put : iterable) {
            linkedHashMap.put(put, Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    public static final <E> HashSet<E> b(int i) {
        return new HashSet<>(d(i));
    }

    public static final <E> LinkedHashSet<E> c(int i) {
        return new LinkedHashSet<>(d(i));
    }

    private static final int d(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    public static final <T> void a(Collection<T> collection, T t) {
        C7471uYa.b(collection, "$this$addIfNotNull");
        if (t != null) {
            collection.add(t);
        }
    }

    public static final <K, V> HashMap<K, V> a(int i) {
        return new HashMap<>(d(i));
    }

    public static final <T> List<T> a(ArrayList<T> arrayList) {
        C7471uYa.b(arrayList, "$this$compact");
        int size = arrayList.size();
        if (size == 0) {
            return C6918mWa.a();
        }
        if (size == 1) {
            return C6850lWa.a(C7676xWa.f((List<? extends T>) arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
