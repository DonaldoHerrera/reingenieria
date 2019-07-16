package defpackage;

import java.util.concurrent.Callable;

/* renamed from: DRa reason: default package */
/* compiled from: MaybeDefer */
public final class DRa<T> extends C7531vPa<T> {
    final Callable<? extends C7669xPa<? extends T>> a;

    public DRa(Callable<? extends C7669xPa<? extends T>> callable) {
        this.a = callable;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        try {
            Object call = this.a.call();
            AQa.a(call, "The maybeSupplier returned a null MaybeSource");
            ((C7669xPa) call).a(wpa);
        } catch (Throwable th) {
            _Pa.b(th);
            C7532vQa.a(th, wpa);
        }
    }
}
