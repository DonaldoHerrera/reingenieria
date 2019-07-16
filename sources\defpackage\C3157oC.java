package defpackage;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: oC reason: default package and case insensitive filesystem */
/* compiled from: LocalCache */
class C3157oC<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    static final Logger a = Logger.getLogger(C3157oC.class.getName());
    static final y<Object, Object> b = new C3119mC();
    static final Queue<?> c = new C3138nC();
    final int d;
    final int e;
    final p<K, V>[] f;
    final int g;
    final Equivalence<Object> h;
    final Equivalence<Object> i;
    final r j;
    final r k;
    final long l;
    final C2345WC<K, V> m;
    final long n;
    final long o;
    final long p;
    final Queue<C2290TC<K, V>> q;
    final C2271SC<K, V> r;
    final Ticker s;
    final C3161d t;
    final C2475cC u;
    final C3043iC<? super K, V> v;
    Set<K> w;
    Collection<V> x;
    Set<Entry<K, V>> y;

    /* renamed from: oC$A */
    /* compiled from: LocalCache */
    static final class A<K, V> extends C<K, V> {
        volatile long d = Long.MAX_VALUE;
        C2138LC<K, V> e = C3157oC.g();
        C2138LC<K, V> f = C3157oC.g();

        A(ReferenceQueue<K> referenceQueue, K k, int i, C2138LC<K, V> lc) {
            super(referenceQueue, k, i, lc);
        }

        public void a(long j) {
            this.d = j;
        }

        public void b(C2138LC<K, V> lc) {
            this.e = lc;
        }

        public C2138LC<K, V> d() {
            return this.e;
        }

        public long v() {
            return this.d;
        }

        public C2138LC<K, V> a() {
            return this.f;
        }

        public void a(C2138LC<K, V> lc) {
            this.f = lc;
        }
    }

    /* renamed from: oC$B */
    /* compiled from: LocalCache */
    static final class B<K, V> extends C<K, V> {
        volatile long d = Long.MAX_VALUE;
        C2138LC<K, V> e = C3157oC.g();
        C2138LC<K, V> f = C3157oC.g();
        volatile long g = Long.MAX_VALUE;
        C2138LC<K, V> h = C3157oC.g();
        C2138LC<K, V> i = C3157oC.g();

        B(ReferenceQueue<K> referenceQueue, K k, int i2, C2138LC<K, V> lc) {
            super(referenceQueue, k, i2, lc);
        }

        public void a(long j) {
            this.d = j;
        }

        public void b(C2138LC<K, V> lc) {
            this.e = lc;
        }

        public void c(C2138LC<K, V> lc) {
            this.h = lc;
        }

        public C2138LC<K, V> d() {
            return this.e;
        }

        public C2138LC<K, V> e() {
            return this.i;
        }

        public long g() {
            return this.g;
        }

        public long v() {
            return this.d;
        }

        public C2138LC<K, V> a() {
            return this.f;
        }

        public void b(long j) {
            this.g = j;
        }

        public void d(C2138LC<K, V> lc) {
            this.i = lc;
        }

        public void a(C2138LC<K, V> lc) {
            this.f = lc;
        }

        public C2138LC<K, V> b() {
            return this.h;
        }
    }

    /* renamed from: oC$C */
    /* compiled from: LocalCache */
    static class C<K, V> extends WeakReference<K> implements C2138LC<K, V> {
        final int a;
        final C2138LC<K, V> b;
        volatile y<K, V> c = C3157oC.m();

        C(ReferenceQueue<K> referenceQueue, K k, int i, C2138LC<K, V> lc) {
            super(k, referenceQueue);
            this.a = i;
            this.b = lc;
        }

        public void a(long j) {
            throw new UnsupportedOperationException();
        }

        public void b(C2138LC<K, V> lc) {
            throw new UnsupportedOperationException();
        }

        public void c(C2138LC<K, V> lc) {
            throw new UnsupportedOperationException();
        }

        public C2138LC<K, V> d() {
            throw new UnsupportedOperationException();
        }

        public C2138LC<K, V> e() {
            throw new UnsupportedOperationException();
        }

        public int f() {
            return this.a;
        }

        public long g() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            return get();
        }

        public C2138LC<K, V> u() {
            return this.b;
        }

        public long v() {
            throw new UnsupportedOperationException();
        }

        public C2138LC<K, V> a() {
            throw new UnsupportedOperationException();
        }

        public void b(long j) {
            throw new UnsupportedOperationException();
        }

        public y<K, V> c() {
            return this.c;
        }

        public void d(C2138LC<K, V> lc) {
            throw new UnsupportedOperationException();
        }

        public void a(C2138LC<K, V> lc) {
            throw new UnsupportedOperationException();
        }

        public C2138LC<K, V> b() {
            throw new UnsupportedOperationException();
        }

        public void a(y<K, V> yVar) {
            this.c = yVar;
        }
    }

    /* renamed from: oC$D */
    /* compiled from: LocalCache */
    static class D<K, V> extends WeakReference<V> implements y<K, V> {
        final C2138LC<K, V> a;

        D(ReferenceQueue<V> referenceQueue, V v, C2138LC<K, V> lc) {
            super(v, referenceQueue);
            this.a = lc;
        }

        public int a() {
            return 1;
        }

        public y<K, V> a(ReferenceQueue<V> referenceQueue, V v, C2138LC<K, V> lc) {
            return new D(referenceQueue, v, lc);
        }

        public void a(V v) {
        }

        public boolean b() {
            return false;
        }

        public C2138LC<K, V> c() {
            return this.a;
        }

        public V d() {
            return get();
        }

        public boolean isActive() {
            return true;
        }
    }

    /* renamed from: oC$E */
    /* compiled from: LocalCache */
    static final class E<K, V> extends C<K, V> {
        volatile long d = Long.MAX_VALUE;
        C2138LC<K, V> e = C3157oC.g();
        C2138LC<K, V> f = C3157oC.g();

        E(ReferenceQueue<K> referenceQueue, K k, int i, C2138LC<K, V> lc) {
            super(referenceQueue, k, i, lc);
        }

        public void b(long j) {
            this.d = j;
        }

        public void c(C2138LC<K, V> lc) {
            this.e = lc;
        }

        public void d(C2138LC<K, V> lc) {
            this.f = lc;
        }

        public C2138LC<K, V> e() {
            return this.f;
        }

        public long g() {
            return this.d;
        }

        public C2138LC<K, V> b() {
            return this.e;
        }
    }

    /* renamed from: oC$F */
    /* compiled from: LocalCache */
    static final class F<K, V> extends q<K, V> {
        final int b;

        F(ReferenceQueue<V> referenceQueue, V v, C2138LC<K, V> lc, int i) {
            super(referenceQueue, v, lc);
            this.b = i;
        }

        public int a() {
            return this.b;
        }

        public y<K, V> a(ReferenceQueue<V> referenceQueue, V v, C2138LC<K, V> lc) {
            return new F(referenceQueue, v, lc, this.b);
        }
    }

    /* renamed from: oC$G */
    /* compiled from: LocalCache */
    static final class G<K, V> extends v<K, V> {
        final int b;

        G(V v, int i) {
            super(v);
            this.b = i;
        }

        public int a() {
            return this.b;
        }
    }

    /* renamed from: oC$H */
    /* compiled from: LocalCache */
    static final class H<K, V> extends D<K, V> {
        final int b;

        H(ReferenceQueue<V> referenceQueue, V v, C2138LC<K, V> lc, int i) {
            super(referenceQueue, v, lc);
            this.b = i;
        }

        public int a() {
            return this.b;
        }

        public y<K, V> a(ReferenceQueue<V> referenceQueue, V v, C2138LC<K, V> lc) {
            return new H(referenceQueue, v, lc, this.b);
        }
    }

    /* renamed from: oC$I */
    /* compiled from: LocalCache */
    static final class I<K, V> extends AbstractQueue<C2138LC<K, V>> {
        final C2138LC<K, V> a = new C2002EC(this);

        I() {
        }

        /* renamed from: a */
        public boolean offer(C2138LC<K, V> lc) {
            C3157oC.b(lc.e(), lc.b());
            C3157oC.b(this.a.e(), lc);
            C3157oC.b(lc, this.a);
            return true;
        }

        public void clear() {
            C2138LC<K, V> b = this.a.b();
            while (true) {
                C2138LC<K, V> lc = this.a;
                if (b != lc) {
                    C2138LC b2 = b.b();
                    C3157oC.b(b);
                    b = b2;
                } else {
                    lc.c(lc);
                    C2138LC<K, V> lc2 = this.a;
                    lc2.d(lc2);
                    return;
                }
            }
        }

        public boolean contains(Object obj) {
            return ((C2138LC) obj).b() != o.INSTANCE;
        }

        public boolean isEmpty() {
            return this.a.b() == this.a;
        }

        public Iterator<C2138LC<K, V>> iterator() {
            return new C2022FC(this, peek());
        }

        public boolean remove(Object obj) {
            C2138LC lc = (C2138LC) obj;
            C2138LC e = lc.e();
            C2138LC b = lc.b();
            C3157oC.b(e, b);
            C3157oC.b(lc);
            return b != o.INSTANCE;
        }

        public int size() {
            int i = 0;
            for (C2138LC<K, V> b = this.a.b(); b != this.a; b = b.b()) {
                i++;
            }
            return i;
        }

        public C2138LC<K, V> peek() {
            C2138LC<K, V> b = this.a.b();
            if (b == this.a) {
                return null;
            }
            return b;
        }

        public C2138LC<K, V> poll() {
            C2138LC<K, V> b = this.a.b();
            if (b == this.a) {
                return null;
            }
            remove(b);
            return b;
        }
    }

    /* renamed from: oC$J */
    /* compiled from: LocalCache */
    final class J implements Entry<K, V> {
        final K a;
        V b;

        J(K k, V v) {
            this.a = k;
            this.b = v;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.a.equals(entry.getKey()) || !this.b.equals(entry.getValue())) {
                return false;
            }
            return true;
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
            V put = C3157oC.this.put(this.a, v);
            this.b = v;
            return put;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: oC$a reason: case insensitive filesystem */
    /* compiled from: LocalCache */
    abstract class C3158a<T> extends AbstractSet<T> {
        @Weak
        final ConcurrentMap<?, ?> a;

        C3158a(ConcurrentMap<?, ?> concurrentMap) {
            this.a = concurrentMap;
        }

        public void clear() {
            this.a.clear();
        }

        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public int size() {
            return this.a.size();
        }

        public Object[] toArray() {
            return C3157oC.b((Collection<E>) this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return C3157oC.b((Collection<E>) this).toArray(eArr);
        }
    }

    /* renamed from: oC$b reason: case insensitive filesystem */
    /* compiled from: LocalCache */
    static abstract class C3159b<K, V> implements C2138LC<K, V> {
        C3159b() {
        }

        public void a(y<K, V> yVar) {
            throw new UnsupportedOperationException();
        }

        public void b(C2138LC<K, V> lc) {
            throw new UnsupportedOperationException();
        }

        public y<K, V> c() {
            throw new UnsupportedOperationException();
        }

        public C2138LC<K, V> d() {
            throw new UnsupportedOperationException();
        }

        public C2138LC<K, V> e() {
            throw new UnsupportedOperationException();
        }

        public int f() {
            throw new UnsupportedOperationException();
        }

        public long g() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            throw new UnsupportedOperationException();
        }

        public C2138LC<K, V> u() {
            throw new UnsupportedOperationException();
        }

        public long v() {
            throw new UnsupportedOperationException();
        }

        public void a(long j) {
            throw new UnsupportedOperationException();
        }

        public void b(long j) {
            throw new UnsupportedOperationException();
        }

        public void c(C2138LC<K, V> lc) {
            throw new UnsupportedOperationException();
        }

        public void d(C2138LC<K, V> lc) {
            throw new UnsupportedOperationException();
        }

        public C2138LC<K, V> a() {
            throw new UnsupportedOperationException();
        }

        public C2138LC<K, V> b() {
            throw new UnsupportedOperationException();
        }

        public void a(C2138LC<K, V> lc) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: oC$c reason: case insensitive filesystem */
    /* compiled from: LocalCache */
    static final class C3160c<K, V> extends AbstractQueue<C2138LC<K, V>> {
        final C2138LC<K, V> a = new C3186pC(this);

        C3160c() {
        }

        /* renamed from: a */
        public boolean offer(C2138LC<K, V> lc) {
            C3157oC.a(lc.a(), lc.d());
            C3157oC.a(this.a.a(), lc);
            C3157oC.a(lc, this.a);
            return true;
        }

        public void clear() {
            C2138LC<K, V> d = this.a.d();
            while (true) {
                C2138LC<K, V> lc = this.a;
                if (d != lc) {
                    C2138LC d2 = d.d();
                    C3157oC.a(d);
                    d = d2;
                } else {
                    lc.b(lc);
                    C2138LC<K, V> lc2 = this.a;
                    lc2.a(lc2);
                    return;
                }
            }
        }

        public boolean contains(Object obj) {
            return ((C2138LC) obj).d() != o.INSTANCE;
        }

        public boolean isEmpty() {
            return this.a.d() == this.a;
        }

        public Iterator<C2138LC<K, V>> iterator() {
            return new C3205qC(this, peek());
        }

        public boolean remove(Object obj) {
            C2138LC lc = (C2138LC) obj;
            C2138LC a2 = lc.a();
            C2138LC d = lc.d();
            C3157oC.a(a2, d);
            C3157oC.a(lc);
            return d != o.INSTANCE;
        }

        public int size() {
            int i = 0;
            for (C2138LC<K, V> d = this.a.d(); d != this.a; d = d.d()) {
                i++;
            }
            return i;
        }

        public C2138LC<K, V> peek() {
            C2138LC<K, V> d = this.a.d();
            if (d == this.a) {
                return null;
            }
            return d;
        }

        public C2138LC<K, V> poll() {
            C2138LC<K, V> d = this.a.d();
            if (d == this.a) {
                return null;
            }
            remove(d);
            return d;
        }
    }

    /* renamed from: oC$d reason: case insensitive filesystem */
    /* compiled from: LocalCache */
    enum C3161d {
        STRONG,
        STRONG_ACCESS,
        STRONG_WRITE,
        STRONG_ACCESS_WRITE,
        WEAK,
        WEAK_ACCESS,
        WEAK_WRITE,
        WEAK_ACCESS_WRITE;
        
        static final C3161d[] i = null;

        static {
            C3161d dVar;
            C3161d dVar2;
            C3161d dVar3;
            C3161d dVar4;
            C3161d dVar5;
            C3161d dVar6;
            C3161d dVar7;
            C3161d dVar8;
            i = new C3161d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8};
        }

        static C3161d a(r rVar, boolean z, boolean z2) {
            char c = 0;
            boolean z3 = (rVar == r.WEAK ? (char) 4 : 0) | z;
            if (z2) {
                c = 2;
            }
            return i[z3 | c];
        }

        /* access modifiers changed from: 0000 */
        public abstract <K, V> C2138LC<K, V> a(p<K, V> pVar, K k, int i2, C2138LC<K, V> lc);

        /* access modifiers changed from: 0000 */
        public <K, V> void b(C2138LC<K, V> lc, C2138LC<K, V> lc2) {
            lc2.b(lc.g());
            C3157oC.b(lc.e(), lc2);
            C3157oC.b(lc2, lc.b());
            C3157oC.b(lc);
        }

        /* access modifiers changed from: 0000 */
        public <K, V> C2138LC<K, V> a(p<K, V> pVar, C2138LC<K, V> lc, C2138LC<K, V> lc2) {
            return a(pVar, lc.getKey(), lc.f(), lc2);
        }

        /* access modifiers changed from: 0000 */
        public <K, V> void a(C2138LC<K, V> lc, C2138LC<K, V> lc2) {
            lc2.a(lc.v());
            C3157oC.a(lc.a(), lc2);
            C3157oC.a(lc2, lc.d());
            C3157oC.a(lc);
        }
    }

    /* renamed from: oC$e reason: case insensitive filesystem */
    /* compiled from: LocalCache */
    final class C3162e extends C3164g<Entry<K, V>> {
        C3162e() {
            super();
        }

        public Entry<K, V> next() {
            return b();
        }
    }

    /* renamed from: oC$f reason: case insensitive filesystem */
    /* compiled from: LocalCache */
    final class C3163f extends C3158a<Entry<K, V>> {
        C3163f(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        public boolean contains(Object obj) {
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null) {
                return false;
            }
            Object obj2 = C3157oC.this.get(key);
            if (obj2 != null && C3157oC.this.i.equivalent(entry.getValue(), obj2)) {
                z = true;
            }
            return z;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C3162e();
        }

        public boolean remove(Object obj) {
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key != null && C3157oC.this.remove(key, entry.getValue())) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: oC$g reason: case insensitive filesystem */
    /* compiled from: LocalCache */
    abstract class C3164g<T> implements Iterator<T> {
        int a;
        int b = -1;
        p<K, V> c;
        AtomicReferenceArray<C2138LC<K, V>> d;
        C2138LC<K, V> e;
        J f;
        J g;

        C3164g() {
            this.a = C3157oC.this.f.length - 1;
            a();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.f = null;
            if (!c() && !d()) {
                while (true) {
                    int i = this.a;
                    if (i < 0) {
                        break;
                    }
                    p<K, V>[] pVarArr = C3157oC.this.f;
                    this.a = i - 1;
                    this.c = pVarArr[i];
                    if (this.c.b != 0) {
                        this.d = this.c.f;
                        this.b = this.d.length() - 1;
                        if (d()) {
                            break;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public J b() {
            J j = this.f;
            if (j != null) {
                this.g = j;
                a();
                return this.g;
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: 0000 */
        public boolean c() {
            C2138LC<K, V> lc = this.e;
            if (lc != null) {
                while (true) {
                    this.e = lc.u();
                    C2138LC<K, V> lc2 = this.e;
                    if (lc2 == null) {
                        break;
                    } else if (a(lc2)) {
                        return true;
                    } else {
                        lc = this.e;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean d() {
            while (true) {
                int i = this.b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.d;
                this.b = i - 1;
                C2138LC<K, V> lc = (C2138LC) atomicReferenceArray.get(i);
                this.e = lc;
                if (lc == null || (!a(this.e) && !c())) {
                }
            }
            return true;
        }

        public boolean hasNext() {
            return this.f != null;
        }

        public void remove() {
            Preconditions.checkState(this.g != null);
            C3157oC.this.remove(this.g.getKey());
            this.g = null;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C2138LC<K, V> lc) {
            boolean z;
            try {
                long read = C3157oC.this.s.read();
                Object key = lc.getKey();
                Object a2 = C3157oC.this.a(lc, read);
                if (a2 != null) {
                    this.f = new J<>(key, a2);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.c.l();
            }
        }
    }

    /* renamed from: oC$h reason: case insensitive filesystem */
    /* compiled from: LocalCache */
    final class C3165h extends C3164g<K> {
        C3165h() {
            super();
        }

        public K next() {
            return b().getKey();
        }
    }

    /* renamed from: oC$i reason: case insensitive filesystem */
    /* compiled from: LocalCache */
    final class C3166i extends C3158a<K> {
        C3166i(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        public boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C3165h();
        }

        public boolean remove(Object obj) {
            return this.a.remove(obj) != null;
        }
    }

    /* renamed from: oC$j reason: case insensitive filesystem */
    /* compiled from: LocalCache */
    static final class C3167j<K, V> extends n<K, V> implements C3100lC<K, V>, Serializable {
        transient C3100lC<K, V> n;

        C3167j(C3157oC<K, V> oCVar) {
            super(oCVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.n = b().a(this.l);
        }

        private Object readResolve() {
            return this.n;
        }

        public final V apply(K k) {
            return this.n.apply(k);
        }

        public V get(K k) throws ExecutionException {
            return this.n.get(k);
        }
    }

    /* renamed from: oC$k */
    /* compiled from: LocalCache */
    static class k<K, V> implements y<K, V> {
        volatile y<K, V> a;
        final C1944BE<V> b;
        final Stopwatch c;

        public k() {
            this(C3157oC.m());
        }

        public int a() {
            return this.a.a();
        }

        public y<K, V> a(ReferenceQueue<V> referenceQueue, V v, C2138LC<K, V> lc) {
            return this;
        }

        public boolean b() {
            return true;
        }

        public boolean b(V v) {
            return this.b.a(v);
        }

        public C2138LC<K, V> c() {
            return null;
        }

        public V d() throws ExecutionException {
            return C1984DE.a(this.b);
        }

        public long e() {
            return this.c.elapsed(TimeUnit.NANOSECONDS);
        }

        public y<K, V> f() {
            return this.a;
        }

        public V get() {
            return this.a.get();
        }

        public boolean isActive() {
            return this.a.isActive();
        }

        public k(y<K, V> yVar) {
            this.b = C1944BE.h();
            this.c = Stopwatch.createUnstarted();
            this.a = yVar;
        }

        private C3347xE<V> b(Throwable th) {
            return C3267tE.a(th);
        }

        public boolean a(Throwable th) {
            return this.b.a(th);
        }

        public void a(V v) {
            if (v != null) {
                b(v);
            } else {
                this.a = C3157oC.m();
            }
        }

        public C3347xE<V> a(K k, C3043iC<? super K, V> iCVar) {
            try {
                this.c.start();
                Object obj = this.a.get();
                if (obj == null) {
                    Object a2 = iCVar.a(k);
                    return b((V) a2) ? this.b : C3267tE.a(a2);
                }
                C3347xE a3 = iCVar.a(k, obj);
                if (a3 == null) {
                    return C3267tE.a(null);
                }
                return C3267tE.a(a3, new C3385zC(this), C1924AE.a());
            } catch (Throwable th) {
                C3347xE<V> b2 = a(th) ? this.b : b(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return b2;
            }
        }
    }

    /* renamed from: oC$l */
    /* compiled from: LocalCache */
    static class l<K, V> extends m<K, V> implements C3100lC<K, V> {
        l(C3024hC<? super K, ? super V> hCVar, C3043iC<? super K, V> iCVar) {
            Preconditions.checkNotNull(iCVar);
            super(new C3157oC(hCVar, iCVar), null);
        }

        public final V apply(K k) {
            return b(k);
        }

        public V b(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new C1964CE(e.getCause());
            }
        }

        public V get(K k) throws ExecutionException {
            return this.a.b(k);
        }

        /* access modifiers changed from: 0000 */
        public Object writeReplace() {
            return new C3167j(this.a);
        }
    }

    /* renamed from: oC$m */
    /* compiled from: LocalCache */
    static class m<K, V> implements C2948dC<K, V>, Serializable {
        final C3157oC<K, V> a;

        /* synthetic */ m(C3157oC oCVar, C3119mC mCVar) {
            this(oCVar);
        }

        public void a(Object obj) {
            Preconditions.checkNotNull(obj);
            this.a.remove(obj);
        }

        /* access modifiers changed from: 0000 */
        public Object writeReplace() {
            return new n(this.a);
        }

        m(C3024hC<? super K, ? super V> hCVar) {
            this(new C3157oC<>(hCVar, null));
        }

        private m(C3157oC<K, V> oCVar) {
            this.a = oCVar;
        }
    }

    /* renamed from: oC$n */
    /* compiled from: LocalCache */
    static class n<K, V> extends C3081kC<K, V> implements Serializable {
        final r a;
        final r b;
        final Equivalence<Object> c;
        final Equivalence<Object> d;
        final long e;
        final long f;
        final long g;
        final C2345WC<K, V> h;
        final int i;
        final C2271SC<? super K, ? super V> j;
        final Ticker k;
        final C3043iC<? super K, V> l;
        transient C2948dC<K, V> m;

        n(C3157oC<K, V> oCVar) {
            C3157oC<K, V> oCVar2 = oCVar;
            r rVar = oCVar2.j;
            r rVar2 = oCVar2.k;
            Equivalence<Object> equivalence = oCVar2.h;
            Equivalence<Object> equivalence2 = oCVar2.i;
            long j2 = oCVar2.o;
            long j3 = oCVar2.n;
            long j4 = oCVar2.l;
            C2345WC<K, V> wc = oCVar2.m;
            int i2 = oCVar2.g;
            C2271SC<K, V> sc = oCVar2.r;
            Ticker ticker = oCVar2.s;
            C3043iC<? super K, V> iCVar = oCVar2.v;
            this(rVar, rVar2, equivalence, equivalence2, j2, j3, j4, wc, i2, sc, ticker, iCVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.m = b().a();
        }

        private Object readResolve() {
            return this.m;
        }

        /* access modifiers changed from: 0000 */
        public C3024hC<K, V> b() {
            C3024hC<K, V> o = C3024hC.o();
            o.a(this.a);
            o.b(this.b);
            o.a(this.c);
            o.b(this.d);
            o.a(this.i);
            o.a(this.j);
            o.f = false;
            long j2 = this.e;
            if (j2 > 0) {
                o.b(j2, TimeUnit.NANOSECONDS);
            }
            long j3 = this.f;
            if (j3 > 0) {
                o.a(j3, TimeUnit.NANOSECONDS);
            }
            C2345WC<K, V> wc = this.h;
            if (wc != b.INSTANCE) {
                o.a(wc);
                long j4 = this.g;
                if (j4 != -1) {
                    o.b(j4);
                }
            } else {
                long j5 = this.g;
                if (j5 != -1) {
                    o.a(j5);
                }
            }
            Ticker ticker = this.k;
            if (ticker != null) {
                o.a(ticker);
            }
            return o;
        }

        private n(r rVar, r rVar2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j2, long j3, long j4, C2345WC<K, V> wc, int i2, C2271SC<? super K, ? super V> sc, Ticker ticker, C3043iC<? super K, V> iCVar) {
            this.a = rVar;
            this.b = rVar2;
            this.c = equivalence;
            this.d = equivalence2;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = wc;
            this.i = i2;
            this.j = sc;
            if (ticker == Ticker.systemTicker() || ticker == C3024hC.d) {
                ticker = null;
            }
            this.k = ticker;
            this.l = iCVar;
        }

        /* access modifiers changed from: protected */
        public C2948dC<K, V> a() {
            return this.m;
        }
    }

    /* renamed from: oC$o */
    /* compiled from: LocalCache */
    private enum o implements C2138LC<Object, Object> {
        INSTANCE;

        public C2138LC<Object, Object> a() {
            return this;
        }

        public void a(long j) {
        }

        public void a(C2138LC<Object, Object> lc) {
        }

        public void a(y<Object, Object> yVar) {
        }

        public C2138LC<Object, Object> b() {
            return this;
        }

        public void b(long j) {
        }

        public void b(C2138LC<Object, Object> lc) {
        }

        public y<Object, Object> c() {
            return null;
        }

        public void c(C2138LC<Object, Object> lc) {
        }

        public C2138LC<Object, Object> d() {
            return this;
        }

        public void d(C2138LC<Object, Object> lc) {
        }

        public C2138LC<Object, Object> e() {
            return this;
        }

        public int f() {
            return 0;
        }

        public long g() {
            return 0;
        }

        public Object getKey() {
            return null;
        }

        public C2138LC<Object, Object> u() {
            return null;
        }

        public long v() {
            return 0;
        }
    }

    /* renamed from: oC$p */
    /* compiled from: LocalCache */
    static class p<K, V> extends ReentrantLock {
        @Weak
        final C3157oC<K, V> a;
        volatile int b;
        @GuardedBy("this")
        long c;
        int d;
        int e;
        volatile AtomicReferenceArray<C2138LC<K, V>> f;
        final long g;
        final ReferenceQueue<K> h;
        final ReferenceQueue<V> i;
        final Queue<C2138LC<K, V>> j;
        final AtomicInteger k = new AtomicInteger();
        @GuardedBy("this")
        final Queue<C2138LC<K, V>> l;
        @GuardedBy("this")
        final Queue<C2138LC<K, V>> m;
        final C2475cC n;

        p(C3157oC<K, V> oCVar, int i2, long j2, C2475cC cCVar) {
            Queue<C2138LC<K, V>> queue;
            Queue<C2138LC<K, V>> queue2;
            Queue<C2138LC<K, V>> queue3;
            this.a = oCVar;
            this.g = j2;
            Preconditions.checkNotNull(cCVar);
            this.n = cCVar;
            a(b(i2));
            ReferenceQueue<V> referenceQueue = null;
            this.h = oCVar.p() ? new ReferenceQueue<>() : null;
            if (oCVar.q()) {
                referenceQueue = new ReferenceQueue<>();
            }
            this.i = referenceQueue;
            if (oCVar.o()) {
                queue = new ConcurrentLinkedQueue<>();
            } else {
                queue = C3157oC.b();
            }
            this.j = queue;
            if (oCVar.s()) {
                queue2 = new I<>();
            } else {
                queue2 = C3157oC.b();
            }
            this.l = queue2;
            if (oCVar.o()) {
                queue3 = new C3160c<>();
            } else {
                queue3 = C3157oC.b();
            }
            this.m = queue3;
        }

        /* access modifiers changed from: 0000 */
        public void a(AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray) {
            this.e = (atomicReferenceArray.length() * 3) / 4;
            if (!this.a.a()) {
                int i2 = this.e;
                if (((long) i2) == this.g) {
                    this.e = i2 + 1;
                }
            }
            this.f = atomicReferenceArray;
        }

        /* access modifiers changed from: 0000 */
        public AtomicReferenceArray<C2138LC<K, V>> b(int i2) {
            return new AtomicReferenceArray<>(i2);
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            do {
            } while (this.h.poll() != null);
        }

        /* access modifiers changed from: 0000 */
        public void d() {
            if (this.a.p()) {
                c();
            }
            if (this.a.q()) {
                e();
            }
        }

        /* access modifiers changed from: 0000 */
        public void e() {
            do {
            } while (this.i.poll() != null);
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void f() {
            int i2 = 0;
            do {
                Reference poll = this.h.poll();
                if (poll != null) {
                    this.a.c((C2138LC) poll);
                    i2++;
                } else {
                    return;
                }
            } while (i2 != 16);
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void g() {
            while (true) {
                C2138LC lc = (C2138LC) this.j.poll();
                if (lc == null) {
                    return;
                }
                if (this.m.contains(lc)) {
                    this.m.add(lc);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void h() {
            if (this.a.p()) {
                f();
            }
            if (this.a.q()) {
                i();
            }
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void i() {
            int i2 = 0;
            do {
                Reference poll = this.i.poll();
                if (poll != null) {
                    this.a.a((y) poll);
                    i2++;
                } else {
                    return;
                }
            } while (i2 != 16);
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void j() {
            AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i2 = this.b;
                AtomicReferenceArray<C2138LC<K, V>> b2 = b(length << 1);
                this.e = (b2.length() * 3) / 4;
                int length2 = b2.length() - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    C2138LC lc = (C2138LC) atomicReferenceArray.get(i3);
                    if (lc != null) {
                        C2138LC u = lc.u();
                        int f2 = lc.f() & length2;
                        if (u == null) {
                            b2.set(f2, lc);
                        } else {
                            C2138LC lc2 = lc;
                            while (u != null) {
                                int f3 = u.f() & length2;
                                if (f3 != f2) {
                                    lc2 = u;
                                    f2 = f3;
                                }
                                u = u.u();
                            }
                            b2.set(f2, lc2);
                            while (lc != lc2) {
                                int f4 = lc.f() & length2;
                                C2138LC a2 = a(lc, (C2138LC) b2.get(f4));
                                if (a2 != null) {
                                    b2.set(f4, a2);
                                } else {
                                    b(lc);
                                    i2--;
                                }
                                lc = lc.u();
                            }
                        }
                    }
                }
                this.f = b2;
                this.b = i2;
            }
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public C2138LC<K, V> k() {
            for (C2138LC<K, V> lc : this.m) {
                if (lc.c().a() > 0) {
                    return lc;
                }
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        public void l() {
            if ((this.k.incrementAndGet() & 63) == 0) {
                a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void m() {
            n();
        }

        /* access modifiers changed from: 0000 */
        public void n() {
            if (!isHeldByCurrentThread()) {
                this.a.h();
            }
        }

        /* access modifiers changed from: 0000 */
        public void o() {
            if (tryLock()) {
                try {
                    h();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public V b(Object obj, int i2) {
            try {
                if (this.b != 0) {
                    long read = this.a.s.read();
                    C2138LC a2 = a(obj, i2, read);
                    if (a2 == null) {
                        return null;
                    }
                    Object obj2 = a2.c().get();
                    if (obj2 != null) {
                        c(a2, read);
                        V a3 = a(a2, a2.getKey(), i2, obj2, read, this.a.v);
                        l();
                        return a3;
                    }
                    o();
                }
                l();
                return null;
            } finally {
                l();
            }
        }

        /* access modifiers changed from: 0000 */
        public void c(C2138LC<K, V> lc, long j2) {
            if (this.a.i()) {
                lc.a(j2);
            }
            this.j.add(lc);
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public C2138LC<K, V> a(K k2, int i2, C2138LC<K, V> lc) {
            C3161d dVar = this.a.t;
            Preconditions.checkNotNull(k2);
            return dVar.a(this, k2, i2, lc);
        }

        /* access modifiers changed from: 0000 */
        public C2138LC<K, V> c(Object obj, int i2) {
            for (C2138LC<K, V> a2 = a(i2); a2 != null; a2 = a2.u()) {
                if (a2.f() == i2) {
                    Object key = a2.getKey();
                    if (key == null) {
                        o();
                    } else if (this.a.h.equivalent(obj, key)) {
                        return a2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public void d(long j2) {
            if (tryLock()) {
                try {
                    a(j2);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public C2138LC<K, V> a(C2138LC<K, V> lc, C2138LC<K, V> lc2) {
            if (lc.getKey() == null) {
                return null;
            }
            y c2 = lc.c();
            Object obj = c2.get();
            if (obj == null && c2.isActive()) {
                return null;
            }
            C2138LC<K, V> a2 = this.a.t.a(this, lc, lc2);
            a2.a(c2.a(this.i, obj, a2));
            return a2;
        }

        /* access modifiers changed from: 0000 */
        public V d(Object obj, int i2) {
            C2252RC rc;
            lock();
            try {
                b(this.a.s.read());
                int i3 = this.b;
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i2;
                C2138LC lc = (C2138LC) atomicReferenceArray.get(length);
                C2138LC lc2 = lc;
                while (true) {
                    if (lc2 == null) {
                        break;
                    }
                    Object key = lc2.getKey();
                    if (lc2.f() != i2 || key == null || !this.a.h.equivalent(obj, key)) {
                        lc2 = lc2.u();
                    } else {
                        y c2 = lc2.c();
                        V v = c2.get();
                        if (v != null) {
                            rc = C2252RC.a;
                        } else if (c2.isActive()) {
                            rc = C2252RC.COLLECTED;
                        }
                        C2252RC rc2 = rc;
                        this.d++;
                        int i4 = this.b - 1;
                        atomicReferenceArray.set(length, a(lc, lc2, key, i2, v, c2, rc2));
                        this.b = i4;
                        return v;
                    }
                }
                unlock();
                m();
                return null;
            } finally {
                unlock();
                m();
            }
        }

        /* access modifiers changed from: 0000 */
        public void c(long j2) {
            if (tryLock()) {
                try {
                    h();
                    a(j2);
                    this.k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void a(C2138LC<K, V> lc, K k2, V v, long j2) {
            y c2 = lc.c();
            int a2 = this.a.m.a(k2, v);
            Preconditions.checkState(a2 >= 0, "Weights must be non-negative");
            lc.a(this.a.k.a(this, lc, v, a2));
            a(lc, a2, j2);
            c2.a(v);
        }

        /* access modifiers changed from: 0000 */
        public V b(K k2, int i2, C3043iC<? super K, V> iCVar) throws ExecutionException {
            k kVar;
            y yVar;
            boolean z;
            V b2;
            K k3 = k2;
            int i3 = i2;
            lock();
            try {
                long read = this.a.s.read();
                b(read);
                int i4 = this.b - 1;
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
                int length = i3 & (atomicReferenceArray.length() - 1);
                C2138LC lc = (C2138LC) atomicReferenceArray.get(length);
                C2138LC lc2 = lc;
                while (true) {
                    kVar = null;
                    if (lc2 == null) {
                        yVar = null;
                        break;
                    }
                    Object key = lc2.getKey();
                    if (lc2.f() != i3 || key == null || !this.a.h.equivalent(k3, key)) {
                        lc2 = lc2.u();
                    } else {
                        y c2 = lc2.c();
                        if (c2.b()) {
                            z = false;
                            yVar = c2;
                        } else {
                            V v = c2.get();
                            if (v == null) {
                                a(key, i2, v, c2.a(), C2252RC.COLLECTED);
                            } else if (this.a.b(lc2, read)) {
                                a(key, i2, v, c2.a(), C2252RC.EXPIRED);
                            } else {
                                b(lc2, read);
                                this.n.a(1);
                                unlock();
                                m();
                                return v;
                            }
                            this.l.remove(lc2);
                            this.m.remove(lc2);
                            this.b = i4;
                            yVar = c2;
                        }
                    }
                }
                z = true;
                if (z) {
                    kVar = new k();
                    if (lc2 == null) {
                        lc2 = a(k3, i3, lc);
                        lc2.a((y<K, V>) kVar);
                        atomicReferenceArray.set(length, lc2);
                    } else {
                        lc2.a((y<K, V>) kVar);
                    }
                }
                if (!z) {
                    return a(lc2, k3, yVar);
                }
                try {
                    synchronized (lc2) {
                        b2 = b(k3, i3, kVar, iCVar);
                    }
                    this.n.b(1);
                    return b2;
                } catch (Throwable th) {
                    this.n.b(1);
                    throw th;
                }
            } finally {
                unlock();
                m();
            }
        }

        /* access modifiers changed from: 0000 */
        public V a(K k2, int i2, C3043iC<? super K, V> iCVar) throws ExecutionException {
            Preconditions.checkNotNull(k2);
            Preconditions.checkNotNull(iCVar);
            try {
                if (this.b != 0) {
                    C2138LC c2 = c((Object) k2, i2);
                    if (c2 != null) {
                        long read = this.a.s.read();
                        Object a2 = a(c2, read);
                        if (a2 != null) {
                            c(c2, read);
                            this.n.a(1);
                            V a3 = a(c2, k2, i2, a2, read, iCVar);
                            l();
                            return a3;
                        }
                        y c3 = c2.c();
                        if (c3.b()) {
                            V a4 = a(c2, k2, c3);
                            l();
                            return a4;
                        }
                    }
                }
                V b2 = b(k2, i2, iCVar);
                l();
                return b2;
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof Error) {
                    throw new C3227rE((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new C1964CE(cause);
                } else {
                    throw e2;
                }
            } catch (Throwable th) {
                l();
                throw th;
            }
        }

        /* access modifiers changed from: 0000 */
        public V a(C2138LC<K, V> lc, K k2, y<K, V> yVar) throws ExecutionException {
            if (yVar.b()) {
                Preconditions.checkState(!Thread.holdsLock(lc), "Recursive load of: %s", (Object) k2);
                try {
                    V d2 = yVar.d();
                    if (d2 != null) {
                        c(lc, this.a.s.read());
                        return d2;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("CacheLoader returned null for key ");
                    sb.append(k2);
                    sb.append(".");
                    throw new a(sb.toString());
                } finally {
                    this.n.b(1);
                }
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        public C3347xE<V> a(K k2, int i2, k<K, V> kVar, C3043iC<? super K, V> iCVar) {
            C3347xE<V> a2 = kVar.a(k2, iCVar);
            C1922AC ac = new C1922AC(this, k2, i2, kVar, a2);
            a2.a(ac, C1924AE.a());
            return a2;
        }

        /* access modifiers changed from: 0000 */
        public V b(K k2, int i2, k<K, V> kVar, C3043iC<? super K, V> iCVar) throws ExecutionException {
            return a(k2, i2, kVar, kVar.a(k2, iCVar));
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
        public V a(K k2, int i2, k<K, V> kVar, C3347xE<V> xEVar) throws ExecutionException {
            V v;
            try {
                v = C1984DE.a(xEVar);
                if (v != null) {
                    try {
                        this.n.b(kVar.e());
                        a(k2, i2, kVar, v);
                        if (v == null) {
                            this.n.a(kVar.e());
                            a(k2, i2, kVar);
                        }
                        return v;
                    } catch (Throwable th) {
                        th = th;
                        if (v == null) {
                            this.n.a(kVar.e());
                            a(k2, i2, kVar);
                        }
                        throw th;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CacheLoader returned null for key ");
                    sb.append(k2);
                    sb.append(".");
                    throw new a(sb.toString());
                }
            } catch (Throwable th2) {
                th = th2;
                v = null;
                if (v == null) {
                }
                throw th;
            }
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void b(C2138LC<K, V> lc, long j2) {
            if (this.a.i()) {
                lc.a(j2);
            }
            this.m.add(lc);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
            r15 = r12.c();
            r16 = r15.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
            if (r16 != null) goto L_0x0075;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
            if (r15.isActive() == false) goto L_0x006e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            r1 = r9.b;
            r9.d++;
            r0 = a(r2, r12, r4, r19, r16, r15, defpackage.C2252RC.c);
            r1 = r9.b - 1;
            r10.set(r11, r0);
            r9.b = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r9.d++;
            a(r18, r19, r16, r15.a(), defpackage.C2252RC.b);
            a(r12, r18, r20, r7);
            a(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
            unlock();
            m();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
            return r16;
         */
        public V b(K k2, int i2, V v) {
            int i3 = i2;
            lock();
            try {
                long read = this.a.s.read();
                b(read);
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
                int length = i3 & (atomicReferenceArray.length() - 1);
                C2138LC lc = (C2138LC) atomicReferenceArray.get(length);
                C2138LC lc2 = lc;
                while (true) {
                    if (lc2 == null) {
                        break;
                    }
                    Object key = lc2.getKey();
                    if (lc2.f() == i3 && key != null) {
                        if (this.a.h.equivalent(k2, key)) {
                            break;
                        }
                    } else {
                        K k3 = k2;
                    }
                    lc2 = lc2.u();
                }
                return null;
            } finally {
                unlock();
                m();
            }
        }

        /* access modifiers changed from: 0000 */
        public V a(C2138LC<K, V> lc, K k2, int i2, V v, long j2, C3043iC<? super K, V> iCVar) {
            if (this.a.l() && j2 - lc.g() > this.a.p && !lc.c().b()) {
                V a2 = a(k2, i2, iCVar, true);
                if (a2 != null) {
                    return a2;
                }
            }
            return v;
        }

        /* access modifiers changed from: 0000 */
        public V a(K k2, int i2, C3043iC<? super K, V> iCVar, boolean z) {
            k a2 = a(k2, i2, z);
            if (a2 == null) {
                return null;
            }
            C3347xE a3 = a(k2, i2, a2, iCVar);
            if (a3.isDone()) {
                try {
                    return C1984DE.a(a3);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public k<K, V> a(K k2, int i2, boolean z) {
            lock();
            try {
                long read = this.a.s.read();
                b(read);
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i2;
                C2138LC lc = (C2138LC) atomicReferenceArray.get(length);
                C2138LC lc2 = lc;
                while (lc2 != null) {
                    Object key = lc2.getKey();
                    if (lc2.f() != i2 || key == null || !this.a.h.equivalent(k2, key)) {
                        lc2 = lc2.u();
                    } else {
                        y c2 = lc2.c();
                        if (!c2.b()) {
                            if (!z || read - lc2.g() >= this.a.p) {
                                this.d++;
                                k<K, V> kVar = new k<>(c2);
                                lc2.a((y<K, V>) kVar);
                                unlock();
                                m();
                                return kVar;
                            }
                        }
                        return null;
                    }
                }
                this.d++;
                k<K, V> kVar2 = new k<>();
                C2138LC a2 = a(k2, i2, lc);
                a2.a((y<K, V>) kVar2);
                atomicReferenceArray.set(length, a2);
                unlock();
                m();
                return kVar2;
            } finally {
                unlock();
                m();
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            C2252RC rc;
            if (this.b != 0) {
                lock();
                try {
                    b(this.a.s.read());
                    AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (C2138LC lc = (C2138LC) atomicReferenceArray.get(i2); lc != null; lc = lc.u()) {
                            if (lc.c().isActive()) {
                                Object key = lc.getKey();
                                Object obj = lc.c().get();
                                if (key != null) {
                                    if (obj != null) {
                                        rc = C2252RC.a;
                                        a(key, lc.f(), obj, lc.c().a(), rc);
                                    }
                                }
                                rc = C2252RC.COLLECTED;
                                a(key, lc.f(), obj, lc.c().a(), rc);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    d();
                    this.l.clear();
                    this.m.clear();
                    this.k.set(0);
                    this.d++;
                    this.b = 0;
                } finally {
                    unlock();
                    m();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void a(C2138LC<K, V> lc, int i2, long j2) {
            g();
            this.c += (long) i2;
            if (this.a.i()) {
                lc.a(j2);
            }
            if (this.a.k()) {
                lc.b(j2);
            }
            this.m.add(lc);
            this.l.add(lc);
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void a(long j2) {
            C2138LC lc;
            C2138LC lc2;
            g();
            do {
                lc = (C2138LC) this.l.peek();
                if (lc == null || !this.a.b(lc, j2)) {
                    do {
                        lc2 = (C2138LC) this.m.peek();
                        if (lc2 == null || !this.a.b(lc2, j2)) {
                            return;
                        }
                    } while (a(lc2, lc2.f(), C2252RC.EXPIRED));
                    throw new AssertionError();
                }
            } while (a(lc, lc.f(), C2252RC.EXPIRED));
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void a(K k2, int i2, V v, int i3, C2252RC rc) {
            this.c -= (long) i3;
            if (rc.a()) {
                this.n.a();
            }
            if (this.a.q != C3157oC.c) {
                this.a.q.offer(C2290TC.a(k2, v, rc));
            }
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public C2138LC<K, V> b(C2138LC<K, V> lc, C2138LC<K, V> lc2) {
            int i2 = this.b;
            C2138LC<K, V> u = lc2.u();
            while (lc != lc2) {
                C2138LC<K, V> a2 = a(lc, u);
                if (a2 != null) {
                    u = a2;
                } else {
                    b(lc);
                    i2--;
                }
                lc = lc.u();
            }
            this.b = i2;
            return u;
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void a(C2138LC<K, V> lc) {
            if (this.a.c()) {
                g();
                if (((long) lc.c().a()) <= this.g || a(lc, lc.f(), C2252RC.SIZE)) {
                    while (this.c > this.g) {
                        C2138LC k2 = k();
                        if (!a(k2, k2.f(), C2252RC.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void b(C2138LC<K, V> lc) {
            a(lc.getKey(), lc.f(), lc.c().get(), lc.c().a(), C2252RC.COLLECTED);
            this.l.remove(lc);
            this.m.remove(lc);
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public void b(long j2) {
            c(j2);
        }

        /* access modifiers changed from: 0000 */
        public C2138LC<K, V> a(int i2) {
            AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
            return (C2138LC) atomicReferenceArray.get(i2 & (atomicReferenceArray.length() - 1));
        }

        /* access modifiers changed from: 0000 */
        public C2138LC<K, V> a(Object obj, int i2, long j2) {
            C2138LC<K, V> c2 = c(obj, i2);
            if (c2 == null) {
                return null;
            }
            if (!this.a.b(c2, j2)) {
                return c2;
            }
            d(j2);
            return null;
        }

        /* access modifiers changed from: 0000 */
        public V a(C2138LC<K, V> lc, long j2) {
            if (lc.getKey() == null) {
                o();
                return null;
            }
            V v = lc.c().get();
            if (v == null) {
                o();
                return null;
            } else if (!this.a.b(lc, j2)) {
                return v;
            } else {
                d(j2);
                return null;
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(Object obj, int i2) {
            try {
                boolean z = false;
                if (this.b != 0) {
                    C2138LC a2 = a(obj, i2, this.a.s.read());
                    if (a2 == null) {
                        return false;
                    }
                    if (a2.c().get() != null) {
                        z = true;
                    }
                    l();
                    return z;
                }
                l();
                return false;
            } finally {
                l();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
            r1 = r12.c();
            r10 = r1.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
            if (r10 != null) goto L_0x0092;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
            r7.d++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
            if (r1.isActive() == false) goto L_0x0079;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
            a(r15, r16, r10, r1.a(), defpackage.C2252RC.c);
            a(r12, r15, r17, r8);
            r0 = r7.b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
            a(r12, r15, r17, r8);
            r0 = r7.b + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0086, code lost:
            r7.b = r0;
            a(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0092, code lost:
            if (r18 == false) goto L_0x009e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            b(r12, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
            unlock();
            m();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
            return r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r7.d++;
            a(r15, r16, r10, r1.a(), defpackage.C2252RC.b);
            a(r12, r15, r17, r8);
            a(r12);
         */
        public V a(K k2, int i2, V v, boolean z) {
            K k3 = k2;
            int i3 = i2;
            lock();
            try {
                long read = this.a.s.read();
                b(read);
                if (this.b + 1 > this.e) {
                    j();
                    int i4 = this.b;
                }
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
                int length = i3 & (atomicReferenceArray.length() - 1);
                C2138LC lc = (C2138LC) atomicReferenceArray.get(length);
                C2138LC lc2 = lc;
                while (true) {
                    if (lc2 == null) {
                        this.d++;
                        C2138LC a2 = a(k2, i3, lc);
                        a(a2, k2, v, read);
                        atomicReferenceArray.set(length, a2);
                        this.b++;
                        a(a2);
                        break;
                    }
                    Object key = lc2.getKey();
                    if (lc2.f() == i3 && key != null && this.a.h.equivalent(k2, key)) {
                        break;
                    }
                    lc2 = lc2.u();
                }
                return null;
            } finally {
                unlock();
                m();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
            r16 = r13.c();
            r6 = r16.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
            if (r6 != null) goto L_0x0072;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
            if (r16.isActive() == false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            r1 = r9.b;
            r9.d++;
            r0 = a(r2, r13, r4, r19, r6, r16, defpackage.C2252RC.c);
            r1 = r9.b - 1;
            r10.set(r12, r0);
            r9.b = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
            if (r9.a.i.equivalent(r20, r6) == false) goto L_0x00a9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
            r9.d++;
            a(r18, r19, r6, r16.a(), defpackage.C2252RC.b);
            a(r13, r18, r21, r7);
            a(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
            unlock();
            m();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a8, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            b(r13, r7);
         */
        public boolean a(K k2, int i2, V v, V v2) {
            int i3 = i2;
            lock();
            try {
                long read = this.a.s.read();
                b(read);
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
                int length = i3 & (atomicReferenceArray.length() - 1);
                C2138LC lc = (C2138LC) atomicReferenceArray.get(length);
                C2138LC lc2 = lc;
                while (true) {
                    if (lc2 == null) {
                        break;
                    }
                    Object key = lc2.getKey();
                    if (lc2.f() != i3 || key == null) {
                        K k3 = k2;
                    } else if (this.a.h.equivalent(k2, key)) {
                        break;
                    }
                    V v3 = v;
                    lc2 = lc2.u();
                }
                return false;
            } finally {
                unlock();
                m();
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(Object obj, int i2, Object obj2) {
            C2252RC rc;
            lock();
            try {
                b(this.a.s.read());
                int i3 = this.b;
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i2;
                C2138LC lc = (C2138LC) atomicReferenceArray.get(length);
                C2138LC lc2 = lc;
                while (true) {
                    if (lc2 == null) {
                        break;
                    }
                    Object key = lc2.getKey();
                    if (lc2.f() != i2 || key == null || !this.a.h.equivalent(obj, key)) {
                        lc2 = lc2.u();
                    } else {
                        y c2 = lc2.c();
                        Object obj3 = c2.get();
                        if (this.a.i.equivalent(obj2, obj3)) {
                            rc = C2252RC.a;
                        } else if (obj3 == null && c2.isActive()) {
                            rc = C2252RC.COLLECTED;
                        }
                        this.d++;
                        int i4 = this.b - 1;
                        atomicReferenceArray.set(length, a(lc, lc2, key, i2, obj3, c2, rc));
                        this.b = i4;
                        if (rc != C2252RC.a) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                m();
                return false;
            } finally {
                unlock();
                m();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
            r1 = r14.c();
            r4 = r1.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
            if (r18 == r1) goto L_0x0072;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
            if (r4 != null) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
            if (r1 == defpackage.C3157oC.b) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
            a(r16, r17, r19, 0, defpackage.C2252RC.b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
            unlock();
            m();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r7.d++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
            if (r18.isActive() == false) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
            if (r4 != null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
            r1 = defpackage.C2252RC.c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
            r1 = defpackage.C2252RC.b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
            r6 = r1;
            a(r16, r17, r4, r18.a(), r6);
            r11 = r11 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
            a(r14, r16, r19, r8);
            r7.b = r11;
            a(r14);
         */
        public boolean a(K k2, int i2, k<K, V> kVar, V v) {
            K k3 = k2;
            int i3 = i2;
            lock();
            try {
                long read = this.a.s.read();
                b(read);
                int i4 = this.b + 1;
                if (i4 > this.e) {
                    j();
                    i4 = this.b + 1;
                }
                int i5 = i4;
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
                int length = i3 & (atomicReferenceArray.length() - 1);
                C2138LC lc = (C2138LC) atomicReferenceArray.get(length);
                C2138LC lc2 = lc;
                while (true) {
                    if (lc2 == null) {
                        this.d++;
                        C2138LC a2 = a(k3, i3, lc);
                        a(a2, k2, v, read);
                        atomicReferenceArray.set(length, a2);
                        this.b = i5;
                        a(a2);
                        break;
                    }
                    Object key = lc2.getKey();
                    if (lc2.f() == i3 && key != null && this.a.h.equivalent(k3, key)) {
                        break;
                    }
                    k<K, V> kVar2 = kVar;
                    lc2 = lc2.u();
                }
                return true;
            } finally {
                unlock();
                m();
            }
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public C2138LC<K, V> a(C2138LC<K, V> lc, C2138LC<K, V> lc2, K k2, int i2, V v, y<K, V> yVar, C2252RC rc) {
            a(k2, i2, v, yVar.a(), rc);
            this.l.remove(lc2);
            this.m.remove(lc2);
            if (!yVar.b()) {
                return b(lc, lc2);
            }
            yVar.a(null);
            return lc;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C2138LC<K, V> lc, int i2) {
            lock();
            try {
                int i3 = this.b;
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i2;
                C2138LC<K, V> lc2 = (C2138LC) atomicReferenceArray.get(length);
                for (C2138LC<K, V> lc3 = lc2; lc3 != null; lc3 = lc3.u()) {
                    if (lc3 == lc) {
                        this.d++;
                        int i4 = this.b - 1;
                        atomicReferenceArray.set(length, a(lc2, lc3, lc3.getKey(), i2, lc3.c().get(), lc3.c(), C2252RC.COLLECTED));
                        this.b = i4;
                        return true;
                    }
                }
                unlock();
                m();
                return false;
            } finally {
                unlock();
                m();
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(K k2, int i2, y<K, V> yVar) {
            lock();
            try {
                int i3 = this.b;
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i2;
                C2138LC lc = (C2138LC) atomicReferenceArray.get(length);
                C2138LC lc2 = lc;
                while (lc2 != null) {
                    Object key = lc2.getKey();
                    if (lc2.f() != i2 || key == null || !this.a.h.equivalent(k2, key)) {
                        lc2 = lc2.u();
                    } else if (lc2.c() == yVar) {
                        this.d++;
                        int i4 = this.b - 1;
                        atomicReferenceArray.set(length, a(lc, lc2, key, i2, yVar.get(), yVar, C2252RC.COLLECTED));
                        this.b = i4;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            m();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    m();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    m();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(K k2, int i2, k<K, V> kVar) {
            lock();
            try {
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i2;
                C2138LC lc = (C2138LC) atomicReferenceArray.get(length);
                C2138LC lc2 = lc;
                while (true) {
                    if (lc2 == null) {
                        break;
                    }
                    Object key = lc2.getKey();
                    if (lc2.f() != i2 || key == null || !this.a.h.equivalent(k2, key)) {
                        lc2 = lc2.u();
                    } else if (lc2.c() == kVar) {
                        if (kVar.isActive()) {
                            lc2.a(kVar.f());
                        } else {
                            atomicReferenceArray.set(length, b(lc, lc2));
                        }
                        return true;
                    }
                }
                unlock();
                m();
                return false;
            } finally {
                unlock();
                m();
            }
        }

        /* access modifiers changed from: 0000 */
        @GuardedBy("this")
        public boolean a(C2138LC<K, V> lc, int i2, C2252RC rc) {
            int i3 = this.b;
            AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i2;
            C2138LC<K, V> lc2 = (C2138LC) atomicReferenceArray.get(length);
            for (C2138LC<K, V> lc3 = lc2; lc3 != null; lc3 = lc3.u()) {
                if (lc3 == lc) {
                    this.d++;
                    int i4 = this.b - 1;
                    atomicReferenceArray.set(length, a(lc2, lc3, lc3.getKey(), i2, lc3.c().get(), lc3.c(), rc));
                    this.b = i4;
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            c(this.a.s.read());
            n();
        }
    }

    /* renamed from: oC$q */
    /* compiled from: LocalCache */
    static class q<K, V> extends SoftReference<V> implements y<K, V> {
        final C2138LC<K, V> a;

        q(ReferenceQueue<V> referenceQueue, V v, C2138LC<K, V> lc) {
            super(v, referenceQueue);
            this.a = lc;
        }

        public int a() {
            return 1;
        }

        public y<K, V> a(ReferenceQueue<V> referenceQueue, V v, C2138LC<K, V> lc) {
            return new q(referenceQueue, v, lc);
        }

        public void a(V v) {
        }

        public boolean b() {
            return false;
        }

        public C2138LC<K, V> c() {
            return this.a;
        }

        public V d() {
            return get();
        }

        public boolean isActive() {
            return true;
        }
    }

    /* renamed from: oC$r */
    /* compiled from: LocalCache */
    enum r {
        STRONG,
        SOFT,
        WEAK;

        /* access modifiers changed from: 0000 */
        public abstract Equivalence<Object> a();

        /* access modifiers changed from: 0000 */
        public abstract <K, V> y<K, V> a(p<K, V> pVar, C2138LC<K, V> lc, V v, int i);
    }

    /* renamed from: oC$s */
    /* compiled from: LocalCache */
    static final class s<K, V> extends u<K, V> {
        volatile long e = Long.MAX_VALUE;
        C2138LC<K, V> f = C3157oC.g();
        C2138LC<K, V> g = C3157oC.g();

        s(K k, int i, C2138LC<K, V> lc) {
            super(k, i, lc);
        }

        public void a(long j) {
            this.e = j;
        }

        public void b(C2138LC<K, V> lc) {
            this.f = lc;
        }

        public C2138LC<K, V> d() {
            return this.f;
        }

        public long v() {
            return this.e;
        }

        public C2138LC<K, V> a() {
            return this.g;
        }

        public void a(C2138LC<K, V> lc) {
            this.g = lc;
        }
    }

    /* renamed from: oC$t */
    /* compiled from: LocalCache */
    static final class t<K, V> extends u<K, V> {
        volatile long e = Long.MAX_VALUE;
        C2138LC<K, V> f = C3157oC.g();
        C2138LC<K, V> g = C3157oC.g();
        volatile long h = Long.MAX_VALUE;
        C2138LC<K, V> i = C3157oC.g();
        C2138LC<K, V> j = C3157oC.g();

        t(K k, int i2, C2138LC<K, V> lc) {
            super(k, i2, lc);
        }

        public void a(long j2) {
            this.e = j2;
        }

        public void b(C2138LC<K, V> lc) {
            this.f = lc;
        }

        public void c(C2138LC<K, V> lc) {
            this.i = lc;
        }

        public C2138LC<K, V> d() {
            return this.f;
        }

        public C2138LC<K, V> e() {
            return this.j;
        }

        public long g() {
            return this.h;
        }

        public long v() {
            return this.e;
        }

        public C2138LC<K, V> a() {
            return this.g;
        }

        public void b(long j2) {
            this.h = j2;
        }

        public void d(C2138LC<K, V> lc) {
            this.j = lc;
        }

        public void a(C2138LC<K, V> lc) {
            this.g = lc;
        }

        public C2138LC<K, V> b() {
            return this.i;
        }
    }

    /* renamed from: oC$u */
    /* compiled from: LocalCache */
    static class u<K, V> extends C3159b<K, V> {
        final K a;
        final int b;
        final C2138LC<K, V> c;
        volatile y<K, V> d = C3157oC.m();

        u(K k, int i, C2138LC<K, V> lc) {
            this.a = k;
            this.b = i;
            this.c = lc;
        }

        public void a(y<K, V> yVar) {
            this.d = yVar;
        }

        public y<K, V> c() {
            return this.d;
        }

        public int f() {
            return this.b;
        }

        public K getKey() {
            return this.a;
        }

        public C2138LC<K, V> u() {
            return this.c;
        }
    }

    /* renamed from: oC$v */
    /* compiled from: LocalCache */
    static class v<K, V> implements y<K, V> {
        final V a;

        v(V v) {
            this.a = v;
        }

        public int a() {
            return 1;
        }

        public y<K, V> a(ReferenceQueue<V> referenceQueue, V v, C2138LC<K, V> lc) {
            return this;
        }

        public void a(V v) {
        }

        public boolean b() {
            return false;
        }

        public C2138LC<K, V> c() {
            return null;
        }

        public V d() {
            return get();
        }

        public V get() {
            return this.a;
        }

        public boolean isActive() {
            return true;
        }
    }

    /* renamed from: oC$w */
    /* compiled from: LocalCache */
    static final class w<K, V> extends u<K, V> {
        volatile long e = Long.MAX_VALUE;
        C2138LC<K, V> f = C3157oC.g();
        C2138LC<K, V> g = C3157oC.g();

        w(K k, int i, C2138LC<K, V> lc) {
            super(k, i, lc);
        }

        public void b(long j) {
            this.e = j;
        }

        public void c(C2138LC<K, V> lc) {
            this.f = lc;
        }

        public void d(C2138LC<K, V> lc) {
            this.g = lc;
        }

        public C2138LC<K, V> e() {
            return this.g;
        }

        public long g() {
            return this.e;
        }

        public C2138LC<K, V> b() {
            return this.f;
        }
    }

    /* renamed from: oC$x */
    /* compiled from: LocalCache */
    final class x extends C3164g<V> {
        x() {
            super();
        }

        public V next() {
            return b().getValue();
        }
    }

    /* renamed from: oC$y */
    /* compiled from: LocalCache */
    interface y<K, V> {
        int a();

        y<K, V> a(ReferenceQueue<V> referenceQueue, V v, C2138LC<K, V> lc);

        void a(V v);

        boolean b();

        C2138LC<K, V> c();

        V d() throws ExecutionException;

        V get();

        boolean isActive();
    }

    /* renamed from: oC$z */
    /* compiled from: LocalCache */
    final class z extends AbstractCollection<V> {
        private final ConcurrentMap<?, ?> a;

        z(ConcurrentMap<?, ?> concurrentMap) {
            this.a = concurrentMap;
        }

        public void clear() {
            this.a.clear();
        }

        public boolean contains(Object obj) {
            return this.a.containsValue(obj);
        }

        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public Iterator<V> iterator() {
            return new x();
        }

        public int size() {
            return this.a.size();
        }

        public Object[] toArray() {
            return C3157oC.b((Collection<E>) this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return C3157oC.b((Collection<E>) this).toArray(eArr);
        }
    }

    C3157oC(C3024hC<? super K, ? super V> hCVar, C3043iC<? super K, V> iCVar) {
        this.g = Math.min(hCVar.b(), 65536);
        this.j = hCVar.g();
        this.k = hCVar.m();
        this.h = hCVar.f();
        this.i = hCVar.l();
        this.l = hCVar.h();
        this.m = hCVar.n();
        this.n = hCVar.c();
        this.o = hCVar.d();
        this.p = hCVar.i();
        this.r = hCVar.j();
        this.q = this.r == a.INSTANCE ? b() : new ConcurrentLinkedQueue<>();
        this.s = hCVar.a(j());
        this.t = C3161d.a(this.j, n(), r());
        this.u = (C2475cC) hCVar.k().get();
        this.v = iCVar;
        int min = Math.min(hCVar.e(), 1073741824);
        if (c() && !a()) {
            min = (int) Math.min((long) min, this.l);
        }
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.g && (!c() || ((long) (i4 * 20)) <= this.l)) {
            i5++;
            i4 <<= 1;
        }
        this.e = 32 - i5;
        this.d = i4 - 1;
        this.f = a(i4);
        int i6 = min / i4;
        if (i6 * i4 < min) {
            i6++;
        }
        while (i3 < i6) {
            i3 <<= 1;
        }
        if (c()) {
            long j2 = this.l;
            long j3 = (long) i4;
            long j4 = (j2 / j3) + 1;
            long j5 = j2 % j3;
            while (i2 < this.f.length) {
                if (((long) i2) == j5) {
                    j4--;
                }
                this.f[i2] = a(i3, j4, (C2475cC) hCVar.k().get());
                i2++;
            }
            return;
        }
        while (true) {
            p<K, V>[] pVarArr = this.f;
            if (i2 < pVarArr.length) {
                pVarArr[i2] = a(i3, -1, (C2475cC) hCVar.k().get());
                i2++;
            } else {
                return;
            }
        }
    }

    static int b(int i2) {
        int i3 = i2 + ((i2 << 15) ^ -12931);
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    static <E> Queue<E> b() {
        return c;
    }

    static <K, V> C2138LC<K, V> g() {
        return o.INSTANCE;
    }

    static <K, V> y<K, V> m() {
        return b;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.l >= 0;
    }

    public void clear() {
        for (p<K, V> b2 : this.f) {
            b2.b();
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int c2 = c(obj);
        return c(c2).a(obj, c2);
    }

    public boolean containsValue(Object obj) {
        long j2;
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        long read = this.s.read();
        p<K, V>[] pVarArr = this.f;
        long j3 = -1;
        int i2 = 0;
        while (i2 < 3) {
            int length = pVarArr.length;
            long j4 = 0;
            int i3 = 0;
            while (i3 < length) {
                p<K, V> pVar = pVarArr[i3];
                int i4 = pVar.b;
                AtomicReferenceArray<C2138LC<K, V>> atomicReferenceArray = pVar.f;
                for (int i5 = 0; i5 < atomicReferenceArray.length(); i5++) {
                    C2138LC lc = (C2138LC) atomicReferenceArray.get(i5);
                    while (lc != null) {
                        p<K, V>[] pVarArr2 = pVarArr;
                        Object a2 = pVar.a(lc, read);
                        if (a2 != null) {
                            j2 = read;
                            if (this.i.equivalent(obj2, a2)) {
                                return true;
                            }
                        } else {
                            j2 = read;
                        }
                        lc = lc.u();
                        pVarArr = pVarArr2;
                        read = j2;
                    }
                    long j5 = read;
                    p<K, V>[] pVarArr3 = pVarArr;
                }
                p<K, V>[] pVarArr4 = pVarArr;
                j4 += (long) pVar.d;
                i3++;
                read = read;
            }
            long j6 = read;
            p<K, V>[] pVarArr5 = pVarArr;
            if (j4 == j3) {
                break;
            }
            i2++;
            j3 = j4;
            pVarArr = pVarArr5;
            read = j6;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return this.n > 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        return this.o > 0;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.y;
        if (set != null) {
            return set;
        }
        C3163f fVar = new C3163f(this);
        this.y = fVar;
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    public long f() {
        long j2 = 0;
        for (p<K, V> pVar : this.f) {
            j2 += (long) Math.max(0, pVar.b);
        }
        return j2;
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int c2 = c(obj);
        return c(c2).b(obj, c2);
    }

    public V getOrDefault(Object obj, V v2) {
        V v3 = get(obj);
        return v3 != null ? v3 : v2;
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        while (true) {
            C2290TC tc = (C2290TC) this.q.poll();
            if (tc != null) {
                try {
                    this.r.a(tc);
                } catch (Throwable th) {
                    a.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return d();
    }

    public boolean isEmpty() {
        p<K, V>[] pVarArr = this.f;
        long j2 = 0;
        for (int i2 = 0; i2 < pVarArr.length; i2++) {
            if (pVarArr[i2].b != 0) {
                return false;
            }
            j2 += (long) pVarArr[i2].d;
        }
        if (j2 != 0) {
            for (int i3 = 0; i3 < pVarArr.length; i3++) {
                if (pVarArr[i3].b != 0) {
                    return false;
                }
                j2 -= (long) pVarArr[i3].d;
            }
            if (j2 != 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean j() {
        return k() || i();
    }

    /* access modifiers changed from: 0000 */
    public boolean k() {
        return e() || l();
    }

    public Set<K> keySet() {
        Set<K> set = this.w;
        if (set != null) {
            return set;
        }
        C3166i iVar = new C3166i(this);
        this.w = iVar;
        return iVar;
    }

    /* access modifiers changed from: 0000 */
    public boolean l() {
        return this.p > 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean n() {
        return o() || i();
    }

    /* access modifiers changed from: 0000 */
    public boolean o() {
        return d() || c();
    }

    /* access modifiers changed from: 0000 */
    public boolean p() {
        return this.j != r.STRONG;
    }

    public V put(K k2, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        int c2 = c((Object) k2);
        return c(c2).a(k2, c2, v2, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V putIfAbsent(K k2, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        int c2 = c((Object) k2);
        return c(c2).a(k2, c2, v2, true);
    }

    /* access modifiers changed from: 0000 */
    public boolean q() {
        return this.k != r.STRONG;
    }

    /* access modifiers changed from: 0000 */
    public boolean r() {
        return s() || k();
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int c2 = c(obj);
        return c(c2).d(obj, c2);
    }

    public boolean replace(K k2, V v2, V v3) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v3);
        if (v2 == null) {
            return false;
        }
        int c2 = c((Object) k2);
        return c(c2).a(k2, c2, v2, v3);
    }

    /* access modifiers changed from: 0000 */
    public boolean s() {
        return e();
    }

    public int size() {
        return C3083kE.a(f());
    }

    public Collection<V> values() {
        Collection<V> collection = this.x;
        if (collection != null) {
            return collection;
        }
        z zVar = new z(this);
        this.x = zVar;
        return zVar;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.m != b.INSTANCE;
    }

    /* access modifiers changed from: 0000 */
    public boolean b(C2138LC<K, V> lc, long j2) {
        Preconditions.checkNotNull(lc);
        if (d() && j2 - lc.v() >= this.n) {
            return true;
        }
        if (!e() || j2 - lc.g() < this.o) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public int c(Object obj) {
        return b(this.h.hash(obj));
    }

    /* access modifiers changed from: 0000 */
    public void a(y<K, V> yVar) {
        C2138LC c2 = yVar.c();
        int f2 = c2.f();
        c(f2).a(c2.getKey(), f2, yVar);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int c2 = c(obj);
        return c(c2).a(obj, c2, obj2);
    }

    /* access modifiers changed from: 0000 */
    public void c(C2138LC<K, V> lc) {
        int f2 = lc.f();
        c(f2).a(lc, f2);
    }

    static <K, V> void b(C2138LC<K, V> lc, C2138LC<K, V> lc2) {
        lc.c(lc2);
        lc2.d(lc);
    }

    public V replace(K k2, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        int c2 = c((Object) k2);
        return c(c2).b(k2, c2, v2);
    }

    /* access modifiers changed from: 0000 */
    public p<K, V> a(int i2, long j2, C2475cC cCVar) {
        p pVar = new p(this, i2, j2, cCVar);
        return pVar;
    }

    /* access modifiers changed from: 0000 */
    public p<K, V> c(int i2) {
        return this.f[(i2 >>> this.e) & this.d];
    }

    static <K, V> void b(C2138LC<K, V> lc) {
        C2138LC g2 = g();
        lc.c(g2);
        lc.d(g2);
    }

    /* access modifiers changed from: 0000 */
    public V a(C2138LC<K, V> lc, long j2) {
        if (lc.getKey() == null) {
            return null;
        }
        V v2 = lc.c().get();
        if (v2 != null && !b(lc, j2)) {
            return v2;
        }
        return null;
    }

    static <K, V> void a(C2138LC<K, V> lc, C2138LC<K, V> lc2) {
        lc.b(lc2);
        lc2.a(lc);
    }

    /* access modifiers changed from: 0000 */
    public V b(K k2) throws ExecutionException {
        return a(k2, this.v);
    }

    /* access modifiers changed from: private */
    public static <E> ArrayList<E> b(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C2023FD.a((Collection<T>) arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V> void a(C2138LC<K, V> lc) {
        C2138LC g2 = g();
        lc.b(g2);
        lc.a(g2);
    }

    /* access modifiers changed from: 0000 */
    public final p<K, V>[] a(int i2) {
        return new p[i2];
    }

    /* access modifiers changed from: 0000 */
    public V a(K k2, C3043iC<? super K, V> iCVar) throws ExecutionException {
        Preconditions.checkNotNull(k2);
        int c2 = c((Object) k2);
        return c(c2).a(k2, c2, iCVar);
    }
}
