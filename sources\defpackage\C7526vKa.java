package defpackage;

import com.google.common.base.Function;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vKa reason: default package and case insensitive filesystem */
/* compiled from: Maps */
public final class C7526vKa {
    public static <K, V> Map<K, V> a(Collection<V> collection, Function<V, K> function) {
        HashMap hashMap = new HashMap();
        for (Object next : collection) {
            hashMap.put(function.apply(next), next);
        }
        return hashMap;
    }
}
