package defpackage;

import java.util.concurrent.Callable;

/* renamed from: kSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableCollect */
public final class C6778kSa<T, U> extends C6642iSa<T, U> {
    final Callable<? extends U> b;
    final C6436fQa<? super U, ? super T> c;

    /* renamed from: kSa$a */
    /* compiled from: ObservableCollect */
    static final class a<T, U> implements GPa<T>, VPa {
        final GPa<? super U> a;
        final C6436fQa<? super U, ? super T> b;
        final U c;
        VPa d;
        boolean e;

        a(GPa<? super U> gPa, U u, C6436fQa<? super U, ? super T> fqa) {
            this.a = gPa;
            this.b = fqa;
            this.c = u;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.d, vPa)) {
                this.d = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.d.dispose();
        }

        public void onComplete() {
            if (!this.e) {
                this.e = true;
                this.a.a(this.c);
                this.a.onComplete();
            }
        }

        public boolean a() {
            return this.d.a();
        }

        public void a(T t) {
            if (!this.e) {
                try {
                    this.b.accept(this.c, t);
                } catch (Throwable th) {
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

    public C6778kSa(EPa<T> ePa, Callable<? extends U> callable, C6436fQa<? super U, ? super T> fqa) {
        super(ePa);
        this.b = callable;
        this.c = fqa;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super U> gPa) {
        try {
            Object call = this.b.call();
            AQa.a(call, "The initialSupplier returned a null value");
            this.a.a(new a(gPa, call, this.c));
        } catch (Throwable th) {
            C7532vQa.a(th, gPa);
        }
    }
}
