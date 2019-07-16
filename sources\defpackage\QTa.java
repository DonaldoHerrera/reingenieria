package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: QTa reason: default package */
/* compiled from: SingleResumeNext */
public final class QTa<T> extends IPa<T> {
    final MPa<? extends T> a;
    final C7118pQa<? super Throwable, ? extends MPa<? extends T>> b;

    /* renamed from: QTa$a */
    /* compiled from: SingleResumeNext */
    static final class a<T> extends AtomicReference<VPa> implements KPa<T>, VPa {
        final KPa<? super T> a;
        final C7118pQa<? super Throwable, ? extends MPa<? extends T>> b;

        a(KPa<? super T> kPa, C7118pQa<? super Throwable, ? extends MPa<? extends T>> pqa) {
            this.a = kPa;
            this.b = pqa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.c(this, vPa)) {
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onSuccess(T t) {
            this.a.onSuccess(t);
        }

        public void a(Throwable th) {
            try {
                Object apply = this.b.apply(th);
                AQa.a(apply, "The nextFunction returned a null SingleSource.");
                ((MPa) apply).a(new _Qa(this, this.a));
            } catch (Throwable th2) {
                _Pa.b(th2);
                this.a.a((Throwable) new ZPa(th, th2));
            }
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }
    }

    public QTa(MPa<? extends T> mPa, C7118pQa<? super Throwable, ? extends MPa<? extends T>> pqa) {
        this.a = mPa;
        this.b = pqa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa, this.b));
    }
}
