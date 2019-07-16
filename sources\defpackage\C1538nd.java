package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: nd reason: default package and case insensitive filesystem */
/* compiled from: ModernAsyncTask */
abstract class C1538nd<Params, Progress, Result> {
    private static final ThreadFactory a = new C1414jd();
    private static final BlockingQueue<Runnable> b = new LinkedBlockingQueue(10);
    public static final Executor c;
    private static b d;
    private static volatile Executor e = c;
    private final d<Params, Result> f = new C1445kd(this);
    private final FutureTask<Result> g = new C1476ld(this, this.f);
    private volatile c h = c.PENDING;
    final AtomicBoolean i = new AtomicBoolean();
    final AtomicBoolean j = new AtomicBoolean();

    /* renamed from: nd$a */
    /* compiled from: ModernAsyncTask */
    private static class a<Data> {
        final C1538nd a;
        final Data[] b;

        a(C1538nd ndVar, Data... dataArr) {
            this.a = ndVar;
            this.b = dataArr;
        }
    }

    /* renamed from: nd$b */
    /* compiled from: ModernAsyncTask */
    private static class b extends Handler {
        b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            a aVar = (a) message.obj;
            int i = message.what;
            if (i == 1) {
                aVar.a.a(aVar.b[0]);
            } else if (i == 2) {
                aVar.a.b((Progress[]) aVar.b);
            }
        }
    }

    /* renamed from: nd$c */
    /* compiled from: ModernAsyncTask */
    public enum c {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: nd$d */
    /* compiled from: ModernAsyncTask */
    private static abstract class d<Params, Result> implements Callable<Result> {
        Params[] a;

        d() {
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, b, a);
        c = threadPoolExecutor;
    }

    C1538nd() {
    }

    private static Handler d() {
        b bVar;
        synchronized (C1538nd.class) {
            if (d == null) {
                d = new b();
            }
            bVar = d;
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public abstract Result a(Params... paramsArr);

    public final boolean a() {
        return this.i.get();
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void b(Result result) {
        b();
    }

    /* access modifiers changed from: protected */
    public void b(Progress... progressArr) {
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* access modifiers changed from: protected */
    public void c(Result result) {
    }

    /* access modifiers changed from: 0000 */
    public void e(Result result) {
        if (!this.j.get()) {
            d(result);
        }
    }

    public final boolean a(boolean z) {
        this.i.set(true);
        return this.g.cancel(z);
    }

    public final C1538nd<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.h != c.PENDING) {
            int i2 = C1507md.a[this.h.ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i2 != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.h = c.RUNNING;
            c();
            this.f.a = paramsArr;
            executor.execute(this.g);
            return this;
        }
    }

    /* access modifiers changed from: 0000 */
    public Result d(Result result) {
        d().obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: 0000 */
    public void a(Result result) {
        if (a()) {
            b(result);
        } else {
            c(result);
        }
        this.h = c.FINISHED;
    }
}
