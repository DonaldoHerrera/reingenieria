package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kVa reason: default package and case insensitive filesystem */
/* compiled from: PublishSubject */
public final class C6781kVa<T> extends C6985nVa<T> {
    static final a[] a = new a[0];
    static final a[] b = new a[0];
    final AtomicReference<a<T>[]> c = new AtomicReference<>(b);
    Throwable d;

    /* renamed from: kVa$a */
    /* compiled from: PublishSubject */
    static final class a<T> extends AtomicBoolean implements VPa {
        final GPa<? super T> a;
        final C6781kVa<T> b;

        a(GPa<? super T> gPa, C6781kVa<T> kva) {
            this.a = gPa;
            this.b = kva;
        }

        public void a(T t) {
            if (!get()) {
                this.a.a(t);
            }
        }

        public void b() {
            if (!get()) {
                this.a.onComplete();
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.b.b(this);
            }
        }

        public void a(Throwable th) {
            if (get()) {
                WUa.b(th);
            } else {
                this.a.a(th);
            }
        }

        public boolean a() {
            return get();
        }
    }

    C6781kVa() {
    }

    public static <T> C6781kVa<T> s() {
        return new C6781kVa<>();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(a<T> aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.c.get();
            if (aVarArr == a) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.c.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        a aVar = new a(gPa, this);
        gPa.a((VPa) aVar);
        if (!a(aVar)) {
            Throwable th = this.d;
            if (th != null) {
                gPa.a(th);
            } else {
                gPa.onComplete();
            }
        } else if (aVar.a()) {
            b(aVar);
        }
    }

    public void onComplete() {
        Object obj = this.c.get();
        Object obj2 = a;
        if (obj != obj2) {
            for (a b2 : (a[]) this.c.getAndSet(obj2)) {
                b2.b();
            }
        }
    }

    public void a(VPa vPa) {
        if (this.c.get() == a) {
            vPa.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.c.get();
            if (aVarArr != a && aVarArr != b) {
                int length = aVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = b;
                    } else {
                        a[] aVarArr3 = new a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.c.compareAndSet(aVarArr, aVarArr2));
    }

    public void a(T t) {
        AQa.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a a2 : (a[]) this.c.get()) {
            a2.a(t);
        }
    }

    public void a(Throwable th) {
        AQa.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.c.get();
        Object obj2 = a;
        if (obj == obj2) {
            WUa.b(th);
            return;
        }
        this.d = th;
        for (a a2 : (a[]) this.c.getAndSet(obj2)) {
            a2.a(th);
        }
    }
}
