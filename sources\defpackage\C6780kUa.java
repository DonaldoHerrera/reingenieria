package defpackage;

import java.util.concurrent.Callable;

/* renamed from: kUa reason: default package and case insensitive filesystem */
/* compiled from: ScheduledDirectTask */
public final class C6780kUa extends _Ta implements Callable<Void> {
    public C6780kUa(Runnable runnable) {
        super(runnable);
    }

    public Void call() throws Exception {
        this.d = Thread.currentThread();
        try {
            this.c.run();
            return null;
        } finally {
            lazySet(_Ta.a);
            this.d = null;
        }
    }
}
