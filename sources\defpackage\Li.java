package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Li reason: default package */
/* compiled from: CrashlyticsUncaughtExceptionHandler */
class Li implements UncaughtExceptionHandler {
    private final a a;
    private final b b;
    private final boolean c;
    private final UncaughtExceptionHandler d;
    private final AtomicBoolean e = new AtomicBoolean(false);

    /* renamed from: Li$a */
    /* compiled from: CrashlyticsUncaughtExceptionHandler */
    interface a {
        void a(b bVar, Thread thread, Throwable th, boolean z);
    }

    /* renamed from: Li$b */
    /* compiled from: CrashlyticsUncaughtExceptionHandler */
    interface b {
        C6503gPa a();
    }

    public Li(a aVar, b bVar, boolean z, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = aVar;
        this.b = bVar;
        this.c = z;
        this.d = uncaughtExceptionHandler;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.e.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str = "Crashlytics completed exception processing. Invoking default exception handler.";
        String str2 = "CrashlyticsCore";
        this.e.set(true);
        try {
            this.a.a(this.b, thread, th, this.c);
        } catch (Exception e2) {
            C5328TMa.e().e(str2, "An error occurred in the uncaught exception handler", e2);
        } catch (Throwable th2) {
            C5328TMa.e().d(str2, str);
            this.d.uncaughtException(thread, th);
            this.e.set(false);
            throw th2;
        }
        C5328TMa.e().d(str2, str);
        this.d.uncaughtException(thread, th);
        this.e.set(false);
    }
}
