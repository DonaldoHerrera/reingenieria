package bo.app;

import java.lang.Thread.UncaughtExceptionHandler;

public class at implements UncaughtExceptionHandler {
    private static final String a = Hg.a(at.class);
    private final ab b;

    public at(ab abVar) {
        this.b = abVar;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            Hg.d(a, "Uncaught exception from thread. Publishing as Throwable event", th);
            this.b.a(th, Throwable.class);
        } catch (Exception e) {
            Hg.d(a, "Failed to log throwable.", e);
        }
    }
}
