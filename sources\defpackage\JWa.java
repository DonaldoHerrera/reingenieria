package defpackage;

import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: JWa reason: default package */
/* compiled from: MapWithDefault.kt */
class JWa {
    public static final <K, V> V a(Map<K, ? extends V> map, K k) {
        C7471uYa.b(map, "$this$getOrImplicitDefault");
        if (map instanceof HWa) {
            return ((HWa) map).a(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Key ");
        sb.append(k);
        sb.append(" is missing in the map.");
        throw new NoSuchElementException(sb.toString());
    }
}
