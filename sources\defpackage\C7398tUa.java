package defpackage;

/* renamed from: tUa reason: default package and case insensitive filesystem */
/* compiled from: DeferredScalarSubscription */
public class C7398tUa<T> extends C7260rUa<T> {
    protected final C5551aBb<? super T> a;
    protected T b;

    public C7398tUa(C5551aBb<? super T> abb) {
        this.a = abb;
    }

    public final void a(long j) {
        if (C7605wUa.b(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3)) {
                            T t = this.b;
                            if (t != null) {
                                this.b = null;
                                C5551aBb<? super T> abb = this.a;
                                abb.a(t);
                                if (get() != 4) {
                                    abb.onComplete();
                                }
                            }
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void c(T t) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    C5551aBb<? super T> abb = this.a;
                    abb.a(t);
                    if (get() != 4) {
                        abb.onComplete();
                    }
                    return;
                }
                this.b = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.b = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.b = t;
        lazySet(16);
        C5551aBb<? super T> abb2 = this.a;
        abb2.a(t);
        if (get() != 4) {
            abb2.onComplete();
        }
    }

    public void cancel() {
        set(4);
        this.b = null;
    }

    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.b;
        this.b = null;
        return t;
    }

    public final int a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
