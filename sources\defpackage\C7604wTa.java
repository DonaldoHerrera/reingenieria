package defpackage;

import java.util.concurrent.Callable;

/* renamed from: wTa reason: default package and case insensitive filesystem */
/* compiled from: SingleDefer */
public final class C7604wTa<T> extends IPa<T> {
    final Callable<? extends MPa<? extends T>> a;

    public C7604wTa(Callable<? extends MPa<? extends T>> callable) {
        this.a = callable;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        try {
            Object call = this.a.call();
            AQa.a(call, "The singleSupplier returned a null SingleSource");
            ((MPa) call).a(kPa);
        } catch (Throwable th) {
            _Pa.b(th);
            C7532vQa.a(th, kPa);
        }
    }
}
