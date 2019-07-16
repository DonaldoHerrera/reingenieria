package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: SNa reason: default package and case insensitive filesystem */
/* compiled from: AsyncTask */
public abstract class C5299SNa<Params, Progress, Result> {
    private static final int a = Runtime.getRuntime().availableProcessors();
    private static final int b;
    private static final int c;
    private static final ThreadFactory d = new C5179ONa();
    private static final BlockingQueue<Runnable> e = new LinkedBlockingQueue(128);
    public static final Executor f;
    public static final Executor g = new c(null);
    private static final b h = new b();
    private static volatile Executor i = g;
    private final e<Params, Result> j = new C5209PNa(this);
    private final FutureTask<Result> k = new C5239QNa(this, this.j);
    private volatile d l = d.PENDING;
    private final AtomicBoolean m = new AtomicBoolean();
    /* access modifiers changed from: private */
    public final AtomicBoolean n = new AtomicBoolean();

    /* renamed from: SNa$a */
    /* compiled from: AsyncTask */
    private static class a<Data> {
        final C5299SNa a;
        final Data[] b;

        a(C5299SNa sNa, Data... dataArr) {
            this.a = sNa;
            this.b = dataArr;
        }
    }

    /* renamed from: SNa$b */
    /* compiled from: AsyncTask */
    private static class b extends Handler {
        public b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            a aVar = (a) message.obj;
            int i = message.what;
            if (i == 1) {
                aVar.a.d(aVar.b[0]);
            } else if (i == 2) {
                aVar.a.b((Progress[]) aVar.b);
            }
        }
    }

    /* renamed from: SNa$c */
    /* compiled from: AsyncTask */
    private static class c implements Executor {
        final LinkedList<Runnable> a;
        Runnable b;

        private c() {
            this.a = new LinkedList<>();
        }

        /* access modifiers changed from: protected */
        public synchronized void a() {
            Runnable runnable = (Runnable) this.a.poll();
            this.b = runnable;
            if (runnable != null) {
                C5299SNa.f.execute(this.b);
            }
        }

        public synchronized void execute(Runnable runnable) {
            this.a.offer(new C5329TNa(this, runnable));
            if (this.b == null) {
                a();
            }
        }

        /* synthetic */ c(C5179ONa oNa) {
            this();
        }
    }

    /* renamed from: SNa$d */
    /* compiled from: AsyncTask */
    public enum d {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: SNa$e */
    /* compiled from: AsyncTask */
    private static abstract class e<Params, Result> implements Callable<Result> {
        Params[] a;

        private e() {
        }

        /* synthetic */ e(C5179ONa oNa) {
            this();
        }
    }

    static {
        int i2 = a;
        b = i2 + 1;
        c = (i2 * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(b, c, 1, TimeUnit.SECONDS, e, d);
        f = threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    public Result e(Result result) {
        h.obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: private */
    public void f(Result result) {
        if (!this.n.get()) {
            e(result);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Result a(Params... paramsArr);

    /* access modifiers changed from: protected */
    public abstract void b(Result result);

    /* access modifiers changed from: protected */
    public void b(Progress... progressArr) {
    }

    /* access modifiers changed from: protected */
    public abstract void c(Result result);

    public final d d() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    /* access modifiers changed from: private */
    public void d(Result result) {
        if (e()) {
            b(result);
        } else {
            c(result);
        }
        this.l = d.FINISHED;
    }

    public final boolean b(boolean z) {
        this.m.set(true);
        return this.k.cancel(z);
    }

    public final C5299SNa<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.l != d.PENDING) {
            int i2 = C5269RNa.a[this.l.ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i2 == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.l = d.RUNNING;
        f();
        this.j.a = paramsArr;
        executor.execute(this.k);
        return this;
    }

    public final boolean e() {
        return this.m.get();
    }
}
