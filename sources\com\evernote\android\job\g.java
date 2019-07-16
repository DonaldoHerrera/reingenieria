package com.evernote.android.job;

import android.os.Build.VERSION;
import java.util.EnumMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: JobConfig */
public final class g {
    private static final EnumMap<e, Boolean> a = new EnumMap<>(e.class);
    private static final Dj b = new Dj("JobConfig");
    private static final ExecutorService c = Executors.newCachedThreadPool(new f());
    private static volatile boolean d;
    private static volatile boolean e = false;
    private static volatile long f = 3000;
    private static volatile boolean g = false;
    private static volatile int h = 0;
    private static volatile boolean i = false;
    private static volatile Bj j = Bj.a;
    private static volatile ExecutorService k = c;
    private static volatile boolean l = false;

    static {
        for (e put : e.values()) {
            a.put(put, Boolean.TRUE);
        }
    }

    public static boolean a(e eVar) {
        return ((Boolean) a.get(eVar)).booleanValue();
    }

    public static ExecutorService b() {
        return k;
    }

    public static int c() {
        return h;
    }

    public static long d() {
        return f;
    }

    public static boolean e() {
        return d && VERSION.SDK_INT < 24;
    }

    public static boolean f() {
        return l;
    }

    public static boolean g() {
        return e;
    }

    public static boolean h() {
        return i;
    }

    static boolean i() {
        return g;
    }

    public static void a(e eVar, boolean z) {
        a.put(eVar, Boolean.valueOf(z));
        b.d("setApiEnabled - %s, %b", eVar, Boolean.valueOf(z));
    }

    public static void a(long j2, TimeUnit timeUnit) {
        f = timeUnit.toMillis(j2);
    }

    public static Bj a() {
        return j;
    }
}
