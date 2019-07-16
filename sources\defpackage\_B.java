package defpackage;

import java.util.concurrent.Executor;

/* renamed from: _B reason: default package */
final class _B implements Executor {
    _B() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
