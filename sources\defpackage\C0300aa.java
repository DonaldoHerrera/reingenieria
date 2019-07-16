package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: aa reason: default package and case insensitive filesystem */
/* compiled from: MapCollections */
abstract class C0300aa<K, V> {
    b a;
    c b;
    e c;

    /* renamed from: aa$a */
    /* compiled from: MapCollections */
    final class a<T> implements Iterator<T> {
        final int a;
        int b;
        int c;
        boolean d = false;

        a(int i) {
            this.a = i;
            this.b = C0300aa.this.c();
        }

        public boolean hasNext() {
            return this.c < this.b;
        }

        public T next() {
            if (hasNext()) {
                T a2 = C0300aa.this.a(this.c, this.a);
                this.c++;
                this.d = true;
                return a2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.d) {
                this.c--;
                this.b--;
                this.d = false;
                C0300aa.this.a(this.c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: aa$b */
    /* compiled from: MapCollections */
    final class b implements Set<Entry<K, V>> {
        b() {
        }

        public boolean a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            a((Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int c = C0300aa.this.c();
            for (Entry entry : collection) {
                C0300aa.this.a(entry.getKey(), entry.getValue());
            }
            return c != C0300aa.this.c();
        }

        public void clear() {
            C0300aa.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a2 = C0300aa.this.a(entry.getKey());
            if (a2 < 0) {
                return false;
            }
            return X.a(C0300aa.this.a(a2, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C0300aa.a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int c = C0300aa.this.c() - 1; c >= 0; c--) {
                Object a2 = C0300aa.this.a(c, 0);
                Object a3 = C0300aa.this.a(c, 1);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                if (a3 == null) {
                    i2 = 0;
                } else {
                    i2 = a3.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return C0300aa.this.c() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C0300aa.this.c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: aa$c */
    /* compiled from: MapCollections */
    final class c implements Set<K> {
        c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0300aa.this.a();
        }

        public boolean contains(Object obj) {
            return C0300aa.this.a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0300aa.a(C0300aa.this.b(), collection);
        }

        public boolean equals(Object obj) {
            return C0300aa.a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int c = C0300aa.this.c() - 1; c >= 0; c--) {
                Object a2 = C0300aa.this.a(c, 0);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return C0300aa.this.c() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int a2 = C0300aa.this.a(obj);
            if (a2 < 0) {
                return false;
            }
            C0300aa.this.a(a2);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0300aa.b(C0300aa.this.b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0300aa.c(C0300aa.this.b(), collection);
        }

        public int size() {
            return C0300aa.this.c();
        }

        public Object[] toArray() {
            return C0300aa.this.b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0300aa.this.a(tArr, 0);
        }
    }

    /* renamed from: aa$d */
    /* compiled from: MapCollections */
    final class d implements Iterator<Entry<K, V>>, Entry<K, V> {
        int a;
        int b;
        boolean c = false;

        d() {
            this.a = C0300aa.this.c() - 1;
            this.b = -1;
        }

        public boolean equals(Object obj) {
            if (this.c) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (X.a(entry.getKey(), C0300aa.this.a(this.b, 0)) && X.a(entry.getValue(), C0300aa.this.a(this.b, 1))) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.c) {
                return C0300aa.this.a(this.b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.c) {
                return C0300aa.this.a(this.b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.b < this.a;
        }

        public int hashCode() {
            int i;
            if (this.c) {
                int i2 = 0;
                Object a2 = C0300aa.this.a(this.b, 0);
                Object a3 = C0300aa.this.a(this.b, 1);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                if (a3 != null) {
                    i2 = a3.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.c) {
                C0300aa.this.a(this.b);
                this.b--;
                this.a--;
                this.c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.c) {
                return C0300aa.this.a(this.b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public Entry<K, V> next() {
            if (hasNext()) {
                this.b++;
                this.c = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: aa$e */
    /* compiled from: MapCollections */
    final class e implements Collection<V> {
        e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0300aa.this.a();
        }

        public boolean contains(Object obj) {
            return C0300aa.this.b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0300aa.this.c() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int b = C0300aa.this.b(obj);
            if (b < 0) {
                return false;
            }
            C0300aa.this.a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int c = C0300aa.this.c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (collection.contains(C0300aa.this.a(i, 1))) {
                    C0300aa.this.a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int c = C0300aa.this.c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (!collection.contains(C0300aa.this.a(i, 1))) {
                    C0300aa.this.a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C0300aa.this.c();
        }

        public Object[] toArray() {
            return C0300aa.this.b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0300aa.this.a(tArr, 1);
        }
    }

    C0300aa() {
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    public abstract int a(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract V a(int i, V v);

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    /* access modifiers changed from: protected */
    public abstract void a(K k, V v);

    /* access modifiers changed from: protected */
    public abstract int b(Object obj);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> b();

    /* access modifiers changed from: protected */
    public abstract int c();

    public Set<Entry<K, V>> d() {
        if (this.a == null) {
            this.a = new b<>();
        }
        return this.a;
    }

    public Set<K> e() {
        if (this.b == null) {
            this.b = new c<>();
        }
        return this.b;
    }

    public Collection<V> f() {
        if (this.c == null) {
            this.c = new e<>();
        }
        return this.c;
    }

    public <T> T[] a(T[] tArr, int i) {
        int c2 = c();
        if (tArr.length < c2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c2);
        }
        for (int i2 = 0; i2 < c2; i2++) {
            tArr[i2] = a(i2, i);
        }
        if (tArr.length > c2) {
            tArr[c2] = null;
        }
        return tArr;
    }

    public Object[] b(int i) {
        int c2 = c();
        Object[] objArr = new Object[c2];
        for (int i2 = 0; i2 < c2; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
