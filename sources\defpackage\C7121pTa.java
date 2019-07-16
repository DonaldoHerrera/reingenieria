package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: pTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableToList */
public final class C7121pTa<T, U extends Collection<? super T>> extends C6642iSa<T, U> {
    final Callable<U> b;

    /* renamed from: pTa$a */
    /* compiled from: ObservableToList */
    static final class a<T, U extends Collection<? super T>> implements GPa<T>, VPa {
        final GPa<? super U> a;
        VPa b;
        U c;

        a(GPa<? super U> gPa, U u) {
            this.a = gPa;
            this.c = u;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.b, vPa)) {
                this.b = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.b.dispose();
        }

        public void onComplete() {
            U u = this.c;
            this.c = null;
            this.a.a(u);
            this.a.onComplete();
        }

        public boolean a() {
            return this.b.a();
        }

        public void a(T t) {
            this.c.add(t);
        }

        public void a(Throwable th) {
            this.c = null;
            this.a.a(th);
        }
    }

    public C7121pTa(EPa<T> ePa, Callable<U> callable) {
        super(ePa);
        this.b = callable;
    }

    public void b(GPa<? super U> gPa) {
        try {
            Object call = this.b.call();
            AQa.a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.a.a(new a(gPa, (Collection) call));
        } catch (Throwable th) {
            _Pa.b(th);
            C7532vQa.a(th, gPa);
        }
    }
}
