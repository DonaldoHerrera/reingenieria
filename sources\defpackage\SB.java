package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: SB reason: default package */
public final class SB {
    public static final Executor a = new a();
    static final Executor b = new _B();

    /* renamed from: SB$a */
    static final class a implements Executor {
        private final Handler a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }
}
