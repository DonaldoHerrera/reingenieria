package com.soundcloud.android;

import java.lang.Thread.UncaughtExceptionHandler;

/* compiled from: SoundCloudUncaughtExceptionHandler.kt */
public final class oa implements UncaughtExceptionHandler {
    private final UncaughtExceptionHandler a;
    private final C5081LHa b;
    private final C7054oVa<C7155pua> c;
    private final C7054oVa<C6336dua> d;

    public oa(UncaughtExceptionHandler uncaughtExceptionHandler, C5081LHa lHa, C7054oVa<C7155pua> ova, C7054oVa<C6336dua> ova2) {
        C7471uYa.b(uncaughtExceptionHandler, "defaultUncaughtExceptionHandler");
        C7471uYa.b(lHa, "memoryReporter");
        C7471uYa.b(ova, "oomReporter");
        C7471uYa.b(ova2, "appConfigurationReporter");
        this.a = uncaughtExceptionHandler;
        this.b = lHa;
        this.c = ova;
        this.d = ova2;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        C7471uYa.b(thread, "thread");
        C7471uYa.b(th, "throwable");
        ((C6336dua) this.d.get()).a();
        C7316sHa.a(6, "SoundCloudUncaughtExceptionHandler", C7316sHa.c(th));
        if (C6972nIa.c(th)) {
            this.b.a();
            C7155pua pua = (C7155pua) this.c.get();
            if (pua != null) {
                pua.a();
            }
            th = new OutOfMemoryError("OOM Trend");
        }
        this.a.uncaughtException(thread, th);
    }
}
