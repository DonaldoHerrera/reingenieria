package androidx.work.impl.utils;

import androidx.work.impl.m;
import androidx.work.q;
import java.util.List;

/* compiled from: StatusRunnable */
public abstract class k<T> implements Runnable {
    private final C1781vf<T> a = C1781vf.d();

    public C3347xE<T> a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public abstract T b();

    public void run() {
        try {
            this.a.b(b());
        } catch (Throwable th) {
            this.a.a(th);
        }
    }

    public static k<List<q>> a(m mVar, String str) {
        return new j(mVar, str);
    }
}
