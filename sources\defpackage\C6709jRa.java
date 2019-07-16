package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableMergeArray */
public final class C6709jRa extends C6979nPa {
    final C7255rPa[] a;

    /* renamed from: jRa$a */
    /* compiled from: CompletableMergeArray */
    static final class a extends AtomicInteger implements C7117pPa {
        final C7117pPa a;
        final AtomicBoolean b;
        final UPa c;

        a(C7117pPa ppa, AtomicBoolean atomicBoolean, UPa uPa, int i) {
            this.a = ppa;
            this.b = atomicBoolean;
            this.c = uPa;
            lazySet(i);
        }

        public void a(VPa vPa) {
            this.c.b(vPa);
        }

        public void onComplete() {
            if (decrementAndGet() == 0 && this.b.compareAndSet(false, true)) {
                this.a.onComplete();
            }
        }

        public void a(Throwable th) {
            this.c.dispose();
            if (this.b.compareAndSet(false, true)) {
                this.a.a(th);
            } else {
                WUa.b(th);
            }
        }
    }

    public C6709jRa(C7255rPa[] rpaArr) {
        this.a = rpaArr;
    }

    public void b(C7117pPa ppa) {
        UPa uPa = new UPa();
        a aVar = new a(ppa, new AtomicBoolean(), uPa, this.a.length + 1);
        ppa.a((VPa) uPa);
        C7255rPa[] rpaArr = this.a;
        int length = rpaArr.length;
        int i = 0;
        while (i < length) {
            C7255rPa rpa = rpaArr[i];
            if (!uPa.a()) {
                if (rpa == null) {
                    uPa.dispose();
                    aVar.a((Throwable) new NullPointerException("A completable source is null"));
                    return;
                }
                rpa.a(aVar);
                i++;
            } else {
                return;
            }
        }
        aVar.onComplete();
    }
}
