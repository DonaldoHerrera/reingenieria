package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vTa reason: default package and case insensitive filesystem */
/* compiled from: SingleCreate */
public final class C7535vTa<T> extends IPa<T> {
    final LPa<T> a;

    /* renamed from: vTa$a */
    /* compiled from: SingleCreate */
    static final class a<T> extends AtomicReference<VPa> implements JPa<T>, VPa {
        final KPa<? super T> a;

        a(KPa<? super T> kPa) {
            this.a = kPa;
        }

        public void a(Throwable th) {
            if (!b(th)) {
                WUa.b(th);
            }
        }

        public boolean b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            C7463uQa uqa = C7463uQa.DISPOSED;
            if (obj != uqa) {
                VPa vPa = (VPa) getAndSet(uqa);
                if (vPa != C7463uQa.DISPOSED) {
                    try {
                        this.a.a(th);
                        return true;
                    } finally {
                        if (vPa != null) {
                            vPa.dispose();
                        }
                    }
                }
            }
            return false;
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onSuccess(T t) {
            Object obj = get();
            C7463uQa uqa = C7463uQa.DISPOSED;
            if (obj != uqa) {
                VPa vPa = (VPa) getAndSet(uqa);
                if (vPa != C7463uQa.DISPOSED) {
                    if (t == null) {
                        try {
                            this.a.a((Throwable) new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (vPa != null) {
                                vPa.dispose();
                            }
                            throw th;
                        }
                    } else {
                        this.a.onSuccess(t);
                    }
                    if (vPa != null) {
                        vPa.dispose();
                    }
                }
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{a.class.getSimpleName(), super.toString()});
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

    public C7535vTa(LPa<T> lPa) {
        this.a = lPa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        a aVar = new a(kPa);
        kPa.a((VPa) aVar);
        try {
            this.a.a(aVar);
        } catch (Throwable th) {
            _Pa.b(th);
            aVar.a(th);
        }
    }
}
