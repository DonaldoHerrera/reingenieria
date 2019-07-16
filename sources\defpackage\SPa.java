package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: SPa reason: default package */
/* compiled from: HandlerScheduler */
final class SPa extends HPa {
    private final Handler b;
    private final boolean c;

    /* renamed from: SPa$a */
    /* compiled from: HandlerScheduler */
    private static final class a extends c {
        private final Handler a;
        private final boolean b;
        private volatile boolean c;

        a(Handler handler, boolean z) {
            this.a = handler;
            this.b = z;
        }

        @SuppressLint({"NewApi"})
        public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.c) {
                return WPa.a();
            } else {
                b bVar = new b(this.a, WUa.a(runnable));
                Message obtain = Message.obtain(this.a, bVar);
                obtain.obj = this;
                if (this.b) {
                    obtain.setAsynchronous(true);
                }
                this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.c) {
                    return bVar;
                }
                this.a.removeCallbacks(bVar);
                return WPa.a();
            }
        }

        public void dispose() {
            this.c = true;
            this.a.removeCallbacksAndMessages(this);
        }

        public boolean a() {
            return this.c;
        }
    }

    /* renamed from: SPa$b */
    /* compiled from: HandlerScheduler */
    private static final class b implements Runnable, VPa {
        private final Handler a;
        private final Runnable b;
        private volatile boolean c;

        b(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        public boolean a() {
            return this.c;
        }

        public void dispose() {
            this.a.removeCallbacks(this);
            this.c = true;
        }

        public void run() {
            try {
                this.b.run();
            } catch (Throwable th) {
                WUa.b(th);
            }
        }
    }

    SPa(Handler handler, boolean z) {
        this.b = handler;
        this.c = z;
    }

    @SuppressLint({"NewApi"})
    public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            b bVar = new b(this.b, WUa.a(runnable));
            Message obtain = Message.obtain(this.b, bVar);
            if (this.c) {
                obtain.setAsynchronous(true);
            }
            this.b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public c a() {
        return new a(this.b, this.c);
    }
}
