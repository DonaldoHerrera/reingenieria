package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zTa reason: default package and case insensitive filesystem */
/* compiled from: SingleDoFinally */
public final class C7811zTa<T> extends IPa<T> {
    final MPa<T> a;
    final C6368eQa b;

    /* renamed from: zTa$a */
    /* compiled from: SingleDoFinally */
    static final class a<T> extends AtomicInteger implements KPa<T>, VPa {
        final KPa<? super T> a;
        final C6368eQa b;
        VPa c;

        a(KPa<? super T> kPa, C6368eQa eqa) {
            this.a = kPa;
            this.b = eqa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    _Pa.b(th);
                    WUa.b(th);
                }
            }
        }

        public void dispose() {
            this.c.dispose();
            b();
        }

        public void onSuccess(T t) {
            this.a.onSuccess(t);
            b();
        }

        public void a(Throwable th) {
            this.a.a(th);
            b();
        }

        public boolean a() {
            return this.c.a();
        }
    }

    public C7811zTa(MPa<T> mPa, C6368eQa eqa) {
        this.a = mPa;
        this.b = eqa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa, this.b));
    }
}
