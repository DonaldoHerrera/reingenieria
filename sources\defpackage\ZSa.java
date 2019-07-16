package defpackage;

/* renamed from: ZSa reason: default package */
/* compiled from: ObservableOnErrorReturn */
public final class ZSa<T> extends C6642iSa<T, T> {
    final C7118pQa<? super Throwable, ? extends T> b;

    /* renamed from: ZSa$a */
    /* compiled from: ObservableOnErrorReturn */
    static final class a<T> implements GPa<T>, VPa {
        final GPa<? super T> a;
        final C7118pQa<? super Throwable, ? extends T> b;
        VPa c;

        a(GPa<? super T> gPa, C7118pQa<? super Throwable, ? extends T> pqa) {
            this.a = gPa;
            this.b = pqa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.c.dispose();
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public boolean a() {
            return this.c.a();
        }

        public void a(T t) {
            this.a.a(t);
        }

        public void a(Throwable th) {
            try {
                Object apply = this.b.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.a.a((Throwable) nullPointerException);
                    return;
                }
                this.a.a(apply);
                this.a.onComplete();
            } catch (Throwable th2) {
                _Pa.b(th2);
                this.a.a((Throwable) new ZPa(th, th2));
            }
        }
    }

    public ZSa(EPa<T> ePa, C7118pQa<? super Throwable, ? extends T> pqa) {
        super(ePa);
        this.b = pqa;
    }

    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa, this.b));
    }
}
