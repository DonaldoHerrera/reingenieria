package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lVa reason: default package and case insensitive filesystem */
/* compiled from: ReplaySubject */
public final class C6849lVa<T> extends C6985nVa<T> {
    static final c[] a = new c[0];
    static final c[] b = new c[0];
    private static final Object[] c = new Object[0];
    final b<T> d;
    final AtomicReference<c<T>[]> e = new AtomicReference<>(a);
    boolean f;

    /* renamed from: lVa$a */
    /* compiled from: ReplaySubject */
    static final class a<T> extends AtomicReference<a<T>> {
        final T a;

        a(T t) {
            this.a = t;
        }
    }

    /* renamed from: lVa$b */
    /* compiled from: ReplaySubject */
    interface b<T> {
        void a(Object obj);

        void a(c<T> cVar);

        void add(T t);

        boolean compareAndSet(Object obj, Object obj2);
    }

    /* renamed from: lVa$c */
    /* compiled from: ReplaySubject */
    static final class c<T> extends AtomicInteger implements VPa {
        final GPa<? super T> a;
        final C6849lVa<T> b;
        Object c;
        volatile boolean d;

        c(GPa<? super T> gPa, C6849lVa<T> lva) {
            this.a = gPa;
            this.b = lva;
        }

        public boolean a() {
            return this.d;
        }

        public void dispose() {
            if (!this.d) {
                this.d = true;
                this.b.b(this);
            }
        }
    }

    /* renamed from: lVa$d */
    /* compiled from: ReplaySubject */
    static final class d<T> extends AtomicReference<Object> implements b<T> {
        final int a;
        int b;
        volatile a<Object> c;
        a<Object> d;
        volatile boolean e;

        d(int i) {
            AQa.a(i, "maxSize");
            this.a = i;
            a<Object> aVar = new a<>(null);
            this.d = aVar;
            this.c = aVar;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            int i = this.b;
            if (i > this.a) {
                this.b = i - 1;
                this.c = (a) this.c.get();
            }
        }

        public void add(T t) {
            a<Object> aVar = new a<>(t);
            a<Object> aVar2 = this.d;
            this.d = aVar;
            this.b++;
            aVar2.set(aVar);
            a();
        }

        public void b() {
            a<Object> aVar = this.c;
            if (aVar.a != null) {
                a<Object> aVar2 = new a<>(null);
                aVar2.lazySet(aVar.get());
                this.c = aVar2;
            }
        }

        public void a(Object obj) {
            a<Object> aVar = new a<>(obj);
            a<Object> aVar2 = this.d;
            this.d = aVar;
            this.b++;
            aVar2.lazySet(aVar);
            b();
            this.e = true;
        }

        public void a(c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                GPa<? super T> gPa = cVar.a;
                a<Object> aVar = (a) cVar.c;
                if (aVar == null) {
                    aVar = this.c;
                }
                int i = 1;
                while (!cVar.d) {
                    a<Object> aVar2 = (a) aVar.get();
                    if (aVar2 != null) {
                        T t = aVar2.a;
                        if (!this.e || aVar2.get() != null) {
                            gPa.a(t);
                            aVar = aVar2;
                        } else {
                            if (GUa.c(t)) {
                                gPa.onComplete();
                            } else {
                                gPa.a(GUa.a((Object) t));
                            }
                            cVar.c = null;
                            cVar.d = true;
                            return;
                        }
                    } else if (aVar.get() != null) {
                        continue;
                    } else {
                        cVar.c = aVar;
                        i = cVar.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                cVar.c = null;
            }
        }
    }

    /* renamed from: lVa$e */
    /* compiled from: ReplaySubject */
    static final class e<T> extends AtomicReference<Object> implements b<T> {
        final List<Object> a;
        volatile boolean b;
        volatile int c;

        e(int i) {
            AQa.a(i, "capacityHint");
            this.a = new ArrayList(i);
        }

        public void a() {
        }

        public void a(Object obj) {
            this.a.add(obj);
            a();
            this.c++;
            this.b = true;
        }

        public void add(T t) {
            this.a.add(t);
            this.c++;
        }

        public void a(c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                List<Object> list = this.a;
                GPa<? super T> gPa = cVar.a;
                Integer num = (Integer) cVar.c;
                int i = 0;
                if (num != null) {
                    i = num.intValue();
                } else {
                    cVar.c = Integer.valueOf(0);
                }
                int i2 = 1;
                while (!cVar.d) {
                    int i3 = this.c;
                    while (i3 != i) {
                        if (cVar.d) {
                            cVar.c = null;
                            return;
                        }
                        Object obj = list.get(i);
                        if (this.b) {
                            int i4 = i + 1;
                            if (i4 == i3) {
                                i3 = this.c;
                                if (i4 == i3) {
                                    if (GUa.c(obj)) {
                                        gPa.onComplete();
                                    } else {
                                        gPa.a(GUa.a(obj));
                                    }
                                    cVar.c = null;
                                    cVar.d = true;
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                        gPa.a(obj);
                        i++;
                    }
                    if (i == this.c) {
                        cVar.c = Integer.valueOf(i);
                        i2 = cVar.addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
                cVar.c = null;
            }
        }
    }

    C6849lVa(b<T> bVar) {
        this.d = bVar;
    }

    public static <T> C6849lVa<T> d(int i) {
        return new C6849lVa<>(new d(i));
    }

    public static <T> C6849lVa<T> s() {
        return new C6849lVa<>(new e(16));
    }

    public void a(VPa vPa) {
        if (this.f) {
            vPa.dispose();
        }
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        c cVar = new c(gPa, this);
        gPa.a((VPa) cVar);
        if (!cVar.d) {
            if (!a(cVar) || !cVar.d) {
                this.d.a(cVar);
            } else {
                b(cVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public c<T>[] f(Object obj) {
        if (this.d.compareAndSet(null, obj)) {
            return (c[]) this.e.getAndSet(b);
        }
        return b;
    }

    public void onComplete() {
        if (!this.f) {
            this.f = true;
            Object a2 = GUa.a();
            b<T> bVar = this.d;
            bVar.a(a2);
            for (c a3 : f(a2)) {
                bVar.a(a3);
            }
        }
    }

    public void a(T t) {
        AQa.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f) {
            b<T> bVar = this.d;
            bVar.add(t);
            for (c a2 : (c[]) this.e.get()) {
                bVar.a(a2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(c<T> cVar) {
        c<T>[] cVarArr;
        c[] cVarArr2;
        do {
            cVarArr = (c[]) this.e.get();
            if (cVarArr != b && cVarArr != a) {
                int length = cVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (cVarArr[i2] == cVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        cVarArr2 = a;
                    } else {
                        c[] cVarArr3 = new c[(length - 1)];
                        System.arraycopy(cVarArr, 0, cVarArr3, 0, i);
                        System.arraycopy(cVarArr, i + 1, cVarArr3, i, (length - i) - 1);
                        cVarArr2 = cVarArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.e.compareAndSet(cVarArr, cVarArr2));
    }

    public void a(Throwable th) {
        AQa.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f) {
            WUa.b(th);
            return;
        }
        this.f = true;
        Object a2 = GUa.a(th);
        b<T> bVar = this.d;
        bVar.a(a2);
        for (c a3 : f(a2)) {
            bVar.a(a3);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(c<T> cVar) {
        c[] cVarArr;
        c[] cVarArr2;
        do {
            cVarArr = (c[]) this.e.get();
            if (cVarArr == b) {
                return false;
            }
            int length = cVarArr.length;
            cVarArr2 = new c[(length + 1)];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
        } while (!this.e.compareAndSet(cVarArr, cVarArr2));
        return true;
    }
}
