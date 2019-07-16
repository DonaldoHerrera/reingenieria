package defpackage;

import java.util.concurrent.Executor;

/* renamed from: xf reason: default package and case insensitive filesystem */
/* compiled from: WorkManagerTaskExecutor */
class C1841xf implements Executor {
    final /* synthetic */ C1871yf a;

    C1841xf(C1871yf yfVar) {
        this.a = yfVar;
    }

    public void execute(Runnable runnable) {
        this.a.b(runnable);
    }
}
