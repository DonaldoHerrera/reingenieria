package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yTa reason: default package and case insensitive filesystem */
/* compiled from: SingleDelayWithCompletable */
public final class C7742yTa<T> extends IPa<T> {
    final MPa<T> a;
    final C7255rPa b;

    /* renamed from: yTa$a */
    /* compiled from: SingleDelayWithCompletable */
    static final class a<T> extends AtomicReference<VPa> implements C7117pPa, VPa {
        final KPa<? super T> a;
        final MPa<T> b;

        a(KPa<? super T> kPa, MPa<T> mPa) {
            this.a = kPa;
            this.b = mPa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.c(this, vPa)) {
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            this.b.a(new _Qa(this, this.a));
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }
    }

    public C7742yTa(MPa<T> mPa, C7255rPa rpa) {
        this.a = mPa;
        this.b = rpa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.b.a(new a(kPa, this.a));
    }
}
