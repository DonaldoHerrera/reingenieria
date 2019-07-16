package defpackage;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: sE reason: default package and case insensitive filesystem */
/* compiled from: FluentFuture */
public abstract class C3247sE<V> extends C3287uE<V> {

    /* renamed from: sE$a */
    /* compiled from: FluentFuture */
    static abstract class a<V> extends C3247sE<V> implements h<V> {
        a() {
        }

        public final void a(Runnable runnable, Executor executor) {
            super.a(runnable, executor);
        }

        @CanIgnoreReturnValue
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @CanIgnoreReturnValue
        public final V get() throws InterruptedException, ExecutionException {
            return super.get();
        }

        public final boolean isCancelled() {
            return super.isCancelled();
        }

        public final boolean isDone() {
            return super.isDone();
        }

        @CanIgnoreReturnValue
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return super.get(j, timeUnit);
        }
    }

    C3247sE() {
    }
}
