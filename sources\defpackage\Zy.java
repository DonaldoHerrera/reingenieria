package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: Zy reason: default package */
public final class Zy {

    /* renamed from: Zy$a */
    private static final class a implements b {
        private final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        public final void a(Exception exc) {
            this.a.countDown();
        }

        public final void b() throws InterruptedException {
            this.a.await();
        }

        public final void onSuccess(Object obj) {
            this.a.countDown();
        }

        public final void a() {
            this.a.countDown();
        }

        /* synthetic */ a(C1681rz rzVar) {
            this();
        }

        public final boolean a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.a.await(j, timeUnit);
        }
    }

    /* renamed from: Zy$b */
    interface b extends Qy, Sy, Ty<Object> {
    }

    /* renamed from: Zy$c */
    private static final class c implements b {
        private final Object a = new Object();
        private final int b;
        private final C1652qz<Void> c;
        private int d;
        private int e;
        private int f;
        private Exception g;
        private boolean h;

        public c(int i, C1652qz<Void> qzVar) {
            this.b = i;
            this.c = qzVar;
        }

        private final void b() {
            int i = this.d;
            int i2 = this.e;
            int i3 = i + i2 + this.f;
            int i4 = this.b;
            if (i3 == i4) {
                if (this.g != null) {
                    C1652qz<Void> qzVar = this.c;
                    StringBuilder sb = new StringBuilder(54);
                    sb.append(i2);
                    sb.append(" out of ");
                    sb.append(i4);
                    sb.append(" underlying tasks failed");
                    qzVar.a((Exception) new ExecutionException(sb.toString(), this.g));
                } else if (this.h) {
                    this.c.f();
                } else {
                    this.c.a(null);
                }
            }
        }

        public final void a(Exception exc) {
            synchronized (this.a) {
                this.e++;
                this.g = exc;
                b();
            }
        }

        public final void onSuccess(Object obj) {
            synchronized (this.a) {
                this.d++;
                b();
            }
        }

        public final void a() {
            synchronized (this.a) {
                this.f++;
                this.h = true;
                b();
            }
        }
    }

    public static <TResult> Wy<TResult> a(TResult tresult) {
        C1652qz qzVar = new C1652qz();
        qzVar.a(tresult);
        return qzVar;
    }

    public static Wy<List<Wy<?>>> b(Collection<? extends Wy<?>> collection) {
        return a(collection).b(new C1711sz(collection));
    }

    public static <TResult> Wy<TResult> a(Exception exc) {
        C1652qz qzVar = new C1652qz();
        qzVar.a(exc);
        return qzVar;
    }

    private static <TResult> TResult b(Wy<TResult> wy) throws ExecutionException {
        if (wy.e()) {
            return wy.b();
        }
        if (wy.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(wy.a());
    }

    public static <TResult> Wy<TResult> a(Executor executor, Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        C1652qz qzVar = new C1652qz();
        executor.execute(new C1681rz(qzVar, callable));
        return qzVar;
    }

    public static <TResult> TResult a(Wy<TResult> wy) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(wy, "Task must not be null");
        if (wy.d()) {
            return b(wy);
        }
        a aVar = new a(null);
        a(wy, (b) aVar);
        aVar.b();
        return b(wy);
    }

    public static <TResult> TResult a(Wy<TResult> wy, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(wy, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (wy.d()) {
            return b(wy);
        }
        a aVar = new a(null);
        a(wy, (b) aVar);
        if (aVar.a(j, timeUnit)) {
            return b(wy);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Wy<Void> a(Collection<? extends Wy<?>> collection) {
        if (collection.isEmpty()) {
            return a((TResult) null);
        }
        for (Wy wy : collection) {
            if (wy == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C1652qz qzVar = new C1652qz();
        c cVar = new c(collection.size(), qzVar);
        for (Wy a2 : collection) {
            a(a2, (b) cVar);
        }
        return qzVar;
    }

    public static Wy<List<Wy<?>>> a(Wy<?>... wyArr) {
        return b((Collection<? extends Wy<?>>) Arrays.asList(wyArr));
    }

    private static void a(Wy<?> wy, b bVar) {
        wy.a(Yy.b, (Ty<? super TResult>) bVar);
        wy.a(Yy.b, (Sy) bVar);
        wy.a(Yy.b, (Qy) bVar);
    }
}
