package defpackage;

import java.util.concurrent.Callable;

/* renamed from: JSa reason: default package */
/* compiled from: ObservableFromCallable */
public final class JSa<T> extends APa<T> implements Callable<T> {
    final Callable<? extends T> a;

    public JSa(Callable<? extends T> callable) {
        this.a = callable;
    }

    public void b(GPa<? super T> gPa) {
        UQa uQa = new UQa(gPa);
        gPa.a((VPa) uQa);
        if (!uQa.a()) {
            try {
                Object call = this.a.call();
                AQa.a(call, "Callable returned null");
                uQa.b(call);
            } catch (Throwable th) {
                _Pa.b(th);
                if (!uQa.a()) {
                    gPa.a(th);
                } else {
                    WUa.b(th);
                }
            }
        }
    }

    public T call() throws Exception {
        T call = this.a.call();
        AQa.a(call, "The callable returned a null value");
        return call;
    }
}
