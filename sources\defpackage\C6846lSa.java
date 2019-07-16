package defpackage;

import java.util.concurrent.Callable;

/* renamed from: lSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableCollectSingle */
public final class C6846lSa<T, U> extends IPa<U> implements DQa<U> {
    final EPa<T> a;
    final Callable<? extends U> b;
    final C6436fQa<? super U, ? super T> c;

    /* renamed from: lSa$a */
    /* compiled from: ObservableCollectSingle */
    static final class a<T, U> implements GPa<T>, VPa {
        final KPa<? super U> a;
        final C6436fQa<? super U, ? super T> b;
        final U c;
        VPa d;
        boolean e;

        a(KPa<? super U> kPa, U u, C6436fQa<? super U, ? super T> fqa) {
            this.a = kPa;
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
                this.a.onSuccess(this.c);
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

    public C6846lSa(EPa<T> ePa, Callable<? extends U> callable, C6436fQa<? super U, ? super T> fqa) {
        this.a = ePa;
        this.b = callable;
        this.c = fqa;
    }

    public APa<U> a() {
        return WUa.a((APa<T>) new C6778kSa<T>(this.a, this.b, this.c));
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super U> kPa) {
        try {
            Object call = this.b.call();
            AQa.a(call, "The initialSupplier returned a null value");
            this.a.a(new a(kPa, call, this.c));
        } catch (Throwable th) {
            C7532vQa.a(th, kPa);
        }
    }
}
