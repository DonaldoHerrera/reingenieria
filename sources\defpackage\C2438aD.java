package defpackage;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: aD reason: default package and case insensitive filesystem */
/* compiled from: AbstractMapBasedMultimap */
abstract class C2438aD<K, V> extends C2949dD<K, V> implements Serializable {
    /* access modifiers changed from: private */
    public transient Map<K, Collection<V>> c;
    /* access modifiers changed from: private */
    public transient int d;

    /* renamed from: aD$a */
    /* compiled from: AbstractMapBasedMultimap */
    private class a extends e<K, Collection<V>> {
        final transient Map<K, Collection<V>> c;

        /* renamed from: aD$a$a reason: collision with other inner class name */
        /* compiled from: AbstractMapBasedMultimap */
        class C0052a extends b<K, Collection<V>> {
            C0052a() {
            }

            /* access modifiers changed from: 0000 */
            public Map<K, Collection<V>> c() {
                return a.this;
            }

            public boolean contains(Object obj) {
                return C3063jD.a((Collection<?>) a.this.c.entrySet(), obj);
            }

            public Iterator<Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C2438aD.this.b(((Entry) obj).getKey());
                return true;
            }
        }

        /* renamed from: aD$a$b */
        /* compiled from: AbstractMapBasedMultimap */
        class b implements Iterator<Entry<K, Collection<V>>> {
            final Iterator<Entry<K, Collection<V>>> a = a.this.c.entrySet().iterator();
            Collection<V> b;

            b() {
            }

            public boolean hasNext() {
                return this.a.hasNext();
            }

            public void remove() {
                C3044iD.a(this.b != null);
                this.a.remove();
                C2438aD aDVar = C2438aD.this;
                aDVar.d = aDVar.d - this.b.size();
                this.b.clear();
                this.b = null;
            }

            public Entry<K, Collection<V>> next() {
                Entry entry = (Entry) this.a.next();
                this.b = (Collection) entry.getValue();
                return a.this.a(entry);
            }
        }

        a(Map<K, Collection<V>> map) {
            this.c = map;
        }

        /* access modifiers changed from: protected */
        public Set<Entry<K, Collection<V>>> a() {
            return new C0052a();
        }

        public void clear() {
            if (this.c == C2438aD.this.c) {
                C2438aD.this.d();
            } else {
                C2023FD.b(new b());
            }
        }

        public boolean containsKey(Object obj) {
            return C2196OD.b(this.c, obj);
        }

        public boolean equals(Object obj) {
            return this == obj || this.c.equals(obj);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public Set<K> keySet() {
            return C2438aD.this.keySet();
        }

        public int size() {
            return this.c.size();
        }

        public String toString() {
            return this.c.toString();
        }

        /* access modifiers changed from: 0000 */
        public Entry<K, Collection<V>> a(Entry<K, Collection<V>> entry) {
            Object key = entry.getKey();
            return C2196OD.a(key, C2438aD.this.a(key, (Collection) entry.getValue()));
        }

        public Collection<V> get(Object obj) {
            Collection collection = (Collection) C2196OD.c(this.c, obj);
            if (collection == null) {
                return null;
            }
            return C2438aD.this.a(obj, collection);
        }

        public Collection<V> remove(Object obj) {
            Collection collection = (Collection) this.c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> e = C2438aD.this.e();
            e.addAll(collection);
            C2438aD aDVar = C2438aD.this;
            aDVar.d = aDVar.d - collection.size();
            collection.clear();
            return e;
        }
    }

    /* renamed from: aD$b */
    /* compiled from: AbstractMapBasedMultimap */
    private class b extends c<K, Collection<V>> {
        b(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            C2023FD.b(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return c().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || c().keySet().equals(obj);
        }

        public int hashCode() {
            return c().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new C2457bD(this, c().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) c().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                C2438aD aDVar = C2438aD.this;
                aDVar.d = aDVar.d - i;
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: aD$c */
    /* compiled from: AbstractMapBasedMultimap */
    private class c extends e implements RandomAccess {
        c(K k, List<V> list, d dVar) {
            super(k, list, dVar);
        }
    }

    /* renamed from: aD$d */
    /* compiled from: AbstractMapBasedMultimap */
    class d extends AbstractCollection<V> {
        final K a;
        Collection<V> b;
        final d c;
        final Collection<V> d;

        /* renamed from: aD$d$a */
        /* compiled from: AbstractMapBasedMultimap */
        class a implements Iterator<V> {
            final Iterator<V> a;
            final Collection<V> b = d.this.b;

            a() {
                this.a = C2438aD.b(d.this.b);
            }

            /* access modifiers changed from: 0000 */
            public Iterator<V> a() {
                b();
                return this.a;
            }

            /* access modifiers changed from: 0000 */
            public void b() {
                d.this.h();
                if (d.this.b != this.b) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                b();
                return this.a.hasNext();
            }

            public V next() {
                b();
                return this.a.next();
            }

            public void remove() {
                this.a.remove();
                C2438aD.this.d = C2438aD.this.d - 1;
                d.this.i();
            }

            a(Iterator<V> it) {
                this.a = it;
            }
        }

        d(K k, Collection<V> collection, d dVar) {
            Collection<V> collection2;
            this.a = k;
            this.b = collection;
            this.c = dVar;
            if (dVar == null) {
                collection2 = null;
            } else {
                collection2 = dVar.f();
            }
            this.d = collection2;
        }

        public boolean add(V v) {
            h();
            boolean isEmpty = this.b.isEmpty();
            boolean add = this.b.add(v);
            if (add) {
                C2438aD.this.d = C2438aD.this.d + 1;
                if (isEmpty) {
                    c();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.b.addAll(collection);
            if (addAll) {
                int size2 = this.b.size();
                C2438aD aDVar = C2438aD.this;
                aDVar.d = aDVar.d + (size2 - size);
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            d dVar = this.c;
            if (dVar != null) {
                dVar.c();
            } else {
                C2438aD.this.c.put(this.a, this.b);
            }
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.b.clear();
                C2438aD aDVar = C2438aD.this;
                aDVar.d = aDVar.d - size;
                i();
            }
        }

        public boolean contains(Object obj) {
            h();
            return this.b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            h();
            return this.b.containsAll(collection);
        }

        /* access modifiers changed from: 0000 */
        public d d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            h();
            return this.b.equals(obj);
        }

        /* access modifiers changed from: 0000 */
        public Collection<V> f() {
            return this.b;
        }

        /* access modifiers changed from: 0000 */
        public K g() {
            return this.a;
        }

        /* access modifiers changed from: 0000 */
        public void h() {
            d dVar = this.c;
            if (dVar != null) {
                dVar.h();
                if (this.c.f() != this.d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.b.isEmpty()) {
                Collection<V> collection = (Collection) C2438aD.this.c.get(this.a);
                if (collection != null) {
                    this.b = collection;
                }
            }
        }

        public int hashCode() {
            h();
            return this.b.hashCode();
        }

        /* access modifiers changed from: 0000 */
        public void i() {
            d dVar = this.c;
            if (dVar != null) {
                dVar.i();
            } else if (this.b.isEmpty()) {
                C2438aD.this.c.remove(this.a);
            }
        }

        public Iterator<V> iterator() {
            h();
            return new a();
        }

        public boolean remove(Object obj) {
            h();
            boolean remove = this.b.remove(obj);
            if (remove) {
                C2438aD.this.d = C2438aD.this.d - 1;
                i();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.b.removeAll(collection);
            if (removeAll) {
                int size2 = this.b.size();
                C2438aD aDVar = C2438aD.this;
                aDVar.d = aDVar.d + (size2 - size);
                i();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.b.retainAll(collection);
            if (retainAll) {
                int size2 = this.b.size();
                C2438aD aDVar = C2438aD.this;
                aDVar.d = aDVar.d + (size2 - size);
                i();
            }
            return retainAll;
        }

        public int size() {
            h();
            return this.b.size();
        }

        public String toString() {
            h();
            return this.b.toString();
        }
    }

    /* renamed from: aD$e */
    /* compiled from: AbstractMapBasedMultimap */
    class e extends d implements List<V> {

        /* renamed from: aD$e$a */
        /* compiled from: AbstractMapBasedMultimap */
        private class a extends aD$d.a implements ListIterator<V> {
            a() {
                super();
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [aD$d$a, aD$e$a] */
            private ListIterator<V> c() {
                return (ListIterator) a();
            }

            public void add(V v) {
                boolean isEmpty = e.this.isEmpty();
                c().add(v);
                C2438aD.this.d = C2438aD.this.d + 1;
                if (isEmpty) {
                    e.this.c();
                }
            }

            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            public int nextIndex() {
                return c().nextIndex();
            }

            public V previous() {
                return c().previous();
            }

            public int previousIndex() {
                return c().previousIndex();
            }

            public void set(V v) {
                c().set(v);
            }

            public a(int i) {
                super(e.this.j().listIterator(i));
            }
        }

        e(K k, List<V> list, d dVar) {
            super(k, list, dVar);
        }

        public void add(int i, V v) {
            h();
            boolean isEmpty = f().isEmpty();
            j().add(i, v);
            C2438aD.this.d = C2438aD.this.d + 1;
            if (isEmpty) {
                c();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = j().addAll(i, collection);
            if (addAll) {
                int size2 = f().size();
                C2438aD aDVar = C2438aD.this;
                aDVar.d = aDVar.d + (size2 - size);
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        public V get(int i) {
            h();
            return j().get(i);
        }

        public int indexOf(Object obj) {
            h();
            return j().indexOf(obj);
        }

        /* access modifiers changed from: 0000 */
        public List<V> j() {
            return (List) f();
        }

        public int lastIndexOf(Object obj) {
            h();
            return j().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            h();
            return new a();
        }

        public V remove(int i) {
            h();
            V remove = j().remove(i);
            C2438aD.this.d = C2438aD.this.d - 1;
            i();
            return remove;
        }

        public V set(int i, V v) {
            h();
            return j().set(i, v);
        }

        public List<V> subList(int i, int i2) {
            h();
            return C2438aD.this.a(g(), j().subList(i, i2), d() == null ? this : d());
        }

        public ListIterator<V> listIterator(int i) {
            h();
            return new a(i);
        }
    }

    protected C2438aD(Map<K, Collection<V>> map) {
        Preconditions.checkArgument(map.isEmpty());
        this.c = map;
    }

    /* access modifiers changed from: 0000 */
    public abstract Collection<V> a(K k, Collection<V> collection);

    /* access modifiers changed from: 0000 */
    public abstract Collection<V> e();

    public Collection<V> get(K k) {
        Collection collection = (Collection) this.c.get(k);
        if (collection == null) {
            collection = a(k);
        }
        return a(k, collection);
    }

    public boolean put(K k, V v) {
        Collection collection = (Collection) this.c.get(k);
        if (collection == null) {
            Collection a2 = a(k);
            if (a2.add(v)) {
                this.d++;
                this.c.put(k, a2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.d++;
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static <E> Iterator<E> b(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: 0000 */
    public Set<K> c() {
        return new b(this.c);
    }

    public void d() {
        for (Collection clear : this.c.values()) {
            clear.clear();
        }
        this.c.clear();
        this.d = 0;
    }

    /* access modifiers changed from: private */
    public void b(Object obj) {
        Collection collection = (Collection) C2196OD.d(this.c, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.d -= size;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Map<K, Collection<V>> map) {
        this.c = map;
        this.d = 0;
        for (Collection collection : map.values()) {
            Preconditions.checkArgument(!collection.isEmpty());
            this.d += collection.size();
        }
    }

    /* access modifiers changed from: 0000 */
    public Map<K, Collection<V>> b() {
        return new a(this.c);
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> a(K k) {
        return e();
    }

    /* access modifiers changed from: 0000 */
    public final List<V> a(K k, List<V> list, d dVar) {
        return list instanceof RandomAccess ? new c(k, list, dVar) : new e(k, list, dVar);
    }
}
