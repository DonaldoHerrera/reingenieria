package defpackage;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: PD reason: default package and case insensitive filesystem */
/* compiled from: Multimap */
public interface C2215PD<K, V> {
    Map<K, Collection<V>> a();

    @CanIgnoreReturnValue
    boolean a(K k, Iterable<? extends V> iterable);

    Collection<V> get(K k);

    Set<K> keySet();

    @CanIgnoreReturnValue
    boolean put(K k, V v);
}
