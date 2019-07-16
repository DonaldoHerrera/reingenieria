package defpackage;

import java.util.concurrent.Callable;

/* renamed from: gTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableScanSeed */
public final class C6507gTa<T, R> extends C6642iSa<T, R> {
    final C6504gQa<R, ? super T, R> b;
    final Callable<R> c;

    /* renamed from: gTa$a */
    /* compiled from: ObservableScanSeed */
    static final class a<T, R> implements GPa<T>, VPa {
        final GPa<? super R> a;
        final C6504gQa<R, ? super T, R> b;
        R c;
        VPa d;
        boolean e;

        a(GPa<? super R> gPa, C6504gQa<R, ? super T, R> gqa, R r) {
            this.a = gPa;
            this.b = gqa;
            this.c = r;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.d, vPa)) {
                this.d = vPa;
                this.a.a((VPa) this);
                this.a.a(this.c);
            }
        }

        public void dispose() {
            this.d.dispose();
        }

        public void onComplete() {
            if (!this.e) {
                this.e = true;
                this.a.onComplete();
            }
        }

        public boolean a() {
            return this.d.a();
        }

        public void a(T t) {
            if (!this.e) {
                try {
                    R apply = this.b.apply(this.c, t);
                    AQa.a(apply, "The accumulator returned a null value");
                    this.c = apply;
                    this.a.a(apply);
                } catch (Throwable th) {
                    _Pa.b(th);
                    this.d.dispose();
                    a(th);
                }
            }
        }

        public void a(Throwable th) {
            if (this.e) {
                WUa.b(th);
                return;
            }
            this.e = true;
            this.a.a(th);
        }
    }

    public C6507gTa(EPa<T> ePa, Callable<R> callable, C6504gQa<R, ? super T, R> gqa) {
        super(ePa);
        this.b = gqa;
        this.c = callable;
    }

    public void b(GPa<? super R> gPa) {
        try {
            Object call = this.c.call();
            AQa.a(call, "The seed supplied is null");
            this.a.a(new a(gPa, this.b, call));
        } catch (Throwable th) {
            _Pa.b(th);
            C7532vQa.a(th, gPa);
        }
    }
}
