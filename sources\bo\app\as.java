package bo.app;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class as implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);
    private UncaughtExceptionHandler b;

    public void a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = uncaughtExceptionHandler;
    }

    public Thread newThread(Runnable runnable) {
        if (this.b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(as.class.getSimpleName());
            sb.append(" #");
            sb.append(this.a.getAndIncrement());
            Thread thread = new Thread(runnable, sb.toString());
            thread.setUncaughtExceptionHandler(this.b);
            return thread;
        }
        throw new IllegalStateException("No UncaughtExceptionHandler. You must call setUncaughtExceptionHandler before creating a new thread");
    }
}
