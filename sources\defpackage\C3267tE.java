package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: tE reason: default package and case insensitive filesystem */
/* compiled from: Futures */
public final class C3267tE extends C3307vE {
    public static <V> C3347xE<V> a(V v) {
        if (v == null) {
            return b.b;
        }
        return new b(v);
    }

    public static <V> C3347xE<V> a(Throwable th) {
        Preconditions.checkNotNull(th);
        return new a(th);
    }

    public static <I, O> C3347xE<O> a(C3347xE<I> xEVar, Function<? super I, ? extends O> function, Executor executor) {
        return C3188pE.a(xEVar, function, executor);
    }

    @CanIgnoreReturnValue
    public static <V> V a(Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done: %s", (Object) future);
        return C1984DE.a(future);
    }
}
