package defpackage;

/* renamed from: BSa reason: default package */
/* compiled from: ObservableFilter */
public final class BSa<T> extends C6642iSa<T, T> {
    final C7256rQa<? super T> b;

    /* renamed from: BSa$a */
    /* compiled from: ObservableFilter */
    static final class a<T> extends OQa<T, T> {
        final C7256rQa<? super T> f;

        a(GPa<? super T> gPa, C7256rQa<? super T> rqa) {
            super(gPa);
            this.f = rqa;
        }

        public void a(T t) {
            if (this.e == 0) {
                try {
                    if (this.f.test(t)) {
                        this.a.a(t);
                    }
                } catch (Throwable th) {
                    b(th);
                }
            } else {
                this.a.a(null);
            }
        }

        public T poll() throws Exception {
            T poll;
            do {
                poll = this.c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f.test(poll));
            return poll;
        }

        public int a(int i) {
            return b(i);
        }
    }

    public BSa(EPa<T> ePa, C7256rQa<? super T> rqa) {
        super(ePa);
        this.b = rqa;
    }

    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa, this.b));
    }
}
