package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: T reason: default package */
/* compiled from: ArrayMap */
public class T<K, V> extends C0485ba<K, V> implements Map<K, V> {
    C0300aa<K, V> h;

    public T() {
    }

    private C0300aa<K, V> b() {
        if (this.h == null) {
            this.h = new S(this);
        }
        return this.h;
    }

    public boolean a(Collection<?> collection) {
        return C0300aa.c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return b().d();
    }

    public Set<K> keySet() {
        return b().e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.g + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return b().f();
    }

    public T(int i) {
        super(i);
    }

    public T(C0485ba baVar) {
        super(baVar);
    }
}
