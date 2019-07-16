package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public class FirebaseApp {
    private static final List<String> a = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
    private static final List<String> b = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    private static final List<String> c = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
    private static final List<String> d = Arrays.asList(new String[0]);
    private static final Set<String> e = Collections.emptySet();
    /* access modifiers changed from: private */
    public static final Object f = new Object();
    private static final Executor g = new c();
    static final Map<String, FirebaseApp> h = new T();
    private final Context i;
    private final String j;
    private final d k;
    private final n l;
    private final SharedPreferences m;
    private final C2216PE n;
    /* access modifiers changed from: private */
    public final AtomicBoolean o = new AtomicBoolean(false);
    private final AtomicBoolean p = new AtomicBoolean();
    private final AtomicBoolean q;
    private final List<a> r = new CopyOnWriteArrayList();
    private final List<Object> s = new CopyOnWriteArrayList();

    @KeepForSdk
    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    public interface a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @TargetApi(14)
    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class b implements BackgroundStateChangeListener {
        private static AtomicReference<b> a = new AtomicReference<>();

        private b() {
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    b bVar = new b();
                    if (a.compareAndSet(null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        public void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.f) {
                Iterator it = new ArrayList(FirebaseApp.h.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.o.get()) {
                        firebaseApp.a(z);
                    }
                }
            }
        }
    }

    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class c implements Executor {
        private static final Handler a = new Handler(Looper.getMainLooper());

        private c() {
        }

        public void execute(Runnable runnable) {
            a.post(runnable);
        }
    }

    @TargetApi(24)
    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class d extends BroadcastReceiver {
        private static AtomicReference<d> a = new AtomicReference<>();
        private final Context b;

        public d(Context context) {
            this.b = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (a.get() == null) {
                d dVar = new d(context);
                if (a.compareAndSet(null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f) {
                for (FirebaseApp a2 : FirebaseApp.h.values()) {
                    a2.g();
                }
            }
            a();
        }

        public void a() {
            this.b.unregisterReceiver(this);
        }
    }

    protected FirebaseApp(Context context, String str, d dVar) {
        Preconditions.checkNotNull(context);
        this.i = context;
        Preconditions.checkNotEmpty(str);
        this.j = str;
        Preconditions.checkNotNull(dVar);
        this.k = dVar;
        this.m = context.getSharedPreferences(a(str), 0);
        this.q = new AtomicBoolean(h());
        List a2 = h.a(context).a();
        this.l = new n(g, a2, e.a(context, Context.class, new Class[0]), e.a(this, FirebaseApp.class, new Class[0]), e.a(dVar, d.class, new Class[0]), C2383YE.a("fire-android", ""), C2383YE.a("fire-core", "17.0.0"), C2329VE.b());
        this.n = (C2216PE) this.l.get(C2216PE.class);
    }

    private void f() {
        Preconditions.checkState(!this.p.get(), "FirebaseApp was deleted");
    }

    /* access modifiers changed from: private */
    public void g() {
        boolean d2 = androidx.core.content.a.d(this.i);
        if (d2) {
            d.b(this.i);
        } else {
            this.l.a(e());
        }
        a(FirebaseApp.class, this, a, d2);
        if (e()) {
            a(FirebaseApp.class, this, b, d2);
            a(Context.class, this.i, c, d2);
        }
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (f) {
            firebaseApp = (FirebaseApp) h.get("[DEFAULT]");
            if (firebaseApp == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(ProcessUtils.getMyProcessName());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return firebaseApp;
    }

    private boolean h() {
        String str = "firebase_data_collection_default_enabled";
        if (this.m.contains(str)) {
            return this.m.getBoolean(str, true);
        }
        try {
            PackageManager packageManager = this.i.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.i.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                    return applicationInfo.metaData.getBoolean(str);
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return true;
    }

    public String c() {
        f();
        return this.j;
    }

    public d d() {
        f();
        return this.k;
    }

    @KeepForSdk
    public boolean e() {
        return "[DEFAULT]".equals(c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.j.equals(((FirebaseApp) obj).c());
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    @KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
        f();
        return this.q.get();
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.j).add("options", this.k).toString();
    }

    public Context b() {
        f();
        return this.i;
    }

    public static FirebaseApp a(Context context) {
        synchronized (f) {
            if (h.containsKey("[DEFAULT]")) {
                FirebaseApp instance = getInstance();
                return instance;
            }
            d a2 = d.a(context);
            if (a2 == null) {
                Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            FirebaseApp a3 = a(context, a2);
            return a3;
        }
    }

    private static String b(String str) {
        return str.trim();
    }

    public static FirebaseApp a(Context context, d dVar) {
        return a(context, dVar, "[DEFAULT]");
    }

    public static FirebaseApp a(Context context, d dVar, String str) {
        FirebaseApp firebaseApp;
        b.b(context);
        String b2 = b(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f) {
            boolean z = !h.containsKey(b2);
            StringBuilder sb = new StringBuilder();
            sb.append("FirebaseApp name ");
            sb.append(b2);
            sb.append(" already exists!");
            Preconditions.checkState(z, sb.toString());
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, b2, dVar);
            h.put(b2, firebaseApp);
        }
        firebaseApp.g();
        return firebaseApp;
    }

    @KeepForSdk
    public <T> T a(Class<T> cls) {
        f();
        return this.l.get(cls);
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.google.firebase.common.prefs:");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (a onBackgroundStateChanged : this.r) {
            onBackgroundStateChanged.onBackgroundStateChanged(z);
        }
    }

    private <T> void a(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String str : iterable) {
            String str2 = "FirebaseApp";
            if (z) {
                try {
                    if (!d.contains(str)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (!e.contains(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" is not linked. Skipping initialization.");
                        Log.d(str2, sb.toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(" is missing, but is required. Check if it has been removed by Proguard.");
                        throw new IllegalStateException(sb2.toString());
                    }
                } catch (NoSuchMethodException unused2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                    throw new IllegalStateException(sb3.toString());
                } catch (InvocationTargetException e2) {
                    Log.wtf(str2, "Firebase API initialization failure.", e2);
                } catch (IllegalAccessException e3) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failed to initialize ");
                    sb4.append(str);
                    Log.wtf(str2, sb4.toString(), e3);
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{t});
            }
        }
    }
}
