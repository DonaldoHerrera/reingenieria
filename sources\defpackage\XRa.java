package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: XRa reason: default package */
/* compiled from: MaybeSubscribeOn */
public final class XRa<T> extends BRa<T, T> {
    final HPa b;

    /* renamed from: XRa$a */
    /* compiled from: MaybeSubscribeOn */
    static final class a<T> extends AtomicReference<VPa> implements C7600wPa<T>, VPa {
        final C7739yQa a = new C7739yQa();
        final C7600wPa<? super T> b;

        a(C7600wPa<? super T> wpa) {
            this.b = wpa;
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
            this.a.dispose();
        }

        public void onComplete() {
            this.b.onComplete();
        }

        public void onSuccess(T t) {
            this.b.onSuccess(t);
        }

        public void a(VPa vPa) {
            C7463uQa.c(this, vPa);
        }

        public void a(Throwable th) {
            this.b.a(th);
        }
    }

    /* renamed from: XRa$b */
    /* compiled from: MaybeSubscribeOn */
    static final class b<T> implements Runnable {
        final C7600wPa<? super T> a;
        final C7669xPa<T> b;

        b(C7600wPa<? super T> wpa, C7669xPa<T> xpa) {
            this.a = wpa;
            this.b = xpa;
        }

        public void run() {
            this.b.a(this.a);
        }
    }

    public XRa(C7669xPa<T> xpa, HPa hPa) {
        super(xpa);
        this.b = hPa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        a aVar = new a(wpa);
        wpa.a((VPa) aVar);
        aVar.a.a(this.b.a(new b(aVar, this.a)));
    }
}
