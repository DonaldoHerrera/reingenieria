package androidx.work.impl.utils;

import java.util.concurrent.Executor;

/* compiled from: SynchronousExecutor */
public class m implements Executor {
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
