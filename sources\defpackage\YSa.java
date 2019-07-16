package defpackage;

/* renamed from: YSa reason: default package */
/* compiled from: ObservableOnErrorNext */
public final class YSa<T> extends C6642iSa<T, T> {
    final C7118pQa<? super Throwable, ? extends EPa<? extends T>> b;
    final boolean c;

    /* renamed from: YSa$a */
    /* compiled from: ObservableOnErrorNext */
    static final class a<T> implements GPa<T> {
        final GPa<? super T> a;
        final C7118pQa<? super Throwable, ? extends EPa<? extends T>> b;
        final boolean c;
        final C7739yQa d = new C7739yQa();
        boolean e;
        boolean f;

        a(GPa<? super T> gPa, C7118pQa<? super Throwable, ? extends EPa<? extends T>> pqa, boolean z) {
            this.a = gPa;
            this.b = pqa;
            this.c = z;
        }

        public void a(VPa vPa) {
            this.d.a(vPa);
        }

        public void onComplete() {
            if (!this.f) {
                this.f = true;
                this.e = true;
                this.a.onComplete();
            }
        }

        public void a(T t) {
            if (!this.f) {
                this.a.a(t);
            }
        }

        public void a(Throwable th) {
            if (!this.e) {
                this.e = true;
                if (!this.c || (th instanceof Exception)) {
                    try {
                        EPa ePa = (EPa) this.b.apply(th);
                        if (ePa == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.a.a((Throwable) nullPointerException);
                            return;
                        }
                        ePa.a(this);
                    } catch (Throwable th2) {
                        _Pa.b(th2);
                        this.a.a((Throwable) new ZPa(th, th2));
                    }
                } else {
                    this.a.a(th);
                }
            } else if (this.f) {
                WUa.b(th);
            } else {
                this.a.a(th);
            }
        }
    }

    public YSa(EPa<T> ePa, C7118pQa<? super Throwable, ? extends EPa<? extends T>> pqa, boolean z) {
        super(ePa);
        this.b = pqa;
        this.c = z;
    }

    public void b(GPa<? super T> gPa) {
        a aVar = new a(gPa, this.b, this.c);
        gPa.a((VPa) aVar.d);
        this.a.a(aVar);
    }
}
