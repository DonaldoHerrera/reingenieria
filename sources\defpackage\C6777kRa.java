package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableMergeIterable */
public final class C6777kRa extends C6979nPa {
    final Iterable<? extends C7255rPa> a;

    /* renamed from: kRa$a */
    /* compiled from: CompletableMergeIterable */
    static final class a extends AtomicBoolean implements C7117pPa {
        final UPa a;
        final C7117pPa b;
        final AtomicInteger c;

        a(C7117pPa ppa, UPa uPa, AtomicInteger atomicInteger) {
            this.b = ppa;
            this.a = uPa;
            this.c = atomicInteger;
        }

        public void a(VPa vPa) {
            this.a.b(vPa);
        }

        public void onComplete() {
            if (this.c.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.b.onComplete();
            }
        }

        public void a(Throwable th) {
            this.a.dispose();
            if (compareAndSet(false, true)) {
                this.b.a(th);
            } else {
                WUa.b(th);
            }
        }
    }

    public C6777kRa(Iterable<? extends C7255rPa> iterable) {
        this.a = iterable;
    }

    public void b(C7117pPa ppa) {
        UPa uPa = new UPa();
        ppa.a((VPa) uPa);
        try {
            Iterator it = this.a.iterator();
            AQa.a(it, "The source iterator returned is null");
            Iterator it2 = it;
            AtomicInteger atomicInteger = new AtomicInteger(1);
            a aVar = new a(ppa, uPa, atomicInteger);
            while (!uPa.a()) {
                try {
                    if (!it2.hasNext()) {
                        aVar.onComplete();
                        return;
                    } else if (!uPa.a()) {
                        try {
                            Object next = it2.next();
                            AQa.a(next, "The iterator returned a null CompletableSource");
                            C7255rPa rpa = (C7255rPa) next;
                            if (!uPa.a()) {
                                atomicInteger.getAndIncrement();
                                rpa.a(aVar);
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            _Pa.b(th);
                            uPa.dispose();
                            aVar.a(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    _Pa.b(th2);
                    uPa.dispose();
                    aVar.a(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            _Pa.b(th3);
            ppa.a(th3);
        }
    }
}
