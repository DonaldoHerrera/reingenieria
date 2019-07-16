package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: FB reason: default package */
public final class FB {
    private static final AtomicReference<GB> a = new AtomicReference<>(null);

    static GB a() {
        return (GB) a.get();
    }

    public static void a(GB gb) {
        a.compareAndSet(null, gb);
    }
}
