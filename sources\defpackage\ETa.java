package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ETa reason: default package */
/* compiled from: SingleError */
public final class ETa<T> extends IPa<T> {
    final Callable<? extends Throwable> a;

    public ETa(Callable<? extends Throwable> callable) {
        this.a = callable;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        try {
            Object call = this.a.call();
            AQa.a(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th) {
            th = th;
            _Pa.b(th);
        }
        C7532vQa.a(th, kPa);
    }
}
