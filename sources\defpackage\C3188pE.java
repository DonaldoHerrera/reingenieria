package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.ForOverride;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: pE reason: default package and case insensitive filesystem */
/* compiled from: AbstractTransformFuture */
abstract class C3188pE<I, O, F, T> extends a<O> implements Runnable {
    C3347xE<? extends I> h;
    F i;

    /* renamed from: pE$a */
    /* compiled from: AbstractTransformFuture */
    private static final class a<I, O> extends C3188pE<I, O, Function<? super I, ? extends O>, O> {
        a(C3347xE<? extends I> xEVar, Function<? super I, ? extends O> function) {
            super(xEVar, function);
        }

        /* access modifiers changed from: 0000 */
        public void b(O o) {
            a(o);
        }

        /* access modifiers changed from: 0000 */
        public O a(Function<? super I, ? extends O> function, I i) {
            return function.apply(i);
        }
    }

    C3188pE(C3347xE<? extends I> xEVar, F f) {
        Preconditions.checkNotNull(xEVar);
        this.h = xEVar;
        Preconditions.checkNotNull(f);
        this.i = f;
    }

    static <I, O> C3347xE<O> a(C3347xE<I> xEVar, Function<? super I, ? extends O> function, Executor executor) {
        Preconditions.checkNotNull(function);
        a aVar = new a(xEVar, function);
        xEVar.a(aVar, C1924AE.a(executor, aVar));
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    @ForOverride
    public abstract T a(F f, I i2) throws Exception;

    /* access modifiers changed from: 0000 */
    @ForOverride
    public abstract void b(T t);

    /* access modifiers changed from: protected */
    public final void d() {
        a((Future<?>) this.h);
        this.h = null;
        this.i = null;
    }

    /* access modifiers changed from: protected */
    public String f() {
        String str;
        C3347xE<? extends I> xEVar = this.h;
        F f = this.i;
        String f2 = super.f();
        if (xEVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("inputFuture=[");
            sb.append(xEVar);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(f);
            sb2.append("]");
            return sb2.toString();
        } else if (f2 == null) {
            return null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(f2);
            return sb3.toString();
        }
    }

    public final void run() {
        C3347xE<? extends I> xEVar = this.h;
        F f = this.i;
        boolean z = true;
        boolean isCancelled = isCancelled() | (xEVar == null);
        if (f != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.h = null;
            if (xEVar.isCancelled()) {
                b(xEVar);
                return;
            }
            try {
                try {
                    Object a2 = a(f, C3267tE.a((Future<V>) xEVar));
                    this.i = null;
                    b(a2);
                } catch (Throwable th) {
                    this.i = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                a(e.getCause());
            } catch (RuntimeException e2) {
                a((Throwable) e2);
            } catch (Error e3) {
                a((Throwable) e3);
            }
        }
    }
}
