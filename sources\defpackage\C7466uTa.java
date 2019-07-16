package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: uTa reason: default package and case insensitive filesystem */
/* compiled from: SingleCache */
public final class C7466uTa<T> extends IPa<T> implements KPa<T> {
    static final a[] a = new a[0];
    static final a[] b = new a[0];
    final MPa<? extends T> c;
    final AtomicInteger d = new AtomicInteger();
    final AtomicReference<a<T>[]> e = new AtomicReference<>(a);
    T f;
    Throwable g;

    /* renamed from: uTa$a */
    /* compiled from: SingleCache */
    static final class a<T> extends AtomicBoolean implements VPa {
        final KPa<? super T> a;
        final C7466uTa<T> b;

        a(KPa<? super T> kPa, C7466uTa<T> uta) {
            this.a = kPa;
            this.b = uta;
        }

        public boolean a() {
            return get();
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.b.b(this);
            }
        }
    }

    public C7466uTa(MPa<? extends T> mPa) {
        this.c = mPa;
    }

    public void a(VPa vPa) {
    }

    /* access modifiers changed from: 0000 */
    public boolean a(a<T> aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.e.get();
            if (aVarArr == b) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.e.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        a aVar = new a(kPa, this);
        kPa.a((VPa) aVar);
        if (a(aVar)) {
            if (aVar.a()) {
                b(aVar);
            }
            if (this.d.getAndIncrement() == 0) {
                this.c.a(this);
            }
            return;
        }
        Throwable th = this.g;
        if (th != null) {
            kPa.a(th);
        } else {
            kPa.onSuccess(this.f);
        }
    }

    public void onSuccess(T t) {
        a[] aVarArr;
        this.f = t;
        for (a aVar : (a[]) this.e.getAndSet(b)) {
            if (!aVar.a()) {
                aVar.a.onSuccess(t);
            }
        }
    }

    public void a(Throwable th) {
        a[] aVarArr;
        this.g = th;
        for (a aVar : (a[]) this.e.getAndSet(b)) {
            if (!aVar.a()) {
                aVar.a.a(th);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.e.get();
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
        } while (!this.e.compareAndSet(aVarArr, aVarArr2));
    }
}
