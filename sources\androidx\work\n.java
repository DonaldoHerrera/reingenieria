package androidx.work;

import android.os.Build.VERSION;
import java.util.concurrent.TimeUnit;

/* compiled from: PeriodicWorkRequest */
public final class n extends s {

    /* compiled from: PeriodicWorkRequest */
    public static final class a extends androidx.work.s.a<a, n> {
        public a(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
            super(cls);
            this.c.a(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
        }

        /* access modifiers changed from: 0000 */
        public a c() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        public n b() {
            if (!this.a || VERSION.SDK_INT < 23 || !this.c.l.h()) {
                return new n(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
    }

    n(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }
}
