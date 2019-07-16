package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sQa reason: default package and case insensitive filesystem */
/* compiled from: CancellableDisposable */
public final class C7325sQa extends AtomicReference<C6708jQa> implements VPa {
    public C7325sQa(C6708jQa jqa) {
        super(jqa);
    }

    public boolean a() {
        return get() == null;
    }

    public void dispose() {
        if (get() != null) {
            C6708jQa jqa = (C6708jQa) getAndSet(null);
            if (jqa != null) {
                try {
                    jqa.cancel();
                } catch (Exception e) {
                    _Pa.b(e);
                    WUa.b((Throwable) e);
                }
            }
        }
    }
}
