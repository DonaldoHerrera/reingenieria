package com.soundcloud.android;

import android.app.ActivityManager;
import android.content.Context;
import java.lang.Thread.UncaughtExceptionHandler;

@EVa(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B3\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bB+\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/UncaughtExceptionHandlerController;", "", "context", "Landroid/content/Context;", "isReportingCrashes", "", "oomReporter", "Ljavax/inject/Provider;", "Lcom/soundcloud/android/reporting/OutOfMemoryReporter;", "appConfigurationReporter", "Lcom/soundcloud/android/reporting/AppConfigurationReporter;", "(Landroid/content/Context;ZLjavax/inject/Provider;Ljavax/inject/Provider;)V", "memoryReporter", "Lcom/soundcloud/android/utils/MemoryReporter;", "(Lcom/soundcloud/android/utils/MemoryReporter;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "handler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "assertHandlerIsSet", "", "installHandler", "reportCrashKeysAndFlags", "reportMemoryTrim", "level", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: UncaughtExceptionHandlerController.kt */
public final class ra {
    public static final a a = new a(null);
    private final C5081LHa b;
    private final C7054oVa<C6336dua> c;
    private final C7054oVa<C7155pua> d;
    private UncaughtExceptionHandler e;

    /* compiled from: UncaughtExceptionHandlerController.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final void a(boolean z) {
            WUa.a((C6776kQa<? super Throwable>) new qa<Object>(z));
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final void a(Throwable th) {
            C7471uYa.b(th, "t");
            if (C6972nIa.e(th) || C6972nIa.k(th)) {
                String str = SoundCloudApplication.a;
                SDb.a(str).a("Not crashing on expected exception %s", th.getMessage());
                SDb.a(th, str, new Object[0]);
                return;
            }
            throw new RuntimeException("Debug exception from Rx chain", th);
        }
    }

    public ra(Context context, boolean z, C7054oVa<C7155pua> ova, C7054oVa<C6336dua> ova2) {
        C5081LHa lHa;
        C7471uYa.b(context, "context");
        C7471uYa.b(ova, "oomReporter");
        C7471uYa.b(ova2, "appConfigurationReporter");
        Object systemService = context.getSystemService("activity");
        if (!(systemService instanceof ActivityManager)) {
            systemService = null;
        }
        ActivityManager activityManager = (ActivityManager) systemService;
        if (z) {
            lHa = new C6359eHa(activityManager);
        } else {
            lHa = new C5081LHa(activityManager);
        }
        this.b = lHa;
        this.d = ova;
        this.c = ova2;
    }

    @NXa
    public static final void a(boolean z) {
        a.a(z);
    }

    public final void a(int i) {
        this.b.b(i);
    }

    public final void b() {
        UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        C7471uYa.a((Object) defaultUncaughtExceptionHandler, "defaultUncaughtExceptionHandler");
        this.e = new oa(defaultUncaughtExceptionHandler, this.b, this.d, this.c);
        UncaughtExceptionHandler uncaughtExceptionHandler = this.e;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        } else {
            C7471uYa.b("handler");
            throw null;
        }
    }

    public final void c() {
        this.b.b();
        ((C6336dua) this.c.get()).a();
    }

    public final void a() {
        UncaughtExceptionHandler uncaughtExceptionHandler = this.e;
        if (uncaughtExceptionHandler == null) {
            C7471uYa.b("handler");
            throw null;
        } else if (!C7471uYa.a((Object) uncaughtExceptionHandler, (Object) Thread.getDefaultUncaughtExceptionHandler())) {
            b();
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal handler: ");
            sb.append(Thread.getDefaultUncaughtExceptionHandler());
            C7316sHa.a(6, "UncaughtExceptionHandler", sb.toString());
        }
    }
}
