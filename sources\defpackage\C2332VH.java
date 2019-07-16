package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: VH reason: default package and case insensitive filesystem */
/* compiled from: PublishRelay */
public final class C2332VH<T> extends C2350WH<T> {
    static final a[] a = new a[0];
    final AtomicReference<a<T>[]> b = new AtomicReference<>(a);

    /* renamed from: VH$a */
    /* compiled from: PublishRelay */
    static final class a<T> extends AtomicBoolean implements VPa {
        final GPa<? super T> a;
        final C2332VH<T> b;

        a(GPa<? super T> gPa, C2332VH<T> vh) {
            this.a = gPa;
            this.b = vh;
        }

        public void a(T t) {
            if (!get()) {
                this.a.a(t);
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.b.b(this);
            }
        }

        public boolean a() {
            return get();
        }
    }

    C2332VH() {
    }

    public static <T> C2332VH<T> s() {
        return new C2332VH<>();
    }

    /* access modifiers changed from: 0000 */
    public void a(a<T> aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.b.get();
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.b.compareAndSet(aVarArr, aVarArr2));
    }

    public void accept(T t) {
        if (t != null) {
            for (a a2 : (a[]) this.b.get()) {
                a2.a(t);
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        a aVar = new a(gPa, this);
        gPa.a((VPa) aVar);
        a(aVar);
        if (aVar.a()) {
            b(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.b.get();
            if (aVarArr != a) {
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
        } while (!this.b.compareAndSet(aVarArr, aVarArr2));
    }
}
