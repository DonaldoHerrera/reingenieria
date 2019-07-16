package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: uRa reason: default package and case insensitive filesystem */
/* compiled from: FlowableFromIterable */
public final class C7464uRa<T> extends C7393tPa<T> {
    final Iterable<? extends T> b;

    /* renamed from: uRa$a */
    /* compiled from: FlowableFromIterable */
    static abstract class a<T> extends C7329sUa<T> {
        Iterator<? extends T> a;
        volatile boolean b;
        boolean c;

        a(Iterator<? extends T> it) {
            this.a = it;
        }

        public final int a(int i) {
            return i & 1;
        }

        /* access modifiers changed from: 0000 */
        public abstract void a();

        public final void a(long j) {
            if (C7605wUa.b(j) && C7812zUa.a((AtomicLong) this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract void b(long j);

        public final void cancel() {
            this.b = true;
        }

        public final void clear() {
            this.a = null;
        }

        public final boolean isEmpty() {
            Iterator<? extends T> it = this.a;
            return it == null || !it.hasNext();
        }

        public final T poll() {
            Iterator<? extends T> it = this.a;
            if (it == null) {
                return null;
            }
            if (!this.c) {
                this.c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.a.next();
            AQa.a(next, "Iterator.next() returned a null value");
            return next;
        }
    }

    /* renamed from: uRa$b */
    /* compiled from: FlowableFromIterable */
    static final class b<T> extends a<T> {
        final BQa<? super T> d;

        b(BQa<? super T> bQa, Iterator<? extends T> it) {
            super(it);
            this.d = bQa;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            Iterator<? extends T> it = this.a;
            BQa<? super T> bQa = this.d;
            while (!this.b) {
                try {
                    Object next = it.next();
                    if (!this.b) {
                        if (next == null) {
                            bQa.a((Throwable) new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        bQa.b(next);
                        if (!this.b) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.b) {
                                        bQa.onComplete();
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                _Pa.b(th);
                                bQa.a(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    _Pa.b(th2);
                    bQa.a(th2);
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void b(long j) {
            Iterator<? extends T> it = this.a;
            BQa<? super T> bQa = this.d;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        j2 = get();
                        if (j3 == j2) {
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.b) {
                        try {
                            Object next = it.next();
                            if (!this.b) {
                                if (next == null) {
                                    bQa.a((Throwable) new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                boolean b = bQa.b(next);
                                if (!this.b) {
                                    try {
                                        if (!it.hasNext()) {
                                            if (!this.b) {
                                                bQa.onComplete();
                                            }
                                            return;
                                        } else if (b) {
                                            j3++;
                                        }
                                    } catch (Throwable th) {
                                        _Pa.b(th);
                                        bQa.a(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            _Pa.b(th2);
                            bQa.a(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    /* renamed from: uRa$c */
    /* compiled from: FlowableFromIterable */
    static final class c<T> extends a<T> {
        final C5551aBb<? super T> d;

        c(C5551aBb<? super T> abb, Iterator<? extends T> it) {
            super(it);
            this.d = abb;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            Iterator<? extends T> it = this.a;
            C5551aBb<? super T> abb = this.d;
            while (!this.b) {
                try {
                    Object next = it.next();
                    if (!this.b) {
                        if (next == null) {
                            abb.a((Throwable) new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        abb.a(next);
                        if (!this.b) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.b) {
                                        abb.onComplete();
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                _Pa.b(th);
                                abb.a(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    _Pa.b(th2);
                    abb.a(th2);
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void b(long j) {
            Iterator<? extends T> it = this.a;
            C5551aBb<? super T> abb = this.d;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        j2 = get();
                        if (j3 == j2) {
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.b) {
                        try {
                            Object next = it.next();
                            if (!this.b) {
                                if (next == null) {
                                    abb.a((Throwable) new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                abb.a(next);
                                if (!this.b) {
                                    try {
                                        if (!it.hasNext()) {
                                            if (!this.b) {
                                                abb.onComplete();
                                            }
                                            return;
                                        }
                                        j3++;
                                    } catch (Throwable th) {
                                        _Pa.b(th);
                                        abb.a(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            _Pa.b(th2);
                            abb.a(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    public C7464uRa(Iterable<? extends T> iterable) {
        this.b = iterable;
    }

    public static <T> void a(C5551aBb<? super T> abb, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                C7467uUa.a(abb);
                return;
            }
            if (abb instanceof BQa) {
                abb.a((C5619bBb) new b((BQa) abb, it));
            } else {
                abb.a((C5619bBb) new c(abb, it));
            }
        } catch (Throwable th) {
            _Pa.b(th);
            C7467uUa.a(th, abb);
        }
    }

    public void b(C5551aBb<? super T> abb) {
        try {
            a(abb, this.b.iterator());
        } catch (Throwable th) {
            _Pa.b(th);
            C7467uUa.a(th, abb);
        }
    }
}
