package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ORa reason: default package */
/* compiled from: MaybeFromCallable */
public final class ORa<T> extends C7531vPa<T> implements Callable<T> {
    final Callable<? extends T> a;

    public ORa(Callable<? extends T> callable) {
        this.a = callable;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        VPa b = WPa.b();
        wpa.a(b);
        if (!b.a()) {
            try {
                Object call = this.a.call();
                if (b.a()) {
                    return;
                }
                if (call == null) {
                    wpa.onComplete();
                } else {
                    wpa.onSuccess(call);
                }
            } catch (Throwable th) {
                _Pa.b(th);
                if (!b.a()) {
                    wpa.a(th);
                } else {
                    WUa.b(th);
                }
            }
        }
    }

    public T call() throws Exception {
        return this.a.call();
    }
}
