package bo.app;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class gg {

    static class a implements ThreadFactory {
        private static final AtomicInteger a = new AtomicInteger(1);
        private final ThreadGroup b;
        private final AtomicInteger c = new AtomicInteger(1);
        private final String d;
        private final int e;

        a(int i, String str) {
            this.e = i;
            this.b = Thread.currentThread().getThreadGroup();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(a.getAndIncrement());
            sb.append("-thread-");
            this.d = sb.toString();
        }

        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.d);
            sb.append(this.c.getAndIncrement());
            Thread thread = new Thread(threadGroup, runnable, sb.toString(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            thread.setPriority(this.e);
            return thread;
        }
    }

    public static Executor a(int i, int i2, gv gvVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, gvVar == gv.LIFO ? new gz() : new LinkedBlockingQueue(), a(i2, "uil-pool-"));
        return threadPoolExecutor;
    }

    public static ga b() {
        return new gb();
    }

    @TargetApi(11)
    private static boolean c(Context context) {
        return (context.getApplicationInfo().flags & 1048576) != 0;
    }

    private static boolean d() {
        return VERSION.SDK_INT >= 11;
    }

    private static File b(Context context) {
        File a2 = ht.a(context, false);
        File file = new File(a2, "uil-images");
        return (file.exists() || file.mkdir()) ? file : a2;
    }

    public static he c() {
        return new hf();
    }

    public static Executor a() {
        return Executors.newCachedThreadPool(a(5, "uil-pool-d-"));
    }

    public static ft a(Context context, ga gaVar, long j, int i) {
        File b = b(context);
        if (j > 0 || i > 0) {
            try {
                fx fxVar = new fx(ht.b(context), b, gaVar, j, i);
                return fxVar;
            } catch (IOException e) {
                hr.a((Throwable) e);
            }
        }
        return new fv(ht.a(context), b, gaVar);
    }

    public static gd a(Context context, int i) {
        if (i == 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            int memoryClass = activityManager.getMemoryClass();
            if (d() && c(context)) {
                memoryClass = a(activityManager);
            }
            i = (memoryClass * 1048576) / 8;
        }
        return new gf(i);
    }

    @TargetApi(11)
    private static int a(ActivityManager activityManager) {
        return activityManager.getLargeMemoryClass();
    }

    public static hh a(Context context) {
        return new hg(context);
    }

    public static hc a(boolean z) {
        return new hb(z);
    }

    private static ThreadFactory a(int i, String str) {
        return new a(i, str);
    }
}
