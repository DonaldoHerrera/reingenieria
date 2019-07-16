package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: KWa reason: default package */
/* compiled from: MapsJVM.kt */
class KWa extends JWa {
    public static <K, V> Map<K, V> a(HVa<? extends K, ? extends V> hVa) {
        C7471uYa.b(hVa, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(hVa.c(), hVa.d());
        C7471uYa.a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    public static <K, V> SortedMap<K, V> a(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        C7471uYa.b(map, "$this$toSortedMap");
        C7471uYa.b(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    public static final <K, V> Map<K, V> a(Map<? extends K, ? extends V> map) {
        C7471uYa.b(map, "$this$toSingletonMap");
        Entry entry = (Entry) map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C7471uYa.a((Object) singletonMap, "java.util.Collections.singletonMap(key, value)");
        C7471uYa.a((Object) singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
