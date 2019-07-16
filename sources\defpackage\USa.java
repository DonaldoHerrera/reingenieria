package defpackage;

/* renamed from: USa reason: default package */
/* compiled from: ObservableMap */
public final class USa<T, U> extends C6642iSa<T, U> {
    final C7118pQa<? super T, ? extends U> b;

    /* renamed from: USa$a */
    /* compiled from: ObservableMap */
    static final class a<T, U> extends OQa<T, U> {
        final C7118pQa<? super T, ? extends U> f;

        a(GPa<? super U> gPa, C7118pQa<? super T, ? extends U> pqa) {
            super(gPa);
            this.f = pqa;
        }

        public void a(T t) {
            if (!this.d) {
                if (this.e != 0) {
                    this.a.a(null);
                    return;
                }
                try {
                    Object apply = this.f.apply(t);
                    AQa.a(apply, "The mapper function returned a null value.");
                    this.a.a(apply);
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public U poll() throws Exception {
            Object poll = this.c.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f.apply(poll);
            AQa.a(apply, "The mapper function returned a null value.");
            return apply;
        }

        public int a(int i) {
            return b(i);
        }
    }

    public USa(EPa<T> ePa, C7118pQa<? super T, ? extends U> pqa) {
        super(ePa);
        this.b = pqa;
    }

    public void b(GPa<? super U> gPa) {
        this.a.a(new a(gPa, this.b));
    }
}
