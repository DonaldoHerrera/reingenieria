package com.google.android.gms.internal.firebase-perf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.firebase-perf.wc reason: case insensitive filesystem */
class C0906wc<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    /* access modifiers changed from: private */
    public List<Bc> b;
    /* access modifiers changed from: private */
    public Map<K, V> c;
    private boolean d;
    private volatile Dc e;
    /* access modifiers changed from: private */
    public Map<K, V> f;
    private volatile C0910xc g;

    private C0906wc(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    static <FieldDescriptorType extends C0878pb<FieldDescriptorType>> C0906wc<FieldDescriptorType, Object> a(int i) {
        return new C0902vc(i);
    }

    /* access modifiers changed from: private */
    public final void f() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> g() {
        f();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
            this.f = ((TreeMap) this.c).descendingMap();
        }
        return (SortedMap) this.c;
    }

    public void b() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.d) {
            if (this.c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.c);
            }
            this.c = map;
            if (this.f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f);
            }
            this.f = map2;
            this.d = true;
        }
    }

    public final int c() {
        return this.b.size();
    }

    public void clear() {
        f();
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

    public final Iterable<Entry<K, V>> d() {
        if (this.c.isEmpty()) {
            return Ac.a();
        }
        return this.c.entrySet();
    }

    /* access modifiers changed from: 0000 */
    public final Set<Entry<K, V>> e() {
        if (this.g == null) {
            this.g = new C0910xc(this, null);
        }
        return this.g;
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new Dc(this, null);
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0906wc)) {
            return super.equals(obj);
        }
        C0906wc wcVar = (C0906wc) obj;
        int size = size();
        if (size != wcVar.size()) {
            return false;
        }
        int c2 = c();
        if (c2 != wcVar.c()) {
            return entrySet().equals(wcVar.entrySet());
        }
        for (int i = 0; i < c2; i++) {
            if (!b(i).equals(wcVar.b(i))) {
                return false;
            }
        }
        if (c2 != size) {
            return this.c.equals(wcVar.c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a((K) comparable);
        if (a2 >= 0) {
            return ((Bc) this.b.get(a2)).getValue();
        }
        return this.c.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < c(); i2++) {
            i += ((Bc) this.b.get(i2)).hashCode();
        }
        return this.c.size() > 0 ? i + this.c.hashCode() : i;
    }

    public V remove(Object obj) {
        f();
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

    /* access modifiers changed from: private */
    public final V c(int i) {
        f();
        V value = ((Bc) this.b.remove(i)).getValue();
        if (!this.c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            this.b.add(new Bc(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public final boolean a() {
        return this.d;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        f();
        int a2 = a(k);
        if (a2 >= 0) {
            return ((Bc) this.b.get(a2)).setValue(v);
        }
        f();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        int i = -(a2 + 1);
        if (i >= this.a) {
            return g().put(k, v);
        }
        int size = this.b.size();
        int i2 = this.a;
        if (size == i2) {
            Bc bc = (Bc) this.b.remove(i2 - 1);
            g().put((Comparable) bc.getKey(), bc.getValue());
        }
        this.b.add(i, new Bc(this, k, v));
        return null;
    }

    /* synthetic */ C0906wc(int i, C0902vc vcVar) {
        this(i);
    }

    public final Entry<K, V> b(int i) {
        return (Entry) this.b.get(i);
    }

    private final int a(K k) {
        int size = this.b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((Bc) this.b.get(size)).getKey());
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
            int compareTo2 = k.compareTo((Comparable) ((Bc) this.b.get(i2)).getKey());
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
