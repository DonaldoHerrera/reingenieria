package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: J reason: default package */
/* compiled from: SafeIterableMap */
public class J<K, V> implements Iterable<Entry<K, V>> {
    c<K, V> a;
    private c<K, V> b;
    private WeakHashMap<f<K, V>, Boolean> c = new WeakHashMap<>();
    private int d = 0;

    /* renamed from: J$a */
    /* compiled from: SafeIterableMap */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        public c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        /* access modifiers changed from: 0000 */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.c;
        }
    }

    /* renamed from: J$b */
    /* compiled from: SafeIterableMap */
    private static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        public c<K, V> b(c<K, V> cVar) {
            return cVar.c;
        }

        /* access modifiers changed from: 0000 */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* renamed from: J$c */
    /* compiled from: SafeIterableMap */
    static class c<K, V> implements Entry<K, V> {
        final K a;
        final V b;
        c<K, V> c;
        c<K, V> d;

        c(K k, V v) {
            this.a = k;
            this.b = v;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.a.equals(cVar.a) || !this.b.equals(cVar.b)) {
                z = false;
            }
            return z;
        }

        public K getKey() {
            return this.a;
        }

        public V getValue() {
            return this.b;
        }

        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("=");
            sb.append(this.b);
            return sb.toString();
        }
    }

    /* renamed from: J$d */
    /* compiled from: SafeIterableMap */
    private class d implements Iterator<Entry<K, V>>, f<K, V> {
        private c<K, V> a;
        private boolean b = true;

        d() {
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2) {
                this.a = cVar2.d;
                this.b = this.a == null;
            }
        }

        public boolean hasNext() {
            boolean z = true;
            if (this.b) {
                if (J.this.a == null) {
                    z = false;
                }
                return z;
            }
            c<K, V> cVar = this.a;
            if (cVar == null || cVar.c == null) {
                z = false;
            }
            return z;
        }

        public Entry<K, V> next() {
            if (this.b) {
                this.b = false;
                this.a = J.this.a;
            } else {
                c<K, V> cVar = this.a;
                this.a = cVar != null ? cVar.c : null;
            }
            return this.a;
        }
    }

    /* renamed from: J$e */
    /* compiled from: SafeIterableMap */
    private static abstract class e<K, V> implements Iterator<Entry<K, V>>, f<K, V> {
        c<K, V> a;
        c<K, V> b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.a = cVar2;
            this.b = cVar;
        }

        public void a(c<K, V> cVar) {
            if (this.a == cVar && cVar == this.b) {
                this.b = null;
                this.a = null;
            }
            c<K, V> cVar2 = this.a;
            if (cVar2 == cVar) {
                this.a = b(cVar2);
            }
            if (this.b == cVar) {
                this.b = a();
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract c<K, V> b(c<K, V> cVar);

        /* access modifiers changed from: 0000 */
        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.b != null;
        }

        public Entry<K, V> next() {
            c<K, V> cVar = this.b;
            this.b = a();
            return cVar;
        }

        private c<K, V> a() {
            c<K, V> cVar = this.b;
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }
    }

    /* renamed from: J$f */
    /* compiled from: SafeIterableMap */
    interface f<K, V> {
        void a(c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    public c<K, V> a(K k) {
        c<K, V> cVar = this.a;
        while (cVar != null && !cVar.a.equals(k)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public V b(K k, V v) {
        c a2 = a(k);
        if (a2 != null) {
            return a2.b;
        }
        a(k, v);
        return null;
    }

    public Iterator<Entry<K, V>> descendingIterator() {
        b bVar = new b(this.b, this.a);
        this.c.put(bVar, Boolean.valueOf(false));
        return bVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        if (size() != j.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = j.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z = false;
        }
        return z;
    }

    public Entry<K, V> f() {
        return this.a;
    }

    public d g() {
        d dVar = new d<>();
        this.c.put(dVar, Boolean.valueOf(false));
        return dVar;
    }

    public Entry<K, V> h() {
        return this.b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Entry<K, V>> iterator() {
        a aVar = new a(this.a, this.b);
        this.c.put(aVar, Boolean.valueOf(false));
        return aVar;
    }

    public V remove(K k) {
        c a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.d--;
        if (!this.c.isEmpty()) {
            for (f a3 : this.c.keySet()) {
                a3.a(a2);
            }
        }
        c<K, V> cVar = a2.d;
        if (cVar != null) {
            cVar.c = a2.c;
        } else {
            this.a = a2.c;
        }
        c<K, V> cVar2 = a2.c;
        if (cVar2 != null) {
            cVar2.d = a2.d;
        } else {
            this.b = a2.d;
        }
        a2.c = null;
        a2.d = null;
        return a2.b;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public c<K, V> a(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.d++;
        c<K, V> cVar2 = this.b;
        if (cVar2 == null) {
            this.a = cVar;
            this.b = this.a;
            return cVar;
        }
        cVar2.c = cVar;
        cVar.d = cVar2;
        this.b = cVar;
        return cVar;
    }
}
