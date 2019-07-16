package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: xRa reason: default package and case insensitive filesystem */
/* compiled from: FlowableOnBackpressureDrop */
public final class C7671xRa<T> extends C7257rRa<T, T> implements C6776kQa<T> {
    final C6776kQa<? super T> c = this;

    /* renamed from: xRa$a */
    /* compiled from: FlowableOnBackpressureDrop */
    static final class a<T> extends AtomicLong implements C7462uPa<T>, C5619bBb {
        final C5551aBb<? super T> a;
        final C6776kQa<? super T> b;
        C5619bBb c;
        boolean d;

        a(C5551aBb<? super T> abb, C6776kQa<? super T> kqa) {
            this.a = abb;
            this.b = kqa;
        }

        public void a(C5619bBb bbb) {
            if (C7605wUa.a(this.c, bbb)) {
                this.c = bbb;
                this.a.a((C5619bBb) this);
                bbb.a(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            this.c.cancel();
        }

        public void onComplete() {
            if (!this.d) {
                this.d = true;
                this.a.onComplete();
            }
        }

        public void a(T t) {
            if (!this.d) {
                if (get() != 0) {
                    this.a.a(t);
                    C7812zUa.b(this, 1);
                } else {
                    try {
                        this.b.accept(t);
                    } catch (Throwable th) {
                        _Pa.b(th);
                        cancel();
                        a(th);
                    }
                }
            }
        }

        public void a(Throwable th) {
            if (this.d) {
                WUa.b(th);
                return;
            }
            this.d = true;
            this.a.a(th);
        }

        public void a(long j) {
            if (C7605wUa.b(j)) {
                C7812zUa.a((AtomicLong) this, j);
            }
        }
    }

    public C7671xRa(C7393tPa<T> tpa) {
        super(tpa);
    }

    public void accept(T t) {
    }

    /* access modifiers changed from: protected */
    public void b(C5551aBb<? super T> abb) {
        this.b.a((C7462uPa<? super T>) new a<Object>(abb, this.c));
    }
}
