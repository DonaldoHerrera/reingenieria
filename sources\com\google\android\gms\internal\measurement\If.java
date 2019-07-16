package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C1165qc;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class If {
    private static volatile If a = null;
    private static Boolean b = null;
    /* access modifiers changed from: private */
    public static Boolean c = null;
    private static boolean d = false;
    private static Boolean e = null;
    @VisibleForTesting
    private static String f = "use_dynamite_api";
    @VisibleForTesting
    private static String g = "allow_remote_dynamite";
    /* access modifiers changed from: private */
    public final String h;
    protected final Clock i;
    private final ExecutorService j;
    private final Jy k;
    /* access modifiers changed from: private */
    public List<Pair<C1165qc, c>> l;
    private int m;
    /* access modifiers changed from: private */
    public boolean n;
    private String o;
    /* access modifiers changed from: private */
    public C0973he p;

    abstract class a implements Runnable {
        final long a;
        final long b;
        private final boolean c;

        a(If ifR) {
            this(true);
        }

        /* access modifiers changed from: 0000 */
        public abstract void a() throws RemoteException;

        /* access modifiers changed from: protected */
        public void b() {
        }

        public void run() {
            if (If.this.n) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                If.this.a(e, false, this.c);
                b();
            }
        }

        a(boolean z) {
            this.a = If.this.i.currentTimeMillis();
            this.b = If.this.i.elapsedRealtime();
            this.c = z;
        }
    }

    class b implements ActivityLifecycleCallbacks {
        b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            If.this.a((a) new C1058w(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            If.this.a((a) new B(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            If.this.a((a) new C1064x(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            If.this.a((a) new C1070y(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Ie ie = new Ie();
            If.this.a((a) new C1076z(this, activity, ie));
            Bundle b = ie.b(50);
            if (b != null) {
                bundle.putAll(b);
            }
        }

        public final void onActivityStarted(Activity activity) {
            If.this.a((a) new C1052v(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            If.this.a((a) new A(this, activity));
        }
    }

    static class c extends Df {
        private final C1165qc a;

        c(C1165qc qcVar) {
            this.a = qcVar;
        }

        public final int id() {
            return System.identityHashCode(this.a);
        }

        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            this.a.onEvent(str, str2, bundle, j);
        }
    }

    private If(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !c(str2, str3)) {
            this.h = "FA";
        } else {
            this.h = str;
        }
        this.i = DefaultClock.getInstance();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.j = threadPoolExecutor;
        this.k = new Jy(this);
        boolean z = false;
        if (!(!f(context) || g())) {
            this.o = null;
            this.n = true;
            Log.w(this.h, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!c(str2, str3)) {
            this.o = "fa";
            if (str2 == null || str3 == null) {
                boolean z2 = str2 == null;
                if (str3 == null) {
                    z = true;
                }
                if (z2 ^ z) {
                    Log.w(this.h, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.h, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                this.n = true;
                return;
            }
        } else {
            this.o = str2;
        }
        Hf hf = new Hf(this, str2, str3, context, bundle);
        a((a) hf);
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.h, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    public static If a(Context context) {
        return a(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    /* access modifiers changed from: private */
    public static boolean c(String str, String str2) {
        return (str2 == null || str == null || g()) ? false : true;
    }

    private static boolean f(Context context) {
        try {
            GoogleServices.initialize(context);
            if (GoogleServices.getGoogleAppId() != null) {
                return true;
            }
        } catch (IllegalStateException unused) {
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static int g(Context context) {
        return DynamiteModule.b(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    public static int h(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    public static void i(Context context) {
        synchronized (If.class) {
            try {
                if (b != null && c != null) {
                    return;
                }
                if (a(context, "app_measurement_internal_disable_startup_flags")) {
                    b = Boolean.valueOf(false);
                    c = Boolean.valueOf(false);
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                b = Boolean.valueOf(sharedPreferences.getBoolean(f, false));
                c = Boolean.valueOf(sharedPreferences.getBoolean(g, false));
                Editor edit = sharedPreferences.edit();
                edit.remove(f);
                edit.remove(g);
                edit.apply();
            } catch (ClassCastException | IllegalStateException | NullPointerException e2) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e2);
                b = Boolean.valueOf(false);
                c = Boolean.valueOf(false);
            }
        }
    }

    public final void b(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, null);
    }

    public final String d() {
        Ie ie = new Ie();
        a((a) new C0968h(this, ie));
        return ie.a(500);
    }

    public final String e() {
        Ie ie = new Ie();
        a((a) new C0981j(this, ie));
        return ie.a(50);
    }

    public static If a(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (a == null) {
            synchronized (If.class) {
                if (a == null) {
                    If ifR = new If(context, str, str2, str3, bundle);
                    a = ifR;
                }
            }
        }
        return a;
    }

    private static boolean g() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void b(String str, String str2) {
        a((String) null, str, (Object) str2, false);
    }

    public final String c() {
        Ie ie = new Ie();
        a((a) new C0993l(this, ie));
        return ie.a(500);
    }

    public final void b(boolean z) {
        a((a) new C0947e(this, z));
    }

    public final void b(String str) {
        a((a) new C0954f(this, str));
    }

    public final String b() {
        Ie ie = new Ie();
        a((a) new C0987k(this, ie));
        return ie.a(500);
    }

    public final int c(String str) {
        Ie ie = new Ie();
        a((a) new C1011o(this, str, ie));
        Integer num = (Integer) Ie.a(ie.b(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public static boolean b(Context context) {
        i(context);
        synchronized (If.class) {
            if (!d) {
                try {
                    String str = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"measurement.dynamite.enabled", ""});
                    if ("true".equals(str)) {
                        e = Boolean.valueOf(true);
                    } else if ("false".equals(str)) {
                        e = Boolean.valueOf(false);
                    } else {
                        e = null;
                    }
                    d = true;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    try {
                        Log.e("FA", "Unable to call SystemProperties.get()", e2);
                        e = null;
                    } finally {
                        d = true;
                    }
                }
            }
        }
        Boolean bool = e;
        if (bool == null) {
            bool = b;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public final void a(a aVar) {
        this.j.execute(aVar);
    }

    /* access modifiers changed from: protected */
    public final C0973he a(Context context, boolean z) {
        com.google.android.gms.dynamite.DynamiteModule.b bVar;
        if (z) {
            try {
                bVar = DynamiteModule.l;
            } catch (com.google.android.gms.dynamite.DynamiteModule.a e2) {
                a((Exception) e2, true, false);
                return null;
            }
        } else {
            bVar = DynamiteModule.i;
        }
        return xf.asInterface(DynamiteModule.a(context, bVar, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    /* access modifiers changed from: private */
    public final void a(Exception exc, boolean z, boolean z2) {
        this.n |= z;
        if (z) {
            Log.w(this.h, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        String str = "Error with data collection. Data lost.";
        if (z2) {
            a(5, str, (Object) exc, (Object) null, (Object) null);
        }
        Log.w(this.h, str, exc);
    }

    public final void a(C1165qc qcVar) {
        Preconditions.checkNotNull(qcVar);
        a((a) new C1017p(this, qcVar));
    }

    public final void a(String str, Bundle bundle) {
        a(null, str, bundle, false, true, null);
    }

    private final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        r rVar = new r(this, l2, str, str2, bundle, z, z2);
        a((a) rVar);
    }

    public final void a(String str, String str2, Object obj) {
        a(str, str2, obj, true);
    }

    private final void a(String str, String str2, Object obj, boolean z) {
        C1046u uVar = new C1046u(this, str, str2, obj, z);
        a((a) uVar);
    }

    public final void a(Bundle bundle) {
        a((a) new C1040t(this, bundle));
    }

    public final void a(String str, String str2, Bundle bundle) {
        a((a) new C0933c(this, str, str2, bundle));
    }

    public final List<Bundle> a(String str, String str2) {
        Ie ie = new Ie();
        a((a) new C0926b(this, str, str2, ie));
        List<Bundle> list = (List) Ie.a(ie.b(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void a(Activity activity, String str, String str2) {
        a((a) new C0940d(this, activity, str, str2));
    }

    public final void a(String str) {
        a((a) new C0961g(this, str));
    }

    public final long a() {
        Ie ie = new Ie();
        a((a) new C0975i(this, ie));
        Long l2 = (Long) Ie.a(ie.b(500), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.i.currentTimeMillis()).nextLong();
        int i2 = this.m + 1;
        this.m = i2;
        return nextLong + ((long) i2);
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        Ie ie = new Ie();
        C1005n nVar = new C1005n(this, str, str2, z, ie);
        a((a) nVar);
        Bundle b2 = ie.b(5000);
        if (b2 == null || b2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b2.size());
        for (String str3 : b2.keySet()) {
            Object obj = b2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void a(int i2, String str, Object obj, Object obj2, Object obj3) {
        C0999m mVar = new C0999m(this, false, 5, str, obj, null, null);
        a((a) mVar);
    }

    public final void a(boolean z) {
        a((a) new C1023q(this, z));
    }

    private static boolean a(Context context, String str) {
        Preconditions.checkNotEmpty(str);
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                if (applicationInfo.metaData != null) {
                    return applicationInfo.metaData.getBoolean(str);
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }
}
