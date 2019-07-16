package defpackage;

import java.util.concurrent.Callable;

/* renamed from: rSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableDefer */
public final class C7258rSa<T> extends APa<T> {
    final Callable<? extends EPa<? extends T>> a;

    public C7258rSa(Callable<? extends EPa<? extends T>> callable) {
        this.a = callable;
    }

    public void b(GPa<? super T> gPa) {
        try {
            Object call = this.a.call();
            AQa.a(call, "null ObservableSource supplied");
            ((EPa) call).a(gPa);
        } catch (Throwable th) {
            _Pa.b(th);
            C7532vQa.a(th, gPa);
        }
    }
}
