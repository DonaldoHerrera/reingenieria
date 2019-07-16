package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: nD reason: default package and case insensitive filesystem */
/* compiled from: CompactHashMap */
class C3139nD<K, V> extends AbstractMap<K, V> implements Serializable {
    private transient int[] a;
    transient long[] b;
    transient Object[] c;
    transient Object[] d;
    transient float e;
    transient int f;
    private transient int g;
    /* access modifiers changed from: private */
    public transient int h;
    private transient Set<K> i;
    private transient Set<Entry<K, V>> j;
    private transient Collection<V> k;

    /* renamed from: nD$a */
    /* compiled from: CompactHashMap */
    class a extends AbstractSet<Entry<K, V>> {
        a() {
        }

        public void clear() {
            C3139nD.this.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a2 = C3139nD.this.b(entry.getKey());
            if (a2 == -1 || !Objects.equal(C3139nD.this.d[a2], entry.getValue())) {
                return false;
            }
            return true;
        }

        public Iterator<Entry<K, V>> iterator() {
            return C3139nD.this.e();
        }

        public boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                int a2 = C3139nD.this.b(entry.getKey());
                if (a2 != -1 && Objects.equal(C3139nD.this.d[a2], entry.getValue())) {
                    C3139nD.this.h(a2);
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return C3139nD.this.h;
        }
    }

    /* renamed from: nD$b */
    /* compiled from: CompactHashMap */
    private abstract class b<T> implements Iterator<T> {
        int a;
        int b;
        int c;

        private b() {
            C3139nD nDVar = C3139nD.this;
            this.a = nDVar.f;
            this.b = nDVar.f();
            this.c = -1;
        }

        private void a() {
            if (C3139nD.this.f != this.a) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract T a(int i);

        public boolean hasNext() {
            return this.b >= 0;
        }

        public T next() {
            a();
            if (hasNext()) {
                int i = this.b;
                this.c = i;
                T a2 = a(i);
                this.b = C3139nD.this.c(this.b);
                return a2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            a();
            C3044iD.a(this.c >= 0);
            this.a++;
            C3139nD.this.h(this.c);
            this.b = C3139nD.this.a(this.b, this.c);
            this.c = -1;
        }

        /* synthetic */ b(C3139nD nDVar, C3082kD kDVar) {
            this();
        }
    }

    /* renamed from: nD$c */
    /* compiled from: CompactHashMap */
    class c extends AbstractSet<K> {
        c() {
        }

        public void clear() {
            C3139nD.this.clear();
        }

        public boolean contains(Object obj) {
            return C3139nD.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return C3139nD.this.g();
        }

        public boolean remove(Object obj) {
            int a2 = C3139nD.this.b(obj);
            if (a2 == -1) {
                return false;
            }
            C3139nD.this.h(a2);
            return true;
        }

        public int size() {
            return C3139nD.this.h;
        }
    }

    /* renamed from: nD$d */
    /* compiled from: CompactHashMap */
    final class d extends C2476cD<K, V> {
        private final K a;
        private int b;

        d(int i) {
            this.a = C3139nD.this.c[i];
            this.b = i;
        }

        private void a() {
            int i = this.b;
            if (i == -1 || i >= C3139nD.this.size() || !Objects.equal(this.a, C3139nD.this.c[this.b])) {
                this.b = C3139nD.this.b((Object) this.a);
            }
        }

        public K getKey() {
            return this.a;
        }

        public V getValue() {
            a();
            int i = this.b;
            if (i == -1) {
                return null;
            }
            return C3139nD.this.d[i];
        }

        public V setValue(V v) {
            a();
            int i = this.b;
            if (i == -1) {
                C3139nD.this.put(this.a, v);
                return null;
            }
            V[] vArr = C3139nD.this.d;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }
    }

    /* renamed from: nD$e */
    /* compiled from: CompactHashMap */
    class e extends AbstractCollection<V> {
        e() {
        }

        public void clear() {
            C3139nD.this.clear();
        }

        public Iterator<V> iterator() {
            return C3139nD.this.h();
        }

        public int size() {
            return C3139nD.this.h;
        }
    }

    C3139nD() {
        a(3, 1.0f);
    }

    private static int a(long j2) {
        return (int) (j2 >>> 32);
    }

    private static long a(long j2, int i2) {
        return (j2 & -4294967296L) | (((long) i2) & 4294967295L);
    }

    private static int b(long j2) {
        return (int) j2;
    }

    public static <K, V> C3139nD<K, V> b(int i2) {
        return new C3139nD<>(i2);
    }

    private static long[] f(int i2) {
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    private static int[] g(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* access modifiers changed from: private */
    @CanIgnoreReturnValue
    public V h(int i2) {
        return a(this.c[i2], a(this.b[i2]));
    }

    private int i() {
        return this.a.length - 1;
    }

    private void j(int i2) {
        if (this.a.length >= 1073741824) {
            this.g = BaseClientBuilder.API_PRIORITY_OTHER;
            return;
        }
        int i3 = ((int) (((float) i2) * this.e)) + 1;
        int[] g2 = g(i2);
        long[] jArr = this.b;
        int length = g2.length - 1;
        for (int i4 = 0; i4 < this.h; i4++) {
            int a2 = a(jArr[i4]);
            int i5 = a2 & length;
            int i6 = g2[i5];
            g2[i5] = i4;
            jArr[i4] = (((long) a2) << 32) | (((long) i6) & 4294967295L);
        }
        this.g = i3;
        this.a = g2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        a(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.h);
        for (int i2 = 0; i2 < this.h; i2++) {
            objectOutputStream.writeObject(this.c[i2]);
            objectOutputStream.writeObject(this.d[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    public int a(int i2, int i3) {
        return i2 - 1;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
    }

    /* access modifiers changed from: 0000 */
    public int c(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.h) {
            return i3;
        }
        return -1;
    }

    public void clear() {
        this.f++;
        Arrays.fill(this.c, 0, this.h, null);
        Arrays.fill(this.d, 0, this.h, null);
        Arrays.fill(this.a, -1);
        Arrays.fill(this.b, -1);
        this.h = 0;
    }

    public boolean containsKey(Object obj) {
        return b(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        for (int i2 = 0; i2 < this.h; i2++) {
            if (Objects.equal(obj, this.d[i2])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void d(int i2) {
        int size = size() - 1;
        if (i2 < size) {
            Object[] objArr = this.c;
            objArr[i2] = objArr[size];
            Object[] objArr2 = this.d;
            objArr2[i2] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.b;
            long j2 = jArr[size];
            jArr[i2] = j2;
            jArr[size] = -1;
            int a2 = a(j2) & i();
            int[] iArr = this.a;
            int i3 = iArr[a2];
            if (i3 == size) {
                iArr[a2] = i2;
                return;
            }
            while (true) {
                long j3 = this.b[i3];
                int b2 = b(j3);
                if (b2 == size) {
                    this.b[i3] = a(j3, i2);
                    return;
                }
                i3 = b2;
            }
        } else {
            this.c[i2] = null;
            this.d[i2] = null;
            this.b[i2] = -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public void e(int i2) {
        this.c = Arrays.copyOf(this.c, i2);
        this.d = Arrays.copyOf(this.d, i2);
        long[] jArr = this.b;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(copyOf, length, i2, -1);
        }
        this.b = copyOf;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.j;
        if (set != null) {
            return set;
        }
        Set<Entry<K, V>> b2 = b();
        this.j = b2;
        return b2;
    }

    public V get(Object obj) {
        int b2 = b(obj);
        a(b2);
        if (b2 == -1) {
            return null;
        }
        return this.d[b2];
    }

    public boolean isEmpty() {
        return this.h == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.i;
        if (set != null) {
            return set;
        }
        Set<K> c2 = c();
        this.i = c2;
        return c2;
    }

    @CanIgnoreReturnValue
    public V put(K k2, V v) {
        long[] jArr = this.b;
        Object[] objArr = this.c;
        V[] vArr = this.d;
        int a2 = C3266tD.a((Object) k2);
        int i2 = i() & a2;
        int i3 = this.h;
        int[] iArr = this.a;
        int i4 = iArr[i2];
        if (i4 == -1) {
            iArr[i2] = i3;
        } else {
            while (true) {
                long j2 = jArr[i4];
                if (a(j2) != a2 || !Objects.equal(k2, objArr[i4])) {
                    int b2 = b(j2);
                    if (b2 == -1) {
                        jArr[i4] = a(j2, i3);
                        break;
                    }
                    i4 = b2;
                } else {
                    V v2 = vArr[i4];
                    vArr[i4] = v;
                    a(i4);
                    return v2;
                }
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            int i5 = i3 + 1;
            i(i5);
            a(i3, k2, v, a2);
            this.h = i5;
            if (i3 >= this.g) {
                j(this.a.length * 2);
            }
            this.f++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        return a(obj, C3266tD.a(obj));
    }

    public int size() {
        return this.h;
    }

    public Collection<V> values() {
        Collection<V> collection = this.k;
        if (collection != null) {
            return collection;
        }
        Collection<V> d2 = d();
        this.k = d2;
        return d2;
    }

    /* access modifiers changed from: private */
    public int b(Object obj) {
        int a2 = C3266tD.a(obj);
        int i2 = this.a[i() & a2];
        while (i2 != -1) {
            long j2 = this.b[i2];
            if (a(j2) == a2 && Objects.equal(obj, this.c[i2])) {
                return i2;
            }
            i2 = b(j2);
        }
        return -1;
    }

    private void i(int i2) {
        int length = this.b.length;
        if (i2 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (max != length) {
                e(max);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public Set<K> c() {
        return new c();
    }

    /* access modifiers changed from: 0000 */
    public Iterator<V> h() {
        return new C3120mD(this);
    }

    C3139nD(int i2) {
        this(i2, 1.0f);
    }

    /* access modifiers changed from: 0000 */
    public int f() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public Iterator<K> g() {
        return new C3082kD(this);
    }

    C3139nD(int i2, float f2) {
        a(i2, f2);
    }

    public static <K, V> C3139nD<K, V> a() {
        return new C3139nD<>();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, float f2) {
        boolean z = false;
        Preconditions.checkArgument(i2 >= 0, "Initial capacity must be non-negative");
        if (f2 > 0.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Illegal load factor");
        int a2 = C3266tD.a(i2, (double) f2);
        this.a = g(a2);
        this.e = f2;
        this.c = new Object[i2];
        this.d = new Object[i2];
        this.b = f(i2);
        this.g = Math.max(1, (int) (((float) a2) * f2));
    }

    /* access modifiers changed from: 0000 */
    public Set<Entry<K, V>> b() {
        return new a();
    }

    /* access modifiers changed from: 0000 */
    public Iterator<Entry<K, V>> e() {
        return new C3101lD(this);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, K k2, V v, int i3) {
        this.b[i2] = (((long) i3) << 32) | 4294967295L;
        this.c[i2] = k2;
        this.d[i2] = v;
    }

    private V a(Object obj, int i2) {
        int i3 = i() & i2;
        int i4 = this.a[i3];
        if (i4 == -1) {
            return null;
        }
        int i5 = -1;
        while (true) {
            if (a(this.b[i4]) != i2 || !Objects.equal(obj, this.c[i4])) {
                int b2 = b(this.b[i4]);
                if (b2 == -1) {
                    return null;
                }
                int i6 = b2;
                i5 = i4;
                i4 = i6;
            } else {
                V v = this.d[i4];
                if (i5 == -1) {
                    this.a[i3] = b(this.b[i4]);
                } else {
                    long[] jArr = this.b;
                    jArr[i5] = a(jArr[i5], b(jArr[i4]));
                }
                d(i4);
                this.h--;
                this.f++;
                return v;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> d() {
        return new e();
    }
}
