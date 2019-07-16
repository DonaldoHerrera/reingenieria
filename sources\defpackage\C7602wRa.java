package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: wRa reason: default package and case insensitive filesystem */
/* compiled from: FlowableOnBackpressureBuffer */
public final class C7602wRa<T> extends C7257rRa<T, T> {
    final int c;
    final boolean d;
    final boolean e;
    final C6368eQa f;

    /* renamed from: wRa$a */
    /* compiled from: FlowableOnBackpressureBuffer */
    static final class a<T> extends C7260rUa<T> implements C7462uPa<T> {
        final C5551aBb<? super T> a;
        final MQa<T> b;
        final boolean c;
        final C6368eQa d;
        C5619bBb e;
        volatile boolean f;
        volatile boolean g;
        Throwable h;
        final AtomicLong i = new AtomicLong();
        boolean j;

        a(C5551aBb<? super T> abb, int i2, boolean z, boolean z2, C6368eQa eqa) {
            MQa<T> mQa;
            this.a = abb;
            this.d = eqa;
            this.c = z2;
            if (z) {
                mQa = new ZTa<>(i2);
            } else {
                mQa = new YTa<>(i2);
            }
            this.b = mQa;
        }

        public void a(C5619bBb bbb) {
            if (C7605wUa.a(this.e, bbb)) {
                this.e = bbb;
                this.a.a((C5619bBb) this);
                bbb.a(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            if (!this.f) {
                this.f = true;
                this.e.cancel();
                if (getAndIncrement() == 0) {
                    this.b.clear();
                }
            }
        }

        public void clear() {
            this.b.clear();
        }

        public boolean isEmpty() {
            return this.b.isEmpty();
        }

        public void onComplete() {
            this.g = true;
            if (this.j) {
                this.a.onComplete();
            } else {
                a();
            }
        }

        public T poll() throws Exception {
            return this.b.poll();
        }

        public void a(T t) {
            if (!this.b.offer(t)) {
                this.e.cancel();
                C5568aQa aqa = new C5568aQa("Buffer is full");
                try {
                    this.d.run();
                } catch (Throwable th) {
                    _Pa.b(th);
                    aqa.initCause(th);
                }
                a((Throwable) aqa);
                return;
            }
            if (this.j) {
                this.a.a(null);
            } else {
                a();
            }
        }

        public void a(Throwable th) {
            this.h = th;
            this.g = true;
            if (this.j) {
                this.a.a(th);
            } else {
                a();
            }
        }

        public void a(long j2) {
            if (!this.j && C7605wUa.b(j2)) {
                C7812zUa.a(this.i, j2);
                a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            int i2;
            if (getAndIncrement() == 0) {
                MQa<T> mQa = this.b;
                C5551aBb<? super T> abb = this.a;
                int i3 = 1;
                while (!a(this.g, mQa.isEmpty(), abb)) {
                    long j2 = this.i.get();
                    long j3 = 0;
                    while (true) {
                        i2 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
                        if (i2 == 0) {
                            break;
                        }
                        boolean z = this.g;
                        Object poll = mQa.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, abb)) {
                            if (z2) {
                                break;
                            }
                            abb.a(poll);
                            j3++;
                        } else {
                            return;
                        }
                    }
                    if (i2 != 0 || !a(this.g, mQa.isEmpty(), abb)) {
                        if (!(j3 == 0 || j2 == Long.MAX_VALUE)) {
                            this.i.addAndGet(-j3);
                        }
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(boolean z, boolean z2, C5551aBb<? super T> abb) {
            if (this.f) {
                this.b.clear();
                return true;
            }
            if (z) {
                if (!this.c) {
                    Throwable th = this.h;
                    if (th != null) {
                        this.b.clear();
                        abb.a(th);
                        return true;
                    } else if (z2) {
                        abb.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.h;
                    if (th2 != null) {
                        abb.a(th2);
                    } else {
                        abb.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        public int a(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.j = true;
            return 2;
        }
    }

    public C7602wRa(C7393tPa<T> tpa, int i, boolean z, boolean z2, C6368eQa eqa) {
        super(tpa);
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = eqa;
    }

    /* access modifiers changed from: protected */
    public void b(C5551aBb<? super T> abb) {
        C7393tPa<T> tpa = this.b;
        a aVar = new a(abb, this.c, this.d, this.e, this.f);
        tpa.a((C7462uPa<? super T>) aVar);
    }
}
