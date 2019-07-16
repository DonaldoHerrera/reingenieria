package defpackage;

import java.util.concurrent.Executor;

/* renamed from: uf reason: default package and case insensitive filesystem */
/* compiled from: DirectExecutor */
enum C1751uf implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
