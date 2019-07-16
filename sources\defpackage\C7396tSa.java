package defpackage;

/* renamed from: tSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableDoAfterNext */
public final class C7396tSa<T> extends C6642iSa<T, T> {
    final C6776kQa<? super T> b;

    /* renamed from: tSa$a */
    /* compiled from: ObservableDoAfterNext */
    static final class a<T> extends OQa<T, T> {
        final C6776kQa<? super T> f;

        a(GPa<? super T> gPa, C6776kQa<? super T> kqa) {
            super(gPa);
            this.f = kqa;
        }

        public void a(T t) {
            this.a.a(t);
            if (this.e == 0) {
                try {
                    this.f.accept(t);
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public T poll() throws Exception {
            T poll = this.c.poll();
            if (poll != null) {
                this.f.accept(poll);
            }
            return poll;
        }

        public int a(int i) {
            return b(i);
        }
    }

    public C7396tSa(EPa<T> ePa, C6776kQa<? super T> kqa) {
        super(ePa);
        this.b = kqa;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa, this.b));
    }
}
