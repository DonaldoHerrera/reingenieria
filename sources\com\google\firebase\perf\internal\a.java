package com.google.firebase.perf.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.core.app.h;
import com.google.android.gms.internal.firebase-perf.A;
import com.google.android.gms.internal.firebase-perf.C0907x;
import com.google.android.gms.internal.firebase-perf.C0911y;
import com.google.android.gms.internal.firebase-perf.Da;
import com.google.android.gms.internal.firebase-perf.Da.b;
import com.google.android.gms.internal.firebase-perf.L;
import com.google.android.gms.internal.firebase-perf.V;
import com.google.android.gms.internal.firebase-perf.zzbg;
import com.google.firebase.perf.metrics.Trace;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class a implements ActivityLifecycleCallbacks {
    private static volatile a a;
    private boolean b = false;
    private c c = null;
    private final C0911y d;
    private boolean e = true;
    private final WeakHashMap<Activity, Boolean> f = new WeakHashMap<>();
    private zzbg g;
    private zzbg h;
    private final Map<String, Long> i = new HashMap();
    private AtomicInteger j = new AtomicInteger(0);
    private V k = V.BACKGROUND;
    private Set<WeakReference<C0053a>> l = new HashSet();
    private boolean m = false;
    private h n;
    private final WeakHashMap<Activity, Trace> o = new WeakHashMap<>();

    /* renamed from: com.google.firebase.perf.internal.a$a reason: collision with other inner class name */
    public interface C0053a {
        void zza(V v);
    }

    private a(c cVar, C0911y yVar) {
        this.d = yVar;
        this.m = e();
        if (this.m) {
            this.n = new h();
        }
    }

    public static a a() {
        if (a != null) {
            return a;
        }
        return a((c) null, new C0911y());
    }

    private final void d() {
        if (this.c == null) {
            this.c = c.a();
        }
    }

    private static boolean e() {
        try {
            Class.forName("androidx.core.app.h");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final boolean b() {
        return this.e;
    }

    public final V c() {
        return this.k;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public synchronized void onActivityResumed(Activity activity) {
        if (this.f.isEmpty()) {
            this.h = new zzbg();
            this.f.put(activity, Boolean.valueOf(true));
            if (this.e) {
                a(V.FOREGROUND);
                a(true);
                this.e = false;
                return;
            }
            a(V.FOREGROUND);
            a(true);
            a(A.BACKGROUND_TRACE_NAME.toString(), this.g, this.h);
            return;
        }
        this.f.put(activity, Boolean.valueOf(true));
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public synchronized void onActivityStarted(Activity activity) {
        if (this.m) {
            this.n.a(activity);
            d();
            Trace trace = new Trace(a(activity), this.c, this.d, this);
            trace.start();
            this.o.put(activity, trace);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    public synchronized void onActivityStopped(Activity activity) {
        int i2;
        int i3;
        int i4;
        if (this.m && this.o.containsKey(activity)) {
            Trace trace = (Trace) this.o.get(activity);
            if (trace != null) {
                this.o.remove(activity);
                SparseIntArray[] b2 = this.n.b(activity);
                if (b2 != null) {
                    SparseIntArray sparseIntArray = b2[0];
                    if (sparseIntArray != null) {
                        i4 = 0;
                        i3 = 0;
                        i2 = 0;
                        for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                            int keyAt = sparseIntArray.keyAt(i5);
                            int valueAt = sparseIntArray.valueAt(i5);
                            i4 += valueAt;
                            if (keyAt > 700) {
                                i2 += valueAt;
                            }
                            if (keyAt > 16) {
                                i3 += valueAt;
                            }
                        }
                        if (i4 > 0) {
                            trace.putMetric(C0907x.FRAMES_TOTAL.toString(), (long) i4);
                        }
                        if (i3 > 0) {
                            trace.putMetric(C0907x.FRAMES_SLOW.toString(), (long) i3);
                        }
                        if (i2 > 0) {
                            trace.putMetric(C0907x.FRAMES_FROZEN.toString(), (long) i2);
                        }
                        if (L.a(activity.getApplicationContext())) {
                            String a2 = a(activity);
                            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 81);
                            sb.append("sendScreenTrace name:");
                            sb.append(a2);
                            sb.append(" _fr_tot:");
                            sb.append(i4);
                            sb.append(" _fr_slo:");
                            sb.append(i3);
                            sb.append(" _fr_fzn:");
                            sb.append(i2);
                            Log.d("FirebasePerformance", sb.toString());
                        }
                        trace.stop();
                    }
                }
                i4 = 0;
                i3 = 0;
                i2 = 0;
                if (i4 > 0) {
                }
                if (i3 > 0) {
                }
                if (i2 > 0) {
                }
                if (L.a(activity.getApplicationContext())) {
                }
                trace.stop();
            }
        }
        if (this.f.containsKey(activity)) {
            this.f.remove(activity);
            if (this.f.isEmpty()) {
                this.g = new zzbg();
                a(V.BACKGROUND);
                a(false);
                a(A.FOREGROUND_TRACE_NAME.toString(), this.h, this.g);
            }
        }
    }

    public final void b(WeakReference<C0053a> weakReference) {
        synchronized (this.l) {
            this.l.remove(weakReference);
        }
    }

    private static a a(c cVar, C0911y yVar) {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a(null, yVar);
                }
            }
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    public final synchronized void a(Context context) {
        if (!this.b) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.b = true;
            }
        }
    }

    public final void a(String str, long j2) {
        synchronized (this.i) {
            Long l2 = (Long) this.i.get(str);
            if (l2 == null) {
                this.i.put(str, Long.valueOf(1));
            } else {
                this.i.put(str, Long.valueOf(l2.longValue() + 1));
            }
        }
    }

    public final void a(int i2) {
        this.j.addAndGet(1);
    }

    public final void a(WeakReference<C0053a> weakReference) {
        synchronized (this.l) {
            this.l.add(weakReference);
        }
    }

    private final void a(V v) {
        this.k = v;
        synchronized (this.l) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                C0053a aVar = (C0053a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.zza(this.k);
                } else {
                    it.remove();
                }
            }
        }
    }

    private final void a(String str, zzbg zzbg, zzbg zzbg2) {
        d();
        b w = Da.w();
        w.a(str);
        w.a(zzbg.b());
        w.b(zzbg.a(zzbg2));
        w.a(SessionManager.zzcf().zzcg().e());
        int andSet = this.j.getAndSet(0);
        synchronized (this.i) {
            w.a(this.i);
            if (andSet != 0) {
                w.a(C0907x.TRACE_STARTED_NOT_STOPPED.toString(), (long) andSet);
            }
            this.i.clear();
        }
        c cVar = this.c;
        if (cVar != null) {
            cVar.a((Da) w.b(), V.FOREGROUND_BACKGROUND);
        }
    }

    private final void a(boolean z) {
        d();
        c cVar = this.c;
        if (cVar != null) {
            cVar.a(z);
        }
    }

    private static String a(Activity activity) {
        String valueOf = String.valueOf(activity.getClass().getSimpleName());
        String str = "_st_";
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
