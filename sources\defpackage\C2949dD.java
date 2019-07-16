package defpackage;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: dD reason: default package and case insensitive filesystem */
/* compiled from: AbstractMultimap */
abstract class C2949dD<K, V> implements C2215PD<K, V> {
    private transient Set<K> a;
    private transient Map<K, Collection<V>> b;

    C2949dD() {
    }

    @CanIgnoreReturnValue
    public boolean a(K k, Iterable<? extends V> iterable) {
        Preconditions.checkNotNull(iterable);
        boolean z = true;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || !get(k).addAll(collection)) {
                z = false;
            }
            return z;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext() || !C2023FD.a(get(k), it)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public abstract Map<K, Collection<V>> b();

    /* access modifiers changed from: 0000 */
    public abstract Set<K> c();

    public boolean equals(Object obj) {
        return C2234QD.a(this, obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public Set<K> keySet() {
        Set<K> set = this.a;
        if (set != null) {
            return set;
        }
        Set<K> c = c();
        this.a = c;
        return c;
    }

    public String toString() {
        return a().toString();
    }

    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.b;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> b2 = b();
        this.b = b2;
        return b2;
    }
}
