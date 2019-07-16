package com.google.android.gms.internal.clearcut;

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

/* renamed from: com.google.android.gms.internal.clearcut.eb reason: case insensitive filesystem */
class C0750eb<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    /* access modifiers changed from: private */
    public List<C0771lb> b;
    /* access modifiers changed from: private */
    public Map<K, V> c;
    private boolean d;
    private volatile C0777nb e;
    /* access modifiers changed from: private */
    public Map<K, V> f;
    private volatile C0759hb g;

    private C0750eb(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    /* synthetic */ C0750eb(int i, C0753fb fbVar) {
        this(i);
    }

    private final int a(K k) {
        int size = this.b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((C0771lb) this.b.get(size)).getKey());
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
            int compareTo2 = k.compareTo((Comparable) ((C0771lb) this.b.get(i2)).getKey());
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

    static <FieldDescriptorType extends C0737aa<FieldDescriptorType>> C0750eb<FieldDescriptorType, Object> a(int i) {
        return new C0753fb(i);
    }

    /* access modifiers changed from: private */
    public final V c(int i) {
        f();
        V value = ((C0771lb) this.b.remove(i)).getValue();
        if (!this.c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            this.b.add(new C0771lb(this, (Entry) it.next()));
            it.remove();
        }
        return value;
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

    /* renamed from: a */
    public final V put(K k, V v) {
        f();
        int a2 = a(k);
        if (a2 >= 0) {
            return ((C0771lb) this.b.get(a2)).setValue(v);
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
            C0771lb lbVar = (C0771lb) this.b.remove(i2 - 1);
            g().put((Comparable) lbVar.getKey(), lbVar.getValue());
        }
        this.b.add(i, new C0771lb(this, k, v));
        return null;
    }

    public final boolean a() {
        return this.d;
    }

    public final int b() {
        return this.b.size();
    }

    public final Entry<K, V> b(int i) {
        return (Entry) this.b.get(i);
    }

    public final Iterable<Entry<K, V>> c() {
        return this.c.isEmpty() ? C0762ib.a() : this.c.entrySet();
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

    /* access modifiers changed from: 0000 */
    public final Set<Entry<K, V>> d() {
        if (this.g == null) {
            this.g = new C0759hb(this, null);
        }
        return this.g;
    }

    public void e() {
        if (!this.d) {
            this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
            this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
            this.d = true;
        }
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new C0777nb(this, null);
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0750eb)) {
            return super.equals(obj);
        }
        C0750eb ebVar = (C0750eb) obj;
        int size = size();
        if (size != ebVar.size()) {
            return false;
        }
        int b2 = b();
        if (b2 != ebVar.b()) {
            return entrySet().equals(ebVar.entrySet());
        }
        for (int i = 0; i < b2; i++) {
            if (!b(i).equals(ebVar.b(i))) {
                return false;
            }
        }
        if (b2 != size) {
            return this.c.equals(ebVar.c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a((K) comparable);
        return a2 >= 0 ? ((C0771lb) this.b.get(a2)).getValue() : this.c.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < b(); i2++) {
            i += ((C0771lb) this.b.get(i2)).hashCode();
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
}
