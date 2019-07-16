package defpackage;

/* renamed from: sSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableDistinctUntilChanged */
public final class C7327sSa<T, K> extends C6642iSa<T, T> {
    final C7118pQa<? super T, K> b;
    final C6572hQa<? super K, ? super K> c;

    /* renamed from: sSa$a */
    /* compiled from: ObservableDistinctUntilChanged */
    static final class a<T, K> extends OQa<T, T> {
        final C7118pQa<? super T, K> f;
        final C6572hQa<? super K, ? super K> g;
        K h;
        boolean i;

        a(GPa<? super T> gPa, C7118pQa<? super T, K> pqa, C6572hQa<? super K, ? super K> hqa) {
            super(gPa);
            this.f = pqa;
            this.g = hqa;
        }

        public void a(T t) {
            if (!this.d) {
                if (this.e != 0) {
                    this.a.a(t);
                    return;
                }
                try {
                    K apply = this.f.apply(t);
                    if (this.i) {
                        boolean test = this.g.test(this.h, apply);
                        this.h = apply;
                        if (test) {
                            return;
                        }
                    } else {
                        this.i = true;
                        this.h = apply;
                    }
                    this.a.a(t);
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public T poll() throws Exception {
            while (true) {
                T poll = this.c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f.apply(poll);
                if (!this.i) {
                    this.i = true;
                    this.h = apply;
                    return poll;
                } else if (!this.g.test(this.h, apply)) {
                    this.h = apply;
                    return poll;
                } else {
                    this.h = apply;
                }
            }
        }

        public int a(int i2) {
            return b(i2);
        }
    }

    public C7327sSa(EPa<T> ePa, C7118pQa<? super T, K> pqa, C6572hQa<? super K, ? super K> hqa) {
        super(ePa);
        this.b = pqa;
        this.c = hqa;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa, this.b, this.c));
    }
}
