package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: zE reason: default package and case insensitive filesystem */
/* compiled from: MoreExecutors */
class C3387zE implements Executor {
    boolean a = true;
    final /* synthetic */ Executor b;
    final /* synthetic */ C3121mE c;

    C3387zE(Executor executor, C3121mE mEVar) {
        this.b = executor;
        this.c = mEVar;
    }

    public void execute(Runnable runnable) {
        try {
            this.b.execute(new C3367yE(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.a) {
                this.c.a((Throwable) e);
            }
        }
    }
}
