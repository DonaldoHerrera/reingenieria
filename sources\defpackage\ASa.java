package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ASa reason: default package */
/* compiled from: ObservableError */
public final class ASa<T> extends APa<T> {
    final Callable<? extends Throwable> a;

    public ASa(Callable<? extends Throwable> callable) {
        this.a = callable;
    }

    public void b(GPa<? super T> gPa) {
        try {
            Object call = this.a.call();
            AQa.a(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th) {
            th = th;
            _Pa.b(th);
        }
        C7532vQa.a(th, gPa);
    }
}
