package defpackage;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: I reason: default package */
/* compiled from: FastSafeIterableMap */
public class I<K, V> extends J<K, V> {
    private HashMap<K, c<K, V>> e = new HashMap<>();

    /* access modifiers changed from: protected */
    public c<K, V> a(K k) {
        return (c) this.e.get(k);
    }

    public V b(K k, V v) {
        c a = a(k);
        if (a != null) {
            return a.b;
        }
        this.e.put(k, a(k, v));
        return null;
    }

    public boolean contains(K k) {
        return this.e.containsKey(k);
    }

    public V remove(K k) {
        V remove = super.remove(k);
        this.e.remove(k);
        return remove;
    }

    public Entry<K, V> b(K k) {
        if (contains(k)) {
            return ((c) this.e.get(k)).d;
        }
        return null;
    }
}
