package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableCache */
public final class C6710jSa<T> extends C6642iSa<T, T> implements GPa<T> {
    static final a[] b = new a[0];
    static final a[] c = new a[0];
    final AtomicBoolean d = new AtomicBoolean();
    final int e;
    final AtomicReference<a<T>[]> f;
    volatile long g;
    final b<T> h;
    b<T> i;
    int j;
    Throwable k;
    volatile boolean l;

    /* renamed from: jSa$a */
    /* compiled from: ObservableCache */
    static final class a<T> extends AtomicInteger implements VPa {
        final GPa<? super T> a;
        final C6710jSa<T> b;
        b<T> c;
        int d;
        long e;
        volatile boolean f;

        a(GPa<? super T> gPa, C6710jSa<T> jsa) {
            this.a = gPa;
            this.b = jsa;
            this.c = jsa.h;
        }

        public boolean a() {
            return this.f;
        }

        public void dispose() {
            if (!this.f) {
                this.f = true;
                this.b.b(this);
            }
        }
    }

    /* renamed from: jSa$b */
    /* compiled from: ObservableCache */
    static final class b<T> {
        final T[] a;
        volatile b<T> b;

        b(int i) {
            this.a = new Object[i];
        }
    }

    public C6710jSa(APa<T> aPa, int i2) {
        super(aPa);
        this.e = i2;
        b<T> bVar = new b<>(i2);
        this.h = bVar;
        this.i = bVar;
        this.f = new AtomicReference<>(b);
    }

    public void a(VPa vPa) {
    }

    /* access modifiers changed from: 0000 */
    public void a(a<T> aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f.get();
            if (aVarArr != c) {
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } else {
                return;
            }
        } while (!this.f.compareAndSet(aVarArr, aVarArr2));
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        a aVar = new a(gPa, this);
        gPa.a((VPa) aVar);
        a(aVar);
        if (this.d.get() || !this.d.compareAndSet(false, true)) {
            c(aVar);
        } else {
            this.a.a(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(a<T> aVar) {
        if (aVar.getAndIncrement() == 0) {
            long j2 = aVar.e;
            int i2 = aVar.d;
            b<T> bVar = aVar.c;
            GPa<? super T> gPa = aVar.a;
            int i3 = this.e;
            int i4 = 1;
            while (!aVar.f) {
                boolean z = this.l;
                boolean z2 = this.g == j2;
                if (z && z2) {
                    aVar.c = null;
                    Throwable th = this.k;
                    if (th != null) {
                        gPa.a(th);
                    } else {
                        gPa.onComplete();
                    }
                    return;
                } else if (!z2) {
                    if (i2 == i3) {
                        bVar = bVar.b;
                        i2 = 0;
                    }
                    gPa.a(bVar.a[i2]);
                    i2++;
                    j2++;
                } else {
                    aVar.e = j2;
                    aVar.d = i2;
                    aVar.c = bVar;
                    i4 = aVar.addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                }
            }
            aVar.c = null;
        }
    }

    public void onComplete() {
        this.l = true;
        for (a c2 : (a[]) this.f.getAndSet(c)) {
            c(c2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (aVarArr[i3] == aVar) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 >= 0) {
                    if (length == 1) {
                        aVarArr2 = b;
                    } else {
                        a[] aVarArr3 = new a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i2);
                        System.arraycopy(aVarArr, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f.compareAndSet(aVarArr, aVarArr2));
    }

    public void a(T t) {
        int i2 = this.j;
        if (i2 == this.e) {
            b<T> bVar = new b<>(i2);
            bVar.a[0] = t;
            this.j = 1;
            this.i.b = bVar;
            this.i = bVar;
        } else {
            this.i.a[i2] = t;
            this.j = i2 + 1;
        }
        this.g++;
        for (a c2 : (a[]) this.f.get()) {
            c(c2);
        }
    }

    public void a(Throwable th) {
        this.k = th;
        this.l = true;
        for (a c2 : (a[]) this.f.getAndSet(c)) {
            c(c2);
        }
    }
}
