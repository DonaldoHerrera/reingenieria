package defpackage;

/* renamed from: jUa reason: default package and case insensitive filesystem */
/* compiled from: ScheduledDirectPeriodicTask */
public final class C6712jUa extends _Ta implements Runnable {
    public C6712jUa(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        this.d = Thread.currentThread();
        try {
            this.c.run();
            this.d = null;
        } catch (Throwable th) {
            this.d = null;
            lazySet(_Ta.a);
            WUa.b(th);
        }
    }
}
