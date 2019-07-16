package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableSubscribeOn */
public final class C6779kTa<T> extends C6642iSa<T, T> {
    final HPa b;

    /* renamed from: kTa$a */
    /* compiled from: ObservableSubscribeOn */
    static final class a<T> extends AtomicReference<VPa> implements GPa<T>, VPa {
        final GPa<? super T> a;
        final AtomicReference<VPa> b = new AtomicReference<>();

        a(GPa<? super T> gPa) {
            this.a = gPa;
        }

        public void a(VPa vPa) {
            C7463uQa.c(this.b, vPa);
        }

        /* access modifiers changed from: 0000 */
        public void b(VPa vPa) {
            C7463uQa.c(this, vPa);
        }

        public void dispose() {
            C7463uQa.a(this.b);
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public void a(T t) {
            this.a.a(t);
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }
    }

    /* renamed from: kTa$b */
    /* compiled from: ObservableSubscribeOn */
    final class b implements Runnable {
        private final a<T> a;

        b(a<T> aVar) {
            this.a = aVar;
        }

        public void run() {
            C6779kTa.this.a.a(this.a);
        }
    }

    public C6779kTa(EPa<T> ePa, HPa hPa) {
        super(ePa);
        this.b = hPa;
    }

    public void b(GPa<? super T> gPa) {
        a aVar = new a(gPa);
        gPa.a((VPa) aVar);
        aVar.b(this.b.a(new b(aVar)));
    }
}
