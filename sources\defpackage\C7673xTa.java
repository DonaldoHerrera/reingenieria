package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xTa reason: default package and case insensitive filesystem */
/* compiled from: SingleDelay */
public final class C7673xTa<T> extends IPa<T> {
    final MPa<? extends T> a;
    final long b;
    final TimeUnit c;
    final HPa d;
    final boolean e;

    /* renamed from: xTa$a */
    /* compiled from: SingleDelay */
    final class a implements KPa<T> {
        private final C7739yQa a;
        final KPa<? super T> b;

        /* renamed from: xTa$a$a reason: collision with other inner class name */
        /* compiled from: SingleDelay */
        final class C0187a implements Runnable {
            private final Throwable a;

            C0187a(Throwable th) {
                this.a = th;
            }

            public void run() {
                a.this.b.a(this.a);
            }
        }

        /* renamed from: xTa$a$b */
        /* compiled from: SingleDelay */
        final class b implements Runnable {
            private final T a;

            b(T t) {
                this.a = t;
            }

            public void run() {
                a.this.b.onSuccess(this.a);
            }
        }

        a(C7739yQa yqa, KPa<? super T> kPa) {
            this.a = yqa;
            this.b = kPa;
        }

        public void a(VPa vPa) {
            this.a.a(vPa);
        }

        public void onSuccess(T t) {
            C7739yQa yqa = this.a;
            HPa hPa = C7673xTa.this.d;
            b bVar = new b(t);
            C7673xTa xta = C7673xTa.this;
            yqa.a(hPa.a(bVar, xta.b, xta.c));
        }

        public void a(Throwable th) {
            C7739yQa yqa = this.a;
            HPa hPa = C7673xTa.this.d;
            C0187a aVar = new C0187a(th);
            C7673xTa xta = C7673xTa.this;
            yqa.a(hPa.a(aVar, xta.e ? xta.b : 0, C7673xTa.this.c));
        }
    }

    public C7673xTa(MPa<? extends T> mPa, long j, TimeUnit timeUnit, HPa hPa, boolean z) {
        this.a = mPa;
        this.b = j;
        this.c = timeUnit;
        this.d = hPa;
        this.e = z;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        C7739yQa yqa = new C7739yQa();
        kPa.a((VPa) yqa);
        this.a.a(new a(yqa, kPa));
    }
}
