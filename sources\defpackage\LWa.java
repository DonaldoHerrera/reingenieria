package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: LWa reason: default package */
/* compiled from: Maps.kt */
class LWa extends KWa {
    public static <K, V> Map<K, V> a() {
        AWa aWa = AWa.a;
        if (aWa != null) {
            return aWa;
        }
        throw new OVa("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    public static <K, V> Map<K, V> b(HVa<? extends K, ? extends V>... hVaArr) {
        C7471uYa.b(hVaArr, "pairs");
        if (hVaArr.length <= 0) {
            return a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(hVaArr.length));
        a(hVaArr, (M) linkedHashMap);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> c(HVa<? extends K, ? extends V>... hVaArr) {
        C7471uYa.b(hVaArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(hVaArr.length));
        a((Map<? super K, ? super V>) linkedHashMap, hVaArr);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> d(Map<? extends K, ? extends V> map) {
        C7471uYa.b(map, "$this$toMutableMap");
        return new LinkedHashMap(map);
    }

    public static <K, V> HashMap<K, V> a(HVa<? extends K, ? extends V>... hVaArr) {
        C7471uYa.b(hVaArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(a(hVaArr.length));
        a((Map<? super K, ? super V>) hashMap, hVaArr);
        return hashMap;
    }

    public static <K, V> V b(Map<K, ? extends V> map, K k) {
        C7471uYa.b(map, "$this$getValue");
        return JWa.a(map, k);
    }

    public static <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        C7471uYa.b(map, "$this$toMap");
        int size = map.size();
        if (size == 0) {
            return a();
        }
        if (size != 1) {
            return d(map);
        }
        return KWa.a(map);
    }

    public static int a(int i) {
        if (i < 3) {
            return i + 1;
        }
        return i < 1073741824 ? i + (i / 3) : BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static <K, V> void b(Map<? super K, ? super V> map, Iterable<? extends HVa<? extends K, ? extends V>> iterable) {
        C7471uYa.b(map, "$this$putAll");
        C7471uYa.b(iterable, "pairs");
        for (HVa hVa : iterable) {
            map.put(hVa.a(), hVa.b());
        }
    }

    public static final <K, V> void a(Map<? super K, ? super V> map, HVa<? extends K, ? extends V>[] hVaArr) {
        C7471uYa.b(map, "$this$putAll");
        C7471uYa.b(hVaArr, "pairs");
        for (HVa<? extends K, ? extends V> hVa : hVaArr) {
            map.put(hVa.a(), hVa.b());
        }
    }

    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map) {
        C7471uYa.b(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        if (size == 0) {
            return a();
        }
        if (size != 1) {
            return map;
        }
        return KWa.a(map);
    }

    public static <K, V> Map<K, V> a(Iterable<? extends HVa<? extends K, ? extends V>> iterable) {
        Map<K, V> map;
        C7471uYa.b(iterable, "$this$toMap");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                map = a();
            } else if (size != 1) {
                map = new LinkedHashMap<>(a(collection.size()));
                a(iterable, (M) map);
            } else {
                map = KWa.a((HVa) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
            }
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(iterable, (M) linkedHashMap);
        return b((Map<K, ? extends V>) linkedHashMap);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M a(Iterable<? extends HVa<? extends K, ? extends V>> iterable, M m) {
        C7471uYa.b(iterable, "$this$toMap");
        C7471uYa.b(m, "destination");
        b((Map<? super K, ? super V>) m, iterable);
        return m;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M a(HVa<? extends K, ? extends V>[] hVaArr, M m) {
        C7471uYa.b(hVaArr, "$this$toMap");
        C7471uYa.b(m, "destination");
        a((Map<? super K, ? super V>) m, hVaArr);
        return m;
    }

    public static <K, V> Map<K, V> a(Map<? extends K, ? extends V> map, Iterable<? extends HVa<? extends K, ? extends V>> iterable) {
        C7471uYa.b(map, "$this$plus");
        C7471uYa.b(iterable, "pairs");
        if (map.isEmpty()) {
            return a(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        b((Map<? super K, ? super V>) linkedHashMap, iterable);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> a(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        C7471uYa.b(map, "$this$plus");
        C7471uYa.b(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }
}
