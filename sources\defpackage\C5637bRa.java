package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableCache */
public final class C5637bRa extends C6979nPa implements C7117pPa {
    static final a[] a = new a[0];
    static final a[] b = new a[0];
    final C7255rPa c;
    final AtomicReference<a[]> d = new AtomicReference<>(a);
    final AtomicBoolean e = new AtomicBoolean();
    Throwable f;

    /* renamed from: bRa$a */
    /* compiled from: CompletableCache */
    final class a extends AtomicBoolean implements VPa {
        final C7117pPa a;

        a(C7117pPa ppa) {
            this.a = ppa;
        }

        public boolean a() {
            return get();
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                C5637bRa.this.b(this);
            }
        }
    }

    public C5637bRa(C7255rPa rpa) {
        this.c = rpa;
    }

    public void a(VPa vPa) {
    }

    public void a(Throwable th) {
        a[] aVarArr;
        this.f = th;
        for (a aVar : (a[]) this.d.getAndSet(b)) {
            if (!aVar.get()) {
                aVar.a.a(th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        a aVar = new a(ppa);
        ppa.a((VPa) aVar);
        if (a(aVar)) {
            if (aVar.a()) {
                b(aVar);
            }
            if (this.e.compareAndSet(false, true)) {
                this.c.a(this);
                return;
            }
            return;
        }
        Throwable th = this.f;
        if (th != null) {
            ppa.a(th);
        } else {
            ppa.onComplete();
        }
    }

    public void onComplete() {
        a[] aVarArr;
        for (a aVar : (a[]) this.d.getAndSet(b)) {
            if (!aVar.get()) {
                aVar.a.onComplete();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(a aVar) {
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

    /* access modifiers changed from: 0000 */
    public void b(a aVar) {
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
        } while (!this.d.compareAndSet(aVarArr, aVarArr2));
    }
}
