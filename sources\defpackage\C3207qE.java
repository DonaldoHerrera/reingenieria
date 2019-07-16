package defpackage;

import java.util.concurrent.Executor;

/* renamed from: qE reason: default package and case insensitive filesystem */
/* compiled from: DirectExecutor */
enum C3207qE implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
