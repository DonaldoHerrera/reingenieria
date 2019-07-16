package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: XPa reason: default package */
/* compiled from: ReferenceDisposable */
abstract class XPa<T> extends AtomicReference<T> implements VPa {
    XPa(T t) {
        AQa.a(t, "value is null");
        super(t);
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public final boolean a() {
        return get() == null;
    }

    public final void dispose() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                a(andSet);
            }
        }
    }
}
