package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: yRa reason: default package and case insensitive filesystem */
/* compiled from: FlowableOnBackpressureError */
public final class C7740yRa<T> extends C7257rRa<T, T> {

    /* renamed from: yRa$a */
    /* compiled from: FlowableOnBackpressureError */
    static final class a<T> extends AtomicLong implements C7462uPa<T>, C5619bBb {
        final C5551aBb<? super T> a;
        C5619bBb b;
        boolean c;

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
            this.b.cancel();
        }

        public void onComplete() {
            if (!this.c) {
                this.c = true;
                this.a.onComplete();
            }
        }

        public void a(T t) {
            if (!this.c) {
                if (get() != 0) {
                    this.a.a(t);
                    C7812zUa.b(this, 1);
                } else {
                    a((Throwable) new C5568aQa("could not emit value due to lack of requests"));
                }
            }
        }

        public void a(Throwable th) {
            if (this.c) {
                WUa.b(th);
                return;
            }
            this.c = true;
            this.a.a(th);
        }

        public void a(long j) {
            if (C7605wUa.b(j)) {
                C7812zUa.a((AtomicLong) this, j);
            }
        }
    }

    public C7740yRa(C7393tPa<T> tpa) {
        super(tpa);
    }

    /* access modifiers changed from: protected */
    public void b(C5551aBb<? super T> abb) {
        this.b.a((C7462uPa<? super T>) new a<Object>(abb));
    }
}
