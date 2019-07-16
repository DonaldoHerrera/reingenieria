package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: qTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableToListSingle */
public final class C7190qTa<T, U extends Collection<? super T>> extends IPa<U> implements DQa<U> {
    final EPa<T> a;
    final Callable<U> b;

    /* renamed from: qTa$a */
    /* compiled from: ObservableToListSingle */
    static final class a<T, U extends Collection<? super T>> implements GPa<T>, VPa {
        final KPa<? super U> a;
        U b;
        VPa c;

        a(KPa<? super U> kPa, U u) {
            this.a = kPa;
            this.b = u;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.c.dispose();
        }

        public void onComplete() {
            U u = this.b;
            this.b = null;
            this.a.onSuccess(u);
        }

        public boolean a() {
            return this.c.a();
        }

        public void a(T t) {
            this.b.add(t);
        }

        public void a(Throwable th) {
            this.b = null;
            this.a.a(th);
        }
    }

    public C7190qTa(EPa<T> ePa, int i) {
        this.a = ePa;
        this.b = C7808zQa.a(i);
    }

    public APa<U> a() {
        return WUa.a((APa<T>) new C7121pTa<T>(this.a, this.b));
    }

    public void b(KPa<? super U> kPa) {
        try {
            Object call = this.b.call();
            AQa.a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.a.a(new a(kPa, (Collection) call));
        } catch (Throwable th) {
            _Pa.b(th);
            C7532vQa.a(th, kPa);
        }
    }
}
