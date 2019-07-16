package defpackage;

import com.google.common.base.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: wE reason: default package and case insensitive filesystem */
/* compiled from: ImmediateFuture */
abstract class C3327wE<V> implements C3347xE<V> {
    private static final Logger a = Logger.getLogger(C3327wE.class.getName());

    /* renamed from: wE$a */
    /* compiled from: ImmediateFuture */
    static final class a<V> extends i<V> {
        a(Throwable th) {
            a(th);
        }
    }

    /* renamed from: wE$b */
    /* compiled from: ImmediateFuture */
    static class b<V> extends C3327wE<V> {
        static final b<Object> b = new b<>(null);
        private final V c;

        b(V v) {
            this.c = v;
        }

        public V get() {
            return this.c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[status=SUCCESS, result=[");
            sb.append(this.c);
            sb.append("]]");
            return sb.toString();
        }
    }

    C3327wE() {
    }

    public void a(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public abstract V get() throws ExecutionException;

    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        Preconditions.checkNotNull(timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
