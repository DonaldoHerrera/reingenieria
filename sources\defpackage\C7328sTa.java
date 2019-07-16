package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableWithLatestFrom */
public final class C7328sTa<T, U, R> extends C6642iSa<T, R> {
    final C6504gQa<? super T, ? super U, ? extends R> b;
    final EPa<? extends U> c;

    /* renamed from: sTa$a */
    /* compiled from: ObservableWithLatestFrom */
    static final class a<T, U, R> extends AtomicReference<U> implements GPa<T>, VPa {
        final GPa<? super R> a;
        final C6504gQa<? super T, ? super U, ? extends R> b;
        final AtomicReference<VPa> c = new AtomicReference<>();
        final AtomicReference<VPa> d = new AtomicReference<>();

        a(GPa<? super R> gPa, C6504gQa<? super T, ? super U, ? extends R> gqa) {
            this.a = gPa;
            this.b = gqa;
        }

        public void a(VPa vPa) {
            C7463uQa.c(this.c, vPa);
        }

        public boolean b(VPa vPa) {
            return C7463uQa.c(this.d, vPa);
        }

        public void dispose() {
            C7463uQa.a(this.c);
            C7463uQa.a(this.d);
        }

        public void onComplete() {
            C7463uQa.a(this.d);
            this.a.onComplete();
        }

        public void a(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    Object apply = this.b.apply(t, obj);
                    AQa.a(apply, "The combiner returned a null value");
                    this.a.a(apply);
                } catch (Throwable th) {
                    _Pa.b(th);
                    dispose();
                    this.a.a(th);
                }
            }
        }

        public void b(Throwable th) {
            C7463uQa.a(this.c);
            this.a.a(th);
        }

        public void a(Throwable th) {
            C7463uQa.a(this.d);
            this.a.a(th);
        }

        public boolean a() {
            return C7463uQa.a((VPa) this.c.get());
        }
    }

    /* renamed from: sTa$b */
    /* compiled from: ObservableWithLatestFrom */
    final class b implements GPa<U> {
        private final a<T, U, R> a;

        b(a<T, U, R> aVar) {
            this.a = aVar;
        }

        public void a(VPa vPa) {
            this.a.b(vPa);
        }

        public void onComplete() {
        }

        public void a(U u) {
            this.a.lazySet(u);
        }

        public void a(Throwable th) {
            this.a.b(th);
        }
    }

    public C7328sTa(EPa<T> ePa, C6504gQa<? super T, ? super U, ? extends R> gqa, EPa<? extends U> ePa2) {
        super(ePa);
        this.b = gqa;
        this.c = ePa2;
    }

    public void b(GPa<? super R> gPa) {
        UUa uUa = new UUa(gPa);
        a aVar = new a(uUa, this.b);
        uUa.a((VPa) aVar);
        this.c.a(new b(aVar));
        this.a.a(aVar);
    }
}
