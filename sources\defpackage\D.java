package defpackage;

import java.util.concurrent.Executor;

/* renamed from: D reason: default package */
/* compiled from: ArchTaskExecutor */
class D implements Executor {
    D() {
    }

    public void execute(Runnable runnable) {
        E.c().a(runnable);
    }
}
