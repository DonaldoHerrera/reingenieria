package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableReplay */
public final class C6303dTa<T> extends LUa<T> implements FQa<T>, C7670xQa {
    static final b a = new j();
    final EPa<T> b;
    final AtomicReference<g<T>> c;
    final b<T> d;
    final EPa<T> e;

    /* renamed from: dTa$a */
    /* compiled from: ObservableReplay */
    static abstract class a<T> extends AtomicReference<d> implements e<T> {
        d a;
        int b;

        a() {
            d dVar = new d(null);
            this.a = dVar;
            set(dVar);
        }

        /* access modifiers changed from: 0000 */
        public final void a(d dVar) {
            this.a.set(dVar);
            this.a = dVar;
            this.b++;
        }

        /* access modifiers changed from: 0000 */
        public Object b(Object obj) {
            return obj;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            d dVar = (d) ((d) get()).get();
            this.b--;
            b(dVar);
        }

        /* access modifiers changed from: 0000 */
        public Object c(Object obj) {
            return obj;
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            d dVar = (d) get();
            if (dVar.a != null) {
                d dVar2 = new d(null);
                dVar2.lazySet(dVar.get());
                set(dVar2);
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract void d();

        /* access modifiers changed from: 0000 */
        public void e() {
            c();
        }

        public final void i() {
            Object a2 = GUa.a();
            b(a2);
            a(new d(a2));
            e();
        }

        public final void a(T t) {
            GUa.e(t);
            b((Object) t);
            a(new d(t));
            d();
        }

        /* access modifiers changed from: 0000 */
        public final void b(d dVar) {
            set(dVar);
        }

        public final void a(Throwable th) {
            Object a2 = GUa.a(th);
            b(a2);
            a(new d(a2));
            e();
        }

        public final void a(c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                int i = 1;
                do {
                    d dVar = (d) cVar.b();
                    if (dVar == null) {
                        dVar = a();
                        cVar.c = dVar;
                    }
                    while (!cVar.a()) {
                        d dVar2 = (d) dVar.get();
                        if (dVar2 != null) {
                            Object obj = dVar2.a;
                            c(obj);
                            if (GUa.a(obj, cVar.b)) {
                                cVar.c = null;
                                return;
                            }
                            dVar = dVar2;
                        } else {
                            cVar.c = dVar;
                            i = cVar.addAndGet(-i);
                        }
                    }
                    cVar.c = null;
                    return;
                } while (i != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        public d a() {
            return (d) get();
        }
    }

    /* renamed from: dTa$b */
    /* compiled from: ObservableReplay */
    interface b<T> {
        e<T> call();
    }

    /* renamed from: dTa$c */
    /* compiled from: ObservableReplay */
    static final class c<T> extends AtomicInteger implements VPa {
        final g<T> a;
        final GPa<? super T> b;
        Object c;
        volatile boolean d;

        c(g<T> gVar, GPa<? super T> gPa) {
            this.a = gVar;
            this.b = gPa;
        }

        public boolean a() {
            return this.d;
        }

        /* access modifiers changed from: 0000 */
        public <U> U b() {
            return this.c;
        }

        public void dispose() {
            if (!this.d) {
                this.d = true;
                this.a.b(this);
                this.c = null;
            }
        }
    }

    /* renamed from: dTa$d */
    /* compiled from: ObservableReplay */
    static final class d extends AtomicReference<d> {
        final Object a;

        d(Object obj) {
            this.a = obj;
        }
    }

    /* renamed from: dTa$e */
    /* compiled from: ObservableReplay */
    interface e<T> {
        void a(c<T> cVar);

        void a(T t);

        void a(Throwable th);

        void i();
    }

    /* renamed from: dTa$f */
    /* compiled from: ObservableReplay */
    static final class f<T> implements b<T> {
        private final int a;

        f(int i) {
            this.a = i;
        }

        public e<T> call() {
            return new i(this.a);
        }
    }

    /* renamed from: dTa$g */
    /* compiled from: ObservableReplay */
    static final class g<T> extends AtomicReference<VPa> implements GPa<T>, VPa {
        static final c[] a = new c[0];
        static final c[] b = new c[0];
        final e<T> c;
        boolean d;
        final AtomicReference<c[]> e = new AtomicReference<>(a);
        final AtomicBoolean f = new AtomicBoolean();

        g(e<T> eVar) {
            this.c = eVar;
        }

        public boolean a() {
            return this.e.get() == b;
        }

        /* access modifiers changed from: 0000 */
        public void b(c<T> cVar) {
            c[] cVarArr;
            c[] cVarArr2;
            do {
                cVarArr = (c[]) this.e.get();
                int length = cVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (cVarArr[i2].equals(cVar)) {
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
                } else {
                    return;
                }
            } while (!this.e.compareAndSet(cVarArr, cVarArr2));
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            for (c a2 : (c[]) this.e.getAndSet(b)) {
                this.c.a(a2);
            }
        }

        public void dispose() {
            this.e.set(b);
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            if (!this.d) {
                this.d = true;
                this.c.i();
                c();
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

        public void a(VPa vPa) {
            if (C7463uQa.c(this, vPa)) {
                b();
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            for (c a2 : (c[]) this.e.get()) {
                this.c.a(a2);
            }
        }

        public void a(T t) {
            if (!this.d) {
                this.c.a(t);
                b();
            }
        }

        public void a(Throwable th) {
            if (!this.d) {
                this.d = true;
                this.c.a(th);
                c();
                return;
            }
            WUa.b(th);
        }
    }

    /* renamed from: dTa$h */
    /* compiled from: ObservableReplay */
    static final class h<T> implements EPa<T> {
        private final AtomicReference<g<T>> a;
        private final b<T> b;

        h(AtomicReference<g<T>> atomicReference, b<T> bVar) {
            this.a = atomicReference;
            this.b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
        public void a(GPa<? super T> gPa) {
            g gVar;
            while (true) {
                gVar = (g) this.a.get();
                if (gVar != null) {
                    break;
                }
                g gVar2 = new g(this.b.call());
                if (this.a.compareAndSet(null, gVar2)) {
                    gVar = gVar2;
                    break;
                }
            }
            c cVar = new c(gVar, gPa);
            gPa.a((VPa) cVar);
            gVar.a(cVar);
            if (cVar.a()) {
                gVar.b(cVar);
            } else {
                gVar.c.a(cVar);
            }
        }
    }

    /* renamed from: dTa$i */
    /* compiled from: ObservableReplay */
    static final class i<T> extends a<T> {
        final int c;

        i(int i) {
            this.c = i;
        }

        /* access modifiers changed from: 0000 */
        public void d() {
            if (this.b > this.c) {
                b();
            }
        }
    }

    /* renamed from: dTa$j */
    /* compiled from: ObservableReplay */
    static final class j implements b<Object> {
        j() {
        }

        public e<Object> call() {
            return new k(16);
        }
    }

    /* renamed from: dTa$k */
    /* compiled from: ObservableReplay */
    static final class k<T> extends ArrayList<Object> implements e<T> {
        volatile int a;

        k(int i) {
            super(i);
        }

        public void a(T t) {
            GUa.e(t);
            add(t);
            this.a++;
        }

        public void i() {
            add(GUa.a());
            this.a++;
        }

        public void a(Throwable th) {
            add(GUa.a(th));
            this.a++;
        }

        public void a(c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                GPa<? super T> gPa = cVar.b;
                int i = 1;
                while (!cVar.a()) {
                    int i2 = this.a;
                    Integer num = (Integer) cVar.b();
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (!GUa.a(get(intValue), gPa) && !cVar.a()) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                    cVar.c = Integer.valueOf(intValue);
                    i = cVar.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    private C6303dTa(EPa<T> ePa, EPa<T> ePa2, AtomicReference<g<T>> atomicReference, b<T> bVar) {
        this.e = ePa;
        this.b = ePa2;
        this.c = atomicReference;
        this.d = bVar;
    }

    public static <T> LUa<T> a(EPa<T> ePa, int i2) {
        if (i2 == Integer.MAX_VALUE) {
            return g(ePa);
        }
        return a(ePa, (b<T>) new f<T>(i2));
    }

    public static <T> LUa<T> g(EPa<? extends T> ePa) {
        return a(ePa, a);
    }

    public void b(VPa vPa) {
        this.c.compareAndSet((g) vPa, null);
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        this.e.a(gPa);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    public void g(C6776kQa<? super VPa> kqa) {
        g gVar;
        while (true) {
            gVar = (g) this.c.get();
            if (gVar != null && !gVar.a()) {
                break;
            }
            g gVar2 = new g(this.d.call());
            if (this.c.compareAndSet(gVar, gVar2)) {
                gVar = gVar2;
                break;
            }
        }
        boolean z = !gVar.f.get() && gVar.f.compareAndSet(false, true);
        try {
            kqa.accept(gVar);
            if (z) {
                this.b.a(gVar);
            }
        } catch (Throwable th) {
            if (z) {
                gVar.f.compareAndSet(true, false);
            }
            _Pa.b(th);
            throw EUa.a(th);
        }
    }

    static <T> LUa<T> a(EPa<T> ePa, b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return WUa.a((LUa<T>) new C6303dTa<T>(new h(atomicReference, bVar), ePa, atomicReference, bVar));
    }
}
