package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableCreate */
public final class C7120pSa<T> extends APa<T> {
    final CPa<T> a;

    /* renamed from: pSa$a */
    /* compiled from: ObservableCreate */
    static final class a<T> extends AtomicReference<VPa> implements BPa<T>, VPa {
        final GPa<? super T> a;

        a(GPa<? super T> gPa) {
            this.a = gPa;
        }

        public void a(T t) {
            if (t == null) {
                a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (!a()) {
                this.a.a(t);
            }
        }

        /* JADX INFO: finally extract failed */
        public boolean b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (a()) {
                return false;
            }
            try {
                this.a.a(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            if (!a()) {
                try {
                    this.a.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{a.class.getSimpleName(), super.toString()});
        }

        public void a(Throwable th) {
            if (!b(th)) {
                WUa.b(th);
            }
        }

        public void a(VPa vPa) {
            C7463uQa.b(this, vPa);
        }

        public void a(C6708jQa jqa) {
            a((VPa) new C7325sQa(jqa));
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }
    }

    public C7120pSa(CPa<T> cPa) {
        this.a = cPa;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        a aVar = new a(gPa);
        gPa.a((VPa) aVar);
        try {
            this.a.a(aVar);
        } catch (Throwable th) {
            _Pa.b(th);
            aVar.a(th);
        }
    }
}
