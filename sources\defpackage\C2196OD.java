package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: OD reason: default package and case insensitive filesystem */
/* compiled from: Maps */
public final class C2196OD {

    /* renamed from: OD$a */
    /* compiled from: Maps */
    private enum a implements Function<Entry<?, ?>, Object> {
        VALUE
    }

    /* renamed from: OD$b */
    /* compiled from: Maps */
    static abstract class b<K, V> extends a<Entry<K, V>> {
        b() {
        }

        /* access modifiers changed from: 0000 */
        public abstract Map<K, V> c();

        public void clear() {
            c().clear();
        }

        public abstract boolean contains(Object obj);

        public boolean isEmpty() {
            return c().isEmpty();
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                Preconditions.checkNotNull(collection);
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                return C2458bE.a((Set<?>) this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                Preconditions.checkNotNull(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet a = C2458bE.a(collection.size());
                for (Object next : collection) {
                    if (contains(next)) {
                        a.add(((Entry) next).getKey());
                    }
                }
                return c().keySet().retainAll(a);
            }
        }

        public int size() {
            return c().size();
        }
    }

    /* renamed from: OD$c */
    /* compiled from: Maps */
    static class c<K, V> extends a<K> {
        @Weak
        final Map<K, V> a;

        c(Map<K, V> map) {
            Preconditions.checkNotNull(map);
            this.a = map;
        }

        /* access modifiers changed from: 0000 */
        public Map<K, V> c() {
            return this.a;
        }

        public boolean contains(Object obj) {
            return c().containsKey(obj);
        }

        public boolean isEmpty() {
            return c().isEmpty();
        }

        public int size() {
            return c().size();
        }
    }

    /* renamed from: OD$d */
    /* compiled from: Maps */
    static class d<K, V> extends AbstractCollection<V> {
        @Weak
        final Map<K, V> a;

        d(Map<K, V> map) {
            Preconditions.checkNotNull(map);
            this.a = map;
        }

        /* access modifiers changed from: 0000 */
        public final Map<K, V> c() {
            return this.a;
        }

        public void clear() {
            c().clear();
        }

        public boolean contains(Object obj) {
            return c().containsValue(obj);
        }

        public boolean isEmpty() {
            return c().isEmpty();
        }

        public Iterator<V> iterator() {
            return C2196OD.a(c().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Entry entry : c().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        c().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                Preconditions.checkNotNull(collection);
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet a2 = C2458bE.a();
                for (Entry entry : c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a2.add(entry.getKey());
                    }
                }
                return c().keySet().removeAll(a2);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                Preconditions.checkNotNull(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet a2 = C2458bE.a();
                for (Entry entry : c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a2.add(entry.getKey());
                    }
                }
                return c().keySet().retainAll(a2);
            }
        }

        public int size() {
            return c().size();
        }
    }

    /* renamed from: OD$e */
    /* compiled from: Maps */
    static abstract class e<K, V> extends AbstractMap<K, V> {
        private transient Set<Entry<K, V>> a;
        private transient Collection<V> b;

        e() {
        }

        /* access modifiers changed from: 0000 */
        public abstract Set<Entry<K, V>> a();

        /* access modifiers changed from: 0000 */
        public Collection<V> b() {
            return new d(this);
        }

        public Set<Entry<K, V>> entrySet() {
            Set<Entry<K, V>> set = this.a;
            if (set != null) {
                return set;
            }
            Set<Entry<K, V>> a2 = a();
            this.a = a2;
            return a2;
        }

        public Collection<V> values() {
            Collection<V> collection = this.b;
            if (collection != null) {
                return collection;
            }
            Collection<V> b2 = b();
            this.b = b2;
            return b2;
        }
    }

    static <V> Function<Entry<?, V>, V> a() {
        return a.VALUE;
    }

    static boolean b(Map<?, ?> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V c(Map<?, V> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V d(Map<?, V> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <K, V> Iterator<V> a(Iterator<Entry<K, V>> it) {
        return new C2139LD(it);
    }

    static int a(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : BaseClientBuilder.API_PRIORITY_OTHER;
        }
        C3044iD.a(i, "expectedSize");
        return i + 1;
    }

    public static <K, V> Entry<K, V> a(K k, V v) {
        return new C3306vD(k, v);
    }

    static boolean a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    static String a(Map<?, ?> map) {
        StringBuilder a2 = C3063jD.a(map.size());
        a2.append('{');
        boolean z = true;
        for (Entry entry : map.entrySet()) {
            if (!z) {
                a2.append(", ");
            }
            z = false;
            a2.append(entry.getKey());
            a2.append('=');
            a2.append(entry.getValue());
        }
        a2.append('}');
        return a2.toString();
    }
}
