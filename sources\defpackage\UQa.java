package defpackage;

/* renamed from: UQa reason: default package */
/* compiled from: DeferredScalarDisposable */
public class UQa<T> extends PQa<T> {
    protected final GPa<? super T> a;
    protected T b;

    public UQa(GPa<? super T> gPa) {
        this.a = gPa;
    }

    public final int a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void b(T t) {
        int i = get();
        if ((i & 54) == 0) {
            GPa<? super T> gPa = this.a;
            if (i == 8) {
                this.b = t;
                lazySet(16);
                gPa.a(null);
            } else {
                lazySet(2);
                gPa.a(t);
            }
            if (get() != 4) {
                gPa.onComplete();
            }
        }
    }

    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public void dispose() {
        set(4);
        this.b = null;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.b;
        this.b = null;
        lazySet(32);
        return t;
    }

    public final boolean a() {
        return get() == 4;
    }

    public final void b(Throwable th) {
        if ((get() & 54) != 0) {
            WUa.b(th);
            return;
        }
        lazySet(2);
        this.a.a(th);
    }

    public final void b() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.a.onComplete();
        }
    }
}
