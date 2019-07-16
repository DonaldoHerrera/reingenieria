package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.h;
import java.util.concurrent.Executor;

/* renamed from: yf reason: default package and case insensitive filesystem */
/* compiled from: WorkManagerTaskExecutor */
public class C1871yf implements C1811wf {
    private final Executor a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Executor c = new C1841xf(this);

    public C1871yf(Executor executor) {
        this.a = new h(executor);
    }

    public Executor a() {
        return this.c;
    }

    public void b(Runnable runnable) {
        this.b.post(runnable);
    }

    public void a(Runnable runnable) {
        this.a.execute(runnable);
    }

    public Executor b() {
        return this.a;
    }
}
