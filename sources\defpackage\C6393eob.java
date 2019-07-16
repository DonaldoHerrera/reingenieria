package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: eob reason: default package and case insensitive filesystem */
/* compiled from: SmallSortedMap */
class C6393eob<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    /* access modifiers changed from: private */
    public List<b> b;
    /* access modifiers changed from: private */
    public Map<K, V> c;
    private boolean d;
    private volatile d e;

    /* renamed from: eob$a */
    /* compiled from: SmallSortedMap */
    private static class a {
        /* access modifiers changed from: private */
        public static final Iterator<Object> a = new C5729cob();
        private static final Iterable<Object> b = new C6325dob();

        static <T> Iterable<T> b() {
            return b;
        }
    }

    /* renamed from: eob$b */
    /* compiled from: SmallSortedMap */
    private class b implements Comparable<b>, Entry<K, V> {
        private final K a;
        private V b;

        b(C6393eob eob, Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            return getKey().compareTo(bVar.getKey());
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!a(this.a, entry.getKey()) || !a(this.b, entry.getValue())) {
                z = false;
            }
            return z;
        }

        public V getValue() {
            return this.b;
        }

        public int hashCode() {
            K k = this.a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C6393eob.this.e();
            V v2 = this.b;
            this.b = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(String.valueOf(this.a));
            String valueOf2 = String.valueOf(String.valueOf(this.b));
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }

        b(K k, V v) {
            this.a = k;
            this.b = v;
        }

        private boolean a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        public K getKey() {
            return this.a;
        }
    }

    /* renamed from: eob$c */
    /* compiled from: SmallSortedMap */
    private class c implements Iterator<Entry<K, V>> {
        private int a;
        private boolean b;
        private Iterator<Entry<K, V>> c;

        private c() {
            this.a = -1;
        }

        private Iterator<Entry<K, V>> a() {
            if (this.c == null) {
                this.c = C6393eob.this.c.entrySet().iterator();
            }
            return this.c;
        }

        public boolean hasNext() {
            return this.a + 1 < C6393eob.this.b.size() || a().hasNext();
        }

        public void remove() {
            if (this.b) {
                this.b = false;
                C6393eob.this.e();
                if (this.a < C6393eob.this.b.size()) {
                    C6393eob eob = C6393eob.this;
                    int i = this.a;
                    this.a = i - 1;
                    eob.c(i);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public Entry<K, V> next() {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            if (i < C6393eob.this.b.size()) {
                return (Entry) C6393eob.this.b.get(this.a);
            }
            return (Entry) a().next();
        }

        /* synthetic */ c(C6393eob eob, C5661bob bob) {
            this();
        }
    }

    /* renamed from: eob$d */
    /* compiled from: SmallSortedMap */
    private class d extends AbstractSet<Entry<K, V>> {
        private d() {
        }

        /* renamed from: a */
        public boolean add(Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C6393eob.this.a((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C6393eob.this.clear();
        }

        public boolean contains(Object obj) {
            Entry entry = (Entry) obj;
            Object obj2 = C6393eob.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Entry<K, V>> iterator() {
            return new c(C6393eob.this, null);
        }

        public boolean remove(Object obj) {
            Entry entry = (Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C6393eob.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C6393eob.this.size();
        }

        /* synthetic */ d(C6393eob eob, C5661bob bob) {
            this();
        }
    }

    /* synthetic */ C6393eob(int i, C5661bob bob) {
        this(i);
    }

    /* access modifiers changed from: private */
    public void e() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private void f() {
        e();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
    }

    private SortedMap<K, V> g() {
        e();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
        }
        return (SortedMap) this.c;
    }

    public void clear() {
        e();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a((K) comparable) >= 0 || this.c.containsKey(comparable);
    }

    public void d() {
        if (!this.d) {
            this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
            this.d = true;
        }
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new d<>(this, null);
        }
        return this.e;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a((K) comparable);
        if (a2 >= 0) {
            return ((b) this.b.get(a2)).getValue();
        }
        return this.c.get(comparable);
    }

    public V remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int a2 = a((K) comparable);
        if (a2 >= 0) {
            return c(a2);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    public int size() {
        return this.b.size() + this.c.size();
    }

    private C6393eob(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
    }

    static <FieldDescriptorType extends defpackage.Knb.a<FieldDescriptorType>> C6393eob<FieldDescriptorType, Object> b(int i) {
        return new C5661bob(i);
    }

    public boolean c() {
        return this.d;
    }

    /* access modifiers changed from: private */
    public V c(int i) {
        e();
        V value = ((b) this.b.remove(i)).getValue();
        if (!this.c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            this.b.add(new b(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public int a() {
        return this.b.size();
    }

    public Iterable<Entry<K, V>> b() {
        return this.c.isEmpty() ? a.b() : this.c.entrySet();
    }

    public Entry<K, V> a(int i) {
        return (Entry) this.b.get(i);
    }

    public V a(K k, V v) {
        e();
        int a2 = a(k);
        if (a2 >= 0) {
            return ((b) this.b.get(a2)).setValue(v);
        }
        f();
        int i = -(a2 + 1);
        if (i >= this.a) {
            return g().put(k, v);
        }
        int size = this.b.size();
        int i2 = this.a;
        if (size == i2) {
            b bVar = (b) this.b.remove(i2 - 1);
            g().put(bVar.getKey(), bVar.getValue());
        }
        this.b.add(i, new b(k, v));
        return null;
    }

    private int a(K k) {
        int size = this.b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(((b) this.b.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(((b) this.b.get(i2)).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }
}
