package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zRa reason: default package and case insensitive filesystem */
/* compiled from: FlowableOnBackpressureLatest */
public final class C7809zRa<T> extends C7257rRa<T, T> {

    /* renamed from: zRa$a */
    /* compiled from: FlowableOnBackpressureLatest */
    static final class a<T> extends AtomicInteger implements C7462uPa<T>, C5619bBb {
        final C5551aBb<? super T> a;
        C5619bBb b;
        volatile boolean c;
        Throwable d;
        volatile boolean e;
        final AtomicLong f = new AtomicLong();
        final AtomicReference<T> g = new AtomicReference<>();

        a(C5551aBb<? super T> abb) {
            this.a = abb;
        }

        public void a(C5619bBb bbb) {
            if (C7605wUa.a(this.b, bbb)) {
                this.b = bbb;
                this.a.a((C5619bBb) this);
                bbb.a(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            if (!this.e) {
                this.e = true;
                this.b.cancel();
                if (getAndIncrement() == 0) {
                    this.g.lazySet(null);
                }
            }
        }

        public void onComplete() {
            this.c = true;
            a();
        }

        public void a(T t) {
            this.g.lazySet(t);
            a();
        }

        public void a(Throwable th) {
            this.d = th;
            this.c = true;
            a();
        }

        public void a(long j) {
            if (C7605wUa.b(j)) {
                C7812zUa.a(this.f, j);
                a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C5551aBb<? super T> abb = this.a;
                AtomicLong atomicLong = this.f;
                AtomicReference<T> atomicReference = this.g;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.c;
                        Object andSet = atomicReference.getAndSet(null);
                        boolean z3 = andSet == null;
                        if (!a(z2, z3, abb, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            abb.a(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.c;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (a(z4, z, abb, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C7812zUa.b(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(boolean z, boolean z2, C5551aBb<?> abb, AtomicReference<T> atomicReference) {
            if (this.e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z) {
                Throwable th = this.d;
                if (th != null) {
                    atomicReference.lazySet(null);
                    abb.a(th);
                    return true;
                } else if (z2) {
                    abb.onComplete();
                    return true;
                }
            }
            return false;
        }
    }

    public C7809zRa(C7393tPa<T> tpa) {
        super(tpa);
    }

    /* access modifiers changed from: protected */
    public void b(C5551aBb<? super T> abb) {
        this.b.a((C7462uPa<? super T>) new a<Object>(abb));
    }
}
