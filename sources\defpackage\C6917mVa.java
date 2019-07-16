package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mVa reason: default package and case insensitive filesystem */
/* compiled from: SingleSubject */
public final class C6917mVa<T> extends IPa<T> implements KPa<T> {
    static final a[] a = new a[0];
    static final a[] b = new a[0];
    final AtomicReference<a<T>[]> c = new AtomicReference<>(a);
    final AtomicBoolean d = new AtomicBoolean();
    T e;
    Throwable f;

    /* renamed from: mVa$a */
    /* compiled from: SingleSubject */
    static final class a<T> extends AtomicReference<C6917mVa<T>> implements VPa {
        final KPa<? super T> a;

        a(KPa<? super T> kPa, C6917mVa<T> mva) {
            this.a = kPa;
            lazySet(mva);
        }

        public boolean a() {
            return get() == null;
        }

        public void dispose() {
            C6917mVa mva = (C6917mVa) getAndSet(null);
            if (mva != null) {
                mva.b(this);
            }
        }
    }

    C6917mVa() {
    }

    public static <T> C6917mVa<T> k() {
        return new C6917mVa<>();
    }

    public void a(VPa vPa) {
        if (this.c.get() == b) {
            vPa.dispose();
        }
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        a aVar = new a(kPa, this);
        kPa.a((VPa) aVar);
        if (!a(aVar)) {
            Throwable th = this.f;
            if (th != null) {
                kPa.a(th);
            } else {
                kPa.onSuccess(this.e);
            }
        } else if (aVar.a()) {
            b(aVar);
        }
    }

    public void onSuccess(T t) {
        AQa.a(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d.compareAndSet(false, true)) {
            this.e = t;
            for (a aVar : (a[]) this.c.getAndSet(b)) {
                aVar.a.onSuccess(t);
            }
        }
    }

    public void a(Throwable th) {
        AQa.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d.compareAndSet(false, true)) {
            this.f = th;
            for (a aVar : (a[]) this.c.getAndSet(b)) {
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
            aVarArr = (a[]) this.c.get();
            if (aVarArr == b) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.c.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void b(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.c.get();
            int length = aVarArr.length;
            if (length != 0) {
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
        } while (!this.c.compareAndSet(aVarArr, aVarArr2));
    }
}
