package defpackage;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: _C reason: default package and case insensitive filesystem */
/* compiled from: AbstractListMultimap */
abstract class C2419_C<K, V> extends C2438aD<K, V> implements C2043GD<K, V> {
    protected C2419_C(Map<K, Collection<V>> map) {
        super(map);
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> a(K k, Collection<V> collection) {
        return a(k, (List) collection, null);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    public Map<K, Collection<V>> a() {
        return super.a();
    }

    public List<V> get(K k) {
        return (List) super.get(k);
    }
}
