package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: Yy reason: default package */
public final class Yy {
    public static final Executor a = new a();
    static final Executor b = new C1622pz();

    /* renamed from: Yy$a */
    private static final class a implements Executor {
        private final Handler a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }
}
