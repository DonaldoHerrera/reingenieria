package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableUnsubscribeOn */
public final class C7259rTa<T> extends C6642iSa<T, T> {
    final HPa b;

    /* renamed from: rTa$a */
    /* compiled from: ObservableUnsubscribeOn */
    static final class a<T> extends AtomicBoolean implements GPa<T>, VPa {
        final GPa<? super T> a;
        final HPa b;
        VPa c;

        /* renamed from: rTa$a$a reason: collision with other inner class name */
        /* compiled from: ObservableUnsubscribeOn */
        final class C0184a implements Runnable {
            C0184a() {
            }

            public void run() {
                a.this.c.dispose();
            }
        }

        a(GPa<? super T> gPa, HPa hPa) {
            this.a = gPa;
            this.b = hPa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.b.a(new C0184a());
            }
        }

        public void onComplete() {
            if (!get()) {
                this.a.onComplete();
            }
        }

        public void a(T t) {
            if (!get()) {
                this.a.a(t);
            }
        }

        public void a(Throwable th) {
            if (get()) {
                WUa.b(th);
            } else {
                this.a.a(th);
            }
        }

        public boolean a() {
            return get();
        }
    }

    public C7259rTa(EPa<T> ePa, HPa hPa) {
        super(ePa);
        this.b = hPa;
    }

    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa, this.b));
    }
}
