package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: G reason: default package */
/* compiled from: DefaultTaskExecutor */
public class G extends H {
    private final Object a = new Object();
    private final ExecutorService b = Executors.newFixedThreadPool(4, new F(this));
    private volatile Handler c;

    public void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    public void b(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                if (this.c == null) {
                    this.c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }

    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
