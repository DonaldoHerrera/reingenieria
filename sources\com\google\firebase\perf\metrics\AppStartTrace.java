package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.internal.firebase-perf.A;
import com.google.android.gms.internal.firebase-perf.C0889sb;
import com.google.android.gms.internal.firebase-perf.C0911y;
import com.google.android.gms.internal.firebase-perf.Da;
import com.google.android.gms.internal.firebase-perf.Da.b;
import com.google.android.gms.internal.firebase-perf.V;
import com.google.android.gms.internal.firebase-perf.zzbg;
import com.google.firebase.perf.internal.SessionManager;
import com.google.firebase.perf.internal.c;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AppStartTrace implements ActivityLifecycleCallbacks {
    private static final long a = TimeUnit.MINUTES.toMicros(1);
    private static volatile AppStartTrace b;
    private boolean c = false;
    private c d = null;
    private final C0911y e;
    private Context f;
    private WeakReference<Activity> g;
    private WeakReference<Activity> h;
    private boolean i = false;
    /* access modifiers changed from: private */
    public zzbg j = null;
    private zzbg k = null;
    private zzbg l = null;
    /* access modifiers changed from: private */
    public boolean m = false;

    public static class a implements Runnable {
        private final AppStartTrace a;

        public a(AppStartTrace appStartTrace) {
            this.a = appStartTrace;
        }

        public final void run() {
            if (this.a.j == null) {
                this.a.m = true;
            }
        }
    }

    private AppStartTrace(c cVar, C0911y yVar) {
        this.e = yVar;
    }

    public static AppStartTrace a() {
        if (b != null) {
            return b;
        }
        return a((c) null, new C0911y());
    }

    private final synchronized void b() {
        if (this.c) {
            ((Application) this.f).unregisterActivityLifecycleCallbacks(this);
            this.c = false;
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        return;
     */
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        SessionManager.zzcf().zzc(V.FOREGROUND);
        if (!this.m) {
            if (this.j == null) {
                this.g = new WeakReference<>(activity);
                this.j = new zzbg();
                if (FirebasePerfProvider.zzcq().a(this.j) > a) {
                    this.i = true;
                }
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0136, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0138, code lost:
        return;
     */
    public synchronized void onActivityResumed(Activity activity) {
        if (!this.m && this.l == null) {
            if (!this.i) {
                this.h = new WeakReference<>(activity);
                this.l = new zzbg();
                zzbg zzcq = FirebasePerfProvider.zzcq();
                String name = activity.getClass().getName();
                long a2 = zzcq.a(this.l);
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 47);
                sb.append("onResume(): ");
                sb.append(name);
                sb.append(": ");
                sb.append(a2);
                sb.append(" microseconds");
                Log.d("FirebasePerformance", sb.toString());
                b w = Da.w();
                w.a(A.APP_START_TRACE_NAME.toString());
                w.a(zzcq.b());
                w.b(zzcq.a(this.l));
                ArrayList arrayList = new ArrayList(3);
                b w2 = Da.w();
                w2.a(A.ON_CREATE_TRACE_NAME.toString());
                w2.a(zzcq.b());
                w2.b(zzcq.a(this.j));
                arrayList.add((Da) ((C0889sb) w2.b()));
                b w3 = Da.w();
                w3.a(A.ON_START_TRACE_NAME.toString());
                w3.a(this.j.b());
                w3.b(this.j.a(this.k));
                arrayList.add((Da) ((C0889sb) w3.b()));
                b w4 = Da.w();
                w4.a(A.ON_RESUME_TRACE_NAME.toString());
                w4.a(this.k.b());
                w4.b(this.k.a(this.l));
                arrayList.add((Da) ((C0889sb) w4.b()));
                w.a((Iterable<? extends Da>) arrayList);
                w.a(SessionManager.zzcf().zzcg().e());
                if (this.d == null) {
                    this.d = c.a();
                }
                if (this.d != null) {
                    this.d.a((Da) ((C0889sb) w.b()), V.FOREGROUND_BACKGROUND);
                }
                if (this.c) {
                    b();
                }
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        return;
     */
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.m && this.k == null) {
            if (!this.i) {
                this.k = new zzbg();
            }
        }
    }

    public synchronized void onActivityStopped(Activity activity) {
    }

    private static AppStartTrace a(c cVar, C0911y yVar) {
        if (b == null) {
            synchronized (AppStartTrace.class) {
                if (b == null) {
                    b = new AppStartTrace(null, yVar);
                }
            }
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        return;
     */
    public final synchronized void a(Context context) {
        if (!this.c) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.c = true;
                this.f = applicationContext;
            }
        }
    }
}
