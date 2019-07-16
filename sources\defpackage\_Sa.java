package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: _Sa reason: default package */
/* compiled from: ObservablePublish */
public final class _Sa<T> extends LUa<T> implements FQa<T> {
    final EPa<T> a;
    final AtomicReference<b<T>> b;
    final EPa<T> c;

    /* renamed from: _Sa$a */
    /* compiled from: ObservablePublish */
    static final class a<T> extends AtomicReference<Object> implements VPa {
        final GPa<? super T> a;

        a(GPa<? super T> gPa) {
            this.a = gPa;
        }

        public boolean a() {
            return get() == this;
        }

        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((b) andSet).b(this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(b<T> bVar) {
            if (!compareAndSet(null, bVar)) {
                bVar.b(this);
            }
        }
    }

    /* renamed from: _Sa$b */
    /* compiled from: ObservablePublish */
    static final class b<T> implements GPa<T>, VPa {
        static final a[] a = new a[0];
        static final a[] b = new a[0];
        final AtomicReference<b<T>> c;
        final AtomicReference<a<T>[]> d = new AtomicReference<>(a);
        final AtomicBoolean e;
        final AtomicReference<VPa> f = new AtomicReference<>();

        b(AtomicReference<b<T>> atomicReference) {
            this.c = atomicReference;
            this.e = new AtomicBoolean();
        }

        public boolean a() {
            return this.d.get() == b;
        }

        /* access modifiers changed from: 0000 */
        public void b(a<T> aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.d.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2].equals(aVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = a;
                        } else {
                            a[] aVarArr3 = new a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.d.compareAndSet(aVarArr, aVarArr2));
        }

        public void dispose() {
            if (((a[]) this.d.getAndSet(b)) != b) {
                this.c.compareAndSet(this, null);
                C7463uQa.a(this.f);
            }
        }

        public void onComplete() {
            this.c.compareAndSet(this, null);
            for (a aVar : (a[]) this.d.getAndSet(b)) {
                aVar.a.onComplete();
            }
        }

        public void a(VPa vPa) {
            C7463uQa.c(this.f, vPa);
        }

        public void a(T t) {
            for (a aVar : (a[]) this.d.get()) {
                aVar.a.a(t);
            }
        }

        public void a(Throwable th) {
            this.c.compareAndSet(this, null);
            a[] aVarArr = (a[]) this.d.getAndSet(b);
            if (aVarArr.length != 0) {
                for (a aVar : aVarArr) {
                    aVar.a.a(th);
                }
                return;
            }
            WUa.b(th);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(a<T> aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.d.get();
                if (aVarArr == b) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.d.compareAndSet(aVarArr, aVarArr2));
            return true;
        }
    }

    /* renamed from: _Sa$c */
    /* compiled from: ObservablePublish */
    static final class c<T> implements EPa<T> {
        private final AtomicReference<b<T>> a;

        c(AtomicReference<b<T>> atomicReference) {
            this.a = atomicReference;
        }

        public void a(GPa<? super T> gPa) {
            a aVar = new a(gPa);
            gPa.a((VPa) aVar);
            while (true) {
                b bVar = (b) this.a.get();
                if (bVar == null || bVar.a()) {
                    b bVar2 = new b(this.a);
                    if (!this.a.compareAndSet(bVar, bVar2)) {
                        continue;
                    } else {
                        bVar = bVar2;
                    }
                }
                if (bVar.a(aVar)) {
                    aVar.a(bVar);
                    return;
                }
            }
        }
    }

    private _Sa(EPa<T> ePa, EPa<T> ePa2, AtomicReference<b<T>> atomicReference) {
        this.c = ePa;
        this.a = ePa2;
        this.b = atomicReference;
    }

    public static <T> LUa<T> g(EPa<T> ePa) {
        AtomicReference atomicReference = new AtomicReference();
        return WUa.a((LUa<T>) new _Sa<T>(new c(atomicReference), ePa, atomicReference));
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        this.c.a(gPa);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    public void g(C6776kQa<? super VPa> kqa) {
        b bVar;
        while (true) {
            bVar = (b) this.b.get();
            if (bVar != null && !bVar.a()) {
                break;
            }
            b bVar2 = new b(this.b);
            if (this.b.compareAndSet(bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z = true;
        if (bVar.e.get() || !bVar.e.compareAndSet(false, true)) {
            z = false;
        }
        try {
            kqa.accept(bVar);
            if (z) {
                this.a.a(bVar);
            }
        } catch (Throwable th) {
            _Pa.b(th);
            throw EUa.a(th);
        }
    }
}
