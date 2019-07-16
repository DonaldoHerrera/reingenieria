package defpackage;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: xD reason: default package and case insensitive filesystem */
/* compiled from: ImmutableMap */
public abstract class C3346xD<K, V> implements Map<K, V>, Serializable {
    static final Entry<?, ?>[] a = new Entry[0];
    @LazyInit
    private transient C3366yD<Entry<K, V>> b;
    @RetainedWith
    @LazyInit
    private transient C3366yD<K> c;
    @RetainedWith
    @LazyInit
    private transient C3286uD<V> d;

    /* renamed from: xD$a */
    /* compiled from: ImmutableMap */
    public static class a<K, V> {
        Comparator<? super V> a;
        Object[] b;
        int c = 0;
        boolean d = false;

        a(int i) {
            this.b = new Object[(i * 2)];
        }

        private void a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, defpackage.C3286uD.a.a(objArr.length, i2));
                this.d = false;
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            int i;
            if (this.a != null) {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, this.c * 2);
                }
                Entry[] entryArr = new Entry[this.c];
                int i2 = 0;
                while (true) {
                    i = this.c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, C2291TD.a(this.a).a(C2196OD.a()));
                for (int i4 = 0; i4 < this.c; i4++) {
                    int i5 = i4 * 2;
                    this.b[i5] = entryArr[i4].getKey();
                    this.b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        @CanIgnoreReturnValue
        public a<K, V> a(K k, V v) {
            a(this.c + 1);
            C3044iD.a((Object) k, (Object) v);
            Object[] objArr = this.b;
            int i = this.c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.c = i + 1;
            return this;
        }

        public C3346xD<K, V> a() {
            b();
            this.d = true;
            return C2364XD.a(this.c, this.b);
        }
    }

    /* renamed from: xD$b */
    /* compiled from: ImmutableMap */
    static class b implements Serializable {
        private final Object[] a;
        private final Object[] b;

        b(C3346xD<?, ?> xDVar) {
            this.a = new Object[xDVar.size()];
            this.b = new Object[xDVar.size()];
            C2988fE it = xDVar.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                this.a[i] = entry.getKey();
                this.b[i] = entry.getValue();
                i++;
            }
        }

        /* access modifiers changed from: 0000 */
        public Object a(a<Object, Object> aVar) {
            int i = 0;
            while (true) {
                Object[] objArr = this.a;
                if (i >= objArr.length) {
                    return aVar.a();
                }
                aVar.a(objArr[i], this.b[i]);
                i++;
            }
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return a(new a(this.a.length));
        }
    }

    C3346xD() {
    }

    public static <K, V> a<K, V> a(int i) {
        C3044iD.a(i, "expectedSize");
        return new a<>(i);
    }

    public static <K, V> C3346xD<K, V> d() {
        return C2364XD.e;
    }

    /* access modifiers changed from: 0000 */
    public abstract C3366yD<Entry<K, V>> a();

    /* access modifiers changed from: 0000 */
    public abstract C3366yD<K> b();

    /* access modifiers changed from: 0000 */
    public abstract C3286uD<V> c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public boolean equals(Object obj) {
        return C2196OD.a((Map<?, ?>) this, obj);
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return C2458bE.a((Set<?>) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C2196OD.a((Map<?, ?>) this);
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new b(this);
    }

    public C3366yD<Entry<K, V>> entrySet() {
        C3366yD<Entry<K, V>> yDVar = this.b;
        if (yDVar != null) {
            return yDVar;
        }
        C3366yD<Entry<K, V>> a2 = a();
        this.b = a2;
        return a2;
    }

    public C3366yD<K> keySet() {
        C3366yD<K> yDVar = this.c;
        if (yDVar != null) {
            return yDVar;
        }
        C3366yD<K> b2 = b();
        this.c = b2;
        return b2;
    }

    public C3286uD<V> values() {
        C3286uD<V> uDVar = this.d;
        if (uDVar != null) {
            return uDVar;
        }
        C3286uD<V> c2 = c();
        this.d = c2;
        return c2;
    }
}
