package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ITa reason: default package */
/* compiled from: SingleFromCallable */
public final class ITa<T> extends IPa<T> {
    final Callable<? extends T> a;

    public ITa(Callable<? extends T> callable) {
        this.a = callable;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        VPa b = WPa.b();
        kPa.a(b);
        if (!b.a()) {
            try {
                Object call = this.a.call();
                AQa.a(call, "The callable returned a null value");
                if (!b.a()) {
                    kPa.onSuccess(call);
                }
            } catch (Throwable th) {
                _Pa.b(th);
                if (!b.a()) {
                    kPa.a(th);
                } else {
                    WUa.b(th);
                }
            }
        }
    }
}
