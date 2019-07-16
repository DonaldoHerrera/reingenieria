package defpackage;

/* renamed from: OQa reason: default package */
/* compiled from: BasicFuseableObserver */
public abstract class OQa<T, R> implements GPa<T>, IQa<R> {
    protected final GPa<? super R> a;
    protected VPa b;
    protected IQa<T> c;
    protected boolean d;
    protected int e;

    public OQa(GPa<? super R> gPa) {
        this.a = gPa;
    }

    public final void a(VPa vPa) {
        if (C7463uQa.a(this.b, vPa)) {
            this.b = vPa;
            if (vPa instanceof IQa) {
                this.c = (IQa) vPa;
            }
            if (c()) {
                this.a.a((VPa) this);
                b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public final void b(Throwable th) {
        _Pa.b(th);
        this.b.dispose();
        a(th);
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return true;
    }

    public void clear() {
        this.c.clear();
    }

    public void dispose() {
        this.b.dispose();
    }

    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.d) {
            this.d = true;
            this.a.onComplete();
        }
    }

    /* access modifiers changed from: protected */
    public final int b(int i) {
        IQa<T> iQa = this.c;
        if (iQa == null || (i & 4) != 0) {
            return 0;
        }
        int a2 = iQa.a(i);
        if (a2 != 0) {
            this.e = a2;
        }
        return a2;
    }

    public void a(Throwable th) {
        if (this.d) {
            WUa.b(th);
            return;
        }
        this.d = true;
        this.a.a(th);
    }

    public boolean a() {
        return this.b.a();
    }
}
