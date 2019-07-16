package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: RTa reason: default package */
/* compiled from: SingleSubscribeOn */
public final class RTa<T> extends IPa<T> {
    final MPa<? extends T> a;
    final HPa b;

    /* renamed from: RTa$a */
    /* compiled from: SingleSubscribeOn */
    static final class a<T> extends AtomicReference<VPa> implements KPa<T>, VPa, Runnable {
        final KPa<? super T> a;
        final C7739yQa b = new C7739yQa();
        final MPa<? extends T> c;

        a(KPa<? super T> kPa, MPa<? extends T> mPa) {
            this.a = kPa;
            this.c = mPa;
        }

        public void a(VPa vPa) {
            C7463uQa.c(this, vPa);
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
            this.b.dispose();
        }

        public void onSuccess(T t) {
            this.a.onSuccess(t);
        }

        public void run() {
            this.c.a(this);
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }
    }

    public RTa(MPa<? extends T> mPa, HPa hPa) {
        this.a = mPa;
        this.b = hPa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        a aVar = new a(kPa, this.a);
        kPa.a((VPa) aVar);
        aVar.b.a(this.b.a(aVar));
    }
}
