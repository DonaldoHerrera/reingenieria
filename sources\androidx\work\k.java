package androidx.work;

import android.os.Build.VERSION;

/* compiled from: OneTimeWorkRequest */
public final class k extends s {

    /* compiled from: OneTimeWorkRequest */
    public static final class a extends androidx.work.s.a<a, k> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
        }

        /* access modifiers changed from: 0000 */
        public a c() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        public k b() {
            if (!this.a || VERSION.SDK_INT < 23 || !this.c.l.h()) {
                return new k(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
    }

    k(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }
}
