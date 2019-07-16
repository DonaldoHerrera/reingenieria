package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: fUa reason: default package and case insensitive filesystem */
/* compiled from: NewThreadScheduler */
public final class C6440fUa extends HPa {
    private static final C6644iUa b = new C6644iUa("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    final ThreadFactory c;

    public C6440fUa() {
        this(b);
    }

    public c a() {
        return new C6508gUa(this.c);
    }

    public C6440fUa(ThreadFactory threadFactory) {
        this.c = threadFactory;
    }
}
