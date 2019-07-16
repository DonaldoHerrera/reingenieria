package defpackage;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: Wh reason: default package */
/* compiled from: CrashlyticsBackgroundWorker */
class Wh {
    private final ExecutorService a;

    public Wh(ExecutorService executorService) {
        this.a = executorService;
    }

    /* access modifiers changed from: 0000 */
    public Future<?> a(Runnable runnable) {
        try {
            return this.a.submit(new Uh(this, runnable));
        } catch (RejectedExecutionException unused) {
            C5328TMa.e().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public <T> T b(Callable<T> callable) {
        String str = "CrashlyticsCore";
        try {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                return this.a.submit(callable).get(4, TimeUnit.SECONDS);
            }
            return this.a.submit(callable).get();
        } catch (RejectedExecutionException unused) {
            C5328TMa.e().d(str, "Executor is shut down because we're handling a fatal crash.");
            return null;
        } catch (Exception e) {
            C5328TMa.e().e(str, "Failed to execute task.", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public <T> Future<T> a(Callable<T> callable) {
        try {
            return this.a.submit(new Vh(this, callable));
        } catch (RejectedExecutionException unused) {
            C5328TMa.e().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }
}
