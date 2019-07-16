package com.google.android.gms.internal.firebase-perf;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public abstract class yd<K, V> implements Serializable, Map<K, V> {
    private static final Entry<?, ?>[] a = new Entry[0];
    private transient Ad<Entry<K, V>> b;
    private transient Ad<K> c;
    private transient td<V> d;

    yd() {
    }

    public static <K, V> yd<K, V> a() {
        return Cd.e;
    }

    /* access modifiers changed from: 0000 */
    public abstract Ad<Entry<K, V>> b();

    /* access modifiers changed from: 0000 */
    public abstract Ad<K> c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return ((td) values()).contains(obj);
    }

    /* access modifiers changed from: 0000 */
    public abstract td<V> d();

    /* access modifiers changed from: 0000 */
    public abstract boolean e();

    public /* synthetic */ Set entrySet() {
        Ad<Entry<K, V>> ad = this.b;
        if (ad != null) {
            return ad;
        }
        Ad<Entry<K, V>> b2 = b();
        this.b = b2;
        return b2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return C0844h.a((Ad) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        Ad<K> ad = this.c;
        if (ad != null) {
            return ad;
        }
        Ad<K> c2 = c();
        this.c = c2;
        return c2;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        rd.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ Collection values() {
        td<V> tdVar = this.d;
        if (tdVar != null) {
            return tdVar;
        }
        td<V> d2 = d();
        this.d = d2;
        return d2;
    }

    public static <K, V> yd<K, V> a(Map<? extends K, ? extends V> map) {
        if (!(map instanceof yd) || (map instanceof SortedMap)) {
            Set entrySet = map.entrySet();
            Bd bd = new Bd(entrySet instanceof Collection ? entrySet.size() : 4);
            bd.a((Iterable<? extends Entry<? extends K, ? extends V>>) entrySet);
            return bd.a();
        }
        yd<K, V> ydVar = (yd) map;
        ydVar.e();
        return ydVar;
    }
}
