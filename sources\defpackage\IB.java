package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: IB reason: default package */
public final class IB {
    private static final AtomicReference<KB> a = new AtomicReference<>(null);

    public static void a(KB kb) {
        a.compareAndSet(null, kb);
    }
}
