package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseInstanceId {
    private static final long a = TimeUnit.HOURS.toSeconds(8);
    private static C2517y b;
    @VisibleForTesting
    private static ScheduledExecutorService c;
    private final Executor d;
    /* access modifiers changed from: private */
    public final FirebaseApp e;
    private final C2510q f;
    private C2495b g;
    private final C2512t h;
    private final C i;
    private boolean j;
    private final a k;

    private class a {
        private final boolean a = c();
        private final C2235QE b;
        private C2197OE<com.google.firebase.a> c;
        private Boolean d = b();

        a(C2235QE qe) {
            this.b = qe;
            if (this.d == null && this.a) {
                this.c = new S(this);
                qe.a(com.google.firebase.a.class, this.c);
            }
        }

        private final Boolean b() {
            String str = "firebase_messaging_auto_init_enabled";
            Context b2 = FirebaseInstanceId.this.e.b();
            SharedPreferences sharedPreferences = b2.getSharedPreferences("com.google.firebase.messaging", 0);
            String str2 = "auto_init";
            if (sharedPreferences.contains(str2)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            }
            try {
                PackageManager packageManager = b2.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(b2.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return null;
        }

        private final boolean c() {
            try {
                Class.forName("com.google.firebase.messaging.a");
                return true;
            } catch (ClassNotFoundException unused) {
                Context b2 = FirebaseInstanceId.this.e.b();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(b2.getPackageName());
                ResolveInfo resolveService = b2.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public final synchronized boolean a() {
            if (this.d == null) {
                return this.a && FirebaseInstanceId.this.e.isDataCollectionDefaultEnabled();
            }
            return this.d.booleanValue();
        }
    }

    FirebaseInstanceId(FirebaseApp firebaseApp, C2235QE qe, C2402ZE ze) {
        this(firebaseApp, new C2510q(firebaseApp.b()), J.b(), J.b(), qe, ze);
    }

    public static FirebaseInstanceId b() {
        return getInstance(FirebaseApp.getInstance());
    }

    static boolean g() {
        String str = "FirebaseInstanceId";
        return Log.isLoggable(str, 3) || (VERSION.SDK_INT == 23 && Log.isLoggable(str, 3));
    }

    @Keep
    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        return (FirebaseInstanceId) firebaseApp.a(FirebaseInstanceId.class);
    }

    private final synchronized void l() {
        if (!this.j) {
            a(0);
        }
    }

    /* access modifiers changed from: private */
    public final void m() {
        B e2 = e();
        if (k() || a(e2) || this.i.a()) {
            l();
        }
    }

    private static String n() {
        return C2510q.a(b.b("").a());
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(boolean z) {
        this.j = z;
    }

    @Deprecated
    public String c() {
        B e2 = e();
        if (this.g.a() || a(e2)) {
            l();
        }
        return B.a(e2);
    }

    /* access modifiers changed from: 0000 */
    public final FirebaseApp d() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public final B e() {
        return c(C2510q.a(this.e), "*");
    }

    /* access modifiers changed from: 0000 */
    public final String f() throws IOException {
        return a(C2510q.a(this.e), "*");
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void h() {
        b.b();
        if (this.k.a()) {
            l();
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean i() {
        return this.g.b();
    }

    /* access modifiers changed from: 0000 */
    public final void j() {
        b.c("");
        l();
    }

    /* access modifiers changed from: 0000 */
    public final boolean k() {
        return this.g.a();
    }

    private final Wy<C2494a> b(String str, String str2) {
        return Zy.a(null).b(this.d, new P(this, str, c(str2)));
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(long j2) {
        A a2 = new A(this, this.f, this.i, Math.min(Math.max(30, j2 << 1), a));
        a((Runnable) a2, j2);
        this.j = true;
    }

    @VisibleForTesting
    private static B c(String str, String str2) {
        return b.a("", str, str2);
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, C2510q qVar, Executor executor, Executor executor2, C2235QE qe, C2402ZE ze) {
        this.j = false;
        if (C2510q.a(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (b == null) {
                    b = new C2517y(firebaseApp.b());
                }
            }
            this.e = firebaseApp;
            this.f = qVar;
            if (this.g == null) {
                C2495b bVar = (C2495b) firebaseApp.a(C2495b.class);
                if (bVar == null || !bVar.b()) {
                    this.g = new U(firebaseApp, qVar, executor, ze);
                } else {
                    this.g = bVar;
                }
            }
            this.g = this.g;
            this.d = executor2;
            this.i = new C(b);
            this.k = new a(qe);
            this.h = new C2512t(executor);
            if (this.k.a()) {
                m();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    private static String c(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* access modifiers changed from: 0000 */
    public final void b(String str) throws IOException {
        B e2 = e();
        if (!a(e2)) {
            a(this.g.a(n(), e2.b, str));
            return;
        }
        throw new IOException("token not available");
    }

    static void a(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (c == null) {
                c = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            c.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Wy b(String str, String str2, String str3, String str4) throws Exception {
        b.a("", str, str2, str4, this.f.b());
        return Zy.a(new Z(str3, str4));
    }

    public String a() {
        m();
        return n();
    }

    public String a(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C2494a) a(b(str, str2))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    private final <T> T a(Wy<T> wy) throws IOException {
        try {
            return Zy.a(wy, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    h();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) throws IOException {
        B e2 = e();
        if (!a(e2)) {
            a(this.g.b(n(), e2.b, str));
            return;
        }
        throw new IOException("token not available");
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(B b2) {
        return b2 == null || b2.b(this.f.b());
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Wy a(String str, String str2, Wy wy) throws Exception {
        String n = n();
        B c2 = c(str, str2);
        if (!this.g.a() && !a(c2)) {
            return Zy.a(new Z(n, c2.b));
        }
        String a2 = B.a(c2);
        C2512t tVar = this.h;
        O o = new O(this, n, a2, str, str2);
        return tVar.a(str, str2, o);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Wy a(String str, String str2, String str3, String str4) {
        return this.g.a(str, str2, str3, str4).a(this.d, (Vy<TResult, TContinuationResult>) new Q<TResult,TContinuationResult>(this, str3, str4, str));
    }
}
