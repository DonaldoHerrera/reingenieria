package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.util.Log;
import com.facebook.B;
import com.facebook.internal.A;
import com.facebook.internal.E;
import com.facebook.internal.ia;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Pk reason: default package */
/* compiled from: ActivityLifecycleTracker */
public class Pk {
    /* access modifiers changed from: private */
    public static final String a = "Pk";
    /* access modifiers changed from: private */
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */
    public static volatile ScheduledFuture c;
    /* access modifiers changed from: private */
    public static final Object d = new Object();
    /* access modifiers changed from: private */
    public static AtomicInteger e = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public static volatile C0496bl f;
    private static AtomicBoolean g = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public static String h;
    /* access modifiers changed from: private */
    public static long i;
    private static final C1726tk j = new C1726tk();
    private static final Bk k = new Bk();
    private static SensorManager l;
    /* access modifiers changed from: private */
    public static Ak m;
    /* access modifiers changed from: private */
    public static String n = null;
    /* access modifiers changed from: private */
    public static Boolean o;
    /* access modifiers changed from: private */
    public static volatile Boolean p;
    private static int q = 0;

    static {
        Boolean valueOf = Boolean.valueOf(false);
        o = valueOf;
        p = valueOf;
    }

    static /* synthetic */ int c() {
        int i2 = q;
        q = i2 + 1;
        return i2;
    }

    static /* synthetic */ int d() {
        int i2 = q;
        q = i2 - 1;
        return i2;
    }

    public static String m() {
        if (n == null) {
            n = UUID.randomUUID().toString();
        }
        return n;
    }

    public static UUID n() {
        if (f != null) {
            return f.d();
        }
        return null;
    }

    public static boolean o() {
        return o.booleanValue();
    }

    public static boolean p() {
        return q == 0;
    }

    private static void q() {
        synchronized (d) {
            if (c != null) {
                c.cancel(false);
            }
            c = null;
        }
    }

    /* access modifiers changed from: private */
    public static int r() {
        A b2 = E.b(B.f());
        if (b2 == null) {
            return Vk.a();
        }
        return b2.j();
    }

    public static void c(Activity activity) {
        e.incrementAndGet();
        q();
        long currentTimeMillis = System.currentTimeMillis();
        i = currentTimeMillis;
        String b2 = ia.b((Context) activity);
        j.a(activity);
        b.execute(new Kk(currentTimeMillis, b2));
        Context applicationContext = activity.getApplicationContext();
        String f2 = B.f();
        A b3 = E.b(f2);
        if (b3 != null && b3.b()) {
            l = (SensorManager) applicationContext.getSystemService("sensor");
            SensorManager sensorManager = l;
            if (sensorManager != null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                m = new Ak(activity);
                k.a(new Lk(b3, f2));
                l.registerListener(k, defaultSensor, 2);
                if (b3 != null && b3.b()) {
                    m.b();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static void d(Activity activity) {
        if (e.decrementAndGet() < 0) {
            e.set(0);
            Log.w(a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        q();
        long currentTimeMillis = System.currentTimeMillis();
        String b2 = ia.b((Context) activity);
        j.b(activity);
        b.execute(new Nk(currentTimeMillis, b2));
        Ak ak = m;
        if (ak != null) {
            ak.c();
        }
        SensorManager sensorManager = l;
        if (sensorManager != null) {
            sensorManager.unregisterListener(k);
        }
    }

    public static void b(Activity activity) {
        b.execute(new Jk());
    }

    public static void b(String str) {
        if (!p.booleanValue()) {
            p = Boolean.valueOf(true);
            B.m().execute(new Ok(str));
        }
    }

    public static void a(Application application, String str) {
        if (g.compareAndSet(false, true)) {
            h = str;
            application.registerActivityLifecycleCallbacks(new Ik());
        }
    }

    public static void c(Boolean bool) {
        o = bool;
    }
}
