package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableToSingle */
public final class C7188qRa<T> extends IPa<T> {
    final C7255rPa a;
    final Callable<? extends T> b;
    final T c;

    /* renamed from: qRa$a */
    /* compiled from: CompletableToSingle */
    final class a implements C7117pPa {
        private final KPa<? super T> a;

        a(KPa<? super T> kPa) {
            this.a = kPa;
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public void onComplete() {
            T t;
            C7188qRa qra = C7188qRa.this;
            Callable<? extends T> callable = qra.b;
            if (callable != null) {
                try {
                    t = callable.call();
                } catch (Throwable th) {
                    _Pa.b(th);
                    this.a.a(th);
                    return;
                }
            } else {
                t = qra.c;
            }
            if (t == null) {
                this.a.a((Throwable) new NullPointerException("The value supplied is null"));
            } else {
                this.a.onSuccess(t);
            }
        }

        public void a(VPa vPa) {
            this.a.a(vPa);
        }
    }

    public C7188qRa(C7255rPa rpa, Callable<? extends T> callable, T t) {
        this.a = rpa;
        this.c = t;
        this.b = callable;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa));
    }
}
