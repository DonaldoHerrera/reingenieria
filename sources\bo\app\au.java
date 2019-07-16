package bo.app;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class au extends ThreadPoolExecutor {
    private static final TimeUnit a = TimeUnit.MILLISECONDS;

    public au(ThreadFactory threadFactory) {
        super(1, 1, 0, a, new LinkedBlockingQueue(), threadFactory);
    }
}
