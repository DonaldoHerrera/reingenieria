package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.GraphRequest.b;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.C0542c;
import com.facebook.internal.E;
import com.facebook.internal.V;
import com.facebook.internal.Z;
import com.facebook.internal.da;
import com.facebook.internal.ia;
import com.facebook.internal.ja;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* compiled from: FacebookSdk */
public final class B {
    private static final String a = "com.facebook.B";
    private static final HashSet<O> b;
    private static Executor c;
    /* access modifiers changed from: private */
    public static volatile String d;
    private static volatile String e;
    private static volatile String f;
    private static volatile Boolean g;
    private static volatile String h = "facebook.com";
    private static AtomicLong i = new AtomicLong(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
    private static volatile boolean j = false;
    private static boolean k = false;
    private static V<File> l;
    /* access modifiers changed from: private */
    public static Context m;
    private static int n = 64206;
    private static final Object o = new Object();
    private static String p = da.a();
    private static final BlockingQueue<Runnable> q = new LinkedBlockingQueue(10);
    private static final ThreadFactory r = new C0598x();
    private static Boolean s;
    private static Boolean t;

    /* compiled from: FacebookSdk */
    public interface a {
        void a();
    }

    static {
        O o2 = O.DEVELOPER_ERRORS;
        Boolean valueOf = Boolean.valueOf(false);
        b = new HashSet<>(Arrays.asList(new O[]{o2}));
        s = valueOf;
        t = valueOf;
    }

    @Deprecated
    public static synchronized void c(Context context) {
        synchronized (B.class) {
            a(context, (a) null);
        }
    }

    public static boolean d() {
        return ba.c();
    }

    public static Context e() {
        ja.c();
        return m;
    }

    public static String f() {
        ja.c();
        return d;
    }

    public static boolean g() {
        return ba.d();
    }

    public static boolean h() {
        return ba.e();
    }

    public static File i() {
        ja.c();
        return (File) l.a();
    }

    public static int j() {
        ja.c();
        return n;
    }

    public static String k() {
        ja.c();
        return f;
    }

    public static boolean l() {
        return ba.f();
    }

    public static Executor m() {
        synchronized (o) {
            if (c == null) {
                c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return c;
    }

    public static String n() {
        return h;
    }

    public static String o() {
        ia.b(a, String.format("getGraphApiVersion: %s", new Object[]{p}));
        return p;
    }

    public static long p() {
        ja.c();
        return i.get();
    }

    public static String q() {
        return "5.0.3";
    }

    public static boolean r() {
        return j;
    }

    public static synchronized boolean s() {
        boolean booleanValue;
        synchronized (B.class) {
            booleanValue = t.booleanValue();
        }
        return booleanValue;
    }

    public static synchronized boolean t() {
        boolean booleanValue;
        synchronized (B.class) {
            booleanValue = s.booleanValue();
        }
        return booleanValue;
    }

    public static boolean u() {
        return k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return;
     */
    @Deprecated
    public static synchronized void a(Context context, a aVar) {
        synchronized (B.class) {
            if (!s.booleanValue()) {
                ja.a((Object) context, "applicationContext");
                ja.a(context, false);
                ja.b(context, false);
                m = context.getApplicationContext();
                b(m);
                if (!ia.b(d)) {
                    s = Boolean.valueOf(true);
                    if (g()) {
                        c();
                    }
                    if ((m instanceof Application) && ba.e()) {
                        Pk.a((Application) m, d);
                    }
                    E.f();
                    Z.d();
                    BoltsMeasurementEventListener.a(m);
                    l = new V<>(new C0599y());
                    m().execute(new FutureTask(new C0600z(aVar, context)));
                    return;
                }
                throw new C0594t("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            } else if (aVar != null) {
                aVar.a();
            }
        }
    }

    public static void b(Context context, String str) {
        m().execute(new A(context.getApplicationContext(), str));
    }

    public static void c() {
        t = Boolean.valueOf(true);
    }

    static void b(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                    if (d == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                d = str.substring(2);
                            } else {
                                d = str;
                            }
                        } else if (obj instanceof Integer) {
                            throw new C0594t("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (e == null) {
                        e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f == null) {
                        f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (n == 64206) {
                        n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (g == null) {
                        g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    public static boolean a(O o2) {
        boolean z;
        synchronized (b) {
            z = r() && b.contains(o2);
        }
        return z;
    }

    static void a(Context context, String str) {
        if (context == null || str == null) {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        try {
            C0542c a2 = C0542c.a(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("ping");
            String sb2 = sb.toString();
            long j2 = sharedPreferences.getLong(sb2, 0);
            GraphRequest a3 = GraphRequest.a((AccessToken) null, String.format("%s/activities", new Object[]{str}), Sk.a(defpackage.Sk.a.MOBILE_INSTALL_EVENT, a2, C1237dk.a(context), a(context), context), (b) null);
            if (j2 == 0) {
                a3.b();
                Editor edit = sharedPreferences.edit();
                edit.putLong(sb2, System.currentTimeMillis());
                edit.apply();
            }
        } catch (JSONException e2) {
            throw new C0594t("An error occurred while publishing install.", (Throwable) e2);
        } catch (Exception e3) {
            ia.a("Facebook-publish", e3);
        }
    }

    public static boolean a(Context context) {
        ja.c();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static boolean a(int i2) {
        int i3 = n;
        return i2 >= i3 && i2 < i3 + 100;
    }
}
